import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Test0412_3 {
	  public int[] solution(int[] lottos, int[] win_nums) {
		  		
		  		//중복된 숫자는 안나오기때문에 set으로 만듬
		        HashSet<Integer> lotto_num = new HashSet<>();
		        HashSet<Integer> win_num = new HashSet<>();

		        int zero_cnt = 0 ;
		        for(int l : lottos) {

		            if(l != 0) {
		                lotto_num.add(l);   
		            }else {
		                zero_cnt += 1;
		            }
		        }

		        for(int l : win_nums) {
		            if(l != 0) {
		                win_num.add(l); 
		            }
		        }

		        lotto_num.retainAll(win_num);  

//		      result[0] = lotto_num.size();
//		      result[1] = lotto_num.size() + zero_cnt;

		        int max_cnt = lotto_num.size() + zero_cnt; 
		        int min_cnt = lotto_num.size(); 



		        int[] answer = new int[2];
		        answer[0] = ranking(max_cnt);
		        answer[1] = ranking(min_cnt);


		        return answer;
		    }

		    
	  
	  public static int ranking(int cnt) {

	        if(cnt == 6) {
	            return 1;
	        }else if (cnt == 5) {
	            return 2;
	        }else if (cnt == 4) {
	            return 3;
	        }else if (cnt == 3) {
	            return 4; 
	        }else if (cnt == 2) {
	            return 5; 
	        }else {
	            return 6;
	        }
	        
	        
	  }
}
