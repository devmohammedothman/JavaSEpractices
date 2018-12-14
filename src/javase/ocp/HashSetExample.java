package javase.ocp;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//removing duplicate words
		
		String text = "I feel, a feel, a funny feel, a funny feel I feel, if you "
					+"feel the feel I feel, I feel the feel you feel";
		
		Set<String> wordsTree = new TreeSet<>();
		Set<String> wordSet = new HashSet<>();
		
		for(String word : text.split("\\W+"))
			{
				wordSet.add(word);
				wordsTree.add(word);
			
			}
		
		System.out.println(wordSet);
		System.out.println(wordsTree);

	}

}
