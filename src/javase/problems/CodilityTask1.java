package javase.problems;

import java.util.Arrays;

public class CodilityTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("largest Value "+findlargestMaximumPoint(1, 1, 2, 3));
	}
	
	public static int findlargestMaximumPoint(int a , int b,int c,int d)
	{
		int result = 0;
		
		//applying role on all possible combination
		//(D-A)2 + (B-C)2
		
		int resultComb1 = (int)Math.abs(Math.pow(c-a,2) + Math.pow(d-b,2)); 
		int resultComb2 = (int)Math.abs(Math.pow(b-a,2) + Math.pow(d-c,2)); 
		int resultComb3 = (int)Math.abs(Math.pow(b-a,2) + Math.pow(c-d,2));
		
		int resultComb4 = (int)Math.abs(Math.pow(d-a,2) +Math.pow(b-c,2));
		int resultComb5 = (int)Math.abs(Math.pow(d-b,2) + Math.pow(c-a,2));
		int resultComb6 = (int)Math.abs(Math.pow(d-c,2) + Math.pow(b-a,2));
		int resultComb7 = (int)Math.abs(Math.pow(d-c,2) + Math.pow(a-b,2));
		
		int [] results = {resultComb1,resultComb2,resultComb3,resultComb4,resultComb5,resultComb6,resultComb7};
		
		Arrays.sort(results);
			
		result = results[results.length -1];
		
		return result;
	}

}
