public class TestPoint3 {

	public static void main(String[] args) throws Exception {

		Point3 p0 = new Point3(-2, 2);
		Point3 p1 = p0; // copie de p0
		Point3 p2 = new Point3(p0); // p2 et p0 réfèrent le même objet

		System.out.println("p0 : " +p0.toString());
		System.out.println("p1 : " + p1); // toString() optionnel :
		System.out.println("p2 : " + p2); // Java l'appelle tout seul !

		// comparaison d'objets: == vs equals
		String res = new String("avec == p0 et p1 sont:      ");
		if (p0 == p1)
			res = res + "identiques";
		else
			res = res + "differents";
		System.out.println(res);

		res = new String("avec == p0 et p2 sont:      ");
		if (p0 == p2)
			res = res + "identiques";
		else
			res = res + "differents";
		System.out.println(res);

		res = new String("avec equals p0 et p2 sont:  ");
		if (p0.equals(p2))
			res = res + "identiques";
		else
			res = res + "differents";
		System.out.println(res);
	}
}
