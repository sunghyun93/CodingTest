import java.util.ArrayList;
import java.util.List;

public class Test0408_1 {
	
	 //하샤드 수
	 public static boolean solution(int x) {
	        boolean answer = true;
	        String num = String.valueOf(x);
	        char [] charArr = num.toCharArray();
	        int sum = 0;
	        
	        for(char c : charArr ) {
	        	sum+= (int)c - 48;
	        }
	        
	        if(x%sum ==0) return answer;
	        else return false;
	        
	        
	    }

	public static void main(String[] args) {
		System.out.println(solution(12));

	}

}
