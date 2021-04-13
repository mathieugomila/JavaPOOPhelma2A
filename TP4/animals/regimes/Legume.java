package animals.regimes;

public class Legume extends Regime {
  @Override
  public double getCout(double qte){
    return 1.2 * Math.log((qte +5 ) * 2 + 1);
  }

  @Override
  public String toString(){
    return super.toString() + "Végétarien";
  }
}
