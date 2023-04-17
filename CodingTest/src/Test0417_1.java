
public class Test0417_1 {
	public int solution(int n, int m, int[] section) {
		int answer = 0;
	    int max = 0;
	    //그리디 알고리즘: 현재 상태에서 최선의 수를 찾는 알고리즘
	    //Local Minimum 의 값을 보고 전체를 풀 수 있다라는 개념

	    for(int i = 0; i < section.length; i++){
	        int s = section[i];
	        if(s > max) {
	            answer++;
	            max = s + m - 1;
	        }
	    }

	    return answer;
		    
    }
}
