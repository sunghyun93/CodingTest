import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Test0329_5 {
	
	 public  static int[] solution(String[] keymap, String[] targets) {
		 int[] answer = new int[targets.length];
	        HashMap<Character,Integer> map = new HashMap<>();

	        for (String key : keymap) {
	            for (int j = 0; j < key.length(); j++) {

	                char ch = key.charAt(j);

	                if (map.containsKey(ch)){
	                    if(map.get(ch)>j){
	                        map.replace(ch,j+1);
	                    }
	                }else{
	                    map.put(ch,j+1);
	                }
	            }
	        }

	        for(int i=0; i< targets.length;i++){
	            int sum = 0;
	            for(int j=0; j<targets[i].length();j++){

	                char ch = targets[i].charAt(j);

	                if(map.containsKey(ch)){
	                    sum+=map.get(ch);
	                }else{
	                    sum = -1;
	                    break;
	                }
	            }
	            answer[i] = sum;
	        }

	        return answer;
	    }
        
	         	

	public static void main(String[] args) {
		String [] a = {"ABACD","BCEFD"};
		String [] b = {"ABCD","AABB"};
		
		System.out.println(solution(a,b).toString());
	}

}
