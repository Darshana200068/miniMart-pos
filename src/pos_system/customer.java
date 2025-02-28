/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package pos_system;
//import com.mysql.cj.protocol.Resultset;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 94760
 */
public class customer extends javax.swing.JPanel {

    /**
     * Creates new form customer
     */
    public customer() {
        initComponents();
        tb_load();
    }
    public void tb_load(){
        try {
            DefaultTableModel tb=(DefaultTableModel)tbl_load.getModel();
            tb.setRowCount(0);
            
            //create statement
            Statement stmt=db.myCon().createStatement();
            String sql="SELECT * FROM customer";
            ResultSet rs=stmt.executeQuery(sql);
            
            while (rs.next()) {                
                
                Vector vec=new Vector();
                vec.add(rs.getString(1));
                vec.add(rs.getString(2));
                vec.add(rs.getString(3));
                vec.add(rs.getString(4));
                vec.add(rs.getString(6));

                tb.addRow(vec);
            }
        } catch (Exception e) {
            System.out.println(e);
            
        }
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txt_cus_id = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_cus_name = new javax.swing.JTextField();
        txt_cus_tpNo = new javax.swing.JTextField();
        txt_cus_nic = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_cus_Hno = new javax.swing.JTextField();
        txt_cus_fLane = new javax.swing.JTextField();
        txt_cus_sLane = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btn_cus_search = new javax.swing.JButton();
        btn_cus_update = new javax.swing.JButton();
        btn_cus_save = new javax.swing.JButton();
        btn_cus_dele = new javax.swing.JButton();
        btn_prod_clear = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_load = new javax.swing.JTable();

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel8.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel8.setText("Search ID :");

        jLabel9.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Customer Infomation:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel9))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_cus_id, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_cus_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel1.setText("Name :");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 48, -1, -1));

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel2.setText("Contact No :");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 88, -1, -1));
        jPanel3.add(txt_cus_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 46, 252, -1));
        jPanel3.add(txt_cus_tpNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 88, 252, -1));
        jPanel3.add(txt_cus_nic, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 128, 252, -1));

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel3.setText("NIC No :");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 128, -1, -1));

        jLabel4.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel4.setText("Address :");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 170, -1, -1));
        jPanel3.add(txt_cus_Hno, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 168, 193, -1));
        jPanel3.add(txt_cus_fLane, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 210, 193, -1));
        jPanel3.add(txt_cus_sLane, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 250, 193, -1));

        jLabel5.setText("House No");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 171, -1, -1));

        jLabel6.setText("2nd Lane");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 253, -1, -1));

        jLabel7.setText("1st Lane");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 213, -1, -1));

        btn_cus_search.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_cus_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos_system/images/icons8-search-40.png"))); // NOI18N
        btn_cus_search.setText("Search");
        btn_cus_search.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_cus_search.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_cus_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cus_searchActionPerformed(evt);
            }
        });
        jPanel3.add(btn_cus_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 323, -1, -1));

        btn_cus_update.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_cus_update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos_system/images/icons8-update-40.png"))); // NOI18N
        btn_cus_update.setText("Update");
        btn_cus_update.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_cus_update.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_cus_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cus_updateActionPerformed(evt);
            }
        });
        jPanel3.add(btn_cus_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 323, -1, -1));

        btn_cus_save.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_cus_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos_system/images/icons8-save-40.png"))); // NOI18N
        btn_cus_save.setText("Save");
        btn_cus_save.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_cus_save.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_cus_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cus_saveActionPerformed(evt);
            }
        });
        jPanel3.add(btn_cus_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 323, -1, -1));

        btn_cus_dele.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_cus_dele.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos_system/images/icons8-delete-40.png"))); // NOI18N
        btn_cus_dele.setText("Delete");
        btn_cus_dele.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_cus_dele.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_cus_dele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cus_deleActionPerformed(evt);
            }
        });
        jPanel3.add(btn_cus_dele, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 323, -1, -1));

        btn_prod_clear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_prod_clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos_system/images/icons8-clear-40.png"))); // NOI18N
        btn_prod_clear.setText("Clear");
        btn_prod_clear.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_prod_clear.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_prod_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_prod_clearActionPerformed(evt);
            }
        });
        jPanel3.add(btn_prod_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 51, -1, -1));

        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        tbl_load.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cus ID", "Customer_Name", "Contact No", "NIC No", "Address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbl_load.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_loadMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_load);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cus_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cus_saveActionPerformed
        // Save data in DataBase
        //store data in variables
        String cus_name=txt_cus_name.getText();
        String tp_No=txt_cus_tpNo.getText();
        String cus_nic=txt_cus_nic.getText();
        String cus_Hno=txt_cus_Hno.getText();
        String f_Lane=txt_cus_fLane.getText();
        String s_Lane=txt_cus_sLane.getText();
        
        //create statement
        int result;
        try {
            
            Statement stmt= db.myCon().createStatement();
            String sql="INSERT INTO customer(cus_Name,tp_No,nic_No,h_No,f_lane,l_lane) VALUES ('"+cus_name+"','"+tp_No+"','"+cus_nic+"','"+cus_Hno+"','"+f_Lane+"','"+s_Lane+"')";
            result = stmt.executeUpdate(sql);
            if (result==1) {
                JOptionPane.showMessageDialog(null, "Successfull");
            } else {
                JOptionPane.showMessageDialog(null, "Not Success");
            }
                
            
        } catch (Exception e) {
            System.out.println(e);        }
        tb_load();
    }//GEN-LAST:event_btn_cus_saveActionPerformed

    private void btn_cus_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cus_searchActionPerformed
        try {
            // Search customer in database
            String cus_ID=txt_cus_id.getText();     //get Id or Nic

            Statement stmt =db.myCon().createStatement();
            String sql="SELECT * FROM customer WHERE (cus_ID = '"+cus_ID+"') OR (nic_No='"+cus_ID+"') ";
            ResultSet rs=stmt.executeQuery(sql);
            if (rs.next ()) {
                txt_cus_name.setText(rs.getString("cus_Name"));
                txt_cus_tpNo.setText(rs.getString("tp_No"));
                txt_cus_nic.setText(rs.getString("nic_No"));
                txt_cus_Hno.setText(rs.getString("h_No"));
                txt_cus_fLane.setText(rs.getString("f_lane"));
                txt_cus_sLane.setText(rs.getString("l_lane"));
            }
        } catch (SQLException ex) {
            System.out.println(ex);        }
        tb_load();
        
    }//GEN-LAST:event_btn_cus_searchActionPerformed

    private void btn_cus_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cus_updateActionPerformed
        // update customer data in database
        String cus_ID=txt_cus_id.getText();
        
        String cus_name=txt_cus_name.getText();
        String tp_No=txt_cus_tpNo.getText();
        String cus_nic=txt_cus_nic.getText();
        String cus_Hno=txt_cus_Hno.getText();
        String f_Lane=txt_cus_fLane.getText();
        String s_Lane=txt_cus_sLane.getText();
        
        try {
            Statement stmt= db.myCon().createStatement();
            String sql="UPDATE customer SET cus_Name='"+cus_name+"' , tp_No='"+tp_No+"' , nic_No='"+cus_nic+"' , h_No='"+cus_Hno+"' , f_lane='"+f_Lane+"' , l_lane='"+s_Lane+"'WHERE (cus_ID = '"+cus_ID+"') OR (nic_No='"+cus_ID+"')";
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Data Updated");
        } catch (Exception e) {
            System.out.println(e);
        }
        tb_load();
    }//GEN-LAST:event_btn_cus_updateActionPerformed

    private void btn_cus_deleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cus_deleActionPerformed
        // delete recode in database
        String cus_ID=txt_cus_id.getText();
        
        try {
            Statement stmt=db.myCon().createStatement();
            String sql="DELETE FROM customer WHERE (cus_ID = '"+cus_ID+"') OR (nic_No='"+cus_ID+"')";
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Delete Success");
        } catch (Exception e) {
            System.out.println(e);
        }
        txt_cus_id.setText("");
        
        txt_cus_name.setText("");
        txt_cus_tpNo.setText("");
        txt_cus_nic.setText("");
        txt_cus_Hno.setText("");
        txt_cus_fLane.setText("");
        txt_cus_sLane.setText("");
        tb_load();
    }//GEN-LAST:event_btn_cus_deleActionPerformed

    private void tbl_loadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_loadMouseClicked
         // get Data into textfield
        int row=tbl_load.getSelectedRow();
        
        String id=tbl_load.getValueAt(row, 0).toString();
        String name=tbl_load.getValueAt(row, 1).toString();
        String contact=tbl_load.getValueAt(row, 2).toString();
        String nic=tbl_load.getValueAt(row, 3).toString();
        String address=tbl_load.getValueAt(row, 4).toString();
        
        
        txt_cus_id.setText(id);
        txt_cus_name.setText(name);
        txt_cus_tpNo.setText(contact);
        txt_cus_nic.setText(nic);
        txt_cus_fLane.setText(address);

    }//GEN-LAST:event_tbl_loadMouseClicked

    private void btn_prod_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_prod_clearActionPerformed
        // claear type data
        txt_cus_id.setText("");
        txt_cus_name.setText("");
        txt_cus_tpNo.setText("");
        txt_cus_nic.setText("");
        txt_cus_Hno.setText("");
        txt_cus_fLane.setText("");
        txt_cus_sLane.setText("");
        
    }//GEN-LAST:event_btn_prod_clearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cus_dele;
    private javax.swing.JButton btn_cus_save;
    private javax.swing.JButton btn_cus_search;
    private javax.swing.JButton btn_cus_update;
    private javax.swing.JButton btn_prod_clear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_load;
    private javax.swing.JTextField txt_cus_Hno;
    private javax.swing.JTextField txt_cus_fLane;
    private javax.swing.JTextField txt_cus_id;
    private javax.swing.JTextField txt_cus_name;
    private javax.swing.JTextField txt_cus_nic;
    private javax.swing.JTextField txt_cus_sLane;
    private javax.swing.JTextField txt_cus_tpNo;
    // End of variables declaration//GEN-END:variables
}
