package model;

public class Book {

	private String name;
	private int quantity;
	private int lendQuantity;

	public Book(int i, String name,int j, int k) {
		this.name = name;
		this.quantity = j;
		this.lendQuantity= k;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.lendQuantity = quantity;
	}
	
	public int getLendQuantity() {
		return lendQuantity;
	}

	public void setLendQuantity(int lendQuantity) {
		this.lendQuantity = lendQuantity;
	}

	public String toString() {
		return "Name's Book:" + getName() + "| Quantity:" + getQuantity()+  "| Lending quantity:" + getLendQuantity();
	}
}
