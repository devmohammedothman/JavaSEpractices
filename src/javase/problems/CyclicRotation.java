package javase.problems;

public class CyclicRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []input ={};
		
		int [] result = findCyclic(input, 3);
		
		for(int r : result)
		{
			System.out.println("item "+r);
		}

	}
	
	public static int [] findCyclic(int original[],int round)
	{
		
		int inputArrLength = original.length;
		int [] rotated  = original;
		//check if input array length == 0
		if(inputArrLength == 0)
			return original;
		
		if(round == 0 )
			return original;//return original array without any rotation
		
		//loop over number of rotations
		for(int r = 1 ; r <= round;r++)
		{
			int []temp = new int [inputArrLength];
			
			//start rotate original array for n of times
			for (int i = 1; i <= inputArrLength; i++)
			{
				//this if it was the last item in the array to put it in first item of array
				if(i == inputArrLength)
					temp[0] = rotated[i-1];
				else
					temp[i] = rotated[i-1];
			}
			
			//assign temp to rotated array
			rotated = temp;
			
		}
		
		return rotated;
	}

}
