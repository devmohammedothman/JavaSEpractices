package javase.problems;

import java.util.Stack;

public class CodilityTask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "(())))(";
		String s2 = "))";
		String s3 = "";
		String s4 = "(())";
		
		System.out.println(countnot(s1));
		System.out.println(countnot(s2));
		System.out.println(countnot(s3));
		System.out.println(countnot(s4));
		
		
		System.out.println("********************************");
		
		System.out.println(checkBrackets(s1));
		System.out.println(checkBrackets(s2));
		System.out.println(checkBrackets(s3));
		System.out.println(checkBrackets(s4));
	}
	
	//This is final Solution
	public static int countnot(String s)
	{
		//refering this rule in the task 
		//The requirement is that the number of opening brackets in the left part of the split should be exactly the same 
		//as number of closing brackets in the right part
		//and this rule also k(the length of the first part of the split)
		//i doubt there is something wrong in this problem in the expected result
		
		if(s.isEmpty())
			return 0;
		
		//stack will contain only openning part of brackets
			Stack<Character> openningPartStack= new Stack<Character>();
			Stack<Character> closingPartStack= new Stack<Character>();
			
	
			
			for (Character C : s.toCharArray())
			{
				switch(C)
				{
				case ')':
						closingPartStack.push(C);
					break;
					default:
						openningPartStack.push(C);
						break;
				}
			}
			if(openningPartStack.size() > closingPartStack.size())
				return openningPartStack.size() -1;
			
			if(closingPartStack.size() > openningPartStack.size())
				return closingPartStack.size();
			
			
			return !openningPartStack.isEmpty() ? openningPartStack.size() : 0;
	}
	
	public static int checkBrackets(String s)
	{
		//check if input string is empty or length is odd number , so it will not properly formatted
		if(s.isEmpty())
				return 0;
		
		
		//stack will contain only openning part of brackets
		Stack<Character> openningPartStack= new Stack<Character>();
		
		//loop over each char and check if it is opening to push on stack 
		//or closing to pop its related open from stack
		//but before pop from stack i have to check last inserted item in the stack
		//it must be not equal to current item's opening to remove  
		for (Character C : s.toCharArray())
		{
			switch(C)
			{
			case ')':
				pops(openningPartStack, '(');
				break;
				default:
					openningPartStack.push(C);
					break;
			}
		}
		
		//return 0 if not properly nested else return 1
		//check stack if still has values so return 0 else return 1
		return !openningPartStack.isEmpty() ? openningPartStack.size() : 0;
	}
	
	private static void pops(Stack<Character> s, Character  C){

		//loop over stack to remove all in between chars that not related to current char's opening 
		//because this will violate (u) U role. as this String considered not valid ([)]
		//s.peek return last pushed object without removing it
	        while(!s.isEmpty() && s.peek() != C){
	            s.pop();
	        }
	        if(!s.isEmpty()){
	            s.pop();
	        }else{
	            s.push(C);
	        }
	}	

}
