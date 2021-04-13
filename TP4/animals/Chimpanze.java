// package animals.species;
package animals;

public class Chimpanze extends Herbivore {
  public Chimpanze(String nom, double poids, Animal pere, Animal mere){
    super(nom, poids, 3, pere, mere);
  }

  @Override
  public String getCri(){
    return "Huuuuurlement rigolo";
  }

  @Override
  public String toString(){
    return "Espèce : Chimpanze\n" + super.toString();
  }

  @Override
  public boolean equals(Object o){
    if(! (o instanceof Chimpanze) ) return false;
    Chimpanze c = (Chimpanze) o;
    return super.equals(c);
  }


}
