
public class Test0329_6 {
	public String solution(String[] seoul) {
		
		int index = 0;
	     for(int i = 0; i < seoul.length; i++){
	         if(seoul[i].equals("Kim")){
	             index = i; break;
	         } 
	         
	     }
	     
	     
	     String answer = "김서방은 "+index+"에 있다";
	     return answer;
	}
	 
 
}
