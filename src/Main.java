import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    List<String> text = new ArrayList<>(); //usercode. Det i ArrayList-klassen som implementere List er library code
    List<String> text2 = new LinkedList<>();
    List<String> deck = new DeckList<>(); // Decklist kan bare ændres til arraylist. alle de klasser
    //der implementere List kan udskiftes med hinanden uden problemer.

    var result = deck.add("klør 5");

    //forskel på List<String> text = new ArrayList<>(); og
    // ArrayList<String> text = new ArrayList<>();
    //er, at den første kan ændres til en anden liste, mens den anden kun kan være en arrayliste
    //alle lister arver fra Collections interfacet
    //Collections text3 = new ArrayList<>(); hans virkede men ikke her

    System.out.println(result);
  }

  //stiplede pil i Collections hierarki betyder at de implementere. Arraylist implementere List.
  //den hårde pil betyder de arver
  //De nederst i hierarkiet er de samme. Arraylist og linkedlist kan konverteres direkte.
  //<> generisk datatype. Betyder det kan være alt muligt
}
//abstraction - at man ikke kan se "bag" hvad der sker. Alt over binary er abstracton, og
//jo højere det bliver jo mere abstraction.

//set:
//et sæt er en mængde. Sæt A indeholder nogle ting mens sæt B indeholder B's mængde.
//fordi man har to mængder kan man finde fællesmængde (hvilke ting er indeholdt i begge), mængde
//der kun er i A osv. (tænk venn diagrammer. Cirkler der overlapper hinanden, som med sql join)
//set bruger man til at sammenligne mængder.
//HashSet er unordered mens TreeSet er ordnet, fx alfabetisk rækkefølge.
//Set bruger vi ikke særlig meget. Vi bruger mest arraylister og bagefter hashmap
//vi bliver ikke spurgt ind til Set til eksamen

//big-O notation: O() er hvor mange gange man looper igennem. Tester tid en algoritme tager
//O(n) er loope gennem n elementer

