
public class Test0404_3 {
	public static long solution(int price, int money, int count) {
		 long answer = -1;
	        
	        long total = 0L;
	        
	        for(int i = 1; i <= count; i++) {
	        	total += (price*i);
	        }
	        
	        if(money - total >= 0) return 0;
	        else return total - money;
       
   }
	
	public static void main(String[] args) {
		solution(3,20,4);
	}
}
