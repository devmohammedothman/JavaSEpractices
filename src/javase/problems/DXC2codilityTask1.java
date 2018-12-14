package javase.problems;

public class DXC2codilityTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findShortestPossibleCount(18));
	}

	public static int findShortestPossibleCount(int N)
	{
		int count = 0;
		 for (int i = N; i != 1;)
		 {
			 if (i % 2 == 0) 
			 { 
			     i /= 2;
			     ++count;
			 } else
			 {
			     --i;
			     ++count;
			 }
		 }
		 return count;
	}
	
	public static int findShortest(int N)
	{
		int count = 1;
		 for (int i = N; i != 1;) {
		   if (i % 2 == 1) { 
		     --i;
		     ++count;
		   }
		   i /= 2;
		   ++count;
		 }
		 return count;
	}
}
