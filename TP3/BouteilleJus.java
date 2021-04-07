import java.time.*;

public class BouteilleJus extends Bouteille{
  private int secondsAvantPeremption;
  private LocalDateTime dateTimeOuverture;


  public BouteilleJus(String nom, int quantite, int secondsAvantPeremption){
    super(nom, quantite);
    this.secondsAvantPeremption = secondsAvantPeremption;
  }

  public BouteilleJus(String nom, int quantite){
    this(nom, quantite, 1);
  }

  @Override
  public void ouvrir(){
    super.ouvrir();
    if(dateTimeOuverture == null){
      dateTimeOuverture = LocalDateTime.now();
    }
  }

  @Override
  public void verser(Verre v, int qte){
    super.verser(v, qte);
    if(this.estPerimee()){
      System.out.println("A vos risques et périls");
    }
  }

  public boolean estPerimee(){
    LocalDateTime dateTimeMaintenant = LocalDateTime.now();
    if((Duration.between(dateTimeOuverture, dateTimeMaintenant).toMillis() / 1000) > secondsAvantPeremption){
      return true;
    }
    return false;
  }

  @Override
  public String toString(){
    String s = super.toString();
    if(this.estPerimee()){
      s += "La bouteille contient du jus périmée.";
    }
    else {
      s += "La bouteille est propre à la consommation :)";
    }
    return s;
  }


}
