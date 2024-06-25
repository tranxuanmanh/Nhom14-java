<<<<<<< HEAD:src/Interior_Sang/InteriorMangerView.java
package Interior_Sang;

import ALogin_Menu.MenuList;
=======
package Sang;

import DangNhap.MenuList;
>>>>>>> 26d6cf159da925876e6bd2c421996358799537d8:src/Sang/InteriorMangerView.java
import java.awt.Button;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Panel;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

<<<<<<< HEAD:src/Interior_Sang/InteriorMangerView.java
import Interior_Sang.InteriorManagerController;
import Interior_Sang.Interior;
=======
import Sang.InteriorManagerController;
import Sang.Interior;
>>>>>>> 26d6cf159da925876e6bd2c421996358799537d8:src/Sang/InteriorMangerView.java
import java.awt.event.ActionEvent;


public class InteriorMangerView extends JFrame{
//    public InteriorMangerView(){
//        hienthi();
//      
//    }
	private JPanel contentPanel;
	private Interior interiors;
	private JLabel lbID;
	private JTextField txbID;
	private JTextField txbName;
	private JTextField txbPrice;
	private JTextField txbTotal;
	private JTextField txbBrand;
	private JComboBox cbbColor;
	private JTextField txbSize;
	private JTable tableList;
	private DefaultTableModel model;
	
	// getters & setters
	public JTable getTableList() {
		return tableList;
	}

	public void setTableList(JTable tableList) {
		this.tableList = tableList;
	}

	public DefaultTableModel getModel() {
		return model;
	}

	public void setModel(DefaultTableModel model) {
		this.model = model;
	}

	public String getTxbID() {
		return txbID.getText();
	}

	public void setTxbID(String id) {
		this.txbID.setText(id);
	}

	public String getTxbName() {
		return txbName.getText();
	}

	public void setTxbName(String txbName) {
		this.txbName.setText(txbName);
	}

	public String getTxbPrice() {
		return txbPrice.getText();
	}

	public void setTxbPrice(String txbPrice) {
		this.txbPrice.setText(txbPrice);
	}

	public String getTxbTotal() {
		return txbTotal.getText();
	}

	public void setTxbTotal(String txbTotal) {
		this.txbTotal.setText(txbTotal);
	}

	public String getTxbSize() {
		return txbSize.getText();
	}

	public void setTxbSize(String txbSize) {
		this.txbSize.setText(txbSize);
	}

	public String getTxbBrand() {
		return txbBrand.getText();
	}

	public void setTxbBrand(String txbBrand) {

		this.txbBrand.setText(txbBrand);
	}

	public String getCbbColor() {
		return cbbColor.getSelectedItem().toString();
	}

	public void setCbbColor(String cbbColor) {
		this.cbbColor.setSelectedItem(cbbColor);
	}
	
	
	 // Launch the application
	public static void main(String[] args) {
		// run form
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InteriorMangerView frame = new InteriorMangerView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	// Create the frame.
	public InteriorMangerView() {
                setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
		setTitle("Interior");
		this.interiors = new Interior();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 962, 678);
		// ActionListener
		ActionListener action = new InteriorManagerController(this);
		ListSelectionListener list = new InteriorManagerController(this);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(224, 255, 255));
		setJMenuBar(menuBar);

		JMenu menuFile = new JMenu("File");
		menuBar.add(menuFile);

		JMenuItem menuOpen = new JMenuItem("Open");
		menuOpen.addActionListener(action);
		menuFile.add(menuOpen);

		JMenuItem menuSave = new JMenuItem("Save");
		menuSave.addActionListener(action);
		menuFile.add(menuSave);

		JSeparator separator = new JSeparator();
		menuFile.add(separator);

		JMenuItem menuExit = new JMenuItem("Exit");
		menuExit.addActionListener(action);
		menuFile.add(menuExit);

		JMenu menuAbout = new JMenu("About");
		menuBar.add(menuAbout);
		contentPanel = new JPanel();
		contentPanel.setBackground(new Color(175, 238, 238));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPanel);
		contentPanel.setLayout(null);

		Panel panel = new Panel();
		panel.setBackground(new Color(175, 238, 238));
		panel.setBounds(10, 10, 933, 231);
		contentPanel.add(panel);
		panel.setLayout(null);

		lbID = new JLabel("Product ID");
		lbID.setForeground(new Color(0, 0, 0));
		lbID.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbID.setBounds(104, 50, 98, 15);
		panel.add(lbID);

		JLabel lbName = new JLabel("Product Name");
		lbName.setForeground(new Color(0, 0, 0));
		lbName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbName.setBounds(104, 102, 98, 15);
		panel.add(lbName);

		JLabel lbPrice = new JLabel("Product Price");
		lbPrice.setForeground(new Color(0, 0, 0));
		lbPrice.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbPrice.setBounds(104, 151, 98, 15);
		panel.add(lbPrice);

		JLabel lbTotal = new JLabel("Product Total");
		lbTotal.setForeground(new Color(0, 0, 0));
		lbTotal.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbTotal.setBounds(104, 205, 98, 15);
		panel.add(lbTotal);

		JLabel lbColor = new JLabel("Color");
		lbColor.setForeground(new Color(0, 0, 0));
		lbColor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbColor.setBounds(467, 49, 98, 15);
		panel.add(lbColor);

		JLabel lbBattery = new JLabel("Size");
		lbBattery.setForeground(new Color(0, 0, 0));
		lbBattery.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbBattery.setBounds(467, 102, 98, 15);
		panel.add(lbBattery);

		JLabel lbBrand = new JLabel("Brand");
		lbBrand.setForeground(new Color(0, 0, 0));
		lbBrand.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbBrand.setBounds(467, 151, 98, 15);
		panel.add(lbBrand);

		txbID = new JTextField();
		txbID.setBounds(235, 43, 176, 28);
		panel.add(txbID);
		txbID.setColumns(10);

		txbName = new JTextField();
		txbName.setColumns(10);
		txbName.setBounds(235, 95, 176, 28);
		panel.add(txbName);

		txbPrice = new JTextField();
		txbPrice.setColumns(10);
		txbPrice.setBounds(235, 144, 176, 28);
		panel.add(txbPrice);

		txbTotal = new JTextField();
		txbTotal.setColumns(10);
		txbTotal.setBounds(235, 198, 176, 28);
		panel.add(txbTotal);

		cbbColor = new JComboBox();
		cbbColor.setBackground(new Color(224, 255, 255));
		String color[] = { "BLUE", "RED", "PURPLE", "YELLOW", "PINK" };
		for (String a : color) {
			cbbColor.addItem(a);
		}
		cbbColor.setBounds(576, 43, 178, 26);
		panel.add(cbbColor);

		txbSize = new JTextField();
		txbSize.setColumns(10);
		txbSize.setBounds(578, 95, 176, 28);
		panel.add(txbSize);

		txbBrand = new JTextField();
		txbBrand.setColumns(10);
		txbBrand.setBounds(576, 144, 176, 28);
		panel.add(txbBrand);

		JLabel lblProductLabel = new JLabel("Interior Information");
		lblProductLabel.setBounds(367, 0, 198, 28);
		panel.add(lblProductLabel);
		lblProductLabel.setForeground(new Color(47, 79, 79));
		lblProductLabel.setFont(new Font("Tahoma", Font.BOLD, 18));

		tableList = new JTable(this.model);
		tableList.setFont(new Font("Tahoma", Font.PLAIN, 10));
		tableList.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "ID", "NAME", "PRICE", "TOTAL", "COLOR", "SIZE", "BRAND" }));
		tableList.setBounds(0, 0, 1, 1);
		tableList.getSelectionModel().addListSelectionListener(list);
		JScrollPane scrollPane = new JScrollPane(tableList);
		scrollPane.setBounds(10, 274, 933, 247);
		contentPanel.add(scrollPane);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(175, 238, 238));
		panel_1.setBounds(10, 531, 933, 78);
		contentPanel.add(panel_1);
		panel_1.setLayout(null);

		Button btnInsert = new Button("Insert");
		btnInsert.addActionListener(action);
		btnInsert.setBackground(new Color(224, 255, 255));
		btnInsert.setForeground(SystemColor.desktop);
		btnInsert.setFont(new Font("Dialog", Font.BOLD, 12));
		btnInsert.setBounds(83, 35, 126, 41);
		panel_1.add(btnInsert);

		Button btnUpdate = new Button("Update");
		btnUpdate.addActionListener(action);
		btnUpdate.setForeground(SystemColor.desktop);
		btnUpdate.setFont(new Font("Dialog", Font.BOLD, 12));
		btnUpdate.setBackground(new Color(224, 255, 255));
		btnUpdate.setBounds(236, 35, 126, 41);
		panel_1.add(btnUpdate);

		Button btnRemove = new Button("Delete");
		btnRemove.addActionListener(action);
		btnRemove.setForeground(SystemColor.desktop);
		btnRemove.setFont(new Font("Dialog", Font.BOLD, 12));
		btnRemove.setBackground(new Color(224, 255, 255));
		btnRemove.setBounds(410, 35, 126, 41);
		panel_1.add(btnRemove);

		Button btnSort = new Button("Sort");
		btnSort.addActionListener(action);
		btnSort.setForeground(SystemColor.desktop);
		btnSort.setFont(new Font("Dialog", Font.BOLD, 12));
		btnSort.setBackground(new Color(224, 255, 255));
		btnSort.setBounds(584, 35, 126, 41);
		panel_1.add(btnSort);

		Button btnSearch = new Button("Search");
		btnSearch.addActionListener(action);
		btnSearch.setForeground(SystemColor.desktop);
		btnSearch.setFont(new Font("Dialog", Font.BOLD, 12));
		btnSearch.setBackground(new Color(224, 255, 255));
		btnSearch.setBounds(750, 35, 126, 41);
		panel_1.add(btnSearch);
                
                
		Button btnNewButton = new Button("Home");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
                        new MenuList("","").setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBackground(new Color(255, 128, 128));
		btnNewButton.setBounds(822, 95, 77, 55);
		panel.add(btnNewButton);	}
	
	public void reset() {
		txbID.setText("");
		txbName.setText("");
		txbPrice.setText("");
		txbTotal.setText("");
		txbSize.setText("");
		txbBrand.setText("");
		cbbColor.setSelectedIndex(0);
	}


	// ham them
	public boolean insert(Interior m) {
		return this.interiors.addInterior(m);
	}
	
	// ham xoa
	public boolean remove(Interior m) {
		return this.interiors.delInterior(m);
	}
	
	// ham hien thi
	public void display(JTable table) {
		if (model == null) {
			for (Interior m : this.interiors.list) {
				model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] { m.getProduct_id() + "", m.getProduct_name(), m.getProduct_price() + "",
						m.getProduct_total() + "", m.getInterior_color(), m.getInterior_size() + "", m.getInterior_brand() });
			}
		} else {
			model.setRowCount(0);
			for (Interior m : this.interiors.list) {
				model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] { m.getProduct_id() + "", m.getProduct_name(), m.getProduct_price() + "",
						m.getProduct_total() + "", m.getInterior_color(), m.getInterior_size() + "", m.getInterior_brand() });
			}
		}
	}
	// ham sap xep
	public void Sort(JTable table) {
		List<Interior> sortedList = this.interiors.sortedInterior(0);
		for (Interior m : sortedList) {
			model = (DefaultTableModel) table.getModel();
			model.addRow(new Object[] { m.getProduct_id() + "", m.getProduct_name(), m.getProduct_price() + "",
					m.getProduct_total() + "", m.getInterior_color(), m.getInterior_size() + "", m.getInterior_brand() });
		}
	}
	
	// ham tim kiem
	public boolean SearchName(String a, JTable table) {
		// TODO Auto-generated method stub
		List<Interior> searchList = this.interiors.searchInterior(a);
		if (searchList == null) {
			return false;
		} else {
			model.setRowCount(0);
			for (Interior m : searchList) {
				model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] { m.getProduct_id() + "", m.getProduct_name(), m.getProduct_price() + "",
						m.getProduct_total() + "", m.getInterior_size() + "", m.getInterior_brand() });
			}
		}
		return true;
	}

	// ham luu file
	public void saveFile() {
		try {
			FileOutputStream fos = new FileOutputStream(this.interiors.getFileName());
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(this.interiors.list);
            //closing the stream
            oos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	// ham doc file
	public void openFile() {
		List<Interior> list1 = new ArrayList<Interior>();
		try {
			FileInputStream fis = new FileInputStream(this.interiors.getFileName());
			ObjectInputStream ois = new ObjectInputStream(fis);
			while (true) {
				try {
					list1 = (ArrayList<Interior>) ois.readObject();
				} catch (EOFException eof) {
					// Kết thúc tệp tin, thoát vòng lặp
					break;
				}
			}
			this.interiors.list = list1;
			ois.close();
			display(tableList);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

    private void initComponents() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}