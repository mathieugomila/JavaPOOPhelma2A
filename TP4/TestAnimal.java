import animals.*;

public class TestAnimal {
  public static void main(String[] args) {
    Orque o = new Orque("Loïc", 70);
    System.out.println("Voici un orque \n" + o);
    System.out.println("\nCrie vaillant orque :\n" + o.getCri());

    TigreDuBengale tdb = new TigreDuBengale("Hugo", 75, 101);
    System.out.println("\n\n" + "Voici un tigre du Bengale\n" + tdb);
    System.out.println("\nCrie magnifique tigre :\n" + tdb.getCri());

    TigreBlanc tb = new TigreBlanc("Hugo", 65, 5000);
    System.out.println("\n\n" + "Voici un tigre du Bengale\n" + tb);
    System.out.println("\nCrie magnifique tigre :\n" + tb.getCri());
    System.out.println("\nLe tigre coute " + tb.getCout() + " kg de viande par jour");

    Aigle a = new Aigle("Thomas", 20, 1);
    System.out.println("\n\n" + "Voici un aigle\n" + a);
    System.out.println("\nCrie magnifique aigle :\n" + a.getCri());
    System.out.println("\nL'aigle coute " + a.getCout() + " kg de viande par jour");

    Autruche au = new Autruche("Nico", 50, 400);
    System.out.println("\n\n" + "Voici une autruche\n" + au);
    System.out.println("\nCrie magnifique autruche :\n" + au.getCri());
    System.out.println("\nL'autruche coute " + au.getCout() + " kg de fruits par jour");
  }

}
