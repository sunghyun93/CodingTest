
public class Test0413_4 {
	public int[][] solution(int n, int[][] signs) {
		// 결과를 저장할 2차원 배열 생성
	    int[][] answer = new int[n][n]; 
	    // 모든 정류장을 출발지로 설정
	    for (int i = 0; i < n; i++) { 
	    	// 모든 정류장을 목적지로 설정
	        for (int j = 0; j < n; j++) {
	            if (signs[i][j] == 1) { // i번째 정류장에서 j번째 정류장으로 직접 가는 버스가 있는 경우
	                answer[i][j] = 1; // 직접 가는 경로를 표시
	            } else { // 직접 가는 버스가 없는 경우
	                for (int k = 0; k < n; k++) { // 다른 정류장을 거쳐가는 경로 확인
	                	// i번째 정류장에서 k번째 정류장으로 갈 수 있고, k번째 정류장에서 j번째 정류장으로 갈 수 있는 경우
	                    if (signs[i][k] == 1 && signs[k][j] == 1) { 
	                        answer[i][j] = 1; // 갈아타는 경로를 표시
	                        break; // 더 이상 다른 정류장을 거쳐가는 경우 확인할 필요 없으므로 반복문 종료
	                    }
	                }
	            }
	        }
	    }

	    return answer; // 결과 반환
	}
}
