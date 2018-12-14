package javase.problems;

import java.util.ArrayList;

public class DxcCodilityTask3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(100));
	}
	
	public static int solution(int N)
	{
		ArrayList<Integer> result = new ArrayList<>();
	
		result.add(N);
		
		while(N > 1)
		{
			if(N % 2 ==1 )
			{
				result.add(N-1);
				N-=1;
			}
			else 
			{
				result.add(N/2);
				N /=2;
			}
		}
		
		
		
		return result.size();
	}

}
