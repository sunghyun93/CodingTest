
public class Test0401_3 {
	boolean solution(String s) {
        boolean answer = true;
        
 
        String content=s.toLowerCase();
        
        if(!content.contains("y")||!content.contains("p")) 	return true;
    	
        String [] arr = content.split("");
        
        int p = 0;
        int y = 0;
        for(int i=0; i < arr.length; i++) {
        	if(arr[i].equals("p")) p++;
        	else if(arr[i].equals("y"))	y++;
        	
        	
        }
        
        if(p==y) {
        	return answer;
        }else {
        	return false;
        }
       
    }
}
