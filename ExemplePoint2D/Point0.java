/**
 * Point 2D, representé par deux coordonnées entières.
 * @author Mathieu Chabanas, modifications Nicolas Castagné
 * 2015 -> 2017
 * Attention : seule la dernière version Point3 de la classe est "propre"
 */
class Point0 {
	// les attributs : en haut de la classe

	/** Abscisse du point */
	int x;

	/** Ordonnee du point */
	int y;

	// les méthodes

	/**
	 * Translate le point a la position (x+dx, y+dy).  
	 * @param dx deplacement selon la coordonnee x
	 * @param dy deplacement selon la coordonnee y
	 */
	void translate(int dx, int dy) {
		this.x += dx;
		this.y += dy;
	}
}
