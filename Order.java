import java.util.ArrayList;
//import java.util.Objects;
import java.util.Random;

public class Order implements OrderInterface, Comparable {
	
	

	private int orderNo;
	private String name;
	private int age;
	private int orderTime;
	private DAY orderDay;
	private Customer customer = new Customer(name, age);
	private ArrayList<Beverage> beverages = new ArrayList<Beverage>();



	public Order(int orderNo, int orderTime, DAY orderDay, Customer customer, ArrayList<Beverage> beverages) {
		this.orderNo = orderNo;
		this.orderTime = orderTime;
		this.orderDay = orderDay;
		this.customer = new Customer(customer);
		for (Beverage bev : beverages)
			this.beverages.add(bev);
	}

	public Order(int orderTime, DAY orderDay, String name, int age) {
		this.name = name;
		this.age = age;
		this.orderTime = orderTime;
		this.orderDay = orderDay;
	}

	public Order(int itemNo, DAY day, Customer customer) {
		this.orderNo = itemNo;
		this.orderDay = day;
		this.customer = new Customer(customer);
	}

	public Order(Order o) {
		this.age = o.age;
		this.customer = o.getCustomer();
		this.orderNo = o.orderNo;
		this.beverages = o.getBeverages();
		this.name = o.getName();
		this.orderDay = o.orderDay;
		this.orderTime = o.orderTime;
	}

	@Override
	public boolean isWeekend() {
		if (orderDay == DAY.SATURDAY || orderDay == DAY.SUNDAY)
			return true;
		else
			return false;
	}

	@Override
	public Beverage getBeverage(int orderNo) {
		return beverages.get(orderNo);
	}

	@Override
	public void addNewBeverage(String bevName, SIZE size, boolean extraShot, boolean extraSyrup) {
		beverages.add(new Coffee(bevName, size, extraShot, extraSyrup));
	}

	@Override
	public void addNewBeverage(String bevName, SIZE size) {
		boolean b = isWeekend();
		beverages.add(new Alcohol(bevName, size, b));
	}

	@Override
	public void addNewBeverage(String bevName, SIZE size, int numOfFruits, boolean addPRotien) {
		beverages.add(new Smoothie(bevName, size, numOfFruits, addPRotien));
	}

	@Override
	public double calcOrderTotal() {
		double total = 0;
		for (int i = 0; i < beverages.size(); i++) {
			total += beverages.get(i).calcPrice();
		}
		return total;
	}

	@Override
	public int findNumOfBeveType(TYPE type) {
		int quantity = 0;
		for (int i = 0; i < beverages.size(); i++) {
			if (beverages.get(i).getType() == type) {
				quantity += 1;
			}
		}

		return quantity;
	}

	@Override
	public String toString() {
		return "Order [itemNo=" + orderNo 
				+ ", name=" + name 
				+ ", age=" + age 
				+ ", orderTime=" + orderTime
				+ ", orderDay=" + orderDay 
				+ ", Customer=" + customer.toString()
				+ ", listOfBeverages=" + beverages.toString() 
				+ ", calcOrderTotal=" + calcOrderTotal() + "]";
	}
	

	@Override
	public int compareTo(Object o) {
		Order or = (Order)o;
		if (this.orderNo == or.orderNo)
			return 0;
		else if (this.orderNo < or.orderNo)
			return -1;
		else
			return 1;
	}

	public int getOrderNo() {
		return orderNo;
	}

	public void setOrderNum(int orderNo) {
		this.orderNo = orderNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(int orderTime) {
		this.orderTime = orderTime;
	}

	public DAY getOrderDay() {
		return orderDay;
	}

	public void setOrderDay(DAY orderDay) {
		this.orderDay = orderDay;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = new Customer(customer);
	}

	
	public ArrayList<Beverage> getBeverages() {
		return beverages;
	}

	
	public void setBeverages(ArrayList<Beverage> listOfBeverages) {
		for (Beverage bev : listOfBeverages) {
			this.beverages.add(bev);
		}
	}
	

	public int getTotalItems() {
		return beverages.size();
	}


}
