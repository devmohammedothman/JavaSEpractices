package javase.ocp;

public class javaTest {
	
	static int i = 10; 
	{
		i = 15;
		System.out.print(" Employee "+i);
	}
	
	static { System.out.print(" Employee static "+i); }
	
	public static void main(String [] args)
	{
		boolean a = false;
		boolean b = true;
		
		if(a | b)
		{
			boolean value = a|b;
			System.out.println("\nBitwise or operator " + value);
		}
		float x = 10.0f;
		
		
		try 
		{
		    Float f1 = new Float("3.0");
		    int xx = f1.intValue();
		    byte bb = f1.byteValue();
		    double d = f1.doubleValue();
		    System.out.println(xx + bb + d);
		}
		catch (NumberFormatException e) /* Line 9 */
		{
		    System.out.println("bad number"); /* Line 11 */
		}
		
		//Loop Control Crash Test
		System.out.println(java.util.Arrays.toString(continueLoop()));
		
		returnLoop();
		
		System.out.println(java.util.Arrays.toString(breakLoop()));
	}
	
	public static int[] continueLoop()
	{
		int [] numbers = {10, 20, 30, 40, 50};
		System.out.println("Continue in Loop Behavior ");
	      for(int x : numbers ) {
	         if( x == 30 ) {
	        	 numbers[2] = 25;
	            continue;
	         }
	         System.out.print( x );
	         System.out.print("\n");
	      }
	         return numbers;
	}
	
	public static void returnLoop()
	{
		int [] numbers = {10, 20, 30, 40, 50};
		System.out.println("\n Return in Loop Behavior ");
	      for(int x : numbers ) {
	         if( x == 30 ) {
	        	 x = 25;
	            return;
	         }
	         System.out.print( x );
	         System.out.print("\n");
	      }
	      
	}
	
	public static int[] breakLoop()
	{
		int [] numbers = {10, 20, 30, 40, 50};
		System.out.println("\nBreak in Loop Behavior ");
	      for(int x : numbers ) {
	         if( x == 30 ) {
	        	 numbers[2] = 25;
	            break;
	         }
	         System.out.print( x );
	         System.out.print("\n");
	      }
	         return numbers ;
	}

}
