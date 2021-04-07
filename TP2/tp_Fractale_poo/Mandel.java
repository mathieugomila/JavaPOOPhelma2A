public class Mandel{
  private Image image;
  private double maxModule;
  private int maxTermes;


  public Mandel(int n, double maxModule, int maxTermes){
    this.image = new Image(n, n);
    this.maxModule = maxModule;
    this.maxTermes = maxTermes;

    this.genererImage();
  }

  public int getNbl(){ return this.image.getNbl();}
  public int getNbc(){ return this.image.getNbc();}

  private int calculer(Complexe zp){
    Complexe z = new Complexe(0, 0);
    for(int k = 0; k < this.maxTermes; k++){
      if(z.getRho() > this.maxModule){ // module trop grand
        //System.out.println("test1");
        return 255 << 24 | k%256 << 16 | k%256 << 8| k%256;
      }
      z.mult(z);
      z.add(zp);
      //System.out.println(z.toString());
    }
    //System.out.println("test2");
    return 255 << 24 | 255;
  }

  private void genererImage(){
    for(int a = 0; a < this.getNbl(); a++){
      for(int b = 0; b < this.getNbc(); b++){
        double x, y;
        x = 2.0/this.getNbl() * a - 1;
        y = 2.0/this.getNbc() * b - 1;

        int val = calculer(new Complexe(x, y));
        this.image.setPixel(a, b, val);
        //System.out.println(val);
        //System.out.println(image.getPixel(a, b));
      }
    }
    for(int a = 0; a < this.getNbl(); a++){
      for(int b = 0; b < this.getNbc(); b++){
      //  System.out.println((this.image.getPixel(a, b) << 24 )>> 24);
      }
    }

  }


  public void afficher(){
    this.image.afficher();
  }

  public void sauver(String name){
    this.image.sauver(name);
  }






}
