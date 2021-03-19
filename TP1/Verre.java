public class Verre {
  private int contenance;
  private int quantite;

  public Verre(int contenance) {
    if(contenance < 0) {
      throw new IllegalArgumentException("aie");
    }
    this.contenance = contenance;
    this.quantite = 0;
  }

  public Verre(int contenance, int quantite){
    if(contenance < 0) {
      throw new IllegalArgumentException("aie");
    }
    if(quantite < 0) {
      throw new IllegalArgumentException("aie2");
    }
    if(quantite > contenance) {
      throw new IllegalArgumentException("aie3");
    }
    this.contenance = contenance;
    this.quantite = quantite;
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
      throw new IllegalArgumentException("q < 0");
    }
    int quantiteVerse = Math.min(q, this.getVolumeVide());
    this.quantite += quantiteVerse;
    return quantiteVerse;
  }

  public int boire(int q) {
    if(q < 0){
      throw new IllegalArgumentException("q < 0");
    }
    int quantiteBue = Math.min(q, quantite);
    this.quantite -= quantiteBue;
    return quantiteBue;
  }

  public String toString() {
    return new String("Quantite : " + this.quantite + "/" + this.contenance);
  }

  public int getContenance(){
    return this.contenance;
  }
  public int getQuantite(){
    return this.quantite;
  }
}
