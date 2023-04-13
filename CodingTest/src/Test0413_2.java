
public class Test0413_2 {
	 public int solution(String s) {
		 int answer = 1; // 팰린드롬의 최소 길이는 1

	        // 문자열의 각 문자를 배열에 저장
	        char[] charArr = s.toCharArray();
	        
	        // 각 문자를 중심으로 확장하는 방식으로 팰린드롬 체크
	        for (int i = 0; i < charArr.length; i++) {
	            int left = i - 1; // 왼쪽 인덱스
	            int right = i + 1; // 오른쪽 인덱스
	            
	            // 홀수 길이의 팰린드롬 체크
	            while (left >= 0 && right < charArr.length && charArr[left] == charArr[right]) {
	                answer = Math.max(answer, right - left + 1); // 팰린드롬 길이 업데이트
	                left--;
	                right++;
	            }

	            left = i; // 왼쪽 인덱스 초기화
	            right = i + 1; // 오른쪽 인덱스 초기화

	            // 짝수 길이의 팰린드롬 체크
	            while (left >= 0 && right < charArr.length && charArr[left] == charArr[right]) {
	                answer = Math.max(answer, right - left + 1); // 팰린드롬 길이 업데이트
	                left--;
	                right++;
	            }
	        }

	        return answer;
	 }
}
