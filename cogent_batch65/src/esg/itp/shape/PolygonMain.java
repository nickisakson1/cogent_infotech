package esg.itp.shape;

public class PolygonMain {
	
	public static void main(String[] args) {
		
		Square s = new Square(2.5f);
		Rectangle r = new Rectangle(1.5f,3.0f);
		
		s.calcPeri();
		r.calcPeri();
		s.calcArea();
		r.calcArea();
		
		s.display();
		r.display();
	}

}
