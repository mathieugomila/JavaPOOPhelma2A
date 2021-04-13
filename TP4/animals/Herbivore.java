package animals;

public abstract class Herbivore extends Animal {
  protected double qteFruitsParJour;

  public Herbivore(String nom, double poids, double qteParJour, Animal pere, Animal mere){
    super(nom, poids, pere, mere);
    qteFruitsParJour = qteParJour;
  }

  @Override
  public double getCout(){
    return 1.2 * Math.log((qteFruitsParJour +5 ) * 2 + 1) ;
  }

  @Override
  public String toString(){
    return super.toString() + "\n" + "Quantité de fruits consommée par jour : " + qteFruitsParJour + " kg";
  }

  @Override
  public boolean equals(Object o){
    if(! (o instanceof Herbivore) ) return false;
    Herbivore c = (Herbivore) o;
    return super.equals(c) && c.qteFruitsParJour == qteFruitsParJour;
  }
}
