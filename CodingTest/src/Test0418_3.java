
public class Test0418_3 {
	public String solution(String s, int n) {
		String answer = "";
        
	    char[] arr = s.toCharArray();
	        
	    for(int i = 0; i < arr.length; i++) {
	        if(arr[i] == ' ') continue;
	        if(n <= 0) break; // n이 0 이하인 경우 반복문을 돌리지 않음
	        for(int j = 0; j < n; j++) {
	            if(arr[i] == 'z' || arr[i] == 'Z') {
	                arr[i] = (char)(arr[i]-25);
	            } else {
	                arr[i]++;
	            }
	        }
	    }
	        
	    answer = new String(arr);
	        
	    return answer;
    }
}
