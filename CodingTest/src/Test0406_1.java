import java.util.ArrayList;
import java.util.List;

public class Test0406_1 {

	
	 public static boolean solution(String s) {
	        boolean answer = true;
	        int length = s.length();
	        char [] arr = s.toCharArray();
 	        
	        if(length != 4 && length != 6) {
	        	return false; 
	        }
	        
	        List<Character> list = new ArrayList<>();
	        for(char c : arr) {
	        	list.add(c);
	        }
	        
	       for(int i=0; i < list.size(); i++) {
	    		 if(32 <= list.get(i) &&  list.get(i) <= 41) { 
		    		  return true; 
		    	  }else if(list.get(i) >= 65){
		    		  return false;
		    	  }
	    	 
	    	  
	       }
	        
	        return answer;
	    }
	 
	 public static void main(String[] args) {
		 System.out.println(solution("1234"));
	 }

}
