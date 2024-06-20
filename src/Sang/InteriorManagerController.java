package Sang;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import DangNhap.InteriorMangerView;
import DangNhap.MenuList;

public class InteriorManagerController implements ActionListener, ListSelectionListener {
	
	public InteriorMangerView view;

	public InteriorManagerController(InteriorMangerView view) {
		this.view = view;
	}

	
	
	public void actionPerformedInsert(String a) {
		if ("Insert".equals(a)) {
			if (isCheck()) {
				int ID = Integer.valueOf(this.view.getTxbID());
				String name = this.view.getTxbName();
				int total = Integer.valueOf(this.view.getTxbTotal());
				double price = Double.valueOf(this.view.getTxbPrice());
				String color = this.view.getCbbColor();
				double size = Double.valueOf(this.view.getTxbSize());
				String brand = this.view.getTxbBrand();
				Interior m = new Interior(ID, name, price, total, color, size, brand);
				if (this.view.insert(m) == false) {
					JOptionPane.showMessageDialog(view, "Product Exist!");
				} else {
					JOptionPane.showMessageDialog(view, "Added Successfully!");
					this.view.saveFile();
					
				}
				this.view.display(this.view.getTableList());
				this.view.reset();
			}
		}
	}
	public void actionPerformedUpdate(String a) {
		if ("Update".equals(a)) {
			if (check == false) {
				JOptionPane.showMessageDialog(view, "Please choose an item to update!");
			} else {
				if (isCheck()) {
					int ID = Integer.valueOf(this.view.getTxbID());
					String name = this.view.getTxbName();
					int total = Integer.valueOf(this.view.getTxbTotal());
					double price = Double.valueOf(this.view.getTxbPrice());
					String color = this.view.getCbbColor();
					double size = Double.valueOf(this.view.getTxbSize());
					String brand = this.view.getTxbBrand();
					Interior m = new Interior(ID, name, price, total, color, size, brand);
					if (m.editInterior(m) == false) {
						JOptionPane.showMessageDialog(view, "Product does not Exist!");
					} else {
						JOptionPane.showMessageDialog(view, "Update Successfully!");
						this.view.saveFile();
						this.view.reset();
					}
				}
				this.view.getModel().setRowCount(0);
				this.view.display(this.view.getTableList());
			}
		}
	}
	public void actionPerformedDelete(String a) {
		if ("Delete".equals(a)) {
			if (check == false) {
				JOptionPane.showMessageDialog(view, "Please choose an item to DELETE!");
			} else {
				int selectedRow = this.view.getTableList().getSelectedRow();
				Integer ID = Integer.valueOf(this.view.getTxbID());
				Interior m = new Interior(ID);
				int response = JOptionPane.showConfirmDialog(view,
						"Are you sure to delete this item with ID = " + ID + "?", "Option", JOptionPane.YES_NO_OPTION,
						JOptionPane.QUESTION_MESSAGE);
				if (response == JOptionPane.YES_OPTION) {
					if (this.view.remove(m)) {
						this.view.getModel().removeRow(selectedRow);
						JOptionPane.showMessageDialog(view, "Delete Successfully!");
						this.view.saveFile();
						this.view.reset();
					} else {
						JOptionPane.showMessageDialog(view, "Cannot delete this item because the ID does not exist!");
					}
				}
			}
		}
	}

	public void actionPerformedSearch(String a) {
		if ("Search".equals(a)) {
			if (this.view.getTxbName().toString().isEmpty()) {
				JOptionPane.showMessageDialog(view, "Please enter a name to Search!");
			} else {
				if (this.view.SearchName(this.view.getTxbName(), this.view.getTableList()) == false) {
					JOptionPane.showMessageDialog(view, "Cannot find the product!");
				}
			}
			this.view.saveFile();
		}
	}

	public void actionPerformedExit(String a) {
		if ("Exit".equals(a)) {
			int response = JOptionPane.showConfirmDialog(this.view, "Are you want to exit?",
					"Exit", JOptionPane.YES_NO_OPTION);
			if (response == JOptionPane.YES_OPTION) {
				System.exit(0);
			}
		}
	}
	public void actionPerformedSort(String a) {
		if ("Sort".equals(a)) {
			this.view.getModel().setRowCount(0);
			this.view.Sort(this.view.getTableList());
		}
	}
	
	public void actionPerformedSave(String a) {
		if("Save".equals(a)) {
			this.view.saveFile();
		}
	}
	public void actionPerformedOpen(String a) {
		if("Open".equals(a)) {
			this.view.openFile();
		}
	}
       
	
	public static boolean check = false;
	
	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		try {
			if (!e.getValueIsAdjusting()) {
				int selectedRow = this.view.getTableList().getSelectedRow();
				if (selectedRow != -1) {
					check = true;
					String id = this.view.getModel().getValueAt(selectedRow, 0).toString();
					String name = this.view.getModel().getValueAt(selectedRow, 1).toString();
					String total = this.view.getModel().getValueAt(selectedRow, 3).toString();
					String price = this.view.getModel().getValueAt(selectedRow, 2).toString();
					String color = this.view.getModel().getValueAt(selectedRow, 4).toString();
					String size = this.view.getModel().getValueAt(selectedRow, 5).toString();
					String brand = this.view.getModel().getValueAt(selectedRow, 6).toString();

					this.view.setTxbID(id + "");
					this.view.setTxbName(name);
					this.view.setTxbPrice(price + "");
					this.view.setTxbTotal(total + "");
					this.view.setTxbSize(size + "");
					this.view.setTxbBrand(brand);
					this.view.setCbbColor(color);
				}
			}
		} catch (NumberFormatException e1) {
			JOptionPane.showMessageDialog(view, "ERROR DOUBLE");
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String cm = e.getActionCommand();
		actionPerformedInsert(cm);
		actionPerformedUpdate(cm);
		actionPerformedDelete(cm);
		actionPerformedSort(cm);
		actionPerformedSearch(cm);
		actionPerformedExit(cm);
		actionPerformedOpen(cm);
		actionPerformedSave(cm);
	}
	
	public boolean isCheck() {

		if (this.view.getTxbID().toString().isEmpty()) {
			JOptionPane.showMessageDialog(view, "Missing Field: ID!");
			return false;
		}

		if (this.view.getTxbName().toString().isEmpty()) {
			JOptionPane.showMessageDialog(view, "Missing Field: Name!");
			return false;
		}
		if (this.view.getTxbPrice().toString().isEmpty()) {
			JOptionPane.showMessageDialog(view, "Missing Field: Price!");
			return false;
		}
		if (this.view.getTxbTotal().toString().isEmpty()) {
			JOptionPane.showMessageDialog(view, "Missing Field: Total!");
			return false;
		}
		if (this.view.getTxbSize().toString().isEmpty()) {
			JOptionPane.showMessageDialog(view, "Missing Field: Size!");
			return false;
		}
		if (this.view.getTxbBrand().toString().isEmpty()) {
			JOptionPane.showMessageDialog(view, "Missing Field: Brand!");
			return false;
		}
		// try catch ID
		try {
			int ID = Integer.valueOf(this.view.getTxbID());
			if (ID < 0) {
				JOptionPane.showMessageDialog(view, "ID must be greater than equal to 0");
				return false;
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(view, "Error datatype of ID!");
			return false;
		}

		// try catch total
		try {
			int total = Integer.valueOf(this.view.getTxbTotal());
			if (total < 0) {
				JOptionPane.showMessageDialog(view, "TOTAL must be greater than equal to 0");
				return false;
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(view, "Error datatype of TOTAL!");
			return false;
		}
		// try catch Price
		try {
			Double Price = Double.valueOf(this.view.getTxbPrice());
			if (Price < 0) {
				JOptionPane.showMessageDialog(view, "Price must be greater than equal to 0");
				return false;
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(view, "Error datatype of PRICE!");
			return false;
		}
		// try catch 
		try {
			double Size = Double.valueOf(this.view.getTxbSize());
			if (Size < 0) {
				JOptionPane.showMessageDialog(view, "ID must be greater than equal to 0");
				return false;
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(view, "Error datatype of Size!");
			return false;
		}
		return true;
	}

}
