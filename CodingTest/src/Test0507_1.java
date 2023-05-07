import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test0507_1 {
	class Solution {
	    public int[] solution(int[] numbers) {
	        Set<Integer> list = new HashSet<>();
	        int[] answer = new int[list.size()];
	        
	        int sum = 0;
	        
	        for(int i=0; i<numbers.length-1; i++) {
	        	for(int j=i+1; j<numbers.length; j++) {
	        	  list.add(numbers[i]+numbers[j]);
	        	}
	        }
	        
	        answer = list.stream().mapToInt(i -> i).toArray();
	        Arrays.sort(answer);
	        
	        return answer;
	    }
	}
}
