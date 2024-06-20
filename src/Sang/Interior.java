package Sang;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Interior extends Product implements InteriorManager, Comparable<Interior>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static List<Interior> list = new ArrayList<Interior>();

	// properties
	private String interior_brand;
	private String interior_color;
	private double interior_size;
	
	// File
	private static final String FILE_NAME = "Interior.bin";
	public static String getFileName() {
		return FILE_NAME;
	}
	
	// constructors
	public Interior() {

	}
	
	public Interior(int id) {
		this.product_id = id;
	}
	
	public Interior(int product_id, String product_name, double product_price, int product_total, String color,
			double size, String brand) {
		super(product_id, product_name, product_price, product_total);
		this.interior_color = color;
		this.interior_size = size;
		this.interior_brand = brand;
	}



	// getters & setters
	public String getInterior_brand() {
		return interior_brand;
	}

	public void setInterior_brand(String interior_brand) {
		this.interior_brand = interior_brand;
	}

	public String getInterior_color() {
		return interior_color;
	}

	public void setInterior_color(String interior_color) {
		this.interior_color = interior_color;
	}

	public double getInterior_size() {
		return interior_size;
	}

	public void setInterior_size(double interior_size) {
		this.interior_size = interior_size;
	}

	@Override
	public String toString() {
		return "Interior [" + super.toString() + ", interior_brand=" + interior_brand + ", interior_color="
				+ interior_color + ", interior_size=" + interior_size + "]\n";
	}

	// override Input method of super class (Product)
	@Override
	public void Input() {
		super.Input();
		System.out.print("Input interior's brand: ");
		interior_brand = scanner.nextLine();
		System.out.print("Input interior's battery: ");
		interior_color = scanner.nextLine();
		System.out.print("Input interior's memory: ");
		interior_size = scanner.nextInt();
		// clear scanner buffer
		scanner.nextLine();

	}

	@Override
	public boolean addInterior(Interior m) {
		// TODO Auto-generated method stub
		if (isInteriorExists(m.getProduct_id())) {
			return false;
		}
		return list.add(m);
	}

	// phương thức kiểm tra sự tồn tại của sản phẩm
	public boolean isInteriorExists(int productID) {
		for (Interior m : list) {
			if (m.getProduct_id() == productID) {
				return true;
			}
		}
		return false;
	}
	@Override
	public boolean editInterior(Interior i) {
		for (int j = 0; j < list.size(); j++) {
			if (list.get(j).getProduct_id() == i.getProduct_id()) {
				list.set(j, i);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean delInterior(Interior i) {
		for (Interior m : list) {
			if (m.getProduct_id() == i.getProduct_id()) {
				return list.remove(m);
			}
		}
		return false;
	}

	@Override
	public List<Interior> searchInterior(String name) {
		ArrayList<Interior> searchResult = new ArrayList<>();
		for (Interior m : list) {
			if (m.getProduct_name().equalsIgnoreCase(name)) {
				searchResult.add(m);
			}
		}
		return searchResult.isEmpty() ? null : searchResult;
	}

	// compareTo
	@Override
	public int compareTo(Interior o) {
		// TODO Auto-generated method stub
		if (this.getProduct_price() > o.getProduct_price()) {
			return 1;
		} else if (this.getProduct_price() < o.getProduct_price()) {
			return -1;
		} else {
			return 0;
		}
	}
	
	@Override
	public List<Interior> sortedInterior (double price) {
		Collections.sort(list);
		return list;
	}
	


	
}
