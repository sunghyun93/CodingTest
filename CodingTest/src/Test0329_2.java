
public class Test0329_2 {
	public int [][] solution(int [][] arr1, int [][] arr2) {
		int [][] answer = new int[arr1.length][arr2.length];
		
		for(int i=0; i < answer.length; i++) {
			for(int j=0; i< answer[i].length; j++) {
				answer[i][j] = arr1[i][j]+arr2[i][j];
			}
		}
		return answer;
	}
}

