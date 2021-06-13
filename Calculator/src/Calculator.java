
public class Calculator {
	private double results;
	private double num1;
	private double num2;
	private char operator;
	
	public Calculator() {
		
	}
	public void setOperandOne(double num1) {
		this.num1=num1;
	}
	public void setOperation(char oper) {
		this.operator=oper;
	}
	public void setOperandTwo(double num2) {
		this.num2=num2;
		
	}
	public void performOperation() {
		if( this.operator == '+') {
			results = num1+ num2;
		}
		if( this.operator == '-') {
			results = num1 - num2;
		}
	}
	public void getResults() {
		System.out.println("The result from the Calculator "+results);
	}

}
