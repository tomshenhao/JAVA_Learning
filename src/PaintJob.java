
public class PaintJob {
	public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
		int result=0;
		if(width<=0|height<=0|areaPerBucket<=0|extraBuckets<0) {
			result=-1;
		}else {
			result=(int)(Math.ceil(width*height/areaPerBucket-extraBuckets));
		}
		return result;		
	}
	
	public static int getBucketCount(double width, double height, double areaPerBucket) {
		int result=0;
		if(width<=0|height<=0|areaPerBucket<=0) {
			result=-1;
		}else {
			result=(int)(Math.ceil(width*height/areaPerBucket));
		}
		return result;	
	}
	
	public static int getBucketCount(double area, double areaPerBucket) {
		int result=0;
		if(area<=0|areaPerBucket<=0) {
			result=-1;
		}else {
			result=(int)(Math.ceil(area/areaPerBucket));
		}
		return result;	
	}
}
