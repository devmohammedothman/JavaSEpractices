package javase.problems;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []A = {9,8,10,1,5,6};
		
		System.out.println(FindByBinarySearch(A, 10));
		
//		System.out.println(FindByBinarySearch(A, 6));
//		
//		System.out.println(FindByBinarySearch(A, 5));
//		
//		System.out.println(FindByBinarySearch(A, 7));
	}
	
	public static int FindByBinarySearch(int []A,int x)
	{
		Arrays.sort(A);
		
		int beg = 0;
		int end = A.length -1;
		int result = -1;
		int numberofTimes = 0;
		
		while(beg <= end)
		{
			int mid = (beg+end) /2;
			//check value at the middle of the array less than searched item or not
			if(A[mid] <= x)
			{
				beg = mid+1;
				result = A[mid];
				numberofTimes ++;
			}
			else
				end = mid -1;
		}
		
		return result;
	}

}
