
public class Test0329_3 {
	public static String Solution(String phone_number) {
		String answer = "";
		
		int index =phone_number.length()-4; //전화번호 뒷 네자리를 제외하기 위해서 
		
		char [] phone = phone_number.toCharArray();
		for(int i = 0; i<index; i++) {
			phone [i] = '*';
			
			answer = new String(phone);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		
		System.out.println(Solution("01033334444"));
		
	}
}
