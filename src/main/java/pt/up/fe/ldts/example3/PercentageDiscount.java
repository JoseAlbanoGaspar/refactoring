package pt.up.fe.ldts.example3;

public class PercentageDiscount extends Discount{
    private double percentage;

    public PercentageDiscount(double perc){
        percentage = perc;
    }

    public double applyDiscount(double price){
        return price - price * percentage;
    }
}
