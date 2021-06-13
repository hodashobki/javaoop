package newpackage;

public class Animal {
	String type;
	
	public Animal() {
		this.type="animal";
		System.out.println("I'am an Animal");
	}
	public Animal(String type) {
		System.out.println("Type"+type);
	}
   public void display() {
	   System.out.println("I'm a dog");
   }
	
}
