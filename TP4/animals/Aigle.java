package animals;
// package animals.species;

public class Aigle extends Carnivore {
  static private double QTE_PAR_JOUR_PAR_DEFAUT = 1;
  private double envergure;

  public Aigle(String nom, double poids, double env, Animal pere, Animal mere){
    super(nom, poids, QTE_PAR_JOUR_PAR_DEFAUT, pere, mere);
    this.envergure = env;
  }

  public Aigle(String nom, double poids, double env, double qte, Animal pere, Animal mere){
    super(nom, poids, qte, pere, mere);
    this.envergure = env;
  }


  @Override
  public String getCri(){
    return "Ssssifflement intense";
  }

  @Override
  public String toString(){
    return "Espèce : Aigle\n" + super.toString() + "\nEnvergue : " + envergure + "cm";
  }

  @Override
  public boolean equals(Object o){
    if(! (o instanceof Aigle) ) return false;
    Aigle a = (Aigle) o;
    return super.equals(a);
  }


}
