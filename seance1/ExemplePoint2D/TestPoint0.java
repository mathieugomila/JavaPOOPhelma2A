public class TestPoint0 {

	public static void main(String[] args) {

		// un exemple de boucle + variable
		for (int i = 0; i < 5; i++) {
			System.out.print(i);
		}
		double pi = 3.1415927;
		System.out.println("; pi = " + pi);


		// creation/manipulation d'objets
		Point0 p0 = null; 
		p0 = new Point0();

		p0.x = -2;
		p0.y = 1;
		System.out.println("p0: (" + p0.x + "," + p0.y + ")");

		Point0 p1 = new Point0(); 
		p1 = p0;
		p1.translate(2, 2);
		System.out.print("Maintenant, p0 vaut: ");
		System.out.println("(" + p0.x + "," + p0.y + ")");
	}
}
