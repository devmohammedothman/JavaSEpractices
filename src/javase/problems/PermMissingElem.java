package javase.problems;

public class PermMissingElem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] values = {1,3,4,5,6};
		System.out.println("missing element in array is "+findMissingElemByXOR(values));
		
		System.out.println("missing element in array is "+findMissingElemByRule(values));
	}

	public static int findMissingElemByXOR(int []a)
	{
		int elem = 0;
		int xorSum = 0;
		
		for(int i = 0 ; i < a.length-1;i++)
		{
			xorSum = xorSum ^ a[i] ^ a[i+1];
			
			System.out.println("xor value is "+xorSum);
		}
		elem= xorSum ^ (a.length+1);
		
		return elem;
	}
	
	//apply math rule that sum of consecutive integers from 1 to N equal n(n+1)/2
	public static int findMissingElemByRule(int []a)
	{
		int elem = 0;
		
		if(a.length == 0)
			return 1;
		
		
		long arrLenght = a.length;
		
		//it is array length +1 because there is a missing item
		long n = arrLenght +1;
		long conSum = n* (n+1)/2;
		long currSum = 0;
		//loop over array to get current sum
		for(int i : a)
		{
			currSum += i;
		}
		elem = (int)(conSum - currSum);
		return elem > 0 ? elem : 0;
	}
}
