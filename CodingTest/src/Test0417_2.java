
public class Test0417_2 {
	public String solution(String s) {
        String answer = "";
        s.toLowerCase(); //일단 다 소문자로 변환
        String [] split = s.split(" ",-1); //-1을 해줘야 끝쪽 공백처리도 가능
        
        for(int i=0; i < split.length; i++) {
        	String str = split[i];
        	
        	char [] ch = str.toCharArray();
        	
        	for(int j=0; j < str.length(); j++) {
        		if(j%2==0) {
        			ch[i] = (ch[i]+"").toUpperCase().toCharArray()[0];
        		}else {
        			ch[i] = (ch[i]+"").toLowerCase().toCharArray()[0];
        		}
        		
        		str = new String(ch);
        		split[i] = str;
        	}
        	
        	answer = String.join(" ", split);
        }
        
        
      
        
        
        return answer;
    }
}
