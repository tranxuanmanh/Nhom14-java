
package ALogin_Menu;
import Tivi_Manh.*;
import Mobiles_Minh.*;
import Interior_Sang.InteriorMangerView;
import Test2.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Manh
 */
public class MenuList extends javax.swing.JFrame {

    public MenuList(String name,String pass) {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnIphone = new javax.swing.JButton();
        btnTivi = new javax.swing.JButton();
        btnSang = new javax.swing.JButton();
        btnSamSung = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnThoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lí bán hàng");

        btnIphone.setBackground(new java.awt.Color(255, 115, 241));
        btnIphone.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnIphone.setText("Iphone");
        btnIphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIphoneActionPerformed(evt);
            }
        });

        btnTivi.setBackground(new java.awt.Color(245, 115, 59));
        btnTivi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTivi.setText("Tivi");
        btnTivi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTiviActionPerformed(evt);
            }
        });

        btnSang.setBackground(new java.awt.Color(255, 181, 163));
        btnSang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSang.setText("Interior");
        btnSang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSangActionPerformed(evt);
            }
        });

        btnSamSung.setBackground(new java.awt.Color(255, 248, 101));
        btnSamSung.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSamSung.setText("Samsung");
        btnSamSung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSamSungActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 124, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Chương trình quản lí bán hàng-Nhóm 14");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        btnThoat.setBackground(new java.awt.Color(20, 231, 97));
        btnThoat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnIphone, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btnSamSung)
                        .addGap(33, 33, 33)
                        .addComponent(btnTivi)
                        .addGap(36, 36, 36)
                        .addComponent(btnSang)
                        .addGap(31, 31, 31)
                        .addComponent(btnThoat))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnIphone, btnSamSung, btnSang, btnThoat, btnTivi});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIphone, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSang)
                        .addComponent(btnTivi)
                        .addComponent(btnSamSung)
                        .addComponent(btnThoat)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnIphone, btnSamSung, btnSang, btnThoat, btnTivi});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIphoneActionPerformed
        //Minh_GiaoDien
        Iphones ip=new Iphones();
        ip.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnIphoneActionPerformed

    private void btnSangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSangActionPerformed
       //Sang_GiaoDien
        InteriorMangerView vt=new InteriorMangerView();    
        vt.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnSangActionPerformed

    private void btnTiviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTiviActionPerformed
        //Manh_GiaoDien
        try {
            QuanLi ql=new QuanLi();
            ql.setVisible(true);
            this.setVisible(false);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MenuList.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MenuList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnTiviActionPerformed

    private void btnSamSungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSamSungActionPerformed
       //Van_GiaoDien
        HomeView hv=new HomeView();
        hv.setVisible(true);
        this.setVisible(false);
               
    }//GEN-LAST:event_btnSamSungActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
      
        System.exit(0);        
    }//GEN-LAST:event_btnThoatActionPerformed
  
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuList("","").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIphone;
    private javax.swing.JButton btnSamSung;
    private javax.swing.JButton btnSang;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnTivi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
