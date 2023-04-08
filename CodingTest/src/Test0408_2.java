
public class Test0408_2 {
	public double solution(int[] arr) {
        double answer = 0;
        double sum=0;
        for(int i=0; i< arr.length; i++) {
        	answer=(sum+=arr[i])/arr.length;
        }
        
        return answer;
    }
}
