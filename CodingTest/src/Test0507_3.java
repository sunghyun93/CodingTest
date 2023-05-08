
public class Test0507_3 {
	 public int solution(int k, int m, int[] score) {
	        int answer = 0;
	        int length = score.length;
	        int mod = length/m;
	        
	        for(int i=0; i<length; i++) {
	        	answer += k * mod * score[i];
	        }
	        
	        return answer;
	    }
}
