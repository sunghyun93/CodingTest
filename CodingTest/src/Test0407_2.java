
public class Test0407_2 {

	public static void main(String[] args) {
		for(int i=0; i<6; i++) {
    		for(int j=0; j<6; j++) {
    			if(i-j == 0) {
    				System.out.print("A");
    			} else {
    				System.out.print("a");
    			}  
    		}
    		System.out.println();
    	}
		for(int i=0; i<6; i++) {
    		for(int j=0; j<6; j++) {
    			if(i+j == 5) {
    				System.out.print("A");
    			} else {
    				System.out.print("a");
    			}
    		}
    		System.out.println();
    	}

	}

}
