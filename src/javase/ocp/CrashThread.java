package javase.ocp;

public class CrashThread extends Thread {

	public void run() {
		System.out.println("Thread Running");
		
		KitchenSync kitchenObj = new KitchenSync();
		kitchenObj.reverseOrder();
	}

}
