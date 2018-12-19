package javase.ocp;

public class KitchenSync {

	
	private int[] intArray = new int[10];
    void reverseOrder() {
    	System.out.println("Inside reverse order method");
        synchronized (this) {
        	System.out.println("Inside synchronized Block");
           
        	int halfWay = intArray.length / 2;
            
        	for (int i = 0; i < halfWay; ++i) {
             
                intArray[i] = i;
            }
            
            for(int i : intArray)
            	System.out.println(" -----------> "+i);
        }
    }
    
}
