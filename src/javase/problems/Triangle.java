package javase.problems;

import java.util.Arrays;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {15,2,5,1,8,25};
		
		int result = findTriangle(A);
		
		System.out.println(result > 0 ? "Triangle founded" : "no Triangle");
		
	}

	public static int findTriangle(int A[])
	{	
		//sort incoming array
		Arrays.sort(A);
		
		//loop over array items to check if we can got triangle from triplets a[i] a[i+1] a[i+2]
		//to avoid overflow i less than length -2
		for(int i = 0 ; i<A.length -2; i++)
		{
			//if a[i] + a[i+1] > a[i+2] so we got a triangle and return 1
			if(A[i] + A[i+1] > A[i+2])
			{
				System.out.println("Triangle Triplets "+ A[i]+","+ A[i+1]+","+ A[i+2] );
				return 1;
			}
		}
		
		return 0;
	}
}
