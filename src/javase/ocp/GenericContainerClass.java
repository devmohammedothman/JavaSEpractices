package javase.ocp;
/*
 * This class demonstrates using of Generics implementation 
 * */

class GenericBoxPrinter<T>
{
	private T val;
	
	public GenericBoxPrinter(T arg)
	{
		val = arg;
	}
	
	public String toString()
	{
		return "["+val+"]";
	}
	
	public T getValue()
	{
		return val;
	}
}

public class GenericContainerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GenericBoxPrinter<Integer> value1 = new GenericBoxPrinter<Integer>(new Integer(10));
		System.out.println(value1);
		
		//cast to Integer and note that no explicit casting needed to complete the casting 
		//because i already know in the compile time what is the type of generic box printer object
		Integer intvalue1 = value1.getValue();
		
		GenericBoxPrinter<String> value2 = new GenericBoxPrinter<String>("Generic Class used");
		System.out.println(value2);
		
		//if you tried to cast to unsuitable type by mistake you will got compilation error
		//Integer strValue2 = value2.getValue();
		
		
	}

}
