package javase.problems;

public class BinaryGap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("result of solution loop is "+solutionLoop(10));
		
		
//		System.out.println("result of squential way is "+findBinaryGapSeq(9));
		
//		System.out.println("result of squential way is "+findBinaryGapSeq(10));
		
//		System.out.println("result of squential way is "+findBinaryGapSeq(6));
//		
//		System.out.println("result of squential way is "+findBinaryGapSeq(530));
//		
		System.out.println("result of modolus way is "+findBinaryGapwithModols(20));
//		
//		System.out.println("result of modolus way is "+findBinaryGapwithModols(10));
//		
//		System.out.println("result of modolus way is "+findBinaryGapwithModols(6));
//		
//		System.out.println("result of modolus way is "+findBinaryGapwithModols(530));
		
		System.out.println("result of recursive way is "+findBinaryGapWithRecursion(9));
		
		System.out.println("result of recursive way is "+findBinaryGapWithRecursion(10));
		
		System.out.println("result of recursive way is "+findBinaryGapWithRecursion(6));
		
		System.out.println("result of recursive way is "+findBinaryGapWithRecursion(530));
		
	}

	public static int findBinaryGapWithRecursion(int n) {
	    return findBinaryGapWithRecursion(n, 0, 0);
	}

	public static int findBinaryGapWithRecursion(int n, int max, int current) {
	    if (n == 0)
	        return max;
	    else if (n % 2 == 0)
	        return findBinaryGapWithRecursion(n / 2, max, current + 1);
	    else
	        return findBinaryGapWithRecursion(n / 2, Math.max(max, current), 0);
	}
	public static int findBinaryGapSeq(int n)
	{
		int binarygap = 0;
		if(n > 0)
		{
			//get binary rep of integer n
			String binaryRep = Integer.toBinaryString(n);
			
			//get array of chars for binary rep
			char [] binaryRepArr = binaryRep.toCharArray();
			
			int tempZeroNum = 0;
			
			boolean foundOne = false;
			
			for(Character item : binaryRepArr)
			{
				if(item.equals('0'))
					tempZeroNum += 1;
				else if(item.equals('1'))
				{
					if(tempZeroNum > binarygap && foundOne)
						binarygap = tempZeroNum;
					
					foundOne = true;
					tempZeroNum = 0;
				}
			}
			
		}
		return binarygap;
	}
	
	
	public static int findBinaryGapwithModols(int n)
	{
		int binaryGap = 0;
		
		boolean foundOne = false;
		
		for(int i = 0 ; n>0; n/= 2)
		{
			if(n %2 == 0)
				i++;
			else
			{
				if(i > binaryGap && foundOne)
					binaryGap = i;
				
				foundOne = true;
				i = 0;
			}
		}
		return binaryGap;
	}
	
}
