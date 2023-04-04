
public class Test0404_2 {
	  public String solution(int n) {
		  StringBuffer answer = new StringBuffer();
		  
		  for(int i = 0; i< n; i++) {
			  answer.append(i%n == 0 ? "수": "박");
		  }
		  
		  return answer.toString();
		  
	  }
}	
