package javase.problems;

import java.util.Stack;

public class BraketsProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(solution("{[()()]}") == 0 ? "String is NOT proper formatted ":"String is proper formatted");

System.out.println(checkBrackets("{[()()]}") == 0 ? "String is NOT proper formatted ":"String is proper formatted");
	}

	
//repeated as below 
	public static int checkBrackets(String s)
	{
		//check if input string is empty or length is odd number , so it will not properly formatted
		if(s.isEmpty())
				return 1;
		if(s.length() %2 != 0)
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
			case '}':
				pops(openningPartStack, '{');
				break;
			case ']':
				pops(openningPartStack, '[');
				break;
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
		return openningPartStack.isEmpty() ? 1 : 0;
	}
	
//Passed codility test 100/100 in java.
public static int solution(String S){
    Stack<Character> stack = new Stack<Character>();
    if(null == S){
        return 0;
    }else if(S.isEmpty()){
        return 1;
    }
    for (Character C : S.toCharArray()) {

        switch (C) {
        case ')':
            pops(stack, '(');
            break;
        case '}':
            pops(stack, '{');
            break;
        case ']':
            pops(stack, '[');
            break;

        default:
            stack.push(C);
            break;
        }

    }
    return stack.isEmpty() ? 1 : 0;
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
