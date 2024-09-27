/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package pos_system;

/**
 *
 * @author 94760
 */
import java.awt.Color;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class sale extends javax.swing.JPanel {


    public static String barcode_c="0";
    public static String cusID="0";
    
    public sale() {
        initComponents();
        data_load();
    }
    public sale(String name) {
        initComponents();
        txt_name.setText(name);
    }
    public void data_load(){
        //load customer
        try {
            

            Statement stmt=db.myCon().createStatement();
            String sql="SELECT * FROM customer";
            ResultSet rs=stmt.executeQuery(sql);
            Vector vec=new Vector();

            
            while (rs.next()) {                
                vec.add(rs.getString("cus_ID"));
                
                DefaultComboBoxModel combo=new DefaultComboBoxModel(vec );
                cmbo_sale_cus.setModel(combo);
            }
        } catch (SQLException ex) {
            Logger.getLogger(sale.class.getName()).log(Level.SEVERE, null, ex);
        }
        //load Product
        try {
            

            Statement stmt=db.myCon().createStatement();
            String sql="SELECT * FROM product";
            ResultSet rs=stmt.executeQuery(sql);
            Vector vec=new Vector();

            
            while (rs.next()) {                
                vec.add(rs.getString("prod_Name"));
                
                DefaultComboBoxModel combo=new DefaultComboBoxModel(vec );
                cmbo_sale_prod.setModel(combo);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        //load last invoice number
        try {
            Statement stmt=db.myCon().createStatement();
            ResultSet rs=stmt.executeQuery("SELECT * FROM extra WHERE ex_ID=1");
            if (rs.next()) {
                lbl_sale_invoice.setText(rs.getString("val"));
            }
        } catch (Exception e) {
        }
        //pluss the invoice
        
        int i =Integer.valueOf(lbl_sale_invoice.getText());
        i++;
        lbl_sale_invoice.setText(String.valueOf(i));
        
    }
    public void prod_cal(){
        //product calculator
        try {
            Double qt=Double.parseDouble(txt_sale_qty.getText());
            Double price=Double.parseDouble(txt_sale_uniPrice.getText());
            
            Double tot_price=qt*price;
            txt_sale_totPrice.setText((tot_price).toString());
        } catch (Exception e) {
            System.out.println(e);
        }
            
            
    }
    public void tot_amount(){
        try {
            int row_count=tbl_sale.getRowCount();
        double tot=0;
        for (int i=0;i<row_count;i++) {
            double value= Double.parseDouble(tbl_sale.getValueAt(i, 5).toString());
            tot+=value;
            
        }
        txt_tot_amount.setText(Double.toString(tot));
        } catch (Exception e) {
            System.out.println(e);
        }
        //quntity count
        try {
            int row_count_qty=tbl_sale.getRowCount();
        double qty=0;
        for (int i=0;i<row_count_qty;i++) {
            double value= Double.parseDouble(tbl_sale.getValueAt(i, 3).toString());
            qty+=value;
            
        }
        lbl_tot_qty.setText(Double.toString(qty));
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
    
    public void due_amount(){
        // cal due or balance
        try {
            Double tot_amount=Double.parseDouble(txt_tot_amount.getText());
            Double paid_amount=Double.parseDouble(txt_paid_sale.getText());
            Double due;
                due=paid_amount-tot_amount;
                if (due<0.00) {
                txt_due_balance.setForeground(Color.red);
                txt_due_balance.setText(due.toString());
                } else {
                txt_due_balance.setForeground(Color.black);
                txt_due_balance.setText(due.toString());
        }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void reOrder(){
        try {
            Statement stmt=db.myCon().createStatement();
            String name=(String) cmbo_sale_prod.getSelectedItem();
            String sql="SELECT Qty,reOrder FROM product WHERE prod_Name='"+name+"'";
            ResultSet rs= stmt.executeQuery(sql);
            if(rs.next()){
                int qty=Integer.parseInt(rs.getString("Qty"));
                int reOreder=Integer.parseInt(rs.getString("reOrder"));
                
                if(qty<=reOreder){
                    JOptionPane.showMessageDialog(null, "Low product");
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(sale.class.getName()).log(Level.SEVERE, null, ex);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbl_sale_invoice = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbo_sale_cus = new javax.swing.JComboBox<>();
        lbl_cusName = new javax.swing.JLabel();
        lbl_prod_sale_barCode = new javax.swing.JLabel();
        txt_name = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txt_sale_qty = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_sale_uniPrice = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_sale_totPrice = new javax.swing.JLabel();
        lbl_P_Id = new javax.swing.JLabel();
        cmbo_sale_prod = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_sale = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txt_paid_sale = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        txt_tot_amount = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_due_balance = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl_tot_qty = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btn_sale_add = new javax.swing.JButton();
        btn_remove_selected = new javax.swing.JButton();
        btn_remove_all = new javax.swing.JButton();
        btn_pay_print = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("INVOICE NO :");

        lbl_sale_invoice.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_sale_invoice.setText("01");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Customer : ");

        cmbo_sale_cus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbo_sale_cus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbo_sale_cusActionPerformed(evt);
            }
        });

        lbl_cusName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_cusName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_cusName.setText("Customer");
        lbl_cusName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lbl_prod_sale_barCode.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_prod_sale_barCode.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_prod_sale_barCode.setText("Bar Code");

        txt_name.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txt_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_name.setText("Cashier");
        txt_name.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(lbl_sale_invoice, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbo_sale_cus, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_cusName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_prod_sale_barCode, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(cmbo_sale_cus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_cusName)
                        .addComponent(lbl_prod_sale_barCode)
                        .addComponent(txt_name))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(lbl_sale_invoice)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Qty :");

        txt_sale_qty.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_sale_qty.setText("0");
        txt_sale_qty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_sale_qtyKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Unit Price :");

        txt_sale_uniPrice.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_sale_uniPrice.setText("00.00");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Total Pice :");

        txt_sale_totPrice.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_sale_totPrice.setText("00.00");

        lbl_P_Id.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_P_Id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_P_Id.setText("Product ID");
        lbl_P_Id.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        cmbo_sale_prod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbo_sale_prod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbo_sale_prodActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Product :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbo_sale_prod, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_P_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_sale_qty)
                .addGap(64, 64, 64)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_sale_uniPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_sale_totPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txt_sale_uniPrice))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(5, 5, 5)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(txt_sale_totPrice))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(cmbo_sale_prod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_P_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(txt_sale_qty, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        tbl_sale.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Invoise_ID", "Name", "Bar_Code", "Qty", "Unit Price", "Total Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbl_sale);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Paid Amount :");

        txt_paid_sale.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_paid_sale.setText("0");
        txt_paid_sale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_paid_saleActionPerformed(evt);
            }
        });
        txt_paid_sale.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_paid_saleKeyReleased(evt);
            }
        });

        txt_tot_amount.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_tot_amount.setText("00.00");
        txt_tot_amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tot_amountActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Total Amount :");

        txt_due_balance.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_due_balance.setText("00.00");
        txt_due_balance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_due_balanceActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Balance / Due :");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_due_balance))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_tot_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_tot_amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txt_due_balance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Total Qty:");

        lbl_tot_qty.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_tot_qty.setText("00");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_paid_sale, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(lbl_tot_qty, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(txt_paid_sale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(lbl_tot_qty))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_sale_add.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_sale_add.setText("Add to cart");
        btn_sale_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sale_addActionPerformed(evt);
            }
        });
        jPanel6.add(btn_sale_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 19, 128, -1));

        btn_remove_selected.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_remove_selected.setText("Remove");
        btn_remove_selected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_remove_selectedActionPerformed(evt);
            }
        });
        jPanel6.add(btn_remove_selected, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 57, 128, -1));

        btn_remove_all.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_remove_all.setText("Remove All");
        btn_remove_all.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_remove_allActionPerformed(evt);
            }
        });
        jPanel6.add(btn_remove_all, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 95, -1, -1));

        btn_pay_print.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_pay_print.setText("Pay and Print Bill");
        btn_pay_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pay_printActionPerformed(evt);
            }
        });
        jPanel6.add(btn_pay_print, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 213, 45));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 6, Short.MAX_VALUE))))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btn_sale_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sale_addActionPerformed
        // Add prodauct details
        DefaultTableModel prod_tb=(DefaultTableModel) tbl_sale.getModel();
        try {
            int reqQun=Integer.parseInt(txt_sale_qty.getText());
            Statement stmt =db.myCon().createStatement();
            String name=(String) cmbo_sale_prod.getSelectedItem();
            String sql= "SELECT Qty ,reOrder FROM product WHERE prod_Name='"+name+"'";
            ResultSet rs=stmt.executeQuery(sql);
            if (rs.next()){
                int quan=Integer.parseInt(rs.getString("Qty"));
                int ReOquan=Integer.parseInt(rs.getString("reOrder"));
                if(quan>=reqQun){
                    
                    Vector vec=new Vector();
        
                    vec.add(lbl_sale_invoice.getText()); //invoice ID
                    vec.add(cmbo_sale_prod.getSelectedItem());//product name
                    vec.add(lbl_prod_sale_barCode.getText());//barCode
                    vec.add(txt_sale_qty.getText());//qty
                    vec.add(txt_sale_uniPrice.getText());//unit price
                    vec.add(txt_sale_totPrice.getText());//total price
        
                    prod_tb.addRow(vec);
                    tot_amount();
                    due_amount();
                    reOrder();
                    quan-=reqQun;
                    
                    //update dataBase
                    try {
                       Statement st=db.myCon().createStatement();
                       String Sql="UPDATE product SET Qty='"+quan+"' WHERE prod_Name='"+name+"'";
                       st.executeUpdate(Sql);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    
                }
                else{
                    JOptionPane.showMessageDialog(null, "Out Of Stock");
                }
            }
                    
        } catch (SQLException ex) {
            Logger.getLogger(sale.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }//GEN-LAST:event_btn_sale_addActionPerformed

    private void txt_paid_saleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_paid_saleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_paid_saleActionPerformed

    private void txt_tot_amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tot_amountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tot_amountActionPerformed

    private void txt_due_balanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_due_balanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_due_balanceActionPerformed

    private void cmbo_sale_prodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbo_sale_prodActionPerformed
        //load unit price
        String prod_name=cmbo_sale_prod.getSelectedItem().toString();
        try {
            Statement stmt=db.myCon().createStatement();
            String sql="SELECT price,bar_No,prod_ID FROM product WHERE prod_Name='"+prod_name+"'";
            ResultSet rs = stmt.executeQuery(sql);
            
            if (rs.next()) {
                txt_sale_uniPrice.setText(rs.getString("price"));
                lbl_prod_sale_barCode.setText(rs.getString("bar_No"));
                lbl_P_Id.setText(rs.getString("prod_ID"));
                
                
            }
            prod_cal();
        } catch (Exception e) {
            System.out.println(e);
        }
                 
    }//GEN-LAST:event_cmbo_sale_prodActionPerformed

    private void txt_sale_qtyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_sale_qtyKeyReleased
        
        prod_cal();
    }//GEN-LAST:event_txt_sale_qtyKeyReleased
    
    private void btn_remove_selectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_remove_selectedActionPerformed
        // remove selected row
        DefaultTableModel prod_tb=(DefaultTableModel)tbl_sale.getModel();
        int row=tbl_sale.getSelectedRow();
        
        prod_tb.removeRow(row);
        
        tot_amount();
        due_amount();
    }//GEN-LAST:event_btn_remove_selectedActionPerformed

    private void btn_remove_allActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_remove_allActionPerformed
        //remove all product add
        DefaultTableModel prod_tb=(DefaultTableModel)tbl_sale.getModel();
        prod_tb.setRowCount(0);
        tot_amount();
        due_amount();
    }//GEN-LAST:event_btn_remove_allActionPerformed

    private void txt_paid_saleKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_paid_saleKeyReleased
        due_amount();
        
    }//GEN-LAST:event_txt_paid_saleKeyReleased

    private void btn_pay_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pay_printActionPerformed
        // save data in database
        
        try {
            DefaultTableModel order_tbl=(DefaultTableModel) tbl_sale.getModel();
            int row_count=order_tbl.getRowCount();
            
            for (int i = 0; i < row_count; i++) {
                
                String inv_id=order_tbl.getValueAt(i, 0).toString();
                String pro_name=order_tbl.getValueAt(i, 1).toString();
                String barCode=order_tbl.getValueAt(i, 2).toString();
                String qty=order_tbl.getValueAt(i, 3).toString();
                String u_price=order_tbl.getValueAt(i, 4).toString();
                String tot=order_tbl.getValueAt(i, 5).toString();
                
                
                Statement stmt=db.myCon().createStatement();
                //`order_ID`, `inv_ID`, `prodName`, `barCode`, `Qty`, `Price`, `totPrice`
                String Ssql="INSERT INTO cart(inv_ID,prodName,barCode,Qty,Price,totPrice,cashierD) VALUES ('"+inv_id+"','"+pro_name+"','"+barCode+"','"+qty+"','"+u_price+"','"+tot+"')";
                stmt.executeUpdate(Ssql);
                
                 
            }
            
                    
            
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            
            //sales dataBase
            String inv_id=lbl_sale_invoice.getText();
            String cus_Name=lbl_cusName.getText();
            String totQty=lbl_tot_qty.getText();
            String totBill=txt_tot_amount.getText();
            String balance=txt_due_balance.getText();
            String status=null;
            
            Double billTot=Double.valueOf(txt_tot_amount.getText());
            Double paid=Double.valueOf(txt_paid_sale.getText());
            if(paid.equals(0.0)|| Objects.equals(paid, "")){
                status="Unpaid";
                
            }
            else if(billTot>paid){
                status="Partial";
                
            }else if (billTot<=paid){
                status="Paid";
                
            }
                
            Statement st=db.myCon().createStatement();
                
            //`sale_ID`, `inv_ID`, `order_ID`, `cus_Name`, `tot_Qty`, `tot_Bill`, `Status`, `Balace`
                
            String saleSql ="INSERT INTO sales(inv_ID,cus_ID,cus_Name,tot_Qty,tot_Bill,Status,Balace) VALUES ('"+inv_id+"','"+cusID+"','"+cus_Name+"','"+totQty+"','"+totBill+"','"+status+"','"+balance+"')";
            st.executeUpdate(saleSql);
                       
            JOptionPane.showMessageDialog(null, "Completed sale");
        } catch (Exception e) {
            System.out.println(e);
        }
                
        try {
            String id=lbl_sale_invoice.getText();
            Statement stmt=db.myCon().createStatement();
            stmt.executeUpdate("UPDATE extra SET val='"+id+"' WHERE ex_ID=1");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btn_pay_printActionPerformed

    private void cmbo_sale_cusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbo_sale_cusActionPerformed
        
        //load customer name
        String cus_Id=cmbo_sale_cus.getSelectedItem().toString();
        try {
            Statement stmt=db.myCon().createStatement();
            String sql="SELECT cus_ID,cus_Name FROM customer WHERE cus_ID='"+cus_Id+"'";
            ResultSet rs = stmt.executeQuery(sql);
            
            if (rs.next()) {
               
                cusID=(rs.getString("cus_ID"));
                lbl_cusName.setText(rs.getString("cus_Name"));
                
            }
            prod_cal();
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_cmbo_sale_cusActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_pay_print;
    private javax.swing.JButton btn_remove_all;
    private javax.swing.JButton btn_remove_selected;
    private javax.swing.JButton btn_sale_add;
    private javax.swing.JComboBox<String> cmbo_sale_cus;
    private javax.swing.JComboBox<String> cmbo_sale_prod;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbl_P_Id;
    private javax.swing.JLabel lbl_cusName;
    private javax.swing.JLabel lbl_prod_sale_barCode;
    private javax.swing.JLabel lbl_sale_invoice;
    private javax.swing.JLabel lbl_tot_qty;
    private javax.swing.JTable tbl_sale;
    private javax.swing.JTextField txt_due_balance;
    private javax.swing.JLabel txt_name;
    private javax.swing.JTextField txt_paid_sale;
    private javax.swing.JTextField txt_sale_qty;
    private javax.swing.JLabel txt_sale_totPrice;
    private javax.swing.JLabel txt_sale_uniPrice;
    private javax.swing.JTextField txt_tot_amount;
    // End of variables declaration//GEN-END:variables
}
