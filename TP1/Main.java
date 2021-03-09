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


    }
}
