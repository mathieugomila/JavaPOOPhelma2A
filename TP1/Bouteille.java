public class Bouteille{
  private String nom;
  private int quantite;
  private boolean ouverte;

  public Bouteille(String nom, int quantite, boolean ouverte){
    if(nom == null  || nom.length() == 0 ) {
      throw new IllegalArgumentException("aie nom obligatoire !");
    }

    if(quantite < 0){
      throw new IllegalArgumentException("Quantite négative");
    }

    this.nom = nom; // pas sur
    this.quantite = quantite;
    this.ouverte = ouverte;
  }

  public Bouteille(String nom, int quantite){
    this(nom, quantite, false);
    // this.nom = nom; // pas sur
    // this.quantite = quantite;
    // this.ouverte = false;
  }

  public String getNom(){
    return this.nom;
  }

  public void ouvrir(){
    // if(ouverte) {
    //   throw new InvalidStateException("AIE deja ouverte");
    // }
    this.ouverte = true;
  }

  public void fermer(){
    this.ouverte = false;
  }

  public int verser(int q){
    if( ! this.ouverte){
      throw new IllegalArgumentException("Ouvre le bouchon ducon !"); // c'est un peu vulgaire
    }

    int quantiteAVerser = Math.min(q, this.quantite);
    this.quantite -= quantiteAVerser;
    return quantiteAVerser;
  }

  // On fait le choix ici d'exiger que la bouteille soit suffisamment remplie
  public void verser(Verre v, int q) {
    if(this.quantite < q){
      throw new IllegalArgumentException("Il n'y a pas assez de quantité à verser");
    }
    int quantiteRemplie = v.remplir(q);
    this.verser(quantiteRemplie);
  }

  public int getQuantite(){
    return this.quantite;
  }

  public String toString(){
    String etat;
    if(this.ouverte){
      etat = new String("ouverte");
    }
    else {
      etat = new String("fermée");
    }
    return new String ("Bouteille " + etat + " portant le jolie nom " + this.nom + " et contenant " + this.quantite);
  }



}
