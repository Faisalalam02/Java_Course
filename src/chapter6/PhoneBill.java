package chapter6;

public class PhoneBill {


    private double baseCost ;
    private double allottedMinutes ;
    private double minutesUsed ;
    private int id;

    public PhoneBill(){
        double baseCost = 75.99 ;
        double allottedMinutes = 800 ;
        double minutesUsed = 800 ;
        int id = 0;
    }

    public PhoneBill(int id){
        this.id = id;
        baseCost = 75.99 ;
        allottedMinutes = 800 ;
        minutesUsed = 800 ;
    }
    public PhoneBill(int id, double baseCost, double allottedMinutes, double minutesUsed){

        this.id = id;
        this.baseCost = baseCost;
        this.allottedMinutes = allottedMinutes;
        this.minutesUsed = minutesUsed;

    }

    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }

    public double getBaseCost()
    {
        return baseCost;
    }
    public void setBaseCost(double baseCost)
    {
        this.baseCost = baseCost;
    }

    public double getAllottedMinutes()
    {
        return allottedMinutes;
    }
    public void setAllottedMinutes(double allottedMinutes)
    {
        this.allottedMinutes = allottedMinutes;
    }

    public double getMinutesUsed()
    {
        return minutesUsed;
    }
    public void setMinutesUsed(double minutesUsed)
    {
        this.minutesUsed = minutesUsed;
    }

    public double calculatedOverage()
    {
        if(minutesUsed<= allottedMinutes)
        return 0;
        double overageRate = .25;
        double overageMinute = minutesUsed - allottedMinutes;
        return overageMinute * overageRate;
    }
    public double calculatedTax ()
    {
        double taxRate = .15;
        return taxRate * (baseCost + calculatedOverage());
    }

    public double calculateTotal()
    {
        return calculatedTax() + baseCost + calculatedOverage();
    }
    public void printTotalBill ()
    {
       System.out.println("ID: " + id);
       System.out.println("Base Cost: $" + baseCost);
        System.out.println(String.format("Overage Fee: $%.2f" , calculatedOverage()));
       System.out.println(String.format("Tax: $%.2f" , calculatedTax()));
       System.out.println(String.format("Total Bill: $%.2f", calculateTotal()));
    }
}
