import java.util.ArrayList;
import java.util.Collections;

public class Test0424_6 {
	public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        
        ArrayList<Integer> arr = new ArrayList<>();
      
        int start,end,index = 0;

      
        for(int i=0; i<commands.length; i++) {
        		start = commands[i][0];
        		end = commands[i][1];
        		index = commands[i][2];
        		
        	for(int j = start-1; j<end; j++) { //start ~ end = 5,2,6,3을 arr에 담아준다
        		arr.add(array[j]);
        	}
        	
        	Collections.sort(arr); //정렬후
        	
        	answer[i] = arr.get(index-1); //3번째자리에 있는 숫자를 가져온다 하지만 index로 접근하니깐 -1해준다.
        	arr.clear();
        }
        
        
        
        
        
        return answer;
    }
}
