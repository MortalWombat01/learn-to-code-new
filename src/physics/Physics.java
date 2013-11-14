package physics;

import com.navinf.learntocode.*;

public class Physics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static boolean colliding(Manifold m){
		
		Element A = m.A;
		Element B = m.B;
		
		Vec2 n = new Vec2(B.getX() - A.getX(), B.getY() - A.getY());
		
		double a_extent = (A.getMax().getX()- A.getMin().getX()) / 2;
		double b_extent = (B.getMax().getX()- B.getMin().getX()) / 2;
		
		double x_overlap = a_extent + b_extent - Math.abs(n.getX());
		
		if(x_overlap <= 0){
			return false;
		}
		
		a_extent = (A.getMax().getY()- A.getMin().getY()) / 2;
		b_extent = (B.getMax().getY()- B.getMin().getY()) / 2;
		
		double y_overlap = a_extent + b_extent - Math.abs(n.getY());
		
		if(y_overlap <= 0){
			return false;
		}
		
		if(x_overlap > y_overlap){
			if(n.getX() < 0){
		          m.normal = new Vec2( -1, 0 );
			}else{
		          m.normal = new Vec2( 0, 0 );
		          m.penetration = x_overlap;
		          return true;
			}
		} else {
			if(n.getY() < 0){
		          m.normal = new Vec2( 0, -1 );
			}else{
		        m.normal = new Vec2( 0, 1 );
		        m.penetration = y_overlap;
		        return true;
			}
		}
		
		
		return false;
	}

}
