package javase.problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DistinctProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {2,1,1,2,3,1};
		
		//System.out.println("Distinct Value "+findDistinctValue(a));
		
		System.out.println("Number of Distinct Values "+findNumberofDistinctValue(a));
		
		//System.out.println("Number of Distinct Values "+findDistinctByHashSet(a));
		
	}
	//find number of distinct values excluding repeated values
	public static int findDistinctValue(int []A)
	{
		if(A.length == 0)
			return 0;
		
		//sort incoming array
		Arrays.sort(A);
		
		int value = A[0];
		
		//loop over array items to compare with value
		for(int i = 1; i< A.length ; i++)
		{
			if(A[i] != value)
			{
				value = A[i];
			}
		}
		
		return value;
	}
	
	//find number of distinct values including repeated values
		// so if we have 1,1,2,3 distinct values is 3 (1,2,3)
	public static int findNumberofDistinctValue(int []A)
	{
		int distinct = 0;
		
		if(A.length == 0)
			return 0;
		else distinct = 1;
				
		//sort incoming array
		Arrays.sort(A);
		
		//loop over array items to compare with value
		for(int i = 1; i< A.length ; i++)
		{
			if(A[i] == A[i-1])
			{
				continue;
			}
			else
				distinct +=1 ;
		}
		
		return distinct;
	}

//find number of distinct values including repeated values
	// so if we have 1,1,2,3 distinct values is 3 (1,2,3)
	public static int findDistinctByHashSet(int []A)
	{
		Set set = new HashSet();
		for (int i : A) {
		    set.add(i);
		}
		return set.size();
	}
	
}

