// package animals.species;
package animals;

public class Orque extends Carnivore {
  static private final double QTE_PAR_JOUR_PAR_KG = 0.1;

  public Orque(String nom, double poids, Animal pere, Animal mere){
    super(nom, poids, QTE_PAR_JOUR_PAR_KG*poids, pere, mere);
  }

  @Override
  public String getCri(){
    return "Ssssifflement intense";
  }

  @Override
  public String toString(){
    return "Espèce : Orque\n" + super.toString();
  }

  @Override
  public void setPoids(double p){
    super.setPoids(p);
    this.qteViandeParJour = QTE_PAR_JOUR_PAR_KG * this.getPoids();
  }

  @Override
  public boolean equals(Object o){
    if(! (o instanceof Orque) ) return false;
    Orque or = (Orque) o;
    return super.equals(or);
  }


}
