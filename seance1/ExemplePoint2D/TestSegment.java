public class TestSegment {

	public static void main(String[] args) {
		Point3 p0 = new Point3(1, 1);
		Point3 p1 = new Point3(2, 2);
		Point3 p2 = new Point3(4, 3);
		
		Segment s1 = new Segment(p0, p1);
		Segment s2 = new Segment(p1, p2);
		
		System.out.println("s1 " + s1);
		System.out.println("s2 " + s2);

		p1.translate(3,3);
		
		System.out.println("Apres translation de p1");
		System.out.println("s1 " + s1);
		System.out.println("s2 " + s2);
		
		s1.translate(3,3);
		
		System.out.println("Apres translation de s1");
		System.out.println("s1 " + s1);
		System.out.println("s2 " + s2);
	}
}
