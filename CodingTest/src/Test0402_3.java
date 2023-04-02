
public class Test0402_3 {
	 public int[] solution(int n, int m) {
	        int[] answer = new int[2];
	        answer[0]=gcd(n,m);
	        answer[1]=lcm(n,m);
	        return answer;
	    }
	 
	 //최대공약수 
	 int gcd(int a, int b) {
		 while(b !=0) {
			  int temp = a % b; //나머지
			  a = b;
			  b  = temp;
		 }
		return a;
	 }
	 
	 //최소공배수
	 int lcm(int a, int b) {
		 return a * b / gcd(a,b);
	 }
	 
}
