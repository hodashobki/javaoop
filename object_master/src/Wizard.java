public class Wizard extends Human {
	protected int health;
	protected int intelligence;
	
	public Wizard() {
		this.health=50;
		this.intelligence=8;
	}
	
	public void healWizard(Human human) {
//		Wizard: Add a method heal(Human) that heals the other human by the wizard's intelligence
//		int humanhealth = this.intelligence;
		human.health+=this.intelligence;
		
	}
	public void fireball(Human humann) {
//		fireball(Human) that decreases the other human's health by the wizard's intelligence * 3
//		int decreashealth=this.health-(3*this.intelligence);
		
		humann.health-=(3 * this.intelligence);
		
	}

}
