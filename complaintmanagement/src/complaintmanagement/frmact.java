/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complaintmanagement;

import java.awt.List;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Date;

import java.sql.SQLException;
import java.util.ArrayList;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author MY PC
 */
public class frmact extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmact
     */
    public frmact() {
        initComponents();
        setClosable(true);
        setTitle("Manage Accounts");
        setLocation(400,50);
        btnupd.setEnabled(false);
        btndel.setEnabled(false);
        loaddata();
        
        
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtaccnam = new javax.swing.JTextField();
        cmbacctyp = new javax.swing.JComboBox<>();
        cmbloc = new javax.swing.JComboBox<>();
        txtphno = new javax.swing.JTextField();
        txtadd = new javax.swing.JTextField();
        btnsave = new javax.swing.JButton();
        btnupd = new javax.swing.JButton();
        btndel = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setTitle("Account Management");

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Account Name");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Account Type");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Account Location");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Phone Number");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Address");

        txtaccnam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaccnamActionPerformed(evt);
            }
        });

        cmbacctyp.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        cmbacctyp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Broadband", "Dth", "Phone", "Airtel Money" }));
        cmbacctyp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbacctypActionPerformed(evt);
            }
        });

        cmbloc.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        cmbloc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chandigarh", "Delhi", "Ludhiana", "Patiala", "Panchkula", "Bathinda", " " }));

        btnsave.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnsave.setForeground(new java.awt.Color(51, 51, 255));
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        btnupd.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnupd.setForeground(new java.awt.Color(0, 204, 153));
        btnupd.setText("Update");
        btnupd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdActionPerformed(evt);
            }
        });

        btndel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btndel.setForeground(new java.awt.Color(255, 51, 51));
        btndel.setText("Delete");
        btndel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndelActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 51, 255));
        jButton4.setText("Cancel");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(btnupd)
                        .addGap(15, 15, 15)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cmbacctyp, 0, 361, Short.MAX_VALUE)
                        .addComponent(cmbloc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtaccnam)
                        .addComponent(txtphno))
                    .addComponent(txtadd, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(btndel, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtaccnam, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbacctyp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbloc, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnupd, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btndel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtphno, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                        .addGap(39, 39, 39)
                        .addComponent(txtadd, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)))
                .addGap(38, 38, 38))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Account Number ", "Account Name", "Account Type", "Account Location", "Phone Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtaccnamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaccnamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtaccnamActionPerformed

    private void cmbacctypActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbacctypActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbacctypActionPerformed
public void clear()
{
    txtaccnam.setText(" ");
    txtadd.setText(" ");
    txtphno.setText(" ");
}

public void loaddata() 
{
          DefaultTableModel mod=(DefaultTableModel)jTable1.getModel();
            mod.setRowCount(0);
            clsacc obj=new clsacc();
        try {
            ArrayList<clsaccprp> k=obj.display_acc();
            for(clsaccprp p:k)
            {
                Object[] rowdata=new Object[5];
                rowdata[0]=p.getAccno();
                rowdata[1]=p.getAccnam();
                rowdata[2]=p.getAcctyp();
                rowdata[3]=p.getAccloc();
                rowdata[4]=p.getAccphnno();
                mod.addRow(rowdata);
            }
        } catch (IOException ex) {
            Logger.getLogger(frmact.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(frmact.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(frmact.class.getName()).log(Level.SEVERE, null, ex);
        }          
       jTable1.setModel(mod);
}
    
    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        if(txtaccnam.getText().equals(" ")||txtphno.getText().equals(" ")||txtadd.getText().equals(" "))
            JOptionPane.showMessageDialog(this, "Please fill account name,phone number and location");
        else
        {
            clsaccprp objprp=new clsaccprp();
            clsacc obj =new clsacc();
            objprp.setAccnam(txtaccnam.getText());
            objprp.setAccadd(txtadd.getText());
            objprp.setAccloc(cmbloc.getSelectedItem().toString());
            objprp.setAcctyp(cmbacctyp.getSelectedItem().toString());
            objprp.setAccphnno(txtphno.getText());
            objprp.setAccrtdat( new Date(WIDTH));
               
            
            try {
                obj.insert_acc(objprp);
            } catch (IOException ex) {
                Logger.getLogger(frmact.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(frmact.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(frmact.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        clear();
        loaddata();
    }//GEN-LAST:event_btnsaveActionPerformed
int acod;
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int idx=jTable1.getSelectedRow();
        if(idx!=-1)
            acod=(int)jTable1.getValueAt(idx,0);
        txtaccnam.setText(jTable1.getValueAt(idx,1).toString());
        txtphno.setText( jTable1.getValueAt(idx, 4).toString());
        cmbacctyp.setSelectedItem(jTable1.getValueAt(idx, 2).toString());
        cmbloc.setSelectedItem(jTable1.getValueAt(idx,3).toString());
        clsacc obj=new clsacc();
        try {
            clsaccprp p=obj.find_acc(acod);
            txtadd.setText(p.getAccadd());
            btnupd.setEnabled(true);
            btndel.setEnabled(true);
        } catch (IOException ex) {
            Logger.getLogger(frmact.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(frmact.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(frmact.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnupdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdActionPerformed
        if(txtaccnam.getText().equals(" ")||txtphno.getText().equals(" ")||txtadd.getText().equals(" "))
            JOptionPane.showMessageDialog(this, "Please fill account name,phone number and location");
        else
        {
            clsaccprp objprp=new clsaccprp();
            clsacc obj =new clsacc();
            objprp.setAccnam(txtaccnam.getText());
            objprp.setAccadd(txtadd.getText());
            objprp.setAccloc(cmbloc.getSelectedItem().toString());
            objprp.setAcctyp(cmbacctyp.getSelectedItem().toString());
            objprp.setAccphnno(txtphno.getText());
            objprp.setAccrtdat( new Date(WIDTH));
            objprp.setAccno(acod);
            try {
                obj.update_acc(objprp);
            } catch (IOException ex) {
                Logger.getLogger(frmact.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(frmact.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(frmact.class.getName()).log(Level.SEVERE, null, ex);
            }
            btnupd.setEnabled(false);
            btndel.setEnabled(false);
            clear();
            loaddata();
        }
        
        
    }//GEN-LAST:event_btnupdActionPerformed

    private void btndelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndelActionPerformed
        clsacc obj=new clsacc();
        clsaccprp objprp=new clsaccprp();
        objprp.setAccno(acod);
        try {
            obj.delete_acc(objprp);
            clear();
            loaddata();
            btnupd.setEnabled(false);
            btndel.setEnabled(false);
        } catch (IOException ex) {
            Logger.getLogger(frmact.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(frmact.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(frmact.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btndelActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        clear();
        btnupd.setEnabled(false);
        btndel.setEnabled(false);
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndel;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnupd;
    private javax.swing.JComboBox<String> cmbacctyp;
    private javax.swing.JComboBox<String> cmbloc;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtaccnam;
    private javax.swing.JTextField txtadd;
    private javax.swing.JTextField txtphno;
    // End of variables declaration//GEN-END:variables

    private void setLocationRelativeTo(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}