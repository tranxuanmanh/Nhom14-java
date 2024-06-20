
package Entity;

import java.io.Serializable;
import java.util.ArrayList;

public class TV  extends Product_TV {

        public static ArrayList<TV> list = new ArrayList<>();       	
	// properties
	private String tv_brand;
	private float tv_size;
	private float tv_weight;	
	public TV(){}
	// constructor co tham so

	public TV(String tv_brand, float tv_size, float tv_weight, int product_id, String product_name, double product_price,double product_total) {
		super(product_id, product_name, product_price, product_total);
		this.tv_brand = tv_brand;
		this.tv_size = tv_size;
		this.tv_weight = tv_weight;
	}

//getter ,setter
	public String getTv_brand() {return tv_brand;}
	public void setTv_brand(String tv_brand) {this.tv_brand = tv_brand;}
	public double getTv_size() {return tv_size;}
	public void setTv_size(float tv_size) {this.tv_size = tv_size;}
	public double getTv_weight() {return tv_weight;}
	public void setTv_weight(float tv_weight) {this.tv_weight = tv_weight;}
        
}



           //setGioiTinh
//            String gt = btNam.isSelected() ? "Nam" : "Nu";
//            pr.setString(4, gt);
////            pr.setBoolean(4, btNam.isSelected());
//            //setQuequan          
//            QueQuan selected = (QueQuan) cboQueQuan.getSelectedItem();  //Gan thong tin que quan vao combobox
//            pr.setString(5, selected.getName());  //Lay ten que quan .Neu muon lay id thi selected.getId();
//            //Thuc hien them moi du lieu    

