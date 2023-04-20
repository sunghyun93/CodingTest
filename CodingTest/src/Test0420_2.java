
import java.util.ArrayList;
import java.util.List;

public class Test0420_2 {
	 public int solution(int[] numbers) {
		 int answer = 0;
	     List<Integer> arr1 = new ArrayList<>(); //0부터 9까지
	     List<Integer> arr2 = new ArrayList<>(); //주어진 숫자
	     
	     for(int i=0; i<10; i++) {
	    	 arr1.add(i);
	     }
	     
	     for(int a : numbers) {
	    	 arr2.add(a);
	     }
	     
	     
	     for(int i=0; i<arr1.size(); i++) {
	    	 if(!arr2.contains(arr1.get(i))) {
		    	 answer += arr1.get(i);
		     }
	     }
	     
	    
	     return answer; 
	    }
}
