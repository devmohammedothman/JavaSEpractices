package javase.ocp;
import java.util.*;
import java.util.*;

class Test2 
{
    public int value;
    public int hashcode() { return (int)(value^5); }
}

public class PasstoMainArgwithSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(String item : args)
			System.out.println(item);
		
//		 double value = 9.0;
//	        System.out.println( Math.sqrt(value));
//	        
//	        
//	        int  j = 5; 
//	        tp: for (int i = 0 ; i < 3;i++) 
//	            {
//	                i++;  
//	                for (;;) 
//	                {
//	                    if(i > --j) 
//	                    {
//	                        break tp; 
//	                    } 
//	                } 
//	                //System.out.println("i =" + i + ", j = " + j);
//	            }
//	        
//	        //System.out.println("i =" + i + ", j = " + j);
//	        
//	        int x = 0x80000000;
//	       System.out.print(x + " and  ");
//	        x = x >>> 31;
//	        System.out.println(x);
//	        
//	        
//	        try 
//	        {
//	            aMethod();  
//	        } 
//	        catch (Exception e) /* Line 20 */
//	        {
//	            System.out.print("exception "); 
//	        } 
//	        System.out.print("finished"); /* Line 24 */   
//	        
//	        Boolean b1 = new Boolean("false");
//	        boolean b2;
//	        b2 = b1.booleanValue();
//	        
//	        //try pass object palindrom to method
//	        takePalindrom(new Palindrome() {});
	        
	}
	
	public static void aMethod() throws Exception 
    {
        try /* Line 5 */
        {
            throw new Exception(); /* Line 7 */
        } 
        finally /* Line 9 */
        {
            System.out.print("finally "); /* Line 11 */
        } 
    } 
	
	public void foo() 
    {
        assert false; /* Line 5 */
        assert false; /* Line 6 */
    } 
	
	public void bar()
    {
        while(true)
        {
            assert false; /* Line 12 */
        } 
       // assert false;  /* Line 14 */
    } 
	
	public static void takePalindrom(Palindrome p)
	{
		
	}
	
	

}
