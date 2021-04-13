package animals.regimes;

public abstract class Regime {
  abstract public double getCout(double qte);

  @Override
  public String toString(){
    return "Régime : ";
  }
}
