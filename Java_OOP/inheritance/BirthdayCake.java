package inheritance;

public class BirthdayCake extends Cake {
    private int candles;

    public BirthdayCake() {
        this.setFlavor("Chocolate");
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }

    public int getCandles() {
        return this.candles;
    }
}
