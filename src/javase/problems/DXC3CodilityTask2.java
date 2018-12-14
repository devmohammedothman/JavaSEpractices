package javase.problems;

public class DXC3CodilityTask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution("A2Le","2pL1"));
	}
	
	public static boolean solution(String S, String T) 
	{
		
		if(S.length() != T.length())
			return false;
		
		String sWithQuestion = S.replaceAll("[0-9]", "?");
		String tWithQuestion = T.replaceAll("[0-9]", "?");
		
		char[] firstCharArr = sWithQuestion.toCharArray();
		char[] secondCharArr = tWithQuestion.toCharArray();
		
		boolean []charExist = new boolean[firstCharArr.length];
		
		for(int s1CharIndex =0 ; s1CharIndex < firstCharArr.length ; s1CharIndex ++)
		{
			char c1 = firstCharArr[s1CharIndex];
			char c2 = secondCharArr[s1CharIndex];
			if(c1 == c2 )
				charExist[s1CharIndex] = true;
		}
		
		for(boolean exist : charExist)
		{
			if(exist)
				return true;
		}
		return false;
	}

}
