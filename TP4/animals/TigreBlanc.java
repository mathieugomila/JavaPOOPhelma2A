
package animals;
// package animals.species;
public class TigreBlanc extends Carnivore {

  private int nbrRayures;
  public TigreBlanc(String nom, double poids, int nbrRayures, Animal pere, Animal mere){
    super(nom, poids, nbrRayures, pere, mere);
  }

  @Override
  public String getCri(){
    return "Feuuuuulement terrifiant";
  }

  @Override
  public String toString(){
    return "Espèce : Tigre blanc\n" + super.toString();
  }

  // @Override
  // public void setPoids(double p){
  //   super.setPoids(p);
  //   this.qteViandeParJour = QTE_PAR_JOUR_PAR_KG * this.getPoids();
  // }

  @Override
  public boolean equals(Object o){
    if(! (o instanceof TigreBlanc) ) return false;
    TigreBlanc t = (TigreBlanc) o;
    return super.equals(t);
  }


}
