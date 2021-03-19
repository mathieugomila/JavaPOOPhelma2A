public class Main{
  	public static void main(String[] args){
      Verre v1 = new Verre(20);
      System.out.println(v1.toString());
      v1.remplir(10);
      System.out.println(v1);
      v1.remplir(20);
      System.out.println(v1);
      v1.boire(10);
      System.out.println(v1);
      v1.boire(20);
      System.out.println(v1);
      Bouteille bouteille = new Bouteille("VODKA", 50);
      System.out.println(bouteille.toString());
      bouteille.ouvrir(); // ...
      bouteille.verser(v1, 50);
      System.out.println(bouteille.toString());

      System.out.println("----------------------------------------------");

      Bouteille btl1 = new Bouteille("Coca", 100, false);
      Bouteille btl2 = new Bouteille("Whisky", 75, true);

      Verre v2 = new Verre(20);
      btl2.verser(v2, 5);
      System.out.println(btl1.toString());
      System.out.println(btl2.toString());
      System.out.println(v2.toString());
      btl1.ouvrir();
      btl1.verser(v2, 15);
      btl2.verser(v2, 10);
      btl1.fermer();
      btl2.fermer();
      v2.boire(10);
      System.out.println(btl1.toString());
      System.out.println(btl2.toString());
      System.out.println(v2.toString());
      v2.boire(10);
      System.out.println(btl1.toString());
      System.out.println(btl2.toString());
      System.out.println(v2.toString());

      Bar bar = new Bar("Super bar", 10);
      System.out.println(bar.toString());





    }
}
