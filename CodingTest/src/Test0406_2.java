
public class Test0406_2 {

	
	
	 public static int solution(int[] number) {
	        int answer = 0;
	        int sum=0;
	        
	        /*
	        sum = number[0]+number[1]+number[2];   sum = number[1]+number[2]+number[3];  sum = number[2]+number[3]+number[4];
	        sum = number[0]+number[2]+number[3];   sum = number[1]+number[3]+number[4];
	        sum = number[0]+number[3]+number[4]; 
	         */
	        
	       /*
	       number[0] + number[1] + number [2]    number[0] + number[2] + number[3]	  number[0] + number[2] + number[4]
		   number[1] + number[2] + number [3]	
		   number[2] + number[3] + number [4]
	    		
	    	*/	   
	        
	        
	        	  
	        
	        for(int i=0; i < number.length; i++) { //5
	        	for(int j = i+1; j < number.length; j++ ) { //6
	        		for(int z = j+1; z < number.length; z++) { //7 
	        			if(number[i]+number[j]+number[z] == 0) 
	        				answer++;
	        		}
	        	}
	        }
	        return answer;
	    }
	 
	 public static void main(String[] args) {
	 		int [] n = {-3,-2,-1,0,1,2,3};
			System.out.println(solution(n));
		}

}
