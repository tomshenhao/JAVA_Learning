package previous_section;

public class Point {
	private int x;
	private int y;
	
	public Point() {
	}
	
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void setX(int number) {
		this.x=number;
	}
	
	public void setY(int number) {
		this.y=number;
	}
	
	public double distance() {
		return Math.sqrt(this.x*this.x+this.y*this.y);
	}
	
	public double distance(int x, int y) {
		return Math.sqrt((x-this.x)*(x-this.x)+(y-this.y)*(y-this.y));
	}
	
	public double distance(Point another) {
		return Math.sqrt((another.x-this.x)*(another.x-this.x)+(another.y-this.y)*(another.y-this.y));
	}
}
