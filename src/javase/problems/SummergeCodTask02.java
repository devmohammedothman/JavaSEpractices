package javase.problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SummergeCodTask02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {6,10,6,9,7,8};
		
		int b[] = {6,10,1,2,6,6,7};
		
		int c[] = {5,5,3,3,9};
		
		int d[] = {5,6,1,3,2,4};
		
		System.out.println("longest subsequence " + quasiConstant(a));
		System.out.println("longest subsequence " + quasiConstant(b));
		System.out.println("longest subsequence " + quasiConstant(c));
		System.out.println("longest subsequence " + quasiConstant(d));
	}
	
	public static int solution(int[] A) {
		
	    Arrays.sort(A);
	    int counter = 0;
	    int res = 0;
	    int val = -1;
	    for (int i = 0; i < A.length - 1; i++) {
	    	//check difference between consecutive array items < 2
	        if (val == -1 && A[i + 1] - A[i] < 2) {
	            counter = 2;
	            val = A[i + 1] - A[i];
	        }//check difference between consecutive array items <= 1
	        else if (val == 0 && A[i + 1] - A[i] <= 1) {
	            counter++;
	            val = A[i + 1] - A[i];
	        }//check difference between consecutive array items == 0 
	        else if (val == 1 && A[i + 1] - A[i] == 0) {
	            counter++;
	        } else {
	            val = -1;
	            res = Math.max(res, counter);
	            counter = 0;
	        }
	    }
	    return res;
	}
	
	public static int quasiConstant(int [] a)
	{
		Map<Integer,Integer> map = new HashMap<>();
		for (int i :a)
			map.compute(i, (k,v) -> v == null ? 1 : v+1);
		
		int max = 0;
		
		for(Entry<Integer , Integer> e : map.entrySet())
		{
			int t = e.getValue() + map.getOrDefault(e.getKey() +1 , 0);
			if (t > max)
				max = t;
		}
		
		return max;
	}

}
