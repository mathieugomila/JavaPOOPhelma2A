package animals.regimes;

public class Viande extends Regime {
  @Override
  public double getCout(double qte){
    return Math.pow((qte* 10), 2) + 100;
  }

  @Override
  public String toString(){
    return super.toString() + "Carnivore";
  }
}
