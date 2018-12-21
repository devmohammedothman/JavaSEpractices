package javase.ocp;

class Ballon
{
	String color = "green";
	int length = 10;
	}

public class CrashPassByType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ballon bGreen = new Ballon();
		
		Ballon bYellow = new Ballon();
		bYellow.color = "yellow";
		bYellow.length = 20;
		
		swap(bGreen,bYellow);
		
		System.out.println("Green Ballon Object After Swap "+bGreen.color+ " length "+bGreen.length);
		System.out.println("Yellow Ballon Object After Swap "+bYellow.color+ " length "+bYellow.length);
		
		System.out.println("\n Ballon Object Before Method Change "+bGreen.color+ " length "+bGreen.length);
		
		changeObjectInstanceVariable(bGreen);
		
		System.out.println("Ballon Object After Method Change "+bGreen.color+ " length "+bGreen.length);
		
		

	}
	
	static void swap(Object o1 , Object o2)
	{
		Object temp = o1; 
		o1=o2; 
		o2=temp; 
	}
	
	static void changeObjectInstanceVariable(Ballon b)
	{
		b.color = "red";
		b.length ++;
	}

}
