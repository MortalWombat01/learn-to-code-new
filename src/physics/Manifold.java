package physics;

import com.navinf.learntocode.*;

public class Manifold {
	public Element A;
	public Element B;
	public double penetration;
	public Vec2 normal;
	
	public Manifold(Element A, Element B){
		this.A = A;
		this.B = B;
	}
	
}
