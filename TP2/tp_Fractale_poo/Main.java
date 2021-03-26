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
  }
}
