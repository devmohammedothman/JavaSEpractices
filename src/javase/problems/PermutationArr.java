package javase.problems;

import java.util.HashSet;
import java.util.Set;

public class PermutationArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4};
		System.out.println("Array is permutation "+ (checkPermwithSet(a) == 0 ? "false" : "true") );
	}
	
	/*
	 * Check if supplied array is permutation
	 * */
	public static int checkArrPermutaion(int a[])
	{
		int n  = a.length;
		
		
		if(n == 0)
			return 1;
	
		
		//get sum of array item
		int sum = n * (n+1) /2;
		
		int actSum = 0;
		
		for (int i : a)
		{
			actSum += i;
		}
		
		if (sum == actSum)
			return 1 ;
		return 0;
	}
	
	public static int checkPermwithSet(int []A)
	{
		final Set<Integer> perm = new HashSet<>();
        final int size = A.length;

        for(int number : A)
        {
            if(number > size)
                return 0;

            perm.add(number);
        }

        if(perm.size() == A.length)
            return 1;
        else
            return 0;
    
	}
	

}
