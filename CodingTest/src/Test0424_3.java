import java.util.ArrayList;
import java.util.List;

public class Test0424_3 {
	 public int[] solution(int[] answers) {
	        int[] arr = new int[3];
	        List<Integer> list = new ArrayList<>();
	       
	        
	        int [] one = {1,2,3,4,5}; //5
	        int [] two = {2,1,2,3,2,4,2,5}; //8
	        int [] three = {3,3,1,1,2,2,4,4,5,5}; //10
	        int max = 0;
	        
	        int count1 = 0;
	        int count2 = 0;
	        int count3 = 0;
	        
	        for(int i=0; i<answers.length; i++) {
	        	if(answers[i] == one[i%5]) arr[0] ++;
	        	if(answers[i]== two[i%8]) arr[1] ++;
	        	if(answers[i]== three[i%10]) arr[2] ++;
	        }
	        max = Math.max(arr[0], Math.max(arr[1], arr[2]));
	        
	        
	        for(int i=0; i< arr.length; i++) {
	        	if(max == arr[i]) {
	        		list.add(i+1);
	        	}
	        }
	        
	        int [] answer = new int [list.size()];
	        for(int i=0; i<list.size(); i++) {
	        	answer[i] = list.get(i);
	        }
	        
	       
	        
	        return answer;
	    }
}
