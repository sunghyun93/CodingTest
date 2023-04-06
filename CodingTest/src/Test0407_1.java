
public class Test0407_1 {

	public static void main(String[] args) {
		int num = 5;
        int t = 3;
        int out = 0;
        
        	for(int i=0; i<num; i++){
            	out += t; //3 
                if(out > num){
                	out = num * out ; // 5 * 6
                    out = out * i ;    // 30 * 2 
                    break;
                }
                i++;
            }
            System.out.println(out);
	}

}
