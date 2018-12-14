package javase.ocp;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Palindrome implements childInterface{
	
	//define default access member 
	String text;
	protected String value;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Is This string abcba a Palindrome ? "+isPalindrome("abcba"));
		
		System.out.println("Is This string abracadabra a Palindrome ? "+isPalindrome("abracadabra"));
		
		tryListIteratorSet("123456789");
		
	    
	}
	
	//Another main method will compile because it is considered another method
	public static void Main()
	{}
	
	public static boolean isPalindrome(String str)
	{
		
		boolean result = true;
		
		List<Character> palindrome = new LinkedList<>();
		
		//fill the linked list
		for(char c : str.toCharArray())
		{
			palindrome.add(c);
		}
		
		ListIterator<Character> forward = palindrome.listIterator();
		ListIterator<Character> reverse = palindrome.listIterator(palindrome.size());
		
		//loop over linked list to check whether all items are equal in both directions
		while(forward.hasNext() && reverse.hasPrevious())
		{
			if(forward.next() != reverse.previous())
			{
				result = false;
				break;
			}
		}
		
		return result;
	}
	
	public static boolean tryListIteratorSet(String str)
	{
		
		boolean result = true;
		
		List<Character> palindrome = new LinkedList<>();
		
		//fill the linked list
		for(char c : str.toCharArray())
		{
			palindrome.add(c);
		}
		
		ListIterator<Character> forward = palindrome.listIterator();
		ListIterator<Character> reverse = palindrome.listIterator(palindrome.size());
		
		System.out.println("original List "+ palindrome);
		
		//loop over linked list to check whether all items are equal in both directions
		while(forward.hasNext() && reverse.hasPrevious())
		{
			if(forward.nextIndex() !=  reverse.previousIndex())
			{
				char fchar = forward.next();
				char lchar = reverse.previous();
			
				forward.set(lchar);
				reverse.set(fchar);
			
				System.out.println(palindrome);
			}
			
			 if (forward.nextIndex() == reverse.previousIndex())
				break;
			
			
		}
		
		return result;
	}

	//Note that can't downgrade access modifier so if you made this method default will not compile
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

}
//you can define another class in the same java file but it has to be default
class AnotherClass
{}
