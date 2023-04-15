import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test0415_5 {
	public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i < arr.length; i++) {
        	if(arr[i]%divisor == 0) {
        		list.add(arr[i]);
        		
        	}
        }
        
        if(list.isEmpty()) {
        	int [] dap = {-1};
        	
        	return dap;
        }else {
        	list.sort(Comparator.naturalOrder());
            int[] answer = new int[list.size()];

            for(int j=0; j<list.size(); j++) {
                answer[j] = list.get(j);
            }

            return answer;
        }
        
    }
}
