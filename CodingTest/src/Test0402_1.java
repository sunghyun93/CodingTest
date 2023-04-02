
public class Test0402_1 {
	 public long solution(long n) {
	        long answer = -1;
	        long x = (long) Math.sqrt(n); //루트 씌운 값
	        long x2 = (long) Math.pow(x, 2); // 제곱한 값
	        
	        
	        if(n%x2==0)  {
	        	return (x+1)*(x+1);
	        }else {
	        	
	        }
	        
	        return answer;
	      
	        
	        
        }
    }

