/**
 * Point 2D, representé par deux coordonnées entières.
 * @author Mathieu Chabanas, modifications Nicolas Castagné
 * 2015 -> 2017
 * Attention : seule la dernière version Point3 de la classe est "propre"
 */

// Mise en place de la méthode equals()
public class Point3 {
	// "vraie classe Java bien écrite" x serait aussi private
	public int x; 
	private int y;


	/** Construit un point de coordonnées (a,y). */
	public Point3(int a, int y) {
		x = a;
		setY(y);		// pourquoi pas this.y = y ? 
	}

	// => on parle de CONSTRUCTEUR PAR COPIE, à partir du point p existant
	/** Construit un point de même coordonnées que p. */
	public Point3(Point3 p) {
		this.x = p.x;
		this.y = p.y;	// dangeureux ou non? utiliser setY?
	}

	// constructeur sans paramètre => on parle de CONSTRUCTEUR PAR DEFAUT
	/** Construit un point de coordonnées (0,0). */
	public Point3() {
		this(0, 0);		// réinvoque un autre constructeur 
	}


	public int getY() {
		return this.y;
	}

	public void setY(int y) {
		if (y <= 0) {
			throw new IllegalArgumentException("Invariant sur y non respecte");
		}
		this.y = y;		
	}

	public void translate(int dx, int dy) {
		x += dx;
		setY(y + dy);
	}


	/**
	 *  Retourne représentation de l'objet sous forme de chaine de 
	 *  caracteres: "(x,y)"
	 */	 
	@Override
	public String toString() {
		return new String("(" + x + ", " + y + ")"); 
	}

	/**
	 * Indique si l'objet o est "égal" à l'instance.
	 * Ici cela signifie qu'ils sont du même type (Point3)
	 * et de même coordonnées.	 
	 */
	@Override
	public boolean equals(Object o) {
		return  o instanceof Point3
				&& ((Point3) o).x == this.x
				&& ((Point3) o).y == this.y;
	}
}
