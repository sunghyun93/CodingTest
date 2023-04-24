
import java.util.HashSet;
import java.util.Set;

public class Test0424_4 {
	  public int solution(int[] nums) {
	        int answer = 0;
	        
	        Set<Integer> set = new HashSet<>();
	        
	        
	        
	        for(int number : nums) {
	        	set.add(number);
	        }
	        
	        if(set.size() >= nums.length/2) {
	        	answer += nums.length/2;	
	        }else if(set.size() < nums.length/2) {
	        	answer += set.size();
	        }
	        
	        
	        return answer;
	    }
}
