package bulb;

public class lightbulb {

	int watt;

	public  lightbulb(int incap) {
		this.watt= incap;
		
		
		
	}
	public void addcap(int power){
		watt+=power;
		}
	
	public int getBulbwattage() {
		return watt;
	}
		}
