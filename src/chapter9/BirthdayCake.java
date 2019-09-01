package chapter9;

import javax.xml.namespace.QName;

public class BirthdayCake extends Cake {

    protected double candles;

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
