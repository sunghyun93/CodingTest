import java.util.ArrayList;
import java.util.List;

public class Test0418_6 {
	public String solution(String s) {
		 String answer = "";
	        
	        int length = s.length();
	        int division = 0;
	        
	        if(length%2 == 0) { //짝수일때
	        	division = length/2-1;
	        	answer = s.substring(division, division+2);
	        } else {
	        	division = length/2;
	        	answer = s.charAt(division)+"";
	        }
	        
	        return answer;
    }
}
