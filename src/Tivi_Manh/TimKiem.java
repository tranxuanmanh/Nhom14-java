/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Tivi_Manh;

import Tivi_Manh.QuanLi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import csdl.DbHelper;

/**
 *
 * @author Manh
 */
public class TimKiem extends javax.swing.JFrame {
Connection conn;
private DefaultTableModel tbModel; 
    /**
     * Creates new form TimKiem
     */
    public TimKiem() throws SQLException, ClassNotFoundException {
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
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        searchName = new javax.swing.JButton();
        searchPrice = new javax.swing.JButton();
        searchSize = new javax.swing.JButton();
        searchWeight = new javax.swing.JButton();
        searchBrand = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbHienThi = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        LoadTable = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tim kiem tivi");

        searchName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        searchName.setText("Name");
        searchName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchNameActionPerformed(evt);
            }
        });

        searchPrice.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        searchPrice.setText("Price");
        searchPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchPriceActionPerformed(evt);
            }
        });

        searchSize.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        searchSize.setText("Size");
        searchSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchSizeActionPerformed(evt);
            }
        });

        searchWeight.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        searchWeight.setText("Weight");
        searchWeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchWeightActionPerformed(evt);
            }
        });

        searchBrand.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        searchBrand.setText("Brand");
        searchBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBrandActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(searchName, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(searchBrand)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(searchPrice)
                .addGap(48, 48, 48)
                .addComponent(searchSize)
                .addGap(28, 28, 28)
                .addComponent(searchWeight)
                .addGap(18, 18, 18))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {searchBrand, searchName, searchPrice, searchSize, searchWeight});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchPrice)
                    .addComponent(searchSize)
                    .addComponent(searchWeight)
                    .addComponent(searchName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBrand))
                .addGap(20, 20, 20))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {searchBrand, searchName, searchPrice, searchSize, searchWeight});

        tbHienThi.setAutoCreateRowSorter(true);
        tbHienThi.setBackground(new java.awt.Color(0, 255, 255));
        tbHienThi.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(255, 72, 246), new java.awt.Color(6, 255, 124)));
        tbHienThi.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        tbHienThi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Price", "Total", "Brand", "Size", "Weight"
            }
        ));
        tbHienThi.setToolTipText("");
        tbHienThi.setAlignmentX(0.7F);
        tbHienThi.setAlignmentY(0.6F);
        tbHienThi.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tbHienThi.setGridColor(new java.awt.Color(235, 85, 255));
        tbHienThi.setRowHeight(25);
        tbHienThi.setRowMargin(2);
        tbHienThi.setSelectionBackground(new java.awt.Color(51, 255, 0));
        jScrollPane1.setViewportView(tbHienThi);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 855, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jButton6.setText("Quay Lại");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 206, 157));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tìm kiếm TiVi");

        LoadTable.setText("Reload");
        LoadTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadTableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(LoadTable)
                        .addGap(52, 52, 52)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {LoadTable, jButton6});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LoadTable))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {LoadTable, jButton6});

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void loadTable() throws SQLException, ClassNotFoundException{
        String sql="select * from tv";
        try(
//             Connection con=DbHelper.getConnect();
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
    private void searchWeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchWeightActionPerformed
    String chuoi=JOptionPane.showInputDialog(this,"Nhap vao can nang san pham muon tim kiem","Tim kiem san pham",JOptionPane.OK_CANCEL_OPTION);       
       
    String sql = "SELECT * FROM tv WHERE weight = ?";
        try (
                //Ket noi toi database
                 PreparedStatement pr = conn.prepareStatement(sql);
                 
            ) {        

                pr.setString(1, chuoi);
                ResultSet rs=pr.executeQuery();
                
            if(!rs.isBeforeFirst()){
                JOptionPane.showMessageDialog(this, "Khong tim thay san pham ten la: "+chuoi);
                loadTable();
            }else{
            
                 loadTable(rs);
            }
                
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
      
    }//GEN-LAST:event_searchWeightActionPerformed

    private void searchPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchPriceActionPerformed
     String chuoi=JOptionPane.showInputDialog(this,"Nhap vao gia san pham muon tim kiem","Tim kiem san pham",JOptionPane.OK_CANCEL_OPTION);       
        String sql = "SELECT * FROM tv WHERE price = ?";
        try (
                //Ket noi toi database
                 PreparedStatement pr = conn.prepareStatement(sql);                
            ) {        
                pr.setString(1, chuoi );
                ResultSet rs=pr.executeQuery();
                
            if(!rs.isBeforeFirst()){
                JOptionPane.showMessageDialog(this, "Khong tim thay san pham co gia la: "+chuoi);
                loadTable();
            }else{
            
                 loadTable(rs);
            }
                
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    
    }//GEN-LAST:event_searchPriceActionPerformed

    private void searchNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchNameActionPerformed
         String chuoi=JOptionPane.showInputDialog(this,"Nhap vao ten san pham muon tim kiem","Tim kiem san pham",JOptionPane.OK_CANCEL_OPTION);       
        String sql = "SELECT * FROM tv WHERE name LIKE ?";
        try (
                //Ket noi toi database
                 PreparedStatement pr = conn.prepareStatement(sql);
                 
            ) {        

                pr.setString(1, "%" + chuoi + "%");
                ResultSet rs=pr.executeQuery();
                
            if(!rs.isBeforeFirst()){
                JOptionPane.showMessageDialog(this, "Khong tim thay san pham ten la: "+chuoi);
                loadTable();
            }else{
            
                 loadTable(rs);
            }
                
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_searchNameActionPerformed

    private void searchBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBrandActionPerformed
       String chuoi=JOptionPane.showInputDialog(this,"Nhap vao hang san pham muon tim kiem","Tim kiem san pham",JOptionPane.OK_CANCEL_OPTION);       
        String sql = "SELECT * FROM tv WHERE brand LIKE ?";
        try (
                //Ket noi toi database
                 PreparedStatement pr = conn.prepareStatement(sql);
                 
            ) {        

                pr.setString(1, "%" + chuoi + "%");
                ResultSet rs=pr.executeQuery();
                
            if(!rs.isBeforeFirst()){
                JOptionPane.showMessageDialog(this, "Khong tim thay san pham ten la: "+chuoi);
                loadTable();
            }else{
            
                 loadTable(rs);
            }
                
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_searchBrandActionPerformed

    private void searchSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchSizeActionPerformed
      String chuoi=JOptionPane.showInputDialog(this,"Nhap vao kich thuoc man hinh muon tim kiem","Tim kiem san pham",JOptionPane.OK_CANCEL_OPTION);       
        String sql = "SELECT * FROM tv WHERE size = ?";
        try (
                //Ket noi toi database
                 PreparedStatement pr = conn.prepareStatement(sql);
                 
            ) {        

                pr.setString(1, chuoi);
                ResultSet rs=pr.executeQuery();
                
            if(!rs.isBeforeFirst()){
                JOptionPane.showMessageDialog(this, "Khong tim thay san pham ten la: "+chuoi);
                loadTable();
            }else{
            
                 loadTable(rs);
            }
                
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_searchSizeActionPerformed

    private void LoadTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadTableActionPerformed
    try {
        initTable();
        loadTable();
    } catch (SQLException ex) {
        Logger.getLogger(TimKiem.class.getName()).log(Level.SEVERE, null, ex);
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(TimKiem.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_LoadTableActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       this.setVisible(false);
    try {
        new QuanLi().setVisible(true);
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(TimKiem.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(TimKiem.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jButton6ActionPerformed


    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TimKiem().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(TimKiem.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(TimKiem.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoadTable;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton searchBrand;
    private javax.swing.JButton searchName;
    private javax.swing.JButton searchPrice;
    private javax.swing.JButton searchSize;
    private javax.swing.JButton searchWeight;
    private javax.swing.JTable tbHienThi;
    // End of variables declaration//GEN-END:variables
}
