package animals;
import java.util.*;


public abstract class Animal {
  private String nom;
  private double poids;
  private Animal pere, mere;
  private LinkedList<Animal> enfants;
  // private double qteNour;

  // Quand pere et mere enfantent
  public Animal(String nom, double poids, Animal pere, Animal mere){ // , double qteNour
    this.nom = nom;
    this.poids = poids;
    this.pere = pere;
    this.mere = mere;
    this.enfants = new LinkedList<Animal>();
    if(this.pere != null && this.mere != null){
      this.pere.nouvelEnfant(this);
      this.mere.nouvelEnfant(this);
    }
    // this.qteNour =qteNour;
  }

  public int getNombreDescendants(){
    int compteur = 0;
    LinkedList<String> nomsDescendants = this.getHashCodesDescendants();
    String[] nomsDescendantsArray = nomsDescendants.toArray(new String[0]);
    for(int i = 0; i < nomsDescendantsArray.length; i++){
      if(nomsDescendantsArray[i] != null){
        compteur++;
        String nom = nomsDescendantsArray[i];
        // supprimer doublons :
        for(int j = i; j < nomsDescendantsArray.length; j++){
          if(nomsDescendantsArray[j] != null && nomsDescendantsArray[j].equals(nom)){
            nomsDescendantsArray[j] = null;
          }
        }
      }
    }
    return compteur;
  }

  public LinkedList<String> getHashCodesDescendants(){
    LinkedList<String> hashcodes = new LinkedList<String>();
    if(enfants == null || enfants.size() == 0){
      System.out.println(this.getName() + " PAS DENFANTS");
      return null;
    }
    Animal[] enfantsArray = enfants.toArray(new Animal[0]);
    for(Animal a : enfantsArray){
      hashcodes.add(a.getName());
      LinkedList<String> hashcodesEnfants = a.getHashCodesDescendants();
      if(hashcodesEnfants != null && hashcodesEnfants.size() != 0){
        hashcodes.addAll(hashcodesEnfants);
      }
    }
    return hashcodes;
  }

  public void nouvelEnfant(Animal enfant){
    enfants.add(enfant);
  }

  // Quand on ne connait pas les parents
  public Animal(String nom, double poids){ // , double qteNour
    this(nom, poids, null, null);
    // this.qteNour =qteNour;
  }

  public double getPoids(){
    return poids;
  }

  public String getName(){
    return nom;
  }

  abstract String getCri();

  public void setPoids(double p){
    if(p<0){
      throw new IllegalArgumentException("Le poids d'un animal ne peut pas être négatif\n");
    }
    poids = p;
  }

  abstract public double getCout();

  @Override
  public String toString(){
    return "Nom : " + nom + "\nPoids : " + poids + " kg";
  }

  @Override
  public boolean equals(Object o){
    if (! (o instanceof Animal) ) return false;
    Animal a = (Animal) o;
    return nom.equals(a.nom) && poids == a.poids;
  }

}
