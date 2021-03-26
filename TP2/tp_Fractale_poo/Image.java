import phelma.*;

public class Image{

  private int nbl;
  private int nbc;

  private int[][] data;



  public Image(int nbl, int nbc){
    if(nbl <= 0 || nbc <= 0){
      throw new IllegalArgumentException("Les dimensions du tableau doivent être positives strictement");
    }
    this.nbl = nbl;
    this.nbc = nbc;
    this.data = new int[nbl][nbc];

    for(int x = 0; x < nbl; x++){
      for(int y = 0; y < nbc; y++){
        data[x][y] = 255 << 24;
      }
    }
  }

  public Image(Image other){
    if(other == null){
      throw new IllegalArgumentException("other null");
    }
    this.nbc = other.getNbc();
    this.nbl = other.getNbl();
    this.data = new int[this.nbl][this.nbc];

    for(int x = 0; x < this.nbl; x++){
      for(int y = 0; y < this.nbc; y++){
        this.data[x][y] = other.getPixel(x,y);
      }
    }
  }

  public int getNbl(){return this.nbl;}
  public int getNbc() {return this.nbc;}


  public int getPixel(int i, int j){
    if(i >= this.nbl || j >= this.nbc || i < 0 || j < 0){
      throw new ArrayIndexOutOfBoundsException("Pixel en dehors de l'image");
    }
    return this.data[i][j];
  }

  public void setPixel(int i, int j, int valeur){
    if(i >= this.nbl || j >= this.nbc || i < 0 || j < 0){
      throw new ArrayIndexOutOfBoundsException("Pixel en dehors de l'image");
    }
    this.data[i][j] = valeur;
  }

  public void drawRect(int x, int y, int H, int L){
    if(x + H >= this.nbl || y + L >= this.nbl || x < 0 || y < 0){
      throw new ArrayIndexOutOfBoundsException("Le rectangle déborde de l'image");
    }
    for(int i = 0; i < H; i++){
      for(int j = 0; j < L; j++){
        this.setPixel(x + i, y + j, 255<<24|255<<16|255<<8|255);
      }
    }
  }
  public void afficher(){
    ImageToolkit.displayPixelMatrix(data);
  }

  public void sauver(String nom){
    boolean b = ImageToolkit.savePixelMatrix(nom, data);
    if(b) System.out.println("Sauvegarde effectuée");
    else System.out.println("Sauvegarde pas effectuée");
  }

}
