public class TestPoint1 {

	public static void main(String[] args) { //throws Exception {

		Point1 p0 = new Point1();

		p0.x = -2;
//		p0.y = 2;	// Impossible : y est privé
		p0.setY(2);

		System.out.println("p0 (1): (" + p0.x + "," + p0.getY() + ")");

		try {
			p0.setY(-3);
		} catch (IllegalArgumentException e) {
			System.out.println("Exception attrapée: " + e);
			System.out.println("mais pas de traitement ici, on continue");
		}
		System.out.println("p0 (2): (" + p0.x + "," + p0.getY() + ")");

		p0.setY(-3);	// insistons!

		System.out.println("p0 (3): (" + p0.x + "," + p0.getY() + ")");
		// p0 est-il affiche?
	}
}
