package javase.problems;

public class TapeEquilibrium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a = {3,1,2,4,3};
		System.out.println("result is "+findEquilibrium(a));

	}
	
	public static int findEquilibrium(int []a)
	{
		int result = 0;
		int arrLenght = a.length;
		if(arrLenght == 0)
			return 0;
		if(arrLenght == 1)
			return a[0];
		
		int sumLeft = 0;
		int sumRight = 0;
		
		for(int i = 1;i<arrLenght;i++)
		{
			sumRight += a[i];
		}
		sumLeft += a[0];
		result = Math.abs(sumLeft - sumRight);
		
		for(int p = 1;p < arrLenght;p++)
		{
			int diff = Math.abs(sumLeft - sumRight); 
			if(diff < result)
				result = diff;
			sumLeft += a[p];
			sumRight -= a[p];
		}
		return result;
	}

}
