
package Entity;


public class Product_TV {
        //khoi tao cac thuoc tinh
    protected int product_id;
    protected String product_name;
    protected double product_price;
    protected double product_total;

    //phuong thuc khong tham so
    public Product_TV() {
    }   
    //phuong thuc co tham so
    public Product_TV(int product_id, String product_name, double product_price, double product_total) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_price = product_price;
        this.product_total = product_total;
    }
    //phuong thuc getter 
    public int getProduct_id() {
        return product_id;
    }
    public String getProduct_name() {
        return product_name;
    }
    public double getProduct_price() {
        return product_price;
    }
    public double getProduct_total() {
        return product_total;
    }
    //phuong thuc setter
    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    } 
    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }
    public void setProduct_price(double product_price) {
        this.product_price = product_price;
    } 
    public void setProduct_total(int product_total) {
        this.product_total = product_total;
    }
}
