package javase.problems;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a = {20,22,1,5,10};
		 a = SortBySelection(a);
		for(int i : a)
		{
			System.out.println(i);
		}
		
	}

	public static int[] SortBySelection(int a[])
	{
		int i,minValue,minIndex,temp = 0;
		
		//outer loop for iterating on each array item against rest of array items
		for(i = 0 ; i< a.length ; i++)
		{
			//take array item and suppose it is min value
			minValue = a[i];
			
			//save index of minimum value
			minIndex = i;
			
			for(int j = i ; j < a.length;j++)
			{
				//check if current item less than min value, if so update minValue and its relevant index
				if(a[j] < minValue)
				{
					minValue = a[j];
					minIndex = j;
				}
			}
			
			//after above loop i now know minimum value in the array compared to first array item
			//now it is time to swap this minimum value with this array item
			if(minValue < a[i])
			{
				temp = a[i];
				a[i] = a[minIndex];
				a[minIndex] = temp;
			}
			
		}
		
		return a;
	}
}
