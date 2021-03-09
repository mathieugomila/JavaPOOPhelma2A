public class Verre {
  private int contenance;
  private int quantite;

  public Verre(int contenance){
    this.contenance = contenance;
    this.quantite = 0;
  }

  public int getVolumeVide() {
    return this.contenance - this.quantite;
  }

  public int remplir(int q){
    // int quantiteVerse = q;
    // if (q > this.getVolumeVide()) {
    //   quantiteVerse = this.getVolumeVide();
    // }
    if(q < 0){
      throw IllegalArgumentException("q < 0");
    }
    int quantiteVerse = Math.min(q, this.getVolumeVide());
    this.quantite += quantiteVerse;
    return quantiteVerse;
  }

  public int boire(int q) {
    if(q < 0){
      throw IllegalArgumentException("q < 0");
    }
    int quantiteBue = Math.min(q, quantite);
    this.quantite -= quantiteBue;
    return quantiteBue;
  }

  public String toString() {
    return "Quantite : " + this.quantite + "/" + this.contenance;
  }
}
