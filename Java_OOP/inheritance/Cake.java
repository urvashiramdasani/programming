package inheritance;

public class Cake {
    private String flavor;
    private double price;

    public Cake() {
        this.flavor = "Vanilla";
        this.price = 12.96;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getFlavor() {
        return this.flavor;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }
}
