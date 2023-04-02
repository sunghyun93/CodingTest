
public class Test0402_2 {
	public static int solution(int number, int limit, int power) {
        int answer = 0;
        int divisior; //약수
       
        
        //일단 먼저 number안에 들어가있는 숫자의 약수 구하기
        for( divisior=1; divisior <= number; divisior++) {
        	int count=0;
        	
        	for(int j=1; j*j <= divisior;j++) {
        		if(j*j == divisior) count++;
        		else if(divisior % j ==0) count+=2;
        	}
        	//limit 조건 처리
        	 answer+= count > limit ? power : count;
        	 
       
        }// for
        
        
        
        return answer;
   }
	
		
	public static void main(String[] args) {
		
		System.out.println(solution(10,3,2));
	}
		
		
	
	
	
		
}

