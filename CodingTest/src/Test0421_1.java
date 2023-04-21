import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test0421_1 {
	 public static String[] solution(String[] strings, int n) {
	        String[] answer = {};
	        
	        
	        List<String> list = new ArrayList<>();
	        
	        for(int i=0; i<strings.length; i++) {
	        	list.add(""+strings[i].charAt(n)+strings[i]);
	        }
	        Collections.sort(list);
	        
	        answer = new String[list.size()];
	        
	        for(int i=0; i< list.size(); i++) {
	        	answer[i] = list.get(i).substring(1,list.get(i).length());
	        }
	        
	        
	        
	    
	        
	       
	        
	     
	        return answer;
	    }
	 
	 
	 public static void main(String[] args) {
		 String [] strings= {"sun","bed","car"};
		 int n = 1;
		 
		for(int i=0; i<3; i++) {
			 System.out.println(solution(strings, n)[i]);
		}
		
	 }
}
