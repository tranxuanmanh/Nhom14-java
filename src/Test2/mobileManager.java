package Test2;

import Test12.Mobile;
import java.util.List;


public interface mobileManager {
	public boolean addMobile(Mobile m);
	public boolean editMobile(Mobile m);
	public boolean delMobile(Mobile m);
	public List<Mobile> searchMobile(String name);
	public List<Mobile> searchMobile(double price);
	public List<Mobile> searchMobileByBrand(String brand);
	public List<Mobile> sortedMobile(boolean asc);
}
