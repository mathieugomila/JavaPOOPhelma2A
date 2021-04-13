// package animals.species;
package animals;
public class TigreDuBengale extends Carnivore {

  private int nbrRayures;
  public TigreDuBengale(String nom, double poids, int nbrRayures, Animal pere, Animal mere){
    super(nom, poids, nbrRayures, pere, mere);
  }

  @Override
  public String getCri(){
    return "Feuuuuulement terrifiant";
  }

  @Override
  public String toString(){
    return "Espèce : Tigre du Bengale\n" + super.toString();
  }

  // @Override
  // public void setPoids(double p){
  //   super.setPoids(p);
  //   this.qteViandeParJour = QTE_PAR_JOUR_PAR_KG * this.getPoids();
  // }

  @Override
  public boolean equals(Object o){
    if(! (o instanceof TigreDuBengale) ) return false;
    TigreDuBengale t = (TigreDuBengale) o;
    return super.equals(t);
  }


}
