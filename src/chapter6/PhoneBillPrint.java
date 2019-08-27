package chapter6;

public class PhoneBillPrint {

    public static void main (String args[])
    {
        PhoneBill bill = new PhoneBill(12345);
        bill.setMinutesUsed(800);
        bill.setBaseCost(90);
        bill.printTotalBill();
    }
}
