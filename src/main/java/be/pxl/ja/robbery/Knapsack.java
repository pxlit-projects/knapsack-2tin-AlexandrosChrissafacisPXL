package be.pxl.ja.robbery;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Knapsack {
    private double maximumWeight;
    private List<Product> items = new ArrayList<>();

    public Knapsack(double maximumWeight){
        this.maximumWeight = maximumWeight;
    }

    public double getCurrentWeight(){
        double currentWeight = 0;
        for (Product p:items) {
            currentWeight += p.getWeight();
        }
        return currentWeight;
    }

    public void add(Product product) throws KnapSackFullException {
        //als in past
        if (product.getWeight() + getCurrentWeight() <= maximumWeight){
            items.add(product);
            //nog uit shop halen
        }else {
            throw new KnapSackFullException("[" + product.getName() + "] past niet in de knapzak");
        }
    }

    public List<Product> getItems() {
        return items;
    }
}
