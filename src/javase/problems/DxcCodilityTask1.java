package javase.problems;

public class DxcCodilityTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//System.out.println(solution(529));
			System.out.println(getBinaryPeriodForInt(955));
			System.out.println(solution(955));
			System.out.println(solutionmod(955));
	}

//	public static int solution (int n)
//	{
//		String binaryRepStr = Integer.toBinaryString(n);
//		
//		//get array of chars for binary rep
//		char [] binaryRep = binaryRepStr.toCharArray();
//		
//		 //int[] binaryRep = new int[30];
//	        int nLenghtBinary = binaryRep.length;
//	        int p;
//	        
////	        while (n > 0) {
////	        	binaryRep[nLenghtBinary] = n % 2;
////	            n /= 2;
////	            nLenghtBinary++;
////	        }
//	        //after above loop we have binary representation of n inside d
//	        
//	        //P is the point where all before it same as after it
//	        for (p = 1; p < nLenghtBinary ; ++p) {
//	            int i;
//	            boolean ok = true;
//	          
//	            for (i = 0; i < nLenghtBinary - p; ++i) 
//	            {
//	                if (binaryRep[i] != binaryRep[i + p]) {
//	                    ok = false;
//	                    break;
//	                }
//	            }
//	            
//	            if (ok) {
//	                return p;
//	            }
//	        }
//	        return -1;
//	}

	//original from task
	 static int solution(int n) {
	        int[] d = new int[30];
	        int l = 0;
	        int p;
	        while (n > 0) {
	            d[l] = n % 2;
	            n /= 2;
	            l++;
	        }
	        for (p = 1; p < 1 + l; ++p) {
	            int i;
	            boolean ok = true;
	            for (i = 0; i < l - p; ++i) {
	                if (d[i] != d[i + p]) {
	                    ok = false;
	                    break;
	                }
	            }
	            if (ok) {
	                return p;
	            }
	        }
	        return -1;
	    }
	 
	 //after modification
	 static int solutionmod(int n) {
	        int[] d = new int[30];
	        int l = 0;
	        int p;
	        while (n > 0) {
	            d[l] = n % 2;
	            n /= 2;
	            l++;
	        }
	        for (p = 1; p <=  l/2; ++p) {
//	        	 if (p <= l / 2) {
	            int i;
	            boolean ok = true;
	            for (i = 0; i < l - p; ++ i) {
	                if (d[i] != d[i + p]) {
	                    ok = false;
	                    break;
	                }
	            }
	            if (ok) {
	                return p;
	            }
//        	 }
	        }
	        return -1;
	    }

	static int getBinaryPeriodForInt(int n) {
        int[] d = new int[30];
        int l = 0, res = -1;
        while (n > 0) {
            d[l] = n % 2;
            n /= 2;
            l++;
        }

        for (int p = 1; p < l; p++) {
            if (p <= l / 2) {
                boolean ok = true;
                for (int i = 0; i < l - p; i++) {
                    if (d[i] != d[i + p]) {
                        ok = false;
                        break;
                    }
                }
                if (ok) {
                    res = p;
                }
            }
        }

        return res;
    }


}
