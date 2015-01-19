
public class Vec3 {
	
	public double x, y, z = 0;
	
	public static Vec3 vec3(double x, double y, double z){
		return new Vec3(x, y, z);
	}
	
	private Vec3(double x, double y, double z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public Vec3 mul(double f){
		return vec3(this.x * f, this.y * f, this.z * f);
	}
}
