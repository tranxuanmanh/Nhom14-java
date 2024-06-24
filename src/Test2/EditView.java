package Test2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Test12.Mobile;

import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class EditView extends JFrame {
	
	public static List<Mobile> listAdd = new ArrayList<Mobile>();
	private static Mobile mobile;
	private TestMobileManager manager;
	

	private static final long serialVersionUID = 1L;
	private JPanel cpEdit;
	private JTextField textFieldId;
	private JTextField textFieldName;
	private JTextField textFieldBrand;
	private JTextField textFieldMemory;
	private JTextField textFieldProcessor;
	private JTextField textFieldPrice;
	private JTextField textFieldTotal;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditView frame = new EditView(mobile);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame
	 */
	public EditView(Mobile mobile) {
		this.mobile = mobile;
		this.manager = new TestMobileManager();
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\user\\eclipse-workspace1\\img\\system-file-manager-icon.png"));
		setTitle("Edit mobile");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 605, 522);
		cpEdit = new JPanel();
		cpEdit.setBackground(new Color(245, 255, 250));
		cpEdit.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(cpEdit);
		cpEdit.setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblInfo = new JLabel("Enter the information to be edited");
		lblInfo.setHorizontalAlignment(SwingConstants.CENTER);
		lblInfo.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblInfo.setBounds(140, 21, 310, 30);
		cpEdit.add(lblInfo);
		
		JLabel lblName = new JLabel("Mobile name");
		lblName.setHorizontalAlignment(SwingConstants.LEFT);
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblName.setBounds(54, 130, 118, 30);
		cpEdit.add(lblName);
		
		JLabel lblID = new JLabel("ID");
		lblID.setHorizontalAlignment(SwingConstants.LEFT);
		lblID.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblID.setBounds(54, 80, 118, 30);
		cpEdit.add(lblID);
		
		JLabel lblBrand = new JLabel("Brand");
		lblBrand.setHorizontalAlignment(SwingConstants.LEFT);
		lblBrand.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblBrand.setBounds(54, 186, 118, 30);
		cpEdit.add(lblBrand);
		
		JLabel lblMemory = new JLabel("Memory");
		lblMemory.setHorizontalAlignment(SwingConstants.LEFT);
		lblMemory.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMemory.setBounds(54, 240, 118, 30);
		cpEdit.add(lblMemory);
		
		JLabel lblProcessor = new JLabel("Processor");
		lblProcessor.setHorizontalAlignment(SwingConstants.LEFT);
		lblProcessor.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblProcessor.setBounds(54, 293, 118, 30);
		cpEdit.add(lblProcessor);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setHorizontalAlignment(SwingConstants.LEFT);
		lblPrice.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPrice.setBounds(54, 358, 118, 30);
		cpEdit.add(lblPrice);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setHorizontalAlignment(SwingConstants.LEFT);
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTotal.setBounds(342, 358, 118, 30);
		cpEdit.add(lblTotal);
		
		textFieldId = new JTextField();
		textFieldId.setToolTipText("Enter full information");
		lblID.setLabelFor(textFieldId);
		textFieldId.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldId.setBounds(170, 80, 96, 30);
		textFieldId.setEditable(false);
		cpEdit.add(textFieldId);
		textFieldId.setColumns(10);
		
		textFieldName = new JTextField();
		textFieldName.setToolTipText("Enter full information");
		lblName.setLabelFor(textFieldName);
		textFieldName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldName.setBounds(170, 130, 351, 30);
		cpEdit.add(textFieldName);
		textFieldName.setColumns(10);
		
		textFieldBrand = new JTextField();
		textFieldBrand.setToolTipText("Enter full information");
		lblBrand.setLabelFor(textFieldBrand);
		textFieldBrand.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldBrand.setBounds(170, 186, 351, 30);
		cpEdit.add(textFieldBrand);
		textFieldBrand.setColumns(10);
		
		textFieldMemory = new JTextField();
		textFieldMemory.setToolTipText("Enter full information");
		lblMemory.setLabelFor(textFieldMemory);
		textFieldMemory.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldMemory.setBounds(170, 240, 351, 30);
		cpEdit.add(textFieldMemory);
		textFieldMemory.setColumns(10);
		
		textFieldProcessor = new JTextField();
		textFieldProcessor.setToolTipText("Enter full information");
		lblProcessor.setLabelFor(textFieldProcessor);
		textFieldProcessor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldProcessor.setBounds(170, 293, 351, 30);
		cpEdit.add(textFieldProcessor);
		textFieldProcessor.setColumns(10);
		
		textFieldPrice = new JTextField();
		textFieldPrice.setToolTipText("Enter full information");
		lblPrice.setLabelFor(textFieldPrice);
		textFieldPrice.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldPrice.setBounds(170, 358, 96, 30);
		cpEdit.add(textFieldPrice);
		textFieldPrice.setColumns(10);
		
		textFieldTotal = new JTextField();
		textFieldTotal.setToolTipText("Enter full information");
		lblTotal.setLabelFor(textFieldTotal);
		textFieldTotal.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldTotal.setBounds(425, 358, 96, 30);
		cpEdit.add(textFieldTotal);
		textFieldTotal.setColumns(10);
		
//		Hiển thị thông tin từ đối tượng Mobile đã chọn
        textFieldId.setText(String.valueOf(mobile.getProduct_id()));
        textFieldName.setText(mobile.getProduct_name());
        textFieldBrand.setText(mobile.getMobile_brand());
        textFieldMemory.setText(String.valueOf(mobile.getMobile_memory()));
        textFieldProcessor.setText(mobile.getMobile_processor());
        textFieldPrice.setText(String.valueOf(mobile.getProduct_price()));
        textFieldTotal.setText(String.valueOf(mobile.getProduct_total()));
		
        JButton btnSave = new JButton("Update");
		 btnSave.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                try {
	                    double price = Double.parseDouble(textFieldPrice.getText());
	                    int memory = Integer.parseInt(textFieldMemory.getText());
	                    int total = Integer.parseInt(textFieldTotal.getText());
	                    String name = textFieldName.getText();
	                    String brand = textFieldBrand.getText();
	                    String processor = textFieldProcessor.getText();

	                    // Cập nhật thông tin của mobile
	                    mobile.setProduct_name(name);
	                    mobile.setProduct_price(price);
	                    mobile.setProduct_total(total);
	                    mobile.setMobile_brand(brand);
	                    mobile.setMobile_memory(memory);
	                    mobile.setMobile_processor(processor);

	                    // Gọi phương thức editMobile từ manager để lưu thay đổi vào file
	                    if (manager.editMobile(mobile)) {
	                        JOptionPane.showMessageDialog(EditView.this, "Update successful!", "Notification", JOptionPane.INFORMATION_MESSAGE);
	                        dispose();
	                        new HomeView().setVisible(true);
	                    } else {
	                        JOptionPane.showMessageDialog(EditView.this, "Update failed!", "Error", JOptionPane.ERROR_MESSAGE);
	                    }
	                } catch (NumberFormatException ex) {
	                    JOptionPane.showMessageDialog(EditView.this, "Invalid input data", "Error", JOptionPane.ERROR_MESSAGE);
	                }
	            }
	        });
		 btnSave.setForeground(new Color(0, 0, 205));
	        btnSave.setFont(new Font("Tahoma", Font.BOLD, 16));
	        btnSave.setBounds(212, 424, 96, 30);
	        cpEdit.add(btnSave);
		
		JButton btnNewButton = new JButton("Cancel");
		btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                new HomeView().setVisible(true);
            }
        });
		btnNewButton.setForeground(new Color(255, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(425, 424, 96, 30);
		cpEdit.add(btnNewButton);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reset();
			}
		});
		btnReset.setForeground(new Color(0, 0, 205));
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnReset.setBounds(318, 424, 96, 30);
		cpEdit.add(btnReset);
	}
	
	public void reset() {
		textFieldName.setText("");
		textFieldBrand.setText("");
		textFieldMemory.setText("");
		textFieldProcessor.setText("");
		textFieldPrice.setText("");
		textFieldTotal.setText("");
	}
}
