package javase.problems;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []items = new int [5];
		populateArray(items);
		
		for(int i : items)
			System.out.println("array item "+i);
		
		int []result = MergeSortFunction(items);
		
		for(int x : result)
			System.out.println("sorted array item "+x);
		
	}
	
	public static int[] populateArray(int []A)
	{
		for(int i = 0 ; i<A.length;i++)
		{
			A[i] = (int)(Math.random()*100);
		}
		return A;
	}
	public static int[] MergeSortFunction(int [] A)
	{
		//check if incoming array length <=1
		if(A.length <=1)
			return A;
		
		int midPoint = A.length /2;
		int []left = new int [midPoint];
		int []right ;
		
		//check if incoming array length is odd or even
		if(A.length % 2 == 0) //even
		{
			right = new int [midPoint];
		}
		else{
			right = new int [midPoint +1];
		}
		
		int [] result = new int[A.length];
		
		//fill two created arrays left and right
		for(int i = 0 ; i <midPoint ; i++)
		{
			left[i] = A[i];
		}
		
		int x = 0;
		for(int j = midPoint ; j < A.length ; j++)
		{
			right[x] = A[j];
			x++;
		}
		
		left = MergeSortFunction(left);
		right = MergeSortFunction(right);
		
		result = merge(left , right);
		
		return result;
	}
	
	public static int [] merge(int left[],int right[])
	{
		int [] result = new int [left.length + right.length];
		
		int idxLeft = 0 ;
		int idxRight = 0 ;
		int idxResult = 0;
		
		while(idxLeft < left.length || idxRight < right.length)
		{
			if(idxLeft < left.length && idxRight < right.length)
			{
				if(left[idxLeft] <= right[idxRight])
				{
					result[idxResult] = left[idxLeft];
					idxResult++;
					idxLeft ++;
				}
				else
				{
					result[idxResult] = right[idxRight];
					idxResult ++;
					idxRight ++;
				}
			}
			else if(idxLeft < left.length)
			{
				result[idxResult] = left[idxLeft];
				idxResult ++;
				idxLeft ++;
			}
			else if(idxRight < right.length)
			{
				result[idxResult] = right[idxRight];
				idxResult ++;
				idxRight ++;
			}
		}
		
		return result;
	}

}
