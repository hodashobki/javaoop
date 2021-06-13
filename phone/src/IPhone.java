public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        // your code here
//    	String iphon="iphone says Zing";
    		return "iphone says Zing";
    }
    @Override
    public String unlock() {
        // your code here
    	return "Unlocked via facial recognition";
    }
    @Override
    public void displayInfo() {
        // your code here 
    	System.out.println("iphone X from AT&T");
    }
}