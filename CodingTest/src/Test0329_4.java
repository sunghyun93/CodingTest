
public class Test0329_4 {

	public static String solution(int n) {
	        
			StringBuilder sb = new StringBuilder(n);
			
	        int l = sb.length();
	        
	        
	        for(int i = 0; i < l; i++) {
	        	sb.append(i%n == 0 ? '수':'박');
	        }

	        return sb.toString();
	        
    }
	
	public static void main(String[] args) {
		
		System.out.println(solution(2));
		
	}
}
