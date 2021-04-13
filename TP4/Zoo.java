import java.util.*;
import animals.*;

/** Une classe représentant un Zoo :
 *
 * Un zoo a un nom, et peut contenir un nombre quelconque d'animaux.
 * On peut : ajouter un nouvel animal, récupérer le nombre d'animaux, calculer le cout de nourriture
 * total, récupérer une chaine de caractères représentant l'état du Zoo.
 *
 */public class Zoo {
	private String nom;
	private LinkedList<Animal> animaux;

	/** Construit le zoo de nom name, initialement vide */
	public Zoo(String name) {
		nom=name;
		animaux = new LinkedList<Animal>();
	}

	/** Ajoute l'animal a au zoo */
	public void ajoute(Animal a) {
		// vérifier que l'animal a a un nom unique
		Animal[] animauxArray = animaux.toArray(new Animal[0]);
		for(int index = 0; index < animaux.size(); index++){
			if(animauxArray[index].getName().equals(a.getName())){
				throw new IllegalArgumentException("Un animal ayant déjà ce nom est présent dans le zoo");
			}
		}
		animaux.add(a);
	}

	public Animal trouver(String nom){
		Animal[] animauxArray = animaux.toArray(new Animal[0]);
		for(int index = 0; index < animaux.size(); index++){
			if(animauxArray[index].getName().equals(nom)){
				return animauxArray[index];
			}
		}
		return null;
	}

	public void supprimer(String nom){
		Animal[] animauxArray = animaux.toArray(new Animal[0]);
		for(int index = 0; index < animaux.size(); index++){
			if(animauxArray[index].getName().equals(nom)){
				animaux.remove(index);
			}
		}
		System.out.println("Impossible de supprimer l'animal appelé " + nom + " car il n'existe pas");
	}

	/** Retourne le nombre d'animaux contenu dans le zoo */
	public int nbAnimaux() {
		return animaux.size();
	}

	/** Retourne le cout total du zoo par jour (cout de nourriture) */
	public double coutTotal() {
		double cout = 0;
		for(Animal a : animaux) {
			cout += a.getCout();
		}
		return cout;
	}

	/** Retourne une chaine de caractères repréentant l'état du zoo et de tous ces animaux */
	public String toString() {
		String s= "Zoo:"+nom+" avec "+nbAnimaux()+" animaux\n";
		for (Animal a : animaux) s += "     " + a + "\n";
		return s;
	}
}
