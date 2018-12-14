package javase.ocpinherit;

import javase.ocp.Palindrome;

public class CheckDefaultAccess extends Palindrome {

	public CheckDefaultAccess()
	{
		Palindrome obj = new Palindrome();
		
		//try to access member with default access modifier by obj
		//obj.text = "sss" ; // compilation error
		
		//try to access member with protected access modifier
		//obj.value = "sss"; //compilation error
		
		//the only way is to access it by inheritance
		super.value = "reset";
		//super.text = ""; // compilation error
		
		
		//Try to access instance variable from other object
		Car c = new Car();
		c.speed = 0; //yes you can
	}
	
	public static boolean isPalindrome(String str)
	{
		return false;
	}
}
