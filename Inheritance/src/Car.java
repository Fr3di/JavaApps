public class Car extends Machine {
	public void wipeWindShield() {
		System.out.println("Wiping windshield!");
	}

	@Override
	public void Start() {
		System.out.println("Car started!");
	}

	public void showInfo() {
		System.out.println("Car name: " + name);
	}
	
}
