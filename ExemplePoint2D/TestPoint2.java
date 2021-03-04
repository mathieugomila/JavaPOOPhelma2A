public class TestPoint2 {

	public static void main(String[] args) throws Exception {

		Point2 p0 = new Point2();	
		Point2 p1 = new Point2(-2, 2);
		Point2 p2 = new Point2(p0);

		System.out.println("p0: " + p0.toString());
		System.out.println("p1: " + p1);
		System.out.println("p2: " + p2);

		p2.translate(10, 10);
		System.out.println("p0: " + p0.toString());
		System.out.println("p2: " + p2);

//		p1.translate(0, -6);
//		System.out.println(p1);
	}
}
