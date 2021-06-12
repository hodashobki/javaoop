
public class Human {
	protected int strength;
	protected  int stealth;
	protected int intelligence;
	protected int health;

	public Human() {
		this.strength=3;
		this.stealth=3;
		this.intelligence=3;
		this.health=100;
	}
	public void attackHuman(Human human1) {
//		Add the attack(Human) method that reduces the health of 
//		the attacked human by the strength of the current human.	
		human1.health -=this.strength;
		System.out.println("This Human attacked by the stringth of " +this.strength+" Human2 who has now a health of"+human1.health);		
	}
}
