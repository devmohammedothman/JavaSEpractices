package javase.problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class FishProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]A = {4,3,2,1,5};
		int[]B = {0,1,0,0,0};
		
		System.out.println("Number of fish" + findNumberByStack(A, B));
	}
	
	public static int NumberOfliveFish(int []A,int []B)
	{
		if(A.length == 0 || B.length == 0 )
			return 0;
		
		 
		HashMap<Integer,Integer> upStreamMap = new HashMap<>();
		
		HashMap<Integer,Integer> downStreamMap = new HashMap<>();
		
		
			
		//loop over first array of Fish size
		for(int i = 0 ; i < B.length ; i++)
		{
			if(B[i] == 1)
				downStreamMap.put(A[i], B[i]);
			else
				upStreamMap.put(A[i], B[i]);
		}
		
		Arrays.sort(A);
		
		HashSet<Integer> upSet = new HashSet<Integer>(upStreamMap.keySet()); 
		HashSet<Integer> downSet = new HashSet<Integer>(downStreamMap.keySet()); 
		Integer[] downArray = downSet.toArray(new Integer[downSet.size()]);
		
		for(int i : upSet)
		{
			if(i < downArray[0])
			{
				upStreamMap.remove(i);
			}
		}
		
		return upStreamMap.size();
	}


	public static int findNumberByStack(int[] A, int[] B) {
	    Stack<Integer> fishesToFight = new Stack<Integer>();
	 
	    int passedUpstream = 0;
	    for (int i = 0; i < B.length; i++) {
	        if (B[i] == 0) {
	            if (fishesToFight.size() == 0)
	                passedUpstream++;
	            else {
	                while (!fishesToFight.empty() && A[i] > fishesToFight.peek())
	                    fishesToFight.pop();
	 
	                if (fishesToFight.size() == 0)
	                    passedUpstream++;
	            }
	        } else
	            fishesToFight.push(A[i]);
	    }
	    return fishesToFight.size() + passedUpstream;
	}

}
