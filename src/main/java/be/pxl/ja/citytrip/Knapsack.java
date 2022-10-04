package be.pxl.ja.citytrip;


import java.util.ArrayList;
import java.util.List;

public class Knapsack {
    private double maximumWeight;
    private List<Attraction> items = new ArrayList<>();

    public Knapsack(double maximumWeight){
        this.maximumWeight = maximumWeight;
    }

    public double getCurrentWeight(){
        double currentWeight = 0;
        for (Attraction p:items) {
            currentWeight += p.getRating();
        }
        return currentWeight;
    }

    public void add(Attraction product) throws KnapSackFullException {
        //als in past
        if (product.getRating() + getCurrentWeight() <= maximumWeight){
            items.add(product);
            //nog uit shop halen
        }else {
            throw new KnapSackFullException("[" + product.getName() + "] past niet in de knapzak");
        }
    }

    public List<Attraction> getItems() {
        return items;
    }
}
