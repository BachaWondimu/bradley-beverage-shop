import java.util.ArrayList;

public class BevShop implements BevShopInterfce {

    private final int MIN_AGE_FOR_ALCOHOL = 21;
    private final int MAX_ORDER_FOR_ALCOHOL = 3;
    private final int MIN_TIME = 8;
    private final int MAX_TIME = 23;
    private final int MAX_FRUIT = 5;

    private int time;
    private DAY day;
    private String customerName;
    private int customerAge;
    private String bevName;
    private SIZE size;
    private boolean extraShot;
    private boolean extraSyrup;
    private int alcOrder;
    private int numOfFruits;
    private boolean addProtein;
    private int orderNo;
    private ArrayList<Order> orders = new ArrayList<>();

    @Override
    public boolean validTime(int time) {
        return time >= MIN_TIME && time <= MAX_TIME;
    }

    @Override
    public boolean eligibleForMore() {
        return alcOrder < MAX_ORDER_FOR_ALCOHOL;
    }

    @Override
    public boolean validAge(int age) {
        return age >= MIN_AGE_FOR_ALCOHOL;
    }

    @Override
    public void startNewOrder(int time, DAY day, String customerName, int customerAge) {
        orders.add(new Order(time, day, customerName, customerAge));
    }

    @Override
    public void processCoffeeOrder(String bevName, SIZE size, boolean extraShot, boolean extraSyrup) {
        getCurrentOrder().addNewBeverage(bevName, size, extraShot, extraSyrup);
    }

    @Override
    public void processAlcoholOrder(String bevName, SIZE size) {
        getCurrentOrder().addNewBeverage(bevName, size);
    }

    public boolean isMaxFruit(int i) {
        return i > MAX_FRUIT;
    }

    @Override
    public void processSmoothieOrder(String bevName, SIZE size, int numOfFruits, boolean addProtein) {
        getCurrentOrder().addNewBeverage(bevName, size, numOfFruits, addProtein);
    }

    @Override
    public int findOrder(int orderNo) {
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getOrderNo() == orderNo) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public double totalOrderPrice(int orderNo) {
        return getCurrentOrder().calcOrderTotal();
    }

    @Override
    public double totalMonthlySale() {
        double total = 0;
        for (Order order : orders) {
            total += order.calcOrderTotal();
        }
        return total;
    }
	
    @Override
    public void sortOrders() {
        // Implementation of sorting logic
    }

    @Override
    public Order getOrderAtIndex(int index) {
        return orders.get(index);
    }

    public Order getCurrentOrder() {
        return orders.get(orderNo);
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public DAY getDay() {
        return day;
    }

    public void setDay(DAY day) {
        this.day = day;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerAge() {
        return customerAge;
    }

    public void setCustomerAge(int customerAge) {
        this.customerAge = customerAge;
    }

    public String getBevName() {
        return bevName;
    }

    public void setBevName(String bevName) {
        this.bevName = bevName;
    }

    public SIZE getSize() {
        return size;
    }

    public void setSize(SIZE size) {
        this.size = size;
    }

    public boolean getExtraShot() {
        return extraShot;
    }

    public void setExtraShot(boolean extraShot) {
        this.extraShot = extraShot;
    }

    public boolean getExtraSyrup() {
        return extraSyrup;
    }

    public void setExtraSyrup(boolean extraSyrup) {
        this.extraSyrup = extraSyrup;
    }

    public int getNumOfAlcoholDrink() {
        return alcOrder;
    }

    public void setAlcOrder(int alcOrder) {
        this.alcOrder = alcOrder;
    }

    public int getNumOfFruits() {
        return numOfFruits;
    }

    public void setNumOfFruits(int numOfFruits) {
        this.numOfFruits = numOfFruits;
    }

    public boolean isAddProtein() {
        return addProtein;
    }

    public void setAddProtein(boolean addProtein) {
        this.addProtein = addProtein;
    }

    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders.clear();
        this.orders.addAll(orders);
    }

    public int totalNumOfMonthlyOrders() {
        return orders.size();
    }

    public int getMinAgeForAlcohol() {
        return MIN_AGE_FOR_ALCOHOL;
    }

    public int getMaxOrderForAlcohol() {
        return MAX_ORDER_FOR_ALCOHOL;
    }

    public int getMIN_TIME() {
        return MIN_TIME;
    }

    public int getMAX_TIME() {
        return MAX_TIME;
    }

    public int getMAX_FRUIT() {
        return MAX_FRUIT;
    }

    public int getAlcOrder() {
        return alcOrder;
    }
}
