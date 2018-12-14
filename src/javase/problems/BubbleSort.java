package javase.problems;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {3,60,35,2,45,320,5};
		
		BubbleSortSeq(a);
		
		for(int x : a)
			System.out.println("Array Bubble sorted "+x);

	}
	
	public static int[] BubbleSortSeq(int []a)
	{
		for(int i = 0 ; i < a.length;i++)
		{
			//length -i in this loop because after one iteration the largest item bubbled to the most right
			//so no need to compare it again
			for(int j =1 ; j < a.length - i; j++)
			{
				if(a[j-1] > a[j])
				{
					int temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;
				}
			}
			
		}
		
		return a;
	}

}
