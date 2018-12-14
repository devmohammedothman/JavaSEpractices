package javase.ocp;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//use hash map to identify misspelt words
		
		Map<String,String> misspeltWords = new HashMap<>();
		misspeltWords.put("mi", "my");
		misspeltWords.put("frm", "from");
		misspeltWords.put("Egpt", "Egypt");
		
		String sentence = "mi name is Mohammed , i am frm Egpt";
		
		
		for(String word : sentence.split("\\W+"))
		{
			
			if(misspeltWords.containsKey(word))
			{
				System.out.println("this Word is wrong "+word+" the correct one is "+misspeltWords.get(word));
				sentence = sentence.replaceAll("\\b"+word+"\\b", misspeltWords.get(word));
			}
		}
		
		
		System.out.println("correct sentence is "+"\""+sentence+"\"");
		
		
	}

}
