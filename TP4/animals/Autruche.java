// package animals.species
package animals;
public class Autruche extends Herbivore {
  private int nbrPlumes;


  public Autruche(String nom, double poids, int nbrPlumes, Animal pere, Animal mere){
    super(nom, poids, 5, pere, mere);
    this.nbrPlumes = nbrPlumes;
  }

  public int getNbrPlumes(){
    return this.nbrPlumes;
  }

  public void setNbrPlumes(int n){
    if(n<0){
      throw new IllegalArgumentException("Vous avez déjà vu une autre avec " + n + "plumes ?\n");
    }
    nbrPlumes = n;
  }





  @Override
  public String getCri(){
    return "Beuuuuuuglement semblable à celui d'une vache";
  }

  @Override
  public String toString(){
    return "Espèce : Autruche\n" + super.toString() + "\nNombre de plumes : " + nbrPlumes;
  }

  @Override
  public boolean equals(Object o){
    if(! (o instanceof Autruche) ) return false;
    Autruche c = (Autruche) o;
    return super.equals(c) && c.nbrPlumes == nbrPlumes;
  }


}
