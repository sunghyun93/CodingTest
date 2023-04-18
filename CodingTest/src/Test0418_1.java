
public class Test0418_1 {
	public int solution(String s) {
        int answer = 0;
        char [] ch = s.toCharArray();
        int op =1;
        //s의 길이는 1이상 5이하
        if(s.length() >=1 &&s.length() <= 5 && s.charAt(0) != 0) {
        	for(int i=0; i<ch.length; i++) {
        		if(ch[i] == '+') {
        			op = 1;
        			continue;
        		}else if(ch[i] == '-') {
        			op = -1;
        			continue;
        		}
        		
        		int num = ch[i]-'0';
        			
        	answer = (answer*10)+num; //자릿수를 높이기 위해서 10을 곱해준다.
        }
        
       
        }
        return answer*op;
	}
}