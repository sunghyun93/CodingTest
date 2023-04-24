
public class Test0424_1 {
	  public int solution(String s) {
	        int answer = 0;
	        String [] aa = {"zero","one","two","three","four","five","six","seven","eight","nine"};
	       
	        
	        for(int i=0; i<aa.length; i++) {
	        	s = s.replace(aa[i], Integer.toString(i));
	        }
	        answer = Integer.parseInt(s);
	        
	        return answer;
	        
	        
	    }
}
