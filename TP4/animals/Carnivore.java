package animals;

public abstract class Carnivore extends Animal {
  protected double qteViandeParJour;

  public Carnivore(String nom, double poids, double qteParJour, Animal pere, Animal mere){
    super(nom, poids, pere, mere);
    qteViandeParJour = qteParJour;
  }

  @Override
  public double getCout(){
    return Math.pow((qteViandeParJour * 10), 2) + 100;
  }

  @Override
  public String toString(){
    return super.toString() + "\n" + "Quantité de viande consommée par jour : " + qteViandeParJour + " kg";
  }

  @Override
  public boolean equals(Object o){
    if(! (o instanceof Carnivore) ) return false;
    Carnivore c = (Carnivore) o;
    return super.equals(c) && c.qteViandeParJour == qteViandeParJour;
  }
}
