package be.pxl.ja.citytrip;

import be.pxl.ja.robbery.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AttractionTest {
    @Test
    public void comparesCorrectlyIfSmaller(){
        Attraction p1 = new Attraction("p1", 5, 15);
        Attraction p2 = new Attraction("p2", 5, 20);

        Assertions.assertEquals(-1, p1.compareTo(p2));
    }

    @Test
    public void comparesCorrectlyIfBigger(){
        Attraction p1 = new Attraction("p1", 5, 15);
        Attraction p2 = new Attraction("p2", 5, 20);

        Assertions.assertEquals(1, p2.compareTo(p1));
    }
}
