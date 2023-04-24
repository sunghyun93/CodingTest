import java.util.Collections;

public class Test0425_4 {
	 public int solution(String A, String B) {
	        int answer = 0;
	      
	        String aa = A;
	        
	        
	        for(int i=0; i<A.length(); i++) {
	        	if(aa.equals(B)) {
	        		return answer;
	        	}
	        	String a = aa.substring(aa.length()-1); //o
	        	aa = a + aa.substring(1,aa.length()-2); // o + 
	        	answer ++;
	        }
	        
	        return -1;
	    }
}
