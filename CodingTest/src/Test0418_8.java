
public class Test0418_8 {
	 public String solution(String s) {
		 String answer = "";

	        // 버블정렬로 해서 푼다.
	        char[] ch = s.toCharArray();

	        for (int i = 0; i < ch.length; i++) {
	            for (int j = i + 1; j < ch.length; j++) {
	                if (ch[i] < ch[j]) {
	                    char temp = ch[i];
	                    ch[i] = ch[j];
	                    ch[j] = temp;
	                }
	            }
	            answer += ch[i];
	        }
	        return answer;
	    }
}
