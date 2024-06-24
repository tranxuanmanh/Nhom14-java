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

public class AddView extends JFrame {

	public static List<Mobile> listAdd = new ArrayList<Mobile>();

	private static final long serialVersionUID = 1L;
	private JPanel cpAdd;
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
					AddView frame = new AddView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AddView() {
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage("C:\\Users\\user\\eclipse-workspace1\\img\\system-file-manager-icon.png"));
		setTitle("Add mobile");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 605, 522);
		cpAdd = new JPanel();
		cpAdd.setBackground(new Color(245, 255, 250));
		cpAdd.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(cpAdd);
		cpAdd.setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblInfo = new JLabel("Enter mobile phone information");
		lblInfo.setHorizontalAlignment(SwingConstants.CENTER);
		lblInfo.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblInfo.setBounds(140, 21, 310, 30);
		cpAdd.add(lblInfo);

		JLabel lblName = new JLabel("Mobile name");
		lblName.setHorizontalAlignment(SwingConstants.LEFT);
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblName.setBounds(54, 130, 118, 30);
		cpAdd.add(lblName);

		JLabel lblID = new JLabel("ID");
		lblID.setHorizontalAlignment(SwingConstants.LEFT);
		lblID.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblID.setBounds(54, 80, 118, 30);
		cpAdd.add(lblID);

		JLabel lblBrand = new JLabel("Brand");
		lblBrand.setHorizontalAlignment(SwingConstants.LEFT);
		lblBrand.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblBrand.setBounds(54, 186, 118, 30);
		cpAdd.add(lblBrand);

		JLabel lblMemory = new JLabel("Memory");
		lblMemory.setHorizontalAlignment(SwingConstants.LEFT);
		lblMemory.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMemory.setBounds(54, 240, 118, 30);
		cpAdd.add(lblMemory);

		JLabel lblProcessor = new JLabel("Processor");
		lblProcessor.setHorizontalAlignment(SwingConstants.LEFT);
		lblProcessor.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblProcessor.setBounds(54, 293, 118, 30);
		cpAdd.add(lblProcessor);

		JLabel lblPrice = new JLabel("Price");
		lblPrice.setHorizontalAlignment(SwingConstants.LEFT);
		lblPrice.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPrice.setBounds(54, 358, 118, 30);
		cpAdd.add(lblPrice);

		JLabel lblTotal = new JLabel("Total");
		lblTotal.setHorizontalAlignment(SwingConstants.LEFT);
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTotal.setBounds(342, 358, 118, 30);
		cpAdd.add(lblTotal);

		textFieldId = new JTextField();
		textFieldId.setToolTipText("Enter full information");
		lblID.setLabelFor(textFieldId);
		textFieldId.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldId.setBounds(170, 80, 96, 30);
		cpAdd.add(textFieldId);
		textFieldId.setColumns(10);

		textFieldName = new JTextField();
		textFieldName.setToolTipText("Enter full information");
		lblName.setLabelFor(textFieldName);
		textFieldName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldName.setBounds(170, 130, 351, 30);
		cpAdd.add(textFieldName);
		textFieldName.setColumns(10);

		textFieldBrand = new JTextField();
		textFieldBrand.setToolTipText("Enter full information");
		lblBrand.setLabelFor(textFieldBrand);
		textFieldBrand.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldBrand.setBounds(170, 186, 351, 30);
		cpAdd.add(textFieldBrand);
		textFieldBrand.setColumns(10);

		textFieldMemory = new JTextField();
		textFieldMemory.setToolTipText("Enter full information");
		lblMemory.setLabelFor(textFieldMemory);
		textFieldMemory.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldMemory.setBounds(170, 240, 351, 30);
		cpAdd.add(textFieldMemory);
		textFieldMemory.setColumns(10);

		textFieldProcessor = new JTextField();
		textFieldProcessor.setToolTipText("Enter full information");
		lblProcessor.setLabelFor(textFieldProcessor);
		textFieldProcessor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldProcessor.setBounds(170, 293, 351, 30);
		cpAdd.add(textFieldProcessor);
		textFieldProcessor.setColumns(10);

		textFieldPrice = new JTextField();
		textFieldPrice.setToolTipText("Enter full information");
		lblPrice.setLabelFor(textFieldPrice);
		textFieldPrice.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldPrice.setBounds(170, 358, 96, 30);
		cpAdd.add(textFieldPrice);
		textFieldPrice.setColumns(10);

		textFieldTotal = new JTextField();
		textFieldTotal.setToolTipText("Enter full information");
		lblTotal.setLabelFor(textFieldTotal);
		textFieldTotal.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldTotal.setBounds(425, 358, 96, 30);
		cpAdd.add(textFieldTotal);
		textFieldTotal.setColumns(10);

		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Lấy giá trị từ các ô nhập
				try {
					listAdd = new TestMobileManager().getFromFile();
					double price = 0;
					int id = 0, memory = 0, total = 0;
					if (new TestMobileManager().isValidInteger(textFieldId.getText())
							&& new TestMobileManager().isValidInteger(textFieldMemory.getText())
							&& new TestMobileManager().isValidInteger(textFieldTotal.getText())) {
						id = Integer.parseInt(textFieldId.getText());
						memory = Integer.parseInt(textFieldMemory.getText());
						total = Integer.parseInt(textFieldTotal.getText());
					} else {
						JOptionPane.showMessageDialog(AddView.this, "Invalid input!", "Warning",
								JOptionPane.INFORMATION_MESSAGE);
					}
					if (new TestMobileManager().isDecimalNumber(textFieldPrice.getText())) {
						price = Double.parseDouble(textFieldPrice.getText());
					} else {
						JOptionPane.showMessageDialog(AddView.this, "Invalid input for price!", "Warning",
								JOptionPane.INFORMATION_MESSAGE);
					}

					String name = textFieldName.getText();
					String brand = textFieldBrand.getText();
					String processor = textFieldProcessor.getText();
					if (id != 0 && memory != 0 && total != 0 && price != 0) {
						// Tao doi tuong
						Mobile addM = new Mobile(brand, memory, processor);
						addM.setProduct_id(id);
						addM.setProduct_name(name);
						addM.setProduct_price(price);
						addM.setProduct_total(total);

						if (new TestMobileManager().addMobile(addM)) {
							JOptionPane.showMessageDialog(AddView.this, "Success", "Noti",
									JOptionPane.INFORMATION_MESSAGE);
							dispose();
							new HomeView().setVisible(true);

						} else {
							JOptionPane.showMessageDialog(AddView.this, "Failure", "Noti",
									JOptionPane.INFORMATION_MESSAGE);
						}
					} else {
						JOptionPane.showMessageDialog(AddView.this, "Enter full information!", "Noti",
								JOptionPane.INFORMATION_MESSAGE);
					}
				} catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(AddView.this, "Invalid input data", "Noti",
							JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		btnAdd.setForeground(new Color(0, 0, 205));
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnAdd.setBounds(211, 423, 96, 30);
		cpAdd.add(btnAdd);

		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new HomeView().setVisible(true);
			}
		});
		btnCancel.setForeground(new Color(255, 0, 0));
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCancel.setBounds(425, 423, 96, 30);
		cpAdd.add(btnCancel);

		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reset();
			}
		});
		btnReset.setForeground(new Color(0, 0, 205));
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnReset.setBounds(319, 423, 96, 30);
		cpAdd.add(btnReset);
	}

	public void reset() {
		textFieldId.setText("");
		textFieldName.setText("");
		textFieldBrand.setText("");
		textFieldMemory.setText("");
		textFieldProcessor.setText("");
		textFieldPrice.setText("");
		textFieldTotal.setText("");
	}
}
