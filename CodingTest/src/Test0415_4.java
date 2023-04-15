import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test0415_4 {
	public static int[] solution(int[] arr) {
		 if (arr.length == 1) {
	            arr[0] = -1;
	            return arr;
	        } else {
	            ArrayList<Integer> arrayList = new ArrayList<Integer>();
	            for (int a : arr) {
	                arrayList.add(a);
	            }
	            Integer minimum = Collections.min(arrayList);
	            arrayList.remove(minimum);
	            int[] resultArray = new int[arr.length - 1];
	            for (int i = 0; i < arrayList.size(); ++i) {
	                resultArray[i] = arrayList.get(i);
	            }
	            return resultArray;
	        }
      
    }
	
	public static void main(String[] args) {
		int [] a = {4,3,2,1};
		for(int i=0; i< a.length; i++) {
			System.out.print(solution(a)[i]);
		}
		
		
	}
}
