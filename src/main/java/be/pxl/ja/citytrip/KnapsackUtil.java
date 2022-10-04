package be.pxl.ja.citytrip;

import java.util.Collections;
import java.util.List;

public class KnapsackUtil {
    public static void fill(Knapsack knapsack, LondonAttractions shop){

            List<Attraction> sortedItems = shop.getItems();
            Collections.sort(sortedItems);
            Collections.reverse(sortedItems);

            for (Attraction p : sortedItems){
                try {
                knapsack.add(p);
                }catch (KnapSackFullException message){
                    System.out.println(message);
                }
            }



    }
}
