import java.util.*;

class Test0425_1 {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
       Arrays.fill(answer, -1); //초기값은 -1로 채움
       
       Map<Character,Integer> map = new HashMap<>();
        
       
       for(int i=0; i< s.length(); i++) {
    	   char ch = s.charAt(i);
    	   
    	   if(map.containsKey(ch)) { //이미나온 글자라면
    		   int prevIndex = map.get(ch);
    		   int distance = i- prevIndex; //현재위치와 이전위치 거리
    		   
    		   if(answer[i] == -1 || distance < answer[i]) { //현재 위치의 값이 1이거나 이전위치보다 가까우면
    			   answer[i] = distance;
    		   }
    		   
    		   map.put(ch,i);
    	   
    	   }
    	   
       }
        return answer;
    }
}
