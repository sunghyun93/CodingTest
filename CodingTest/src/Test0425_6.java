
public class Test0425_6 {
	public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int gcd =  gcd(Math.max(denom1,denom2), Math.min(denom1, denom2)); //최대공약수
        int n = lcm(denom1,denom2); //최소 공배수
        //sint denum = ()d
        
        return answer;
    }
	
	//최대공약수
	int gcd(int num1,int num2 ) {
		while(num2 !=0) {
			int temp = num1 % num2;
		    num1 = num2;
		    num2 = temp;
		}
		return num2;
	}
	
	 //최소공배수
	int lcm(int num1,int num2 ) {
		return num1 * num2 / gcd(num1,num2);
	}
}
