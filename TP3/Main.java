import java.time.*;

public class Main{
  	public static void main(String[] args){
      Verre v = new Verre(50);
      BouteilleJus bj = new BouteilleJus("mangue", 100);
      Bouteille pastis = new Bouteille("pastis", 100);

      bj.ouvrir();
      pastis.ouvrir();

      System.out.println(bj);
      System.out.println(pastis);

      try{
        System.out.println("Dodo 4 secondes");
        Thread.sleep(4000);
      } catch(InterruptedException e) {
      }

      System.out.println(bj);
      System.out.println(pastis);

      pastis.verser(v, 15);
      bj.verser(v, 5);

      System.out.println(bj);
      System.out.println(pastis);

      v.boire(20);




    }
}
