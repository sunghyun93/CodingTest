import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test0408_4 {
	 public long solution(long n) {
	        String answer = "";
	        String num = String.valueOf(n);
	        char [] c = num.toCharArray();
	        
	        List<Long> list = new ArrayList<>();
	        
	        
	        
	        for(int i=0; i<c.length; i++ ) {
	        	for(int j= i+1; j<c.length; j++) {
	        		if(c[i] - 48 > c[j] -48) {
	        			char temp = c[i];
	        			c[i] = c[j];
	        			c[j] = temp;
	        		}
	        		
	        	}
	        }
	         answer = new String(c);
	         long reverseAnswer = Integer.parseInt(answer);
	        
	         
	        return reverseAnswer;
	    }
}
