package LangPackage;
import java.util.HashSet;

public class MarketMain {
	public static void main(String a[]){
        
        HashSet<Market> lhm = new HashSet<Market>();
        lhm.add(new Market("Banana", 20));
        lhm.add(new Market("Apple", 40));
        lhm.add(new Market("Orange", 30));
        for(Market pr:lhm){
            System.out.println(pr);
        }
        Market duplicate = new Market("Banana", 20);
        System.out.println("inserting duplicate object...");
        lhm.add(duplicate);
        System.out.println("After insertion:");
        for(Market pr:lhm){
            System.out.println(pr);
        }
    }

}
