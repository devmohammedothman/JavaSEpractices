package javase.problems;

public class FrogJump {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Number of jumps "+findFrogJumpbyLoop(10, 100, 30));
		
		//System.out.println("Number of jumps "+findFrogJumpbyDivision(10, 85, 30));
	}

	
	public static int findFrogJumpbyLoop(int x, int y , int d)
	{
		int jumps = 0;
		
		if(x == y || d == 0 || x > y)
			return jumps;
		
		int temp = x + d;
		jumps = 1;
		
		while (temp < y)
		{
			temp += d;
			jumps ++;
		}
		
		return jumps;
	}
	
	public static int findFrogJumpbyDivision(int x, int y , int d)
	{
		int jumps = 0;
		
		if(x == y || d == 0 || x > y)
			return jumps;
		double temp = (y-x)/(double)d;
		jumps = (int)Math.ceil(temp);
		
		return jumps;
	}
}
