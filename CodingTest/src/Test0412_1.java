import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Test0412_1 {
	public int[] solution(int []arr) {
        int[] answer = {};
   
        
        List<Integer> list = new ArrayList<>();
        
   
        
        
        for(int i=0; i < list.size()-1; i++) {
        	if(arr[i] != arr[i+1]) {
        		list.add(arr[i]);
        	}
        }
        list.add(arr[arr.length-1]);
        
        answer = new int[list.size()];
        
        for(int i=0; i < answer.length; i++) {
        	answer[i] = list.get(i).intValue();
        }
        
       
        
        
        
        
        
       
        return answer;
    }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
