
public class Test0418_4 {
	Position left;
	Position right;
	Position numPos;
	
	 public String solution(int[] numbers, String hand) {
	        String answer = "";
	        //1. 왼손 오른손 위치를 초기화
	       left = new Position(3,0);
	       right = new Position(3,2);
	       
	       for(int num: numbers) {
	    	   //2. 숫자를 누를 손가락 정하기
	    	   numPos = new Position((num-1)/3 , (num-1) % 3); //계산식이 좀 헷갈림
	    	   if(num == 0) {
	    		   numPos = new Position(3,1);
	    		 
	    	   }
	    	   String finger = numPos.getFinger(hand);
	    	   //3. 정해진 손가락을 answer에 담고 손가락 위치 이동
	    	   answer += finger;
	    	   if(finger.equals("L")) {
	    		   left = numPos;
	    	   }else right = numPos;
	    		   
	    	   
	       }
	       
	        
	       
	        
	       
	        
	        return answer;
	    }
	 
	 public class Position{
		 int row;
		 int colume;
		 
		 Position(int row, int colume){
			 this.row = row;
			 this.colume = colume;
		 }
		 
		 public String getFinger(String hand) {
			 String finger = hand.equals("right")? "R":"L";
			 
			 if(this.colume == 0) finger = "L";
			 else if (this.colume == 2) finger = "R";
			 else {
				 int leftDist = left.getDistance(this);
				 int rightDist = right.getDistance(this);
				 
				 if(leftDist < rightDist) {
					 finger ="L";
				 }else if (rightDist < leftDist) {
					 finger = "R";
				 }
			 }
			 return finger;
		 }
		 
		 public int getDistance(Position p) {
			 return Math.abs(this.row - p.row) + Math.abs(this.colume - p.colume);
		 }
	 }
}


