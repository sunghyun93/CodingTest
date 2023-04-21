import java.util.Arrays;

public class Test0421_2 {
	 public int solution(int[] nums) {
	        int answer = 0;
	        int sum = 0;
	        
	        //오름차순 정렬
	        Arrays.sort(nums);
	        //소수의 정의는 자기자신을 i로 나눴을때 나머지가 0 일경우 소수
	        for(int i=0; i < nums.length; i++) {
	        	for(int j=i+1; j< nums.length; j++ ) {
	        		for(int k=j+1; k < nums.length; k++) {
	        			sum =nums[i]+nums[j]+nums[k];	
	        			 boolean isPrime = true;
	        			 for(int z=2; z < Math.sqrt(sum); z++) {
	 	     				if(sum%z==0) isPrime = false;
	 	     				break;
	 	     			}
	        			if(isPrime) answer++;
	        		}
	     	      
	        	}
	        }
	        
	       

	        return answer;
	    }
}
