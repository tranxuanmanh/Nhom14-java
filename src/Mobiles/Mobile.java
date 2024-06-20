
package Mobiles;

/**
 *
 * @author TUAN MINH
 */
import java.io.Serializable;
public class Mobile extends Product implements Serializable {
    //để đảm bảo tính tương thích
    private static final long serialVersionUID = 1L;
    private String color;
    private double battery;
    private int memory;

    public Mobile() {
    }

    public Mobile(String color, double battery, int memory, String product_id, String product_name, double product_price, int product_total) {
    super(product_id, product_name, product_price, product_total);
    this.color = color;
    this.battery = battery;
    this.memory = memory;
}

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getBattery() {
        return battery;
    }

    public void setBattery(double battery) {
        this.battery = battery;
    }

    public double getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }
    public void setMobile(String color, double battery, int memory, String product_name, double product_price, int product_total)
    {
        this.setProduct_name(product_name);
        this.setProduct_price(product_price);
        this.setProduct_total(product_total);
        this.setColor(color);
        this.setBattery(battery);
        this.setMemory(memory);
    }
    @Override
    public String toString() {
        return "Mobile: {"+super.toString() + "color=" + color + ", battery=" + battery + ", memory=" + memory + '}';
    }
    
    
}
