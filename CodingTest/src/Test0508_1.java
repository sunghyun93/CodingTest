import java.util.*;
//프로그래머스 1단계 숫자 짝궁
public class Test0508_1 {
	
	
	public String solution(String X, String Y) {
        String answer = "";
        List<Character> list1 = new ArrayList<>();
        List<Character> list2 = new ArrayList<>();
        
        for(int i=0; i < X.length(); i++) {
        	list1.add(X.charAt(i));
        }
        
        for(int i=0; i < Y.length(); i++) {
        	list2.add(Y.charAt(i));
        }
        
        if(!list1.contains(list2)) {
        	return "-1";
        }
        
        return answer;
    }
}
