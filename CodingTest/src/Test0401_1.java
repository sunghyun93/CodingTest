
import java.util.HashMap;
import java.util.Map;


public class Test0401_1 {
	public static int [] solution(String[] name, int[] yearning, String[][] photo) {
        Map<String,Integer> map = new HashMap<>();
        int [] answer = new int [photo.length];
 
        

        	for(int i=0; i < yearning.length; i++) {
        		map.put(name[i],yearning[i]);
        	}
        	
        	 for(int i=0; i < photo.length; i++) {
             	for(int j=0; j < photo[i].length; j++) {
             		if(map.containsKey(photo[i][j])) {
             			answer[i]+=map.get(photo[i][j]);
             		}
             	}
             }
        
        
       
       
        	
   
        
        return answer;
    }
	
	//실행시키기 위한 main 함수
	public static void main(String[] args) {
		String [] name = {"may", "kein", "kain", "radi"};
		int [] yearning = {5, 10, 1, 3};
		String[][] photo = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"},{"kon", "kain", "may", "coni"}};
		
		System.out.println(solution(name,yearning,photo));
	}
	
}
