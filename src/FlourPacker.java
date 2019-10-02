
public class FlourPacker {
	public static boolean canPack(int bigCount, int smallCount, int goal) {
		boolean result=false;
		
		if (bigCount<0 | smallCount<0 | goal<0) {
			result=false;
		} else {
			if(bigCount*5+smallCount==goal) {
				result=true;
			} else if(bigCount*5+smallCount>goal) {
				for(int i=0;i<=bigCount; i++){
				    for (int j=0; j<=smallCount; j++){
				        if(i*5+j==goal){
				            result=true;
				        }
				    }
				}
			}
		}
		
		return result;
	}
}
