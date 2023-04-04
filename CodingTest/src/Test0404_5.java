import java.util.HashSet;

public class Test0404_5 {
	public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        //여벌이 있는 학생을 담은 Hash리스트 
        HashSet<Integer> reserveSet = new HashSet<Integer>();
        //체육복을 잃어버린  학생을 담은 Hash리스트 
        HashSet<Integer> lostSet = new HashSet<Integer>();
        
        for(int i : reserve) {
        	reserveSet.add(i);
        }
        
        for(int i : lost) {
        	lostSet.add(i);
        
	        //중복확인
	        if(reserveSet.contains(i)) {
	        	reserveSet.remove(i);
        	}else {
        		lostSet.add(i);
        	}
        }
        
        
        //여분을 기준으로 앞뒤로 확인해서 체육복을 빌려준다.
        for (int i : reserveSet) {
            if (lostSet.contains(i - 1)) {
                lostSet.remove(i - 1);
            } else if (lostSet.contains(i + 1)) {
                lostSet.remove(i + 1);
            }
        }

        // 3. 전체 학생 수에서 lostSet에 남은 학생 수를 빼주면 정답이다.



        
        return n - lostSet.size();
    }
}
