package javase.problems;

import java.util.Arrays;

public class SmallestPositiveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []A = {1,3,6,4,1,2};
		
		System.out.println("missing last positive number "+findSmallestbytrick(A));
		
		int []B = {1,2,3};
		
		System.out.println("missing last positive number "+findSmallestbytrick(B));
		
		
		int []C = {-1,-3};
		
		System.out.println("missing last positive number "+findSmallestbytrick(C));
		
		int []D = {4,10,9,8,120};
		
		System.out.println("missing last positive number "+findSmallestbytrick(D));
		
		int []E = {1};
		
		System.out.println("missing last positive number "+findSmallestbytrick(D));
	}

	public static int findSmallest(int [] A)
	{
		if(A.length == 0)
			return 0;
		
		Arrays.sort(A);
		int n = A.length;
		int lastNumber = Math.abs(A[n-1]);
		int prelastNumber = Math.abs(A[n-2]);
		
		int firstNumer = Math.abs(A[0]);
		int secondNumer = Math.abs(A[1]);
		
		int difFirstNumbers = Math.abs(firstNumer - secondNumer);
		
		int diflastTwoNumbers = Math.abs(lastNumber - prelastNumber);
		
		int result = 0;
		
			if(difFirstNumbers ==1)
				result = A[0] +1;
			else if (difFirstNumbers > 1)
				result = A[1] +1;
			else if(diflastTwoNumbers ==1)
				result = A[n-1] +1;
			else if (diflastTwoNumbers > 1)
			result = A[n-2] +1;
		
		
		return result > 0 ? result : 1;
	}

	public static int findSmallestbyLoop(int []A)
	{
		int n = A.length;
		
		int item,fitem = 0;
		
		if(n == 0)
			return 0 ;
		else if(n ==1)
			return 1;
		
		int result = 0 ;
		
		Arrays.sort(A);
		int smallestIdx = 0;
		boolean smallestIndexUpdated = true;
		
		for(int i = 0; i < n-1;i++)
		{
			item = Math.abs(A[i]);
			fitem = Math.abs(A[i+1]);
			if(item != fitem && fitem-item  > 1 && smallestIndexUpdated)
			{
				result = Math.abs(A[i] +1);
				smallestIndexUpdated = false;
				smallestIdx = i;
				
			}
		}
		
		if(n > 0 && result == 0)
		  result =Math.abs(A[n-1]+1);
		
		if (!smallestIndexUpdated)
			result = Math.abs(A[smallestIdx] +1);
		
		
		return result > 0 ? result : 1;
	}

	
	public static int findSmallestbytrick(int []A)
	{
		Arrays.sort(A);
		
		int min = 1;
		
		for(int i : A)
		{
			if(i == min)
				min +=1;
		}
		
		return min;
	}
}
