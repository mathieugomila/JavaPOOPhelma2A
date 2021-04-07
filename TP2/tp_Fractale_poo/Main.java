import phelma.*;

public class Main{
  public static void main(String[] args){
    Image im1 = new Image(200, 200);
    im1.drawRect(50, 50, 70, 70);
    im1.afficher();
    im1.sauver("test");
    Image im2 = new Image(im1);
    im2.drawRect(130, 50, 20, 100);
    im2.afficher();
    im1.afficher();

    Mandel mandel = new Mandel(100, 100, 100);
    mandel.afficher();

    Julia julia = new Julia(100, 10, 10, new Complexe(0.5, 0.5));
    julia.afficher();
  }
}
