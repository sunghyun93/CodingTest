
public class Test0425_2 {
	 public int solution(int[][] board) {
	        int answer = 0;
	        int length = board.length;
	        int [][] arr = new int[board.length][board[0].length];
	        
	        for(int i=0; i< board.length; i++) {
	        	for(int j=0; j < board[0].length; j++) {
	        		if(board[i][j] == 1) {
	        			makeBoom(i,j,length,arr);
	        		}
	        	}
	        }
	        
	        for(int i=0; i<board.length; i++) {
	        	for(int j=0; j<board[0].length; j++) {
	        		if(arr[i][j] == 0)
	        			answer++;
	        	}
	        }
	        return answer;
	    }
	 
	 private static void makeBoom(int row, int col, int length, int [][] arr) {
		 for(int i = row-1; i <= row+1; i++) {
			 if( i < 0 || i >= length) {
				 continue;
			 }else {
				 for(int j=col-1; j<=col+1; j++) {
					 if(j < 0 || j >= length) {
						 continue;
					 }else {
						 arr[i][j] = 1;
					 }
				 }
			 }
		 }
	 }
}
