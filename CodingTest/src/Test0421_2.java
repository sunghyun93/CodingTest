import java.util.Arrays;

public class Test0421_2 {
	 public int solution(int[] nums) {
	        int answer = 0;
	        int sum = 0;
	        
	        for(int i=0; i < nums.length; i++) {
	            for(int j=i+1; j< nums.length; j++ ) {
	                for(int k=j+1; k < nums.length; k++) {
	                    sum =nums[i]+nums[j]+nums[k];  
	                    boolean isPrime = true;
	                    for(int z=2; z <= Math.sqrt(sum); z++) {
	                        if(sum%z==0) {
	                            isPrime = false;
	                            break;
	                        }
	                    }
	                    if(isPrime) answer++;
	                }
	            }
	        }
	        
	        return answer;
	    }
}
