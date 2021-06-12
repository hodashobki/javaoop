public class Ninja extends Human {
	protected int stealth;
	
	public Ninja() {
		this.stealth=10;
	}
//	 steal(Human) that takes the amount of stealth the ninja has, removes it from the 
//	 other human's health, and adds it to the ninja's
	public void steal(Human humanTwo) {
		humanTwo.health-=this.stealth;
		this.health+=this.stealth;
	}
//	method runAway() that decreases their health by 10
	public void runAway() {
	this.health-=10;	
	}
	}

