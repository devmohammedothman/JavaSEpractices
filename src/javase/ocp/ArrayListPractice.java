package javase.ocp;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> myList = new ArrayList<>();
		
		
		for(int i = 1 ; i < 10; i++)
		{
			myList.add(i);
		}
		
		System.out.println("List contain "+myList);
		
//		Iterator<Integer> myIt = myList.iterator();
//		while(myIt.hasNext())
//		{
//			myIt.next();
//			myIt.remove();
//		}
		
		//replacing while loop with for
		for(Iterator<Integer> myIt = myList.iterator(); myIt.hasNext();)
		{
			myIt.next();
			myIt.remove();
			System.out.println("List Contain "+myList);
		}
		
		System.out.println("List Contain "+myList);
		
		//try to define array and print it without loop can not be done
//		int []arr = {1,2,3,5,4,8,9,10};
//		System.out.println("Array contain "+arr);
	}

}
