import java.util.HashMap;
import java.util.Map;

public class Test0415_6 {
	 public String[] solution(String[] players, String[] callings) {
	        
	        
	        //현재 순위
	        Map<String,Integer> rank = new HashMap<>();
	        //선수 정보
	        Map<Integer,String> player = new HashMap<>();
	        
	        
	        String[] answer = new String[players.length];
	        
	        for(int i=0; i < players.length; i++) {
	        	rank.put(players[i],i);
	        	player.put(i,players[i]);
	        }
	        
	        for(int i=0; i<callings.length; i++) {
	        	//현재 선수 등수
	        	int n = rank.get(callings[i]);
	        	String temp = player.get(n-1);
	        	
	        	//현재 선수와 앞선수 정보 수정
	        	 rank.put(callings[i], n-1);
	             rank.put(temp, n);
	             
	           //선수 정보 갱신
	             player.put(n-1, callings[i]);
	             player.put(n, temp);

	        }
	        
	        // 출력
	        for(String s : rank.keySet()) {
	            answer[rank.get(s)] = s;
	        }
	


	        
	        	        
	        
	        return answer;
	        
	        
	    }
}
