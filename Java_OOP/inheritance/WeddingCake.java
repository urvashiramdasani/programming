package inheritance;

public class WeddingCake extends Cake {
    private int tiers;

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }

    public int getTiers() {
        return tiers;
    }

    public WeddingCake() {
        this.setFlavor("Almond");
    }
}
