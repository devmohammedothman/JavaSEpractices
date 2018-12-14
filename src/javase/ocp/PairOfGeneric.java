package javase.ocp;

class Pair<T1,T2>
{

	T1 object1;
	T2 object2;
	
	public Pair(T1 arg1,T2 arg2)
	{
		object1 = arg1;
		object2 = arg2;
	}
	
	public T1 getFirst()
	{
		return object1;
	}
	
	public T2 getLast()
	{
		return object2;
	}
	
}

public class PairOfGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//initialize pait object with diamond syntax
		Pair<Integer,String> pairObj = new Pair<>(2010, "South Africa");
		
		System.out.println("World cup "+pairObj.getFirst()+" was in "+pairObj.getLast());

	}

}
