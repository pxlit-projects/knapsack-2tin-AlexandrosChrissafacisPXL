package be.pxl.ja.citytrip;

import be.pxl.ja.robbery.KnapSackFullException;
import be.pxl.ja.robbery.Knapsack;
import be.pxl.ja.robbery.KnapsackUtil;
import be.pxl.ja.robbery.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KnapsackTest {

    @Test
    public void testCurrentWeight(){
        be.pxl.ja.robbery.Knapsack knapsack = new be.pxl.ja.robbery.Knapsack(5);
        try {
            knapsack.add(new Product("buh",2,50));
        }
        catch (KnapSackFullException message){
            System.out.println(message);
        }

        Assertions.assertEquals(2,knapsack.getCurrentWeight());
    }

    @Test
    public void testKnapzakUtilSortCorrectly(){
        be.pxl.ja.robbery.Knapsack knapsack = new Knapsack(5);
        Shop shop = new Shop();

        shop.add(new Product("buh",2,50));
        shop.add(new Product("buh",3,100));
        shop.add(new Product("buh",4,150));

        KnapsackUtil.fill(knapsack,shop);

        Assertions.assertEquals("[name = buh weight = 4.0 price = 150.0]", knapsack.getItems().toString());

    }
}
