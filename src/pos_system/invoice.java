/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package pos_system;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 94760
 */
public class invoice extends javax.swing.JPanel {

    /**
     * Creates new form invoice
     */
    public invoice() {
        initComponents();
        dataLoad();
    }
    
    public void dataLoad(){
        try {
            DefaultTableModel tbl=(DefaultTableModel)tbl_inv.getModel();
            tbl.setRowCount(0);
            Statement stmt=db.myCon().createStatement();
            ResultSet rs=stmt.executeQuery("SELECT * FROM sales");
            
            while(rs.next()){
                Vector vec=new Vector();
                
                vec.add(rs.getString(1));
                vec.add(rs.getString(2));
                vec.add(rs.getString(3));
                vec.add(rs.getString(4));
                vec.add(rs.getString(5));
                vec.add(rs.getString(6));
                vec.add(rs.getString(7));
                vec.add(rs.getString(8));
                
                tbl.addRow(vec);
                
            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }
            
            
}
    public void search_para(){
        String invId=txt_invID.getText();
        String cusName=txt_cusName.getText();
        String status=cmbo_status_inv.getSelectedItem().toString();
        
        try {
            DefaultTableModel tbl=(DefaultTableModel) tbl_inv.getModel();
            tbl.setRowCount(0);
            
            Statement stmt=db.myCon().createStatement();
            ResultSet rs =stmt.executeQuery("SELECT * FROM sales WHERE inv_ID LIKE '%"+invId+"%' AND cus_Name LIKE '%"+cusName+"%' AND Status LIKE '%"+status+"%'");
            
            while(rs.next()){
                
                Vector vec=new Vector();
                
                vec.add(rs.getString(1));
                vec.add(rs.getString(2));
                vec.add(rs.getString(3));
                vec.add(rs.getString(4));
                vec.add(rs.getString(5));
                vec.add(rs.getString(6));
                vec.add(rs.getString(7));
                vec.add(rs.getString(8));
                
                tbl.addRow(vec);
            }
        } catch (Exception e) {
            System.out.println(e);
            dataLoad();
            
        }
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_invID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_cusName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cmbo_status_inv = new javax.swing.JComboBox<>();
        btn_refresh = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_inv = new javax.swing.JTable();

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("INVOICE ID :");

        txt_invID.setText("0");
        txt_invID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_invIDKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Customer Name :");

        txt_cusName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_cusNameKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Status :");

        cmbo_status_inv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Unpaid", "Partial", "Paid" }));
        cmbo_status_inv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cmbo_status_invMouseReleased(evt);
            }
        });
        cmbo_status_inv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cmbo_status_invKeyReleased(evt);
            }
        });

        btn_refresh.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_refresh.setText("Refresh");
        btn_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_invID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_cusName, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(cmbo_status_inv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(btn_refresh)
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_cusName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(cmbo_status_inv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_refresh)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txt_invID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        tbl_inv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SaleID", "InvoiceID", "CustomerID", "CustomerName", "TotalQty", "TotalBill", "Status", "Balance"
            }
        ));
        jScrollPane1.setViewportView(tbl_inv);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_invIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_invIDKeyReleased
        //laod data key press
        search_para();
    }//GEN-LAST:event_txt_invIDKeyReleased

    private void txt_cusNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cusNameKeyReleased
        //laod data key press
        search_para();
    }//GEN-LAST:event_txt_cusNameKeyReleased

    private void cmbo_status_invKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbo_status_invKeyReleased
        //laod data key press
        search_para();
    }//GEN-LAST:event_cmbo_status_invKeyReleased

    private void cmbo_status_invMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbo_status_invMouseReleased
        //laod data key press
        search_para();
    }//GEN-LAST:event_cmbo_status_invMouseReleased

    private void btn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshActionPerformed
        dataLoad();
    }//GEN-LAST:event_btn_refreshActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_refresh;
    private javax.swing.JComboBox<String> cmbo_status_inv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_inv;
    private javax.swing.JTextField txt_cusName;
    private javax.swing.JTextField txt_invID;
    // End of variables declaration//GEN-END:variables
}
