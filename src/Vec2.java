
public class Vec2 {
	
	public double x, y = 0;
	
	/** returns a new vector */
	public static Vec2 vec2(double x, double y){
		return new Vec2(x, y);
	}
	
	private Vec2(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	/** returns a vector of length 1 pointing into the direction of this angle */
	public static Vec2 degreesToVec(double ang){
		return vec2(Math.cos(Math.toRadians(ang)), Math.sin(Math.toRadians(ang)));
	}
		
	
	public Vec2 mul(double f){
		return vec2(this.x * f, this.y * f);
	}
}
