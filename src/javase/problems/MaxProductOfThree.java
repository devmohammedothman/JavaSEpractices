package javase.problems;

import java.util.Arrays;

public class MaxProductOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {-3,1,2,-2,5,6};
		
		System.out.println("Maximum product of any triplet "+ findMaxProductOfThree(a) );
	}
	
	public static int findMaxProductOfThree(int []A)
	{
		 Arrays.sort(A);
	        
	        int maxTriplet = 0;
	        int N = A.length;
	        

	        if(A[0]*A[1]>0 && A[0]<0) {
	            if(A[0]*A[1]*A[N-1] > A[N-3]*A[N-2]*A[N-1]){ 
	            	
	                maxTriplet = A[0]*A[1]*A[N-1];
	            }
	            else{
	                maxTriplet = A[N-3]*A[N-2]*A[N-1];
	            }    
	        }
	        else{
	            maxTriplet = A[N-3]*A[N-2]*A[N-1];
	        }
	        
	        return maxTriplet;
	}

}
