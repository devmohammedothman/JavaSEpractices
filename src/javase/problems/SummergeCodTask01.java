package javase.problems;

import java.util.Arrays;
import java.util.List;

public class SummergeCodTask01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Minimum SMS number for that String is "+findMinimumSMSNumber("SMS messages are really short", 12));
	}
	
	public static int findMinimumSMSNumber (String s , int K)
	{
		int countSms = 0;
		
		if(s == null || s.isEmpty())
		 return -1;
		
		//split String on Space
		String [] words = Arrays.stream(s.split("\\s+")).map(String::trim).toArray(String[]::new);
				
		
		if(K == 0)
			return words.length;
		
		List<String> wordList = Arrays.asList(words);
		
		boolean[] wordReserved = new boolean[wordList.size()]; 
		
		for(int i = 0 ; i < wordList.size() ; i++)
		{
			System.out.println(wordList.get(i));
			
			int numberOfChar = 0  ;
			boolean accmulateCondition = false;
			
			if(i == wordList.size() -1 && !wordReserved[i])
			{
				numberOfChar = wordList.get(i-1).trim().length() + wordList.get(i).trim().length();
				accmulateCondition = !wordReserved[i-1] && !wordReserved[i];
				countSms +=1 ;
			}
			else if(i < wordList.size()-1)
			{
				numberOfChar = wordList.get(i).trim().length() + wordList.get(i+1).trim().length();
				accmulateCondition = !wordReserved[i] && !wordReserved[i+1];
			}
			
			if(numberOfChar <= K && accmulateCondition)
			{
				countSms +=1;
				wordReserved[i] = true;
				wordReserved[i+1] = true;
			}
		}
		
		return countSms;
	}

}
