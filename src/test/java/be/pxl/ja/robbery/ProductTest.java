package be.pxl.ja.robbery;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductTest {
    @Test
    public void comparesCorrectlyIfSmaller(){
        Product p1 = new Product("p1", 5, 15);
        Product p2 = new Product("p2", 5, 20);

        System.out.println(p2.compareTo(p1));
        Assertions.assertEquals(-1, p1.compareTo(p2));
    }

    @Test
    public void comparesCorrectlyIfBigger(){
        Product p1 = new Product("p1", 5, 15);
        Product p2 = new Product("p2", 5, 20);

        Assertions.assertEquals(1, p2.compareTo(p1));
    }
}
