import java.util.*;

public class Test0425_5 {
	public int solution(int hp) {
        int answer = 0;
        int a = 5;
        int b = 3;
        int c = 1;
       
        
        while(hp > 0) {
        	if(hp >= a) {
        		answer ++; //4
        		hp -=a;
        	}else if(hp >= 3) {
        		answer ++;
        		hp -= 3;
        	}else {
        		answer ++;
        		hp--;
        	}
        	
        }
        return answer;
    }
}
