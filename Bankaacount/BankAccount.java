import java.util.Random;
public class BankAccount {
//	 (string) account number, (double) checking balance, (double) savings balance.
	protected String accountNumber;
	protected double checkingBalance;
	protected double savingBalance;
//	 Create a class member (static) that has the number of accounts created thus far.
	public static int createdAccounts=0;
//	Create a class member (static) that tracks the total amount of money stored in every account created
	public static double totalAmount=0;
	
	public BankAccount(double checkb,double saveba) {
		this.accountNumber=BankAccount.randomAccount();
		this.checkingBalance=checkb;
		this.savingBalance=saveba;
		createdAccounts+=1;
		totalAmount+=(this.checkingBalance + this.savingBalance);
		}
//	Create a private method that returns a random ten digit account number.
	private static Integer randomAccount() {
		Random rand = new Random();
		Integer randAccount=rand.nextInt(10)*10000000000;
		return randAccount;
	}
//	Create a getter method for the user's checking account balance.
	public double getcheckingBalance() {
		return checkingBalance;
	}
//	● Create a getter method for the user's saving account balance.
	public double getsavingBalance() {
		return savingBalance;
	}
	
//	Create a method that will allow a user to deposit money into either the 
//	checking or saving, be sure to add to total amount stored.
	public void addMoney(double addedAmount) {
		this.checkingBalance+=addedAmount;
		this.savingBalance+=addedAmount;
	}
//	Create a method to withdraw money from one balance.
//	Do not allow them to withdraw money if there are insufficient funds
	public void withdraw(double withdAmount){
		if (this.checkingBalance>withdAmount) {
			this.checkingBalance-=withdAmount;
		}
		else {
			System.out.println("Your Account has not enough funds to proceed :");
		}
	}
//	 Create a method to see the total money from the checking and saving.
	public void seeTotal() {
		System.out.println("The Total money in the Checking Account is "+this.checkingBalance+"and The total in the savings is "+this.savingBalance);
		
	}
}
