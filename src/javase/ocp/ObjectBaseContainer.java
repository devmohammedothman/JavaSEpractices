package javase.ocp;


/*
 * This class demonstrates object based implementation and associated lack of type safety
 * */
class BoxPrinter
{
	Object val; 
	public BoxPrinter(Object arg)
	{
		val = arg;
	}
	
	//override to string method
	public String toString()
	{
		return "["+val+"]";
	}
	
	public Object getValue()
	{
		return val;
	}
}

public class ObjectBaseContainer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoxPrinter value1 = new BoxPrinter(new Integer(10));
		System.out.println(value1);
		
		Integer intValue1 = (Integer)value1.getValue();
		
		BoxPrinter value2 = new BoxPrinter("Type Safety issue");
		System.out.println(value2);
		
		Integer strValue2 = (Integer)value2.getValue();
		
	}

}
