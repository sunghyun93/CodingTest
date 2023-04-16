import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test0416_1 {
	public String solution(String[] participant, String[] completion) {
		  Arrays.sort(participant);
	        Arrays.sort(completion);
	        int i;
	        int c_len=completion.length;
	        for(i=0;i<c_len;i++){
	            if(!participant[i].equals(completion[i])){
	                return participant[i];
	            }
	        }
	        return participant[i];
        
	}
}

