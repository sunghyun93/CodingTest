import java.util.ArrayList;
import java.util.List;

public class Test0413_5 {
	public static int[][] solution(int n, int[][] signs) {
	    List<List<Integer>> view = new ArrayList<>();

	    for (int i = 0; i < n; i++) {
	        List<Integer> temp = new ArrayList<>();
	        for (int j = 0; j < n; j++) {
	            if (signs[i][j] == 1) {
	                temp.add(j);
	            }
	        }
	        view.add(temp);
	    }

	    for (int x = 0; x < n; x++) {
	        for (int i = 0; i < n; i++) {
	            List<Integer> temp = new ArrayList<>();
	            for (int j : view.get(i)) {
	                for (int k : view.get(j)) {
	                    temp.add(k);
	                }
	            }

	            for (int p = 0; p < temp.size(); p++) {
	                if (!view.get(i).contains(temp.get(p))) {
	                    view.get(i).add(temp.get(p));
	                }
	            }
	        }
	    }

	    int[][] answer = new int[n][n];

	    for (int i = 0; i < n; i++) {
	        for (int j = 0; j < view.get(i).size(); j++) {
	            answer[i][view.get(i).get(j)] = 1;
	        }
	    }

	    return answer;
	}
	
	public static void main(String[] args) {
		int n = 3;
		int[][] signs = {{0,0,1},{0,0,1},{0,1,0}};
		
		for(int i=0; i< n; i++) {
			System.out.println();
			for(int j=0; j < n; j++) {
				System.out.print(solution(n,signs)[i][j]);
			}
		}
		

	}


}
