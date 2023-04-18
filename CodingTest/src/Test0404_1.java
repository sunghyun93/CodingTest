
public class Test0404_1 {
	public int[] solution(String[] wallpaper) {
		//좌상단에서 가장 큰 애를 찾으면 된다.
        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        
        //우하단에서 가장 작은애를 찾으면 된다.
        int maxX = Integer.MIN_VALUE;
        int maxY = Integer.MIN_VALUE;
        
        
		
        
        int x =  wallpaper.length;
        int y = wallpaper[0].length();
        
        for(int i=0; i< x; i++) {ㅇ
        	for(int j=0; j < y; j++) {
        		if(wallpaper[i].charAt(j) == '#') {
        			 minX = Math.min(minX,i);
                     minY = Math.min(minY,j);
                     maxX = Math.max(maxX,i);
                     maxY = Math.max(maxY,j);
        		}
        	}
        }
        
        
        
        
        
        
        return new int[] {minX,minY,maxX+1,maxY+1};
    }
}
