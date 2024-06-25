
package Tivi_Manh;
import ALogin_Menu.MenuList;
import csdl.DbHelper;
import java.awt.Frame;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class QuanLi extends javax.swing.JFrame {
Connection conn;
private DefaultTableModel tbModel; 

    public QuanLi() throws ClassNotFoundException, SQLException {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
        conn=DbHelper.getConnect();
        initTable();
        loadTable();
    }
    private void initTable(){
        tbModel=new DefaultTableModel();
        tbModel.setColumnIdentifiers(new String[]{"ID","Name","Price","Total","Brand","Size","Weight"});
        
        tbHienThi.setDefaultEditor(Object.class, null);
        tbHienThi.setModel(tbModel);
        
        
    }
    private void loadTable() throws SQLException, ClassNotFoundException{
        String sql="select * from tv";
        try(

                PreparedStatement pr=conn.prepareStatement(sql);
             ) {
            try(ResultSet rs=pr.executeQuery()){
                tbModel.setRowCount(0);
            
                while(rs.next()){
                    Object[] row=new Object[]{
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getDouble("price"),
                    rs.getDouble("total"),
                    rs.getString("brand"),
                    rs.getFloat("size"),
                    rs.getFloat("weight")
                };
                tbModel.addRow(row);
                
            }
                tbModel.fireTableDataChanged();          
        }catch(Exception e){
            e.printStackTrace();
        }
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtPrice = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtID = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtTotal = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtBrand = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtSize = new javax.swing.JTextPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtName = new javax.swing.JTextPane();
        jScrollPane8 = new javax.swing.JScrollPane();
        txtWeight = new javax.swing.JTextPane();
        btReset = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbHienThi = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnSapXep = new javax.swing.JButton();
        btnMobile = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TranXuanManh_QLTiVi");
        setBackground(new java.awt.Color(255, 255, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Information TV", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(255, 0, 153))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Id");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 153));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Total");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 153));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Brand");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 153));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Price");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 153));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Size");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 153));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Weight");

        jScrollPane2.setViewportView(txtPrice);

        txtID.setEditable(false);
        jScrollPane3.setViewportView(txtID);

        jScrollPane4.setViewportView(txtTotal);

        jScrollPane5.setViewportView(txtBrand);

        jScrollPane6.setViewportView(txtSize);

        jScrollPane7.setViewportView(txtName);

        jScrollPane8.setViewportView(txtWeight);

        btReset.setBackground(new java.awt.Color(255, 153, 153));
        btReset.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btReset.setForeground(new java.awt.Color(51, 51, 255));
        btReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Icon/Edit.png"))); // NOI18N
        btReset.setText("Reset");
        btReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                        .addComponent(jScrollPane2)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                        .addComponent(jScrollPane8))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btReset, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addComponent(jLabel3))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7});

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 239, 146), 2, true));

        tbHienThi.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 102), new java.awt.Color(0, 255, 102)));
        tbHienThi.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        tbHienThi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Name", "Price", "Total", "Brand", "Size", "Weight"
            }
        ));
        tbHienThi.setAlignmentX(0.8F);
        tbHienThi.setAlignmentY(0.7F);
        tbHienThi.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tbHienThi.setGridColor(new java.awt.Color(235, 37, 168));
        tbHienThi.setRowHeight(28);
        tbHienThi.setSelectionBackground(new java.awt.Color(51, 255, 102));
        tbHienThi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbHienThiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbHienThi);
        if (tbHienThi.getColumnModel().getColumnCount() > 0) {
            tbHienThi.getColumnModel().getColumn(0).setHeaderValue("Id");
            tbHienThi.getColumnModel().getColumn(1).setHeaderValue("Name");
            tbHienThi.getColumnModel().getColumn(2).setHeaderValue("Price");
            tbHienThi.getColumnModel().getColumn(3).setHeaderValue("Total");
            tbHienThi.getColumnModel().getColumn(4).setHeaderValue("Brand");
            tbHienThi.getColumnModel().getColumn(5).setHeaderValue("Size");
            tbHienThi.getColumnModel().getColumn(6).setHeaderValue("Weight");
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        jPanel3.setBackground(new java.awt.Color(0, 255, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.cyan, java.awt.Color.pink));
        jPanel3.setForeground(new java.awt.Color(0, 204, 102));

        btnThem.setBackground(new java.awt.Color(153, 211, 245));
        btnThem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThem.setForeground(new java.awt.Color(0, 13, 179));
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Icon/Add2.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setBackground(new java.awt.Color(29, 207, 252));
        btnSua.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSua.setForeground(new java.awt.Color(51, 0, 255));
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Icon/Edit.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(255, 0, 204));
        btnXoa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXoa.setForeground(new java.awt.Color(0, 0, 204));
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Icon/Delete.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(255, 204, 102));
        btnSearch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(0, 51, 204));
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Icon/Search.png"))); // NOI18N
        btnSearch.setText("Tìm kiếm");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnSapXep.setBackground(new java.awt.Color(102, 204, 0));
        btnSapXep.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSapXep.setForeground(new java.awt.Color(0, 51, 204));
        btnSapXep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Icon/sapxep.png"))); // NOI18N
        btnSapXep.setText("Sắp xếp");
        btnSapXep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSapXepActionPerformed(evt);
            }
        });

        btnMobile.setBackground(new java.awt.Color(255, 0, 0));
        btnMobile.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMobile.setText("Quay Lai");
        btnMobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMobileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnSua)
                .addGap(45, 45, 45)
                .addComponent(btnXoa)
                .addGap(46, 46, 46)
                .addComponent(btnSearch)
                .addGap(40, 40, 40)
                .addComponent(btnSapXep)
                .addGap(36, 36, 36)
                .addComponent(btnMobile)
                .addGap(25, 25, 25))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnSapXep, btnSearch, btnSua, btnThem, btnXoa});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSapXep)
                    .addComponent(btnSearch)
                    .addComponent(btnXoa)
                    .addComponent(btnSua)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnSapXep, btnSearch, btnSua, btnThem, btnXoa});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
         //Hop thoai truoc khi update
        if (JOptionPane.showConfirmDialog(this, "Ban co muon sua", "Xac nhan", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.NO_OPTION) {
            return;
        }
        String sql = "update tv set name=?,price=?,total=?,brand=?,size=?,weight=?" + " where id = ?";

        try (
                //Ket noi toi database
                 PreparedStatement pr = conn.prepareStatement(sql);//Lay id
                ) {
            pr.setInt(7, Integer.parseInt(txtID.getText()));
            pr.setString(1, txtName.getText());
            pr.setDouble(2,Double.parseDouble( txtPrice.getText()));
            pr.setDouble(3, Double.parseDouble( txtTotal.getText()));
            
            pr.setString(4,txtBrand.getText());
            pr.setFloat(5,Float.parseFloat( txtSize.getText()));
            pr.setFloat(6, Float.parseFloat(txtWeight.getText()));

       
         int rows=   pr.executeUpdate();

            //Thong bao update
            JOptionPane.showMessageDialog(this,
                    "Update moi thanh cong tivi co id = "+txtID.getText(),
                    "Title ",
                    JOptionPane.INFORMATION_MESSAGE);
            loadTable();
            reset();
        } catch (Exception e) {
            JOptionPane.showInternalMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnSapXepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSapXepActionPerformed
        String sql = "SELECT * FROM tv ORDER BY price DESC ";
        try (
                //Ket noi toi database
                 PreparedStatement pr = conn.prepareStatement(sql);//Lay id
            ) {            
           ResultSet rs=  pr.executeQuery();
           loadTable(rs);
           reset();       
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSapXepActionPerformed
private void loadTable(ResultSet rs) {
    try {
        // Create table model
        DefaultTableModel model = new DefaultTableModel(new String[]{"ID", "Name", "Price", "Total", "Brand", "Size", "Weight"}, 0);

        // Process the ResultSet
        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            double price = rs.getDouble("price");
            double total = rs.getDouble("total");
            String brand = rs.getString("brand");
            float size = rs.getFloat("size");
            float weight = rs.getFloat("weight");
           
            model.addRow(new Object[]{id, name, price, total, brand, size, weight});
        }

        // Set the table model
        tbHienThi.setModel(model);
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "An error occurred while loading data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}


    private void tbHienThiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbHienThiMouseClicked
       
         if(evt.getClickCount()==1){
        int selectRow=tbHienThi.getSelectedRow();
        if(selectRow>=0){
            txtID.setText(tbHienThi.getValueAt(selectRow, 0).toString());
            txtName.setText(tbHienThi.getValueAt(selectRow, 1).toString());
            txtPrice.setText(tbHienThi.getValueAt(selectRow, 2).toString());
            txtTotal.setText(tbHienThi.getValueAt(selectRow, 3).toString());
            
            txtBrand.setText(tbHienThi.getValueAt(selectRow, 4).toString());
            txtSize.setText(tbHienThi.getValueAt(selectRow, 5).toString());
            txtWeight.setText(tbHienThi.getValueAt(selectRow, 6).toString());

}  
        }
        
              
    }//GEN-LAST:event_tbHienThiMouseClicked
public  void reset(){
        txtID.setText("");
        txtName.setText("");
        txtPrice.setText("");
        txtTotal.setText("");       
        txtSize.setText("");
        txtBrand.setText("");
        txtWeight.setText("");
}
    private void btResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResetActionPerformed
        reset();
    }//GEN-LAST:event_btResetActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        //DELETE
       
        if (JOptionPane.showConfirmDialog(this, "Ban co muon xoa", "Xac nhan", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.NO_OPTION) {
            return;
        }
        String sql = "delete from tv" + " where id = ?";

        try (
                //Ket noi toi database
                 PreparedStatement pr = conn.prepareStatement(sql);//Lay id
            ) {
         

            pr.setInt(1, Integer.parseInt(txtID.getText())); //Lay id muon xoa

            int rows = pr.executeUpdate();

            //Thong bao update
            JOptionPane.showMessageDialog(this,
                    "Xoa thanh cong tivi co id = "+txtID.getText(),
               "Title ",
           JOptionPane.INFORMATION_MESSAGE);
            loadTable();
            reset();

        } catch (Exception e) {
            JOptionPane.showInternalMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
             
              
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
         //SAVE
        String sql = "insert into tv(name,price,total,brand,size,weight)" + "values(?,?,?,?,?,?)";
        try (
                PreparedStatement pr = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)){//Lay id) {

            pr.setString(1, txtName.getText());
            pr.setDouble(2,Double.parseDouble( txtPrice.getText()));
            pr.setDouble(3,Double.parseDouble( txtTotal.getText()));
            pr.setString(4, txtBrand.getText());
            pr.setFloat(5,Float.parseFloat(txtSize.getText()));
            pr.setFloat(6,Float.parseFloat(txtWeight.getText()));
 //tv    
        if (!checkValidate()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đủ thông tin");
            return;
        }
            int rows = pr.executeUpdate();
            System.out.println("So dong vua them "+rows);
            //Thong bao them moi
         
            JOptionPane.showMessageDialog(this,
                    "Them moi thanh cong",
                    "Title ",
                    JOptionPane.INFORMATION_MESSAGE);

            ResultSet rs = pr.getGeneratedKeys();//Lay key
            if (rs.next()) {
                int id = rs.getInt(1);
                txtID.setText("" + id);
            }
           loadTable();
            
        } catch (Exception e) {
            e.printStackTrace();
           // JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        
    try {
        //     String chuoi=JOptionPane.showInputDialog(this,"Nhap vao ten san pham muon tim kiem","Tim kiem san pham",JOptionPane.OK_CANCEL_OPTION);
//
//        
//
//        String sql = "SELECT * FROM tv WHERE name LIKE ?";
//        try (
//                //Ket noi toi database
//                 PreparedStatement pr = conn.prepareStatement(sql);
//
//            ) {        
////               pr.setString(1, txtName.getText());
////               pr.setDouble(2,Double.parseDouble( txtPrice.getText()));
////               pr.setString(3, txtBrand.getText());
//                pr.setString(1, "%" + chuoi + "%");
//                ResultSet rs=pr.executeQuery();
//                
//            if(!rs.isBeforeFirst()){
//                JOptionPane.showMessageDialog(this, "Khong tim thay san pham ten la: "+chuoi);
//                loadTable();
//            }else{
//            
//                 loadTable(rs);
//            }
//                
//        }
//        catch(Exception e){
//            e.printStackTrace();
//        }

      new TimKiem().setVisible(true);
    } catch (SQLException ex) {
        Logger.getLogger(QuanLi.class.getName()).log(Level.SEVERE, null, ex);
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(QuanLi.class.getName()).log(Level.SEVERE, null, ex);
    }
        this.setVisible(false);
        
        
        
        
        
      
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnMobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMobileActionPerformed
        new MenuList("","").setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnMobileActionPerformed
   public boolean checkValidate(){
        return !(
                  txtName.getText().isEmpty()
                ||txtPrice.getText().isEmpty()
                ||txtTotal.getText().isEmpty()
                ||txtBrand.getText().isEmpty()
                ||txtWeight.getText().isEmpty()
                ||txtSize.getText().isEmpty());      
    }
   
   
   
  
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new QuanLi().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(QuanLi.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(QuanLi.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btReset;
    private javax.swing.JButton btnMobile;
    private javax.swing.JButton btnSapXep;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTable tbHienThi;
    private javax.swing.JTextPane txtBrand;
    private javax.swing.JTextPane txtID;
    private javax.swing.JTextPane txtName;
    private javax.swing.JTextPane txtPrice;
    private javax.swing.JTextPane txtSize;
    private javax.swing.JTextPane txtTotal;
    private javax.swing.JTextPane txtWeight;
    // End of variables declaration//GEN-END:variables
}
