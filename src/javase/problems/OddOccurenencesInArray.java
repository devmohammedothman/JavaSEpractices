package javase.problems;

public class OddOccurenencesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {9,9,3,3,7,9,9};
		System.out.println("final result is " + findOddOccurrences(a));
	}
	
	public static int findOddOccurrences(int a[])
	{
		int result = 0 ;
		
		for(int i = 0 ; i < a.length ; i++)
		{
			System.out.println("result is " + result + " array "+i+" is " +a[i]);
			
			result ^= a[i];
			
		}
		return result;
	}

}
