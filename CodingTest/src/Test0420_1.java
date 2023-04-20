
public class Test0420_1 {
	  public int solution(int left, int right) {
	       
	       
	        int answer = 0;
	        
	        for(int a=left; a<=right; a++){
	            int chk = 0;
	            for(int s=1; s<=a; s++){
	                chk += (a%s==0) ? 1 : 0;  
	            }
	            answer += (chk%2==0) ? a : -a;
	        }
	        return answer;
	  }
}
