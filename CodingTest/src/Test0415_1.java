
public class Test0415_1 {
	
	public int solution(String s) {
		int answer = 0;
		char [] charArr = s.toCharArray();
		
		for(int i=0; i<s.length(); i++) {
			for( int j=s.length()-1; j > 0; j++) {
				if(charArr[i] == charArr[j]) {
					boolean isPalindrome = true;
					
					for(int k=i; k <= j; k++) {
						if(charArr[k] != charArr[i+j-k]) {
							
						}
					}
				}
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
