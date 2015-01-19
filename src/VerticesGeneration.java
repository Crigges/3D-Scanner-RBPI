import java.util.ArrayList;

public class VerticesGeneration {
	
	
	
	public static final ArrayList<Vec3> genVertices(ArrayList<ArrayList<Vec2>> results){
		ArrayList<Vec3> res = new ArrayList<>();
		double angfactor = 360 / results.size();
		int i = 0;
		for(ArrayList<Vec2> list : results){
			Vec2 dir = Vec2.degreesToVec(angfactor * i);
			i++;
			for(Vec2 vec : list){
				Vec2 buffer = dir.mul(Settings.middle - vec.x);
				res.add(Vec3.vec3(buffer.x, buffer.y, vec.y));
			}
		}
		return res;
	}

}
