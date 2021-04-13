// package animals.species;
package animals;

public abstract class Tigre extends Carnivore {
  static private final double QTE_PAR_JOUR = 4;

  private int nbrRayures;
  public Tigre(String nom, double poids, int nbrRayures, Animal pere, Animal mere){
    super(nom, poids, QTE_PAR_JOUR, pere, mere);
    this.nbrRayures = nbrRayures;
  }

  public String getCri(){
    return "Feuuuuulement terrifiant";
  }

  public String toString(){
    return super.toString();
  }

  // @Override
  // public void setPoids(double p){
  //   super.setPoids(p);
  //   this.qteViandeParJour = QTE_PAR_JOUR_PAR_KG * this.getPoids();
  // }

  @Override
  public boolean equals(Object o){
    if(! (o instanceof Tigre) ) return false;
    Tigre t = (Tigre) o;
    return super.equals(t) && t.nbrRayures == nbrRayures;
  }


}
