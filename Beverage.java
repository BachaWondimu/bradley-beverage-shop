import java.util.Objects;

public abstract class Beverage {

    private String bevName;
    public TYPE beverageType;
    public SIZE beverageSize;
    final public double BASEPRICE = 2.0;
    final public int SIZEPRICE = 1;

   
    public Beverage(String bevName, TYPE beverageType, SIZE beverageSize) {
        this.bevName = bevName;
        this.beverageType = beverageType;
        this.beverageSize = beverageSize;
    }

    
    public abstract double calcPrice();

    @Override
    public String toString() {
        return "Beverage Name=" + bevName
                + ", Beverage Type=" + beverageType
                + ", Beverage Size=" + beverageSize;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Beverage bev = (Beverage) obj;
        return Objects.equals(bevName, bev.bevName)
                && beverageSize == bev.beverageSize
                && beverageType == bev.beverageType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bevName, beverageType, beverageSize);
    }

   
    public String getBevName() {
        return bevName;
    }

    public void setBevName(String bevName) {
        this.bevName = bevName;
    }

   
    public TYPE getType() {
        return beverageType;
    }

    public void setType(TYPE beverageType) {
        this.beverageType = beverageType;
    }

    
    public SIZE getSize() {
        return beverageSize;
    }

    public void setSize(SIZE beverageSize) {
        this.beverageSize = beverageSize;
    }
}
