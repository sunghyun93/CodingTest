
public class Test0413_1 {
	 public int solution(String s) {
		 	
		 	//끝에 있는 문자
	        for(int i = s.length(); i > 0; i--) {
	            //처음에 있는 문자
	        	for(int j = 0; j+i <= s.length(); j++) {
	                if(isPalindrome(s, j, j+i-1)) return i;
	            }
	        }

	        return 0;
	    }
	    
	    boolean isPalindrome(String value, int start, int end) {
	        while(start <= end) {
	            if(value.charAt(start++) != value.charAt(end--)) return false;
	        }
	        return true;
	    }
}
