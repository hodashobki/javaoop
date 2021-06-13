package newpackage;

public class Dog extends Animal {
	String type;
	public Dog() {
		super("Some Animal");
		this.type="Mammal";
	
	}
	
public void display() {
	System.out.println("here is Dog class");
}
public void printMessage() {
//	System.out.println("Here is a dog class");
//	System.out.println("Here is an animal class");
super.display();
display();
}
public void printType() {
	System.out.println(this.type);
	System.out.println(super.type);
}
}
