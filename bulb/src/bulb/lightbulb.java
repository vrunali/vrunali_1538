package bulb;

public class lightbulb {

	int watt;

	public  lightbulb(int incap) {
		this.watt= incap;
		
		
		
	}
	public void addcap(int power){
		watt+=power;
		
		System.out.println(watt);
		}
	
	public int getBulbwattage() {
		return watt;
	}
		}
