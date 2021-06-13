public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
    	return "Ring Ring Ring";
        
    }
    @Override
    public String unlock() {
        // your code here
    	return "Unlocked with fingerprint scanner";
    }
    @Override
    public void displayInfo() {
        // your code here  
    	System.out.println("Galaxy S9 from Verzion");
    }
}