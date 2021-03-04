/**
 * Point 2D, representé par deux coordonnées entières.
 * @author Mathieu Chabanas, modifications Nicolas Castagné
 * 2015 -> 2017
 * Attention : seule la dernière version Point3 de la classe est "propre"
 */

// Ajout d'un INVARIANT DE CLASSE: y > 0 (why not?)
public class Point1 {

	public int x;
	private int y;	// attribut PRIVE

	/**
	 * Accesseur (get): accède en lecture à l'ordonnée du point.
	 * @return la valeur de y
	 */
	public int getY() {
		return this.y; // ou return y; => le "this" est optionnel
	}

	/**
	 * Mutateur (set): modifie l'ordonnée du point.
	 * @throws IllegalArgumentException si la nouvelle ordonnée ne vérifie 
	 * pas l'invariant this.y >= 0
	 */
	public void setY(int y) {
		if (y <= 0) {
			throw new IllegalArgumentException("Invariant sur y non respecte");
		}
		this.y = y;		// this obligatoire pour level l'ambiguité
		// entre paramètre y de la méthode et attribut y
	}

	public void translate(int dx, int dy) {
		this.x += dx;	// ou x+=dx : le this est optionnel
		this.y += dy;	// danger?
	}

	// SURCHARGE de la methode : même nom, paramètre différents
	public void translate(int dx) {
		translate(dx, 0);	// en fait this.translate(dx, 0) 
	}
}
