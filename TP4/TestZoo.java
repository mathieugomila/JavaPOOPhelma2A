import animals.*;
// import animals.species.*;

public class TestZoo {
  public static void main(String[] args) {
    Zoo phelma = new Zoo("Minatec");

    TigreDuBengale tigrou = new TigreDuBengale("Fantôme", 120, 40, null, null); // 120kg et 40 rayures
    phelma.ajoute(tigrou);

    Autruche aut = new Autruche("Ann", 50, 300, null, null); // 50kg et 300 plumes
    phelma.ajoute(aut);

    Chimpanze chips = new Chimpanze("Chita", 30, tigrou, aut); // 30kg
    phelma.ajoute(chips);

    Aigle ai = new Aigle("Roquette", 5, 200, 2, tigrou, aut); // 5kg, 200cm d'envergure et bouffe 2kg
    phelma.ajoute(ai);

    Orque az = new Orque("Azog", 9000, chips, ai); // 9t
    phelma.ajoute(az);

    //Orque az2 = new Orque("Azog", 9000); // 9t
    //phelma.ajoute(az2);

    System.out.println("Voici le zoo :\n" + phelma);
    System.out.println("L'animal " + tigrou.getName() + " possede " + tigrou.getNombreDescendants() + " descendants.");
  }

}
