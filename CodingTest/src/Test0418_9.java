import java.util.Arrays;

public class Test0418_9 {
	  public int solution(int[] d, int budget) {
	        int answer = 0;
	        
	        
	        //일단 지원해줘야하는 금액 오름차순 정렬
	        Arrays.sort(d);
	        
	        for(int i=0; i < d.length; i++) {
	        	if(budget >= d[i]) {
	        		budget -= d[i];
	        		answer++;
	        	}else {
	        		break;
	        	}
	        }
	        
	        return answer;
	    }
}
