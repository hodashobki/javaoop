
public class Samurai extends Human {
	protected int health;
	protected static int samuraiNumber;
	
	public Samurai() {
		this.health=200;
		samuraiNumber++;
	}
//	deathBlow(Human) that kills the other human, but reduces the Samurai's health by half
	public void deathBlow(Human human2) {
		human2.health=0;
		this.health=this.health/2;
		
	}
//	meditate() that heals the Samurai for half of their current health.
	public void meditate() {
		this.health+=this.health/2;
		
	}
//	howMany() that returns the total current number of Samurai.
//	public int howMany(int ninjaNumber) {
//		return  ninjaNumber;
//	}
	public static void howMany() {
		System.out.println( samuraiNumber);
	}

}
