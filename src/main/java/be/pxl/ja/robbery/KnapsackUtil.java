package be.pxl.ja.robbery;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KnapsackUtil {
    public static void fill(Knapsack knapsack,Shop shop){

            List<Product> sortedItems = shop.getItems();
            Collections.sort(sortedItems);
            Collections.reverse(sortedItems);

            for (Product p : sortedItems){
                try {
                knapsack.add(p);
                }catch (KnapSackFullException message){
                    System.out.println(message);
                }
            }



    }
}
