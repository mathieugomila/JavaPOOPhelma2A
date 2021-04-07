public class Bar{
  private String nom;
  private Bouteille[] tab;


  public Bar(String nom, int nbEmplacements){
    if(nom == null || nom.length() == 0){
      throw new IllegalArgumentException("Un bar sans nom ??!");
    }
    this.nom = nom;
    if(nbEmplacements <= 0){
      throw new IllegalArgumentException("Un bar sans moyens de stocker des bouteilles ??!");
    }
    this.tab = new Bouteille[nbEmplacements];
  }


  public String getNom(){
    return this.nom;
  }

  public int getNbEmplacements(){
    return tab.length;
  }

  public void ranger(Bouteille b, int numEmplacement){
    if(numEmplacement < 0 || numEmplacement >= this.getNbEmplacements()){
      throw new IllegalArgumentException("Out of range");
    }

    if(tab[numEmplacement] != null){
      throw new IllegalArgumentException("Ya deja une bouteille");
    }
    tab[numEmplacement] = b; // si b == null c'est pas bien grave
  }

  public Bouteille prendre(String nom){
    if(nom == null || nom.length() == 0){
      throw new IllegalArgumentException("Nom de bouteille non valide ??!");
    }

    for(Bouteille b : tab){
      if(b != null && b.getNom().equals(nom)){
        return b;
      }
    }
    return null;
  }

  public String toString(){
    int compteurBouteille = 0;
    for(Bouteille b : tab){
      if (b != null){
        compteurBouteille++;
      }
    }
    String s = new String("Bienvenu dans le bar " + this.nom + " qui contient " + compteurBouteille + "/" + this.getNbEmplacements() + " bouteilles");
    if(compteurBouteille > 0){
      s += "\nVoici les bouteilles ici présentes :";
      for(Bouteille b : tab){
        if (b != null){
          s += ("\t-" + b.toString());
        }
      }
    }    
    s += "\nEn espérant vous voir bientôt !";
    return s;
  }




}
