package Test12;

import java.io.Serializable;

public class Product implements Serializable {
	public static final long serialVersionUID = 1L;

	public int product_id;
	public String product_name;
	public double product_price;
	public int product_total;
	
	
	//Contructor
	public Product() {
		this.product_id = 0;
		this.product_name = "idk";
		this.product_price = 0;
		this.product_total = 0;
	}
	
	public Product(int product_id, String product_name, double product_price, int product_total) {
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_price = product_price;
		this.product_total = product_total;
	}

	//Setters and Getters
	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public double getProduct_price() {
		return product_price;
	}

	public void setProduct_price(double product_price) {
		this.product_price = product_price;
	}

	public int getProduct_total() {
		return product_total;
	}

	public void setProduct_total(int product_total) {
		this.product_total = product_total;
	}

	@Override
	public String toString() {
		return "Product [product_id=" + product_id + ", product_name=" + product_name + ", product_price="
				+ product_price + ", product_total=" + product_total + "]";
	}
	
	
}
