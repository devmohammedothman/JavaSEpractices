package javase.ocp;

public class javaTest {
	
	static int i = 10; 
	{
		i = 15;
		System.out.print(" Employee "+i);
	}
	
	static { System.out.print(" Employee static "+i); }

}
