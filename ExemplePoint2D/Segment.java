public class Segment {

	private Point3 p1;
	private Point3 p2;

	/* construit le segment [ (0,0) , (1,1) ] */
	public Segment() {
		this.p1 = new Point3(0,0);
		this.p2 = new Point3(1,1);
	}
	
	public Segment(Point3 p1, Point3 p2) {
		this.p1 = p1; // ou new Point3(p1); ???
		this.p2 = p2; // ou new Point3(p2); ???
	}
	
	public Segment(int x1, int y1, int x2, int y2) {
		this(new Point3(x1, y1), new Point3(x2, y2));
	}
	
	/* construit le segment [ (0,0) , (x2,y2) ] */
	public Segment(int x2, int y2) {
		this(new Point3(0, 0), new Point3(x2, y2));
	}
	
	public Segment(Segment other) {
		this(new Point3(other.p1), new Point3(other.p2));
	}

	// euh... est-ce legitime ?
	public Point3 getP1() {
		return this.p1;
	}

	// euh... est-ce legitime ?
	public Point3 getP2() {
		return this.p2;
	}

	public void setP1(Point3 p) {
		this.p1 = p; // ou bien : this.p1 = new Point3(p1) ; ???
	}

	public void setP2(Point3 p) {
		this.p2 = p; // ou bien : this.p1 = new Point3(p2) ; ???
	}

	public double getLength() {
		return Math.sqrt( (p2.getY() - p1.getY()) * (p2.getY() - p1.getY())
				- (p2.x - p1.x) * (p2.x - p1.x)   )  ;
	}
	
	public void translate(int dx, int dy) {
		p1.translate(dx, dy);
		p2.translate(dx, dy);
	}
	
	@Override
	public String toString() {
		return new String(" Segment [" + p1 + " , " + p2 + "]"); 
	}

	@Override
	public boolean equals(Object o) {
		return  o instanceof Segment
				&& ((Segment) o).p1.equals(this.p1)
				&& ((Segment) o).p2.equals(this.p2);
	}
}
