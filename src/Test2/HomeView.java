package Test2;

<<<<<<< HEAD
import ALogin_Menu.*;
=======
import DangNhap.MenuList;
>>>>>>> 26d6cf159da925876e6bd2c421996358799537d8
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

import Test12.Mobile;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class HomeView extends JFrame {

	public static List<Mobile> listMobile = new ArrayList<Mobile>();
	
	private static final long serialVersionUID = 1L;
	private JPanel cpHome;
	private JTextField textFieldName;
	private JTextField textFieldBrand;
	private JTextField textFieldPrice;
	private JButton btnAdd;
	private JTable table;
	private JComboBox cbSort;
	

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeView frame = new HomeView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	
	public HomeView() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\user\\eclipse-workspace1\\img\\system-file-manager-icon.png"));
		setTitle("Home manager");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 829, 678);
		cpHome = new JPanel();
		cpHome.setBackground(new Color(245, 255, 250));
		cpHome.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(cpHome);
		cpHome.setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setHorizontalAlignment(SwingConstants.LEFT);
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblName.setBounds(62, 164, 90, 28);
		cpHome.add(lblName);
		
		JLabel lblBrand = new JLabel("Brand");
		lblBrand.setHorizontalAlignment(SwingConstants.LEFT);
		lblBrand.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblBrand.setBounds(447, 164, 90, 28);
		cpHome.add(lblBrand);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setHorizontalAlignment(SwingConstants.LEFT);
		lblPrice.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPrice.setBounds(62, 212, 90, 28);
		cpHome.add(lblPrice);
		
		textFieldName = new JTextField();
		lblName.setLabelFor(textFieldName);
		textFieldName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldName.setBounds(138, 164, 224, 28);
		cpHome.add(textFieldName);
		textFieldName.setColumns(10);
		
		textFieldBrand = new JTextField();
		lblBrand.setLabelFor(textFieldBrand);
		textFieldBrand.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldBrand.setBounds(523, 164, 224, 28);
		cpHome.add(textFieldBrand);
		textFieldBrand.setColumns(10);
		
		textFieldPrice = new JTextField();
		lblPrice.setLabelFor(textFieldPrice);
		textFieldPrice.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldPrice.setBounds(138, 212, 120, 28);
		cpHome.add(textFieldPrice);
		textFieldPrice.setColumns(10);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = textFieldName.getText().trim();
                String brand = textFieldBrand.getText().trim();
                String priceText = textFieldPrice.getText().trim();
                                
                List<Mobile> searchResults = new ArrayList<>();

                if (!name.isEmpty()) {
                    searchResults = new TestMobileManager().searchMobile(name);
                } else if (!brand.isEmpty()) {
                    searchResults = new TestMobileManager().searchMobileByBrand(brand);
                } else if (!priceText.isEmpty()) {
                    try {
                        double price = Double.parseDouble(priceText);
                        searchResults = new TestMobileManager().searchMobile(price);
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(HomeView.this, "Please enter a valid price.", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                } else {
                    JOptionPane.showMessageDialog(HomeView.this, "Please enter search criteria.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                if (!searchResults.isEmpty()) {
                    updateTableWithSearchResults(searchResults);
                } else {
                    JOptionPane.showMessageDialog(HomeView.this, "No results found.", "Information", JOptionPane.INFORMATION_MESSAGE);
                    updateTableWithSearchResults(searchResults);
                }
            }

			private void updateTableWithSearchResults(List<Mobile> result) {
				// TODO Auto-generated method stub
				DefaultTableModel model = (DefaultTableModel) table.getModel();
		        
		        while (model.getRowCount() > 0) {
		            model.removeRow(0);
		        }
		        
		        DecimalFormat df = new DecimalFormat("#");
		        df.setMaximumFractionDigits(0);
		        
		        for (int i = 0; i < result.size(); i++) {
		            Mobile mobile = result.get(i);
		            String price = df.format(mobile.getProduct_price());
		            model.addRow(new Object[]{
		                i + 1,
		                mobile.getProduct_id(),
		                mobile.getProduct_name(),
		                mobile.getMobile_brand(),
		                mobile.getMobile_memory(),
		                mobile.getMobile_processor(),
		                price,
		                mobile.getProduct_total(),
		                "Edit",
		                "Delete"
		            });
		        }
		        
		        addEditAndDeleteButtonsToTable();
		        
			}
		});
		
		
		btnSearch.setForeground(new Color(0, 0, 205));
		btnSearch.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSearch.setBounds(551, 238, 89, 28);
		cpHome.add(btnSearch);
		
		btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddView addView = new AddView(); // Truyền tham chiếu của HienThi vào AddView
                                addView.setVisible(true);     
			}
		});
		btnAdd.setForeground(new Color(0, 0, 205));
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnAdd.setBounds(658, 238, 89, 28);
		cpHome.add(btnAdd);
		
		
	DefaultTableModel model = new DefaultTableModel();
        model.addColumn("STT");
        model.addColumn("ID");
        model.addColumn("Name");
        model.addColumn("Brand");
        model.addColumn("Memory");
        model.addColumn("Processor");
        model.addColumn("Price");
        model.addColumn("Total");
        model.addColumn("");
        model.addColumn("");

        table = new JTable(model);
        table.setFont(new Font("Tahoma", Font.PLAIN, 15));
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(62, 348, 685, 267);
        cpHome.add(scrollPane);
        
        cbSort = new JComboBox();
        cbSort.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		updateTable();
        	}
        });
        cbSort.setFont(new Font("Tahoma", Font.PLAIN, 15));
        cbSort.setModel(new DefaultComboBoxModel(new String[] {"Ascending", "Decrease"}));
        cbSort.setSelectedIndex(0);
        cbSort.setBounds(605, 298, 142, 28);
        cpHome.add(cbSort);
        
        JLabel lblSort = new JLabel("Sorted by");
        lblSort.setLabelFor(cbSort);
        lblSort.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblSort.setBounds(523, 298, 90, 28);
        cpHome.add(lblSort);
        
        JLabel lblNewLabel = new JLabel("PRODUCT MANAGEMENT");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setForeground(new Color(255, 69, 0));
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblNewLabel.setBounds(295, 70, 234, 38);
        cpHome.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("Enter search information");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.ITALIC, 15));
        lblNewLabel_1.setBounds(62, 128, 182, 19);
        cpHome.add(lblNewLabel_1);
        
        JButton btnNewButton = new JButton("Home");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		dispose();
                new MenuList("","").setVisible(true);
        	}
        });
        btnNewButton.setForeground(new Color(0, 0, 128));
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnNewButton.setBounds(63, 30, 89, 28);
        cpHome.add(btnNewButton);
		
		
	//Cấu hình Edit
	TableColumn editColumn = table.getColumnModel().getColumn(8);
        editColumn.setCellRenderer(new ButtonRenderer());
        editColumn.setCellEditor(new ButtonEditor(new JCheckBox(), "Edit"));
        
//        //Cấu hình Del
        TableColumn deleteColumn = table.getColumnModel().getColumn(9);
        deleteColumn.setCellRenderer(new ButtonRenderer());
        deleteColumn.setCellEditor(new ButtonEditor(new JCheckBox(), "Delete"));
        
        
	}
	
	public void updateTable() {
		int selected = cbSort.getSelectedIndex();
                displayDataInTable(selected == 0);
	}
	
	public void displayDataInTable(boolean acs) {
		
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        listMobile = new TestMobileManager().sortedMobile(!acs);
        
        while (model.getRowCount() > 0) {
        	model.removeRow(0);
         }
        
		System.out.println(listMobile.size());


		for(int i=0; i<listMobile.size(); i++) {
			Mobile mobile = listMobile.get(i);
			System.out.println(mobile.getProduct_price());

			DecimalFormat df = new DecimalFormat("#");
			df.setMaximumFractionDigits(0);
			String price = df.format(mobile.getProduct_price());
			model.addRow(new Object[] {
					i+1,
					mobile.getProduct_id(),
					mobile.getProduct_name(),
					mobile.getMobile_brand(),
					mobile.getMobile_memory(),
					mobile.getMobile_processor(),
					price,
					mobile.getProduct_total(),
					"Edit",
					"Delete"
			});
		}
	}


	private void addEditAndDeleteButtonsToTable() {
        TableColumn editColumn = table.getColumnModel().getColumn(8);
        editColumn.setCellRenderer(new ButtonRenderer());
        editColumn.setCellEditor(new ButtonEditor(new JCheckBox(), "Edit"));

        TableColumn deleteColumn = table.getColumnModel().getColumn(9);
        deleteColumn.setCellRenderer(new ButtonRenderer());
        deleteColumn.setCellEditor(new ButtonEditor(new JCheckBox(), "Delete"));
    }
	
	private class ButtonRenderer extends JButton implements TableCellRenderer {
        public ButtonRenderer() {
            setOpaque(true);
        }

        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            setText((value == null) ? "" : value.toString());
            return this;
        }
    }
	
	  private class ButtonEditor extends DefaultCellEditor {
	        protected JButton button;

	        public ButtonEditor(JCheckBox checkBox, String buttonText) {
	            super(checkBox);
	            button = new JButton(buttonText);
	            button.setOpaque(true);
	            button.addActionListener(new ActionListener() {
	                public void actionPerformed(ActionEvent e) {
	                    int row = table.convertRowIndexToModel(table.getEditingRow()); // Lấy chỉ số hàng trong mô hình dữ liệu
	                    if (buttonText.equals("Edit")) {
	                        // Lấy Mobile tương ứng từ List
	                        Mobile mobileToEdit = listMobile.get(row);

	                        // Tạo một instance của EditView và truyền thông tin của đối tượng cần chỉnh sửa
	                        EditView editView = new EditView(mobileToEdit);
	                        dispose();
	                        editView.setVisible(true);
	                    } 
	                    else if (buttonText.equals("Delete")) {
	                        // Xử lý sự kiện khi người dùng nhấn vào nút
	                        DefaultTableModel model = (DefaultTableModel) table.getModel();
	                        model.removeRow(row); // Xóa hàng từ mô hình dữ liệu

	                        // Lấy Mobile tương ứng từ List
	                        Mobile mobileToDelete = listMobile.get(row);

	                        // Xóa Mobile tương ứng từ List
	                        listMobile.remove(mobileToDelete);

	                        // Thực hiện xóa Mobile từ cơ sở dữ liệu
	                        if (new TestMobileManager().delMobile(mobileToDelete)) {
	                            JOptionPane.showMessageDialog(HomeView.this, "Delete success", "Notification", JOptionPane.INFORMATION_MESSAGE);
	                        } else {
	                            JOptionPane.showMessageDialog(HomeView.this, "Delete failed", "Notification", JOptionPane.ERROR_MESSAGE);
	                        }

	                        // Ghi dữ liệu mới vào file
	                        new TestMobileManager().writeDataToFile(listMobile, "Mobile.bin");

	                        // Cập nhật lại bảng
	                        updateTable();
	                    }
	                }
	            });
	        }

	        public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
	            return button;
	        }
	    }
}