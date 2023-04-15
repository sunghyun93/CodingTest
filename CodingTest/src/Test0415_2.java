
public class Test0415_2 {
	  public int solution(int[][] triangle) {
	        int answer = 0;
	        int height = triangle.length;
	        
	        //삼각형의 각 위치에서 최댓값을 저장할 배열 생성
	        int [][] dap = new int[height][height];
	        dap[0][0] = triangle[0][0];
	        
	        for(int i=1; i<height; i++) {
	        	dap[i][0] = dap[i-1][0]+triangle[i][0];
	        	dap[i][i] = dap[i - 1][i - 1] + triangle[i][i];
	        }
	        
	        // 2. 동적계획법 //
	        for(int i = 2; i < triangle.length; i++) {
	            for(int j = 1; j < i; j++) {
	            	dap[i][j] = Math.max(dap[i - 1][j - 1], dap[i - 1][j]) + triangle[i][j];
	            }
	        }

	        // 3. 최대값 반환 //
	        int max = 0;
	        for(int i = 0; i < dap.length; i++) {
	            max = Math.max(max, dap[dap.length - 1][i]);
	        }
	        
	        //삼각형의 맨 아래층은 그대로 값으로 저장
	        return max;
	        
	    }
}
