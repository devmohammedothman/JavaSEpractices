package javase.problems;

public class DXC2CodilityTask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A [] = {1,1,0,1,0,0};
		int b [] = {0,0,1,1};
		int c [] = {0};
//		int d [] = {1,1,1,1,1,0,1,1};
//		int e [] = {1,1,0,1,0,0,1};
		System.out.println(solution(A));
		System.out.println(solution(b));
		System.out.println(solution(c));
//		System.out.println(solution(d));
//		System.out.println(solution(e));
		
		System.out.println("******************************************");
		
//		System.out.println(adjacencies(A));
//		System.out.println(adjacencies(b));
//		System.out.println(adjacencies(c));
//		System.out.println(adjacencies(d));
//		System.out.println(adjacencies(e));
	}

	
	public static int solution(int[] A) {
	        int n = A.length;
	        int result = 0;
	        for (int i = 0; i < n - 1; i++) {
	            if (A[i] == A[i + 1])
	                result = result + 1;
	        }
	        int r = n > 1 ? -1 : 0;
	        for (int i = 0; i < n; i++) {
	            int count = 0;
	            if (i > 0) 
	            {
	                if (A[i - 1] != A[i])
	                    count = count + 1;
	                else
	                    count = count - 1;
	            }
	           // System.out.println("Count "+count);
	            
	            if (i < n - 1) {
	                if (A[i + 1] != A[i])
	                    count = count + 1;
	                else
	                    count = count - 1;
	            }
	            //System.out.println("count "+count);
	            r = Math.max(r, count);
	            //System.out.println("reverse " + r);
	        }
	        return result + r;
	    }
	
	public static int adjacencies(int[] A) 
	{        
		int count = 0;
	    boolean found = false;
	 
	    for(int i = 0; i < A.length-1; i++) {
	        if (A[i] == A[i+1]) {
	            //System.out.println(A[i] + " " + A[i+1]);
	            count++;
	        }
	        else if (((i + 2) <  A.length-1) && !found) 
	        {
	            if ((A[i] == 0 && A[i+1] == 1 && A[i+2] == 0) 
	            		|| (A[i] == 1 && A[i+1] == 0 && A[i+2] == 1)) {
	                found = true;
	                count = count + 2;
	            }
	            else if ((A[i] == 1 && A[i+1] == 0 && A[i+2] == 0) 
	            		|| (A[i] == 0 && A[i+1] == 1 && A[i+2] == 1)) {
	                found = true;
	                count = count + 1;
	            }
	        }
	    }
	 
	    return count;
	}
}
