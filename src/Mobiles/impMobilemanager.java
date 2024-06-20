
package Mobiles;

import java.io.*;

import java.util.*;

/**
 *
 * @author TUAN MINH
 */
public class impMobilemanager implements Mobilemanager {

    /**
     * @param args the command line arguments
     */
    public static ArrayList<Mobile> list = new ArrayList<>();
    public Scanner sc = new Scanner(System.in);

    public void data() {
        list.add(new Mobile("do", 95, 64, "1", "IPhone6", 100, 10));
        list.add(new Mobile("den", 95, 32, "2", "IPhone5", 90, 10));
        list.add(new Mobile("do", 90, 128, "3", "IPhone6", 105, 10));
        list.add(new Mobile("trang", 95, 256, "4", "IPhone7", 200, 10));
        list.add(new Mobile("tim", 85, 256, "5", "IPhone11", 300, 10));
        list.add(new Mobile("do", 95, 64, "6", "IPhone6", 100, 10));
        list.add(new Mobile("den", 95, 32, "7", "IPhone5", 90, 10));
        list.add(new Mobile("do", 90, 128, "8", "IPhone6", 105, 10));
        list.add(new Mobile("trang", 95, 256, "9", "IPhone7", 200, 10));
        list.add(new Mobile("tim", 85, 256, "10", "IPhone11", 300, 10));
    }

    @Override
    public boolean addMobile(Mobile m) {
        list.add(m);
        return true;
    }

    @Override
    public boolean editMobile(Mobile m) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getProduct_id().equals(m.getProduct_id())) {
                list.set(i, m);
                return true;
            }
        }
        return false;

    }

    @Override
    public boolean delMobile(Mobile m) {

        list.remove(m);
        return true;
    }

    @Override
    public List<Mobile> searcMobile_byName(String name) {
        ArrayList<Mobile> newlist = new ArrayList<>();
        for (Mobile x : this.list) {
            if (x.getProduct_name().equalsIgnoreCase(name)) {
                newlist.add(x);
            }
        }
        return newlist;
    }

    @Override
    public List<Mobile> searcMobile_byPrice(double price) {
        ArrayList<Mobile> newlist = new ArrayList<>();
        for (Mobile x : list) {
            if (x.getProduct_price() == price) {
                newlist.add(x);
            }
        }
        return newlist;
    }

    @Override
    public List<Mobile> searcMobile_byMemory(int memory) {
        ArrayList<Mobile> newlist = new ArrayList<>();
        for (Mobile x : list) {
            if (x.getMemory() == memory) {
                newlist.add(x);
            }
        }
        return newlist;
    }

    @Override
    public List<Mobile> searcMobile_byColor(String color) {
        List<Mobile> newlist = new ArrayList<>();
        for (Mobile x : this.list) {
            if (x.getColor().equalsIgnoreCase(color)) {
                newlist.add(x);
            }
        }
        return newlist;
    }

    @Override
    public List<Mobile> searcMobile_byBattery(double battery) {
        ArrayList<Mobile> newlist = new ArrayList<>();
        for (Mobile x : list) {
            if (x.getBattery() == battery) {
                newlist.add(x);
            }
        }
        return newlist;
    }

    @Override
    public List<Mobile> sortedMobile_byPrice() {
        ArrayList<Mobile> newlist = new ArrayList<>();
        list.sort((m1, m2) -> Double.compare(m1.getProduct_price(), m2.getProduct_price()));
        newlist = this.list;
        return newlist;
    }

    // Phương thức để lưu dữ liệu vào tập tin
    public void saveToBinaryFile(String filename) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {

            out.writeObject(list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loaFromBinaryFile(String filename, ArrayList<Mobile> l) {
// Xóa dữ liệu hiện tại của list trước khi đọc từ file

    try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
        l = (ArrayList<Mobile>) in.readObject(); // Đọc danh sách từ file và gán cho list
    } catch (IOException | ClassNotFoundException e) {
        e.printStackTrace();
    }
}
}
