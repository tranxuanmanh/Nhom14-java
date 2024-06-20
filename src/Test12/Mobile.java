package Test12;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Mobile extends Product implements MobileManager {
	
	private static ArrayList<Mobile> list;

	private String mobile_brand;
	private int mobile_memory;
	private String mobile_processor;

	//Constructor
	public Mobile() {
		this("nul", 0, "null");
	}

	public Mobile(String mobile_brand, int mobile_memory, String mobile_processor) {
		this.mobile_brand = mobile_brand;
		this.mobile_memory = mobile_memory;
		this.mobile_processor = mobile_processor;
		this.product_id = 1;
		this.product_name = "idk";
		this.product_total = 1;
		this.product_price = 1;
	}

	// Getters and Setters
	public String getMobile_brand() {
		return mobile_brand;
	}

	public void setMobile_brand(String mobile_brand) {
		this.mobile_brand = mobile_brand;
	}

	public int getMobile_memory() {
		return mobile_memory;
	}

	public void setMobile_memory(int mobile_memory) {
		this.mobile_memory = mobile_memory;
	}

	public String getMobile_processor() {
		return mobile_processor;
	}

	public void setMobile_processor(String mobile_processor) {
		this.mobile_processor = mobile_processor;
	}

	@Override
	public String toString() {
		return "Mobile [mobile_brand=" + mobile_brand + ", mobile_memory=" + mobile_memory + ", mobile_processor="
				+ mobile_processor + ", product_id=" + getProduct_id() + ", product_name=" + getProduct_name()
				+ ", product_price=" + getProduct_price() + ", product_total=" + getProduct_total() + "]";
	}

	// Add
	@Override
	public boolean addMobile(Mobile m) {
		if (this.list == null) {
			this.list = new ArrayList<>();
		}
		return this.list.add(m);
	}

	// Edit
	@Override
	public boolean editMobile(Mobile m) {
		int pos = -1;
		for (Mobile item : this.list) {
			if (item.getProduct_id() == m.getProduct_id()) {
				pos = this.list.indexOf(item);
				break;
			}
		}

		if (pos != -1) {
			this.list.set(pos, m);
			return true;
		} else {
			return false;
		}
	}

	// Delete
	public static boolean delMobile(int product_id) {
	    return list.removeIf(item -> item.getProduct_id() == product_id);
	}


	// Search by name
	@Override
	public List<Mobile> searchMobile(String name) {
		List<Mobile> result = new ArrayList<>();
		for (Mobile item : this.list) {
			if (item.getProduct_name().toLowerCase().contains(name.toLowerCase())) {
				result.add(item);
			}
		}
		return result;
	}

	// Sort ascending by price
	@Override
	public List<Mobile> sortedMobile(double price) {
		this.list.sort(Comparator.comparingDouble(Mobile::getProduct_price));
	    return new ArrayList<>(this.list);
	}

	// Generate a list
	@Override
	public void generateList(int n) {
		this.list = new ArrayList<>(n);
		HashMap<Integer, Mobile> tmp = new HashMap<>();

		String[] brands = { "Samsung", "Apple", "Xiaomi", "Huawei" };
		String[] processors = { "A14 Bionic", "Exynos 2100", "Dimensity 1200" };
		int[] memories = { 16, 32, 64, 128, 256 };

		Mobile m;
		int value;
		while (tmp.size() < n) {
			
			value = (int) (Math.random() * 100);
			
			if (!tmp.containsKey(value)) {
				
				String brand = brands[(int) (Math.random() * brands.length)];
				String processor = processors[(int) (Math.random() * processors.length)];
				int memory = memories[(int) (Math.random() * memories.length)];
				double price = 2000000 + Math.random() * 40000000;
				String productName = "Mobile " + value;
				int productTotal = (int) (Math.random() * 100);

				m = new Mobile(brand, memory, processor);
				m.setProduct_id(value);
				m.setProduct_name(productName);
				m.setProduct_price(price);
				m.setProduct_total(productTotal);

				this.list.add(m);
				tmp.put(value, m);
			}
		}
	}

	// Print info 
	@Override
	public void printInfo(List<Mobile> mobiles) {
		mobiles.forEach(m -> {
			System.out.printf("\nID:%d, Name: %s, Brand: %s, Memory: %dGB, Processor: %s \n\tPrice: %.2f, Total: %d",
					m.getProduct_id(), m.getProduct_name(), m.getMobile_brand(), m.getMobile_memory(),
					m.getMobile_processor(), m.getProduct_price(), m.getProduct_total());
		});
	}

	public static void main(String[] args) {

		Mobile mobileManager = new Mobile();
		Scanner scanner = new Scanner(System.in);
		int choice;

		do {
			System.out.println("\n============Menu============");
			System.out.println("1. Add mobile");
			System.out.println("2. Edit mobile");
			System.out.println("3. Delete mobile");
			System.out.println("4. Search by name");
			System.out.println("5. Sort by price");
			System.out.println("6. Print");
			System.out.println("0. Exit");
			System.out.println("============================");
			System.out.print("Enter your choice: ");
			while (!scanner.hasNextInt()) {
				System.out.println("Invalid input. Please enter a number.");
				scanner.next();
				System.out.print("Enter your choice: ");
			}
			choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				System.out.print("Enter the number of mobiles to add: ");
				while (!scanner.hasNextInt()) {
					System.out.println("Invalid input. Please enter a valid number.");
					scanner.next(); 
					System.out.print("Enter the number of mobiles to generate: ");
				}
				int numMobiles = scanner.nextInt();
				scanner.nextLine();

				mobileManager.generateList(numMobiles);
				System.out.println(numMobiles + " mobiles added to the list.");
				break;

			case 2:
				System.out.print("Enter product ID to edit: ");
				while (!scanner.hasNextInt()) {
					System.out.println("Invalid input. Please enter a valid product ID.");
					scanner.next();
					System.out.print("Enter product ID to edit: ");
				}
				int editId = scanner.nextInt();
				scanner.nextLine();

				boolean exists = false;
				for (Mobile item : mobileManager.list) {
					if (item.getProduct_id() == editId) {
						exists = true;
						break;
					}
				}

				if (!exists) {
					System.out.println("Mobile with ID " + editId + " not found.");
				} else {

					System.out.print("Enter new product name: ");
					String newProductName = scanner.nextLine();
					System.out.print("Enter new brand: ");
					String newBrand = scanner.nextLine();
					System.out.print("Enter new memory (GB): ");
					while (!scanner.hasNextInt()) {
						System.out.println("Invalid input. Please enter a valid memory size (16, 32, 64, 128, 256).");
						scanner.next();
						System.out.print("Enter new memory (GB): ");
					}
					int newMemory = scanner.nextInt();
					scanner.nextLine(); 
					System.out.print("Enter new processor: ");
					String newProcessor = scanner.nextLine();
					System.out.print("Enter new price: ");
					while (!scanner.hasNextDouble()) {
						System.out.println("Invalid input. Please enter a valid price.");
						scanner.next(); 
						System.out.print("Enter new price: ");
					}
					double newPrice = scanner.nextDouble();
					scanner.nextLine(); 
					System.out.print("Enter new product total: ");
					while (!scanner.hasNextInt()) {
						System.out.println("Invalid input. Please enter a valid product total.");
						scanner.next(); 
						System.out.print("Enter new product total: ");
					}
					int newProductTotal = scanner.nextInt();
					scanner.nextLine();
					Mobile editMobile = new Mobile(newBrand, newMemory, newProcessor);
					editMobile.setProduct_id(editId);
					editMobile.setProduct_name(newProductName);
					editMobile.setProduct_price(newPrice);
					editMobile.setProduct_total(newProductTotal);
					if (mobileManager.editMobile(editMobile)) {
						System.out.println("Edited successfully.");
					}
				}
				break;

			case 3:
				System.out.print("Enter product ID to delete: ");
				while (!scanner.hasNextInt()) {
					System.out.println("Invalid input. Please enter a valid product ID.");
					scanner.next(); 
					System.out.print("Enter product ID to delete: ");
				}
				int deleteId = scanner.nextInt();
				scanner.nextLine(); 
				
                if (mobileManager.delMobile(deleteId)) {
                    System.out.println("Deleted successfully.");
                } else {
                    System.out.println("Mobile with ID " + deleteId + " not found.");
                }
				break;

			case 4:
				System.out.print("Enter name to search: ");
				String searchName = scanner.nextLine();
				List<Mobile> foundMobile = mobileManager.searchMobile(searchName);
				if (foundMobile.isEmpty()) {
					System.out.println("No mobiles found " + searchName);
				} else {
					System.out.println("Found mobile:");
					mobileManager.printInfo(foundMobile);
				}
				break;

			case 5:
				List<Mobile> sortedMobiles = mobileManager.sortedMobile(0);
				System.out.println("Mobiles sorted by price:");
				mobileManager.printInfo(sortedMobiles);
				break;

			case 6:
				mobileManager.printInfo(mobileManager.list);
				break;

			case 0:
				System.out.println("Exiting.");
				break;

			default:
				System.out.println("Invalid choice. Please try again.");
			}
		} while (choice != 0);

		scanner.close();
	}

	public static List<Mobile> getAll() {
	    return new ArrayList<>(list);
	}

}
