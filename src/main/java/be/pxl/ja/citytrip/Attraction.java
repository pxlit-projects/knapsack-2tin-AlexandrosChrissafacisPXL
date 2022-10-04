package be.pxl.ja.citytrip;

public class Attraction implements Comparable<Attraction> {
    private String name;
    private double time;
    private double rating;

    public Attraction(String name, double time, double rating) {
        this.name = name;
        this.time = time;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public int compareTo(Attraction o) {
        return Double.compare(this.getRating(), o.getRating());
    }

    @Override
    public String toString() {
        return "name = " + name + " time = " + time + " rating = " + rating;
    }
}
