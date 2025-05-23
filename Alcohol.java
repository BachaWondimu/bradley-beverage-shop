import java.util.Objects;

public class Alcohol extends Beverage {

    private boolean weekend;
    private final double weekCost = 0.6;

    public Alcohol(String bevName, SIZE size, boolean weekend) {
        super(bevName, TYPE.ALCOHOL, size);
        this.weekend = weekend;
    }

    public Alcohol(String bevName, SIZE size) {
        super(bevName, TYPE.ALCOHOL, size);
    }

    @Override
    public String toString() {
        return "Alcohol [Name=" + getBevName()
                + ", Type=" + getType()
                + ", Size=" + getSize()
                + ", Weekend=" + weekend
                + ", Price=" + calcPrice() + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!super.equals(obj)) return false;
        if (getClass() != obj.getClass()) return false;
        Alcohol other = (Alcohol) obj;
        return Double.doubleToLongBits(weekCost) == Double.doubleToLongBits(other.weekCost)
                && weekend == other.weekend;
    }

    @Override
    public double calcPrice() {
        double price = getBasePrice();
        if (weekend) price += weekCost;
        if (this.getSize() == SIZE.MEDIUM) price += super.SIZEPRICE;
        if (this.getSize() == SIZE.LARGE) price += (super.SIZEPRICE + super.SIZEPRICE);
        return price;
    }

    public double getBasePrice() {
        return super.BASEPRICE;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public void setWeekend(boolean weekend) {
        this.weekend = weekend;
    }

    public double getWeekCost() {
        return weekCost;
    }
}
