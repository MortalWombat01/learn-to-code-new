package physics;

public class Vec2 {
	
	private int x;
	private int y;
	
	public Vec2( int x, int y ){
		setX(x);
		setY(y);
	}
	
	public void set(double x, double y){
		setX(x);
		setY(y);
	}
	
	public void setX(double x) {
		this.x = (int)x;
	}
	
	public void setY(double y) {
		this.y = (int)y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
}
