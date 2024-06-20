package Test12;

import java.util.List;

public interface MobileManager {

	public boolean addMobile(Mobile m);
	public boolean editMobile(Mobile m);
	public static boolean delMobile(int product_id) {
		return false;
	}
	public List<Mobile> searchMobile(String name);
	public List<Mobile> sortedMobile(double price);
	
	public void generateList(int n);
	public void printInfo(List<Mobile> mobiles);
	static List<Mobile> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
