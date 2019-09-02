package chapter9;


public class BirthdayCake extends Cake {

    private double candles;

    public BirthdayCake()
    {
        super("Vanilla");
    }

    public double getCandles() {
        return candles;
    }

    public void setCandles(double candles) {
        this.candles = candles;
    }

}
