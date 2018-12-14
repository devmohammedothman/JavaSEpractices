package javase.problems;

public class FrogRiverOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []A = {1,3,1,4,5,3,5,2};
		
		System.out.println("Earlist Time to Jump is at second "+findTimeToJumbbool(5, A) );
	}

	public static int findTimeToJump(int X , int []A)
	{
		int result = -1;
		
		for(int i = 0 ; i < A.length ; i++)
		{
			if(A[i] == X)
				return i;
		}
		
		return result;
	}
	
	public static int findTimeToJumbbool(int X , int []A)
	{
		boolean bo[] =new boolean [X+1];
		int steps = X;
		for(int i = 0 ; i < A.length ; i++)
		{
			if(!bo[A[i]])
			{
				bo[A[i]] = true;
				steps --;
			}
			if (steps == 0 )
				return i;
		}
		return -1;
	}
}
