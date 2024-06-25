package Test2;

import Test12.Mobile;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class TestMobileManager implements mobileManager {

	static Scanner sc = new Scanner(System.in);
	public static List<Mobile> list = new ArrayList<Mobile>();

	@Override
	public boolean addMobile(Mobile m) {
		// TODO Auto-generated method stub
		List<Mobile> listMobile = getFromFile();
		for (Mobile item : listMobile) {
			if (item.getProduct_id() == m.getProduct_id()) {
				return false;
			}
		}
		listMobile.add(m);
		writeDataToFile(listMobile, "Mobile.bin");
		return true;
	}

	public static void writeDataToFile(List<Mobile> mobiles, String fileName) {
		// TODO Auto-generated method stub
		try (FileOutputStream fos = new FileOutputStream(fileName);
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {

			for (Mobile item : mobiles) {
				oos.writeObject(item);
			}
			//oos.writeObject(mobiles); // Ghi toàn bộ danh sách như một đối tượng duy nhất
			System.out.println("Dữ liệu ghi vào tệp thành công");

		} catch (IOException ex) {
			System.err.println("Lỗi ghi dữ liệu " + ex.getMessage());
			ex.printStackTrace();
		}
	}

	public static List<Mobile> getFromFile() {
//		// TODO Auto-generated method stub
		 List<Mobile> mobiles = new ArrayList<>();
	        try (FileInputStream fis = new FileInputStream("Mobile.bin");
	             ObjectInputStream ois = new ObjectInputStream(fis)) {

	            while (true) {
	                try {
	                    Mobile mobile = (Mobile) ois.readObject();
	                    mobiles.add(mobile);
	                } catch (EOFException e) {
	                    break; // End of file reached
	                }
	            }

	        } catch (ClassNotFoundException e) {
	            System.err.println("Kiểu dữ liệu không khớp!");
	        } catch (IOException e) {
	            System.err.println("Lỗi đọc dữ liệu " + e.getMessage());
	        }

	        return mobiles;
	}

	@Override
	public boolean editMobile(Mobile m) {
		// TODO Auto-generated method stub
		List<Mobile> listMobile = getFromFile();
		for (Mobile item : listMobile) {
			if (item.getProduct_id() == m.getProduct_id()) {
				item.setProduct_name(m.getProduct_name());
				item.setProduct_price(m.getProduct_price());
				item.setProduct_total(m.getProduct_total());
				item.setMobile_brand(m.getMobile_brand());
				item.setMobile_memory(m.getMobile_memory());
				item.setMobile_processor(m.getMobile_processor());
				writeDataToFile(listMobile, "Mobile.bin");
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean delMobile(Mobile m) {
		// TODO Auto-generated method stub
		list.remove(m);
		return list.contains(m) ? false : true;
	}

	@Override
	public List<Mobile> searchMobile(String name) {
		// TODO Auto-generated method stub
		List<Mobile> result = new ArrayList<>();
        for (Mobile mobile : HomeView.listMobile) {
            if (mobile.getProduct_name().toLowerCase().contains(name.toLowerCase())) {
                result.add(mobile);
            }
        }
        return result;
	}

	private String normalizeString(String input) {
		// TODO Auto-generated method stub
		// Chuyển chuỗi về dạng không dấu và chữ thường
		String normalizedString = Normalizer.normalize(input.toLowerCase(), Normalizer.Form.NFD)
				.replaceAll("\\p{InCombiningDiacriticalMarks}+", "");

		// Loại bỏ khoảng trắng
		normalizedString = normalizedString.replaceAll("\\s+", "");

		return normalizedString;
	}

	@Override
	public List<Mobile> searchMobile(double price) {
		// TODO Auto-generated method stub
		List<Mobile> result = new ArrayList<>();
        for (Mobile mobile : HomeView.listMobile) {
            if (mobile.getProduct_price() == price) {
                result.add(mobile);
            }
        }
        return result;
	}

	@Override
	public List<Mobile> searchMobileByBrand(String brand) {
		// TODO Auto-generated method stub
		List<Mobile> result = new ArrayList<>();
        for (Mobile mobile : HomeView.listMobile) {
            if (mobile.getMobile_brand().toLowerCase().contains(brand.toLowerCase())) {
                result.add(mobile);
            }
        }
        return result;
	}

	@Override
	public List<Mobile> sortedMobile(boolean asc) {
		List<Mobile> listMobile = getFromFile();
		
		for (int i = 0; i < listMobile.size(); i++) {
			for (int j = i + 1; j < listMobile.size(); j++) {
				boolean value = listMobile.get(i).product_price < listMobile.get(j).product_price;
				if (value == asc) {
					Mobile tmp = listMobile.get(i);
					listMobile.set(i, listMobile.get(j));
					listMobile.set(j, tmp);
				}
			}
		}
	
		return listMobile;
	}

	public static void main(String[] args) {
		int count = 0;

		String[] brands = { "Samsung", "Apple", "Xiaomi", "Huawei" };
		String[] processors = { "A14 Bionic", "Exynos 2100", "Dimensity 1200" };
		int[] memories = { 16, 32, 64, 128, 256 };

		while (count < 20) {
			Mobile m;
			boolean check = true;
			int value = (int) (Math.random() * 100 + 10);
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getProduct_id() == value) {
					check = false;
					break;
				}
			}
			
			if (check) {
				double randomPrice = (double) (Math.random() * 1000000 + 1000000);
				int productTotal = (int) (Math.random() * 100);
				String brand = brands[(int) (Math.random() * brands.length)];
				String processor = processors[(int) (Math.random() * processors.length)];
				int memory = memories[(int) (Math.random() * memories.length)];

				m = new Mobile(brand, memory, processor);
				m.setProduct_id(value);
				m.setProduct_name("Mobile" + value);
				m.setProduct_price(randomPrice);
				m.setProduct_total(productTotal);

				list.add(m);

				count++;
			}
		}
		
		writeDataToFile(list, "Mobile.bin");
		List<Mobile> listMobile = new TestMobileManager().sortedMobile(false);
		
		for (Mobile item : listMobile) {
			
			System.out.println(item.getProduct_price());
		}
	}
	
	public static boolean isValidInteger(String str) {
        try {
            // Chuyển đổi chuỗi thành số nguyên
            int num = Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            // Nếu có lỗi xảy ra trong quá trình chuyển đổi, trả về false
            return false;
        }
    }
    public static boolean isDecimalNumber(String str) {
        char[] check = str.toCharArray();
        for(int i=0; i<check.length; i++)
        {
        	if(((int)check[i]<48 || (int)check[i]>57) && (int)check[i]!=46)
    		{
    			return false;
    		}
        }
        return true;
    }


}
