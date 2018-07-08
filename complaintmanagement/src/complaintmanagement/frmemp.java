
package complaintmanagement;

import java.awt.Component;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;


public class frmemp extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmemp
     */
    public frmemp() {
        initComponents();
        setLocation(400, 50);
        loaddata();
        btndelete.setEnabled(false);
        btnupdate.setEnabled(false);
        DefaultTableColumnModel mod=(DefaultTableColumnModel)jTable1.getColumnModel();
        TableColumn col=mod.getColumn(4);
        col.setCellRenderer(new TableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                 JLabel lbl=new JLabel();
                 lbl.setIcon((ImageIcon)value);
                 return lbl;
            }
        });
       jTable1.setRowHeight(100);
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
        txtempnam = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtempphn = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cmbemploc = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtemppic = new javax.swing.JTextField();
        btnpic = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setTitle("Manage Employees");

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setText("Employee Name");

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel2.setText("Phone Number");

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel3.setText("Select Location");

        cmbemploc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cmbemploc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chandigarh", "Delhi", "Ludhiana", "Patiala", "Panchkula", "Bathinda" }));

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel4.setText("Browse Picture");

        txtemppic.setEnabled(false);
        txtemppic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemppicActionPerformed(evt);
            }
        });

        btnpic.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        btnpic.setForeground(new java.awt.Color(0, 0, 204));
        btnpic.setText(".......");
        btnpic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpicActionPerformed(evt);
            }
        });

        btnsave.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnsave.setForeground(new java.awt.Color(51, 51, 255));
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        btnupdate.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnupdate.setForeground(new java.awt.Color(0, 204, 0));
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        btndelete.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btndelete.setForeground(new java.awt.Color(255, 0, 0));
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        btncancel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btncancel.setForeground(new java.awt.Color(0, 153, 153));
        btncancel.setText("Cancel");
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(btnupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtempnam)
                            .addComponent(cmbemploc, 0, 247, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btncancel, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtempphn)
                            .addComponent(txtemppic, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnpic)))
                .addGap(12, 12, 12))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtempnam, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtempphn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbemploc, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtemppic, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(btnpic, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btncancel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnupdate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btndelete, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee no", "Employee name", "Employee phn", "Location", "Picture"
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtemppicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemppicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemppicActionPerformed

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        txtempnam.setText(" ");
        txtempphn.setText(" ");
        txtemppic.setText(" ");
        
    }//GEN-LAST:event_btncancelActionPerformed

    private void btnpicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpicActionPerformed
        JFileChooser jf=new JFileChooser();
        jf.setFileSelectionMode(JFileChooser.FILES_ONLY);
       int a=jf.showOpenDialog(this);
       if(a==JFileChooser.APPROVE_OPTION)
           txtemppic.setText(jf.getSelectedFile().getAbsolutePath());
    }//GEN-LAST:event_btnpicActionPerformed
public void saveimage()
{
    Path source=Paths.get(txtemppic.getText());
    Path targetDir=Paths.get("F:\\JavaTraining\\complaintmanagement\\src\\emppic");
        try {
            Files.createDirectories(targetDir);
            String sp=txtemppic.getText();
            sp=sp.substring(sp.lastIndexOf("\\")+1);
            Path Target=targetDir.resolve(sp);
            Files.copy(source,Target,StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException ex) {
            Logger.getLogger(frmemp.class.getName()).log(Level.SEVERE, null, ex);
        }
}
 
     public void loaddata()
     {
         DefaultTableModel mod=(DefaultTableModel)jTable1.getModel();
         
         clsemps obj=new clsemps();
        try {
            ArrayList<clsempsprp>k=obj.display_emps();
            mod.setRowCount(0);
            for(clsempsprp p:k)
            {
                Object[] rowdata=new Object[5];
                rowdata[0]=p.getEmpcod();
                rowdata[1]=p.getEmpname();
                rowdata[2]=p.getEmpphnno();
                rowdata[3]=p.getEmploc();
                ImageIcon img=new ImageIcon(getClass().getResource("/emppic/"+p.getEmppic()));
                rowdata[4]=img;
                mod.addRow(rowdata);
            }
            jTable1.setModel(mod);
        } catch (IOException ex) {
            Logger.getLogger(frmemp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(frmemp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
           Logger.getLogger(frmemp.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         
     }
    
    public void clear()
{
    txtempnam.setText(" ");
    txtempphn.setText(" ");
    txtemppic.setText(" ");
}
    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        
        if(txtempnam.getText()==""||txtempphn.getText()=="")
        {
            JOptionPane.showMessageDialog(this, "Please Enter Employee name and Phone Number");
        }
        else
        {
            clsemps obj=new clsemps();
            clsempsprp objprp =new clsempsprp();
            objprp.setEmpname(txtempnam.getText());
            objprp.setEmpphnno(txtempphn.getText());
            objprp.setEmploc(cmbemploc.getSelectedItem().toString());
            String s=txtemppic.getText();
            s=s.substring(s.lastIndexOf("\\")+1);
            objprp.setEmppic(s);
            try {
                obj.insert_emps(objprp);
            } catch (IOException ex) {
                Logger.getLogger(frmemp.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(frmemp.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(frmemp.class.getName()).log(Level.SEVERE, null, ex);
            }
         
            
            saveimage();
            
            loaddata();
            clear();
           
        
        }
        
        
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        if(txtempnam.getText()==""||txtempphn.getText()=="")
        {
            JOptionPane.showMessageDialog(this, "Please Enter Employee name and Phone Number");
        }
        else
        {
            clsemps obj=new clsemps();
            clsempsprp objprp =new clsempsprp();
            objprp.setEmpname(txtempnam.getText());
            objprp.setEmpphnno(txtempphn.getText());
            objprp.setEmploc(cmbemploc.getSelectedItem().toString());
            String s=txtemppic.getText();
            s=s.substring(s.lastIndexOf("\\")+1);
            objprp.setEmppic(s);
            objprp.setEmpcod(ecod);
            try {
                obj.update_emps(objprp);
           btnupdate.setEnabled(false);
           btndelete.setEnabled(false);
        
            } catch (IOException ex) {
                Logger.getLogger(frmemp.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(frmemp.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(frmemp.class.getName()).log(Level.SEVERE, null, ex);
            }
         
            loaddata();
            clear();
            
        }
        
    }//GEN-LAST:event_btnupdateActionPerformed
int ecod;
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
        int idx=jTable1.getSelectedRow();
        if(idx!=-1)
        {
            ecod=(int)jTable1.getValueAt(idx, 0);
            txtempnam.setText(jTable1.getValueAt(idx, 1).toString());
            txtempphn.setText(jTable1.getValueAt(idx, 2).toString());
            cmbemploc.setSelectedItem(jTable1.getValueAt(idx, 3));
            clsemps obj=new clsemps();
            try {
                clsempsprp p=obj.find_emps(ecod);
                txtemppic.setText(p.getEmppic());
            } catch (IOException ex) {
                Logger.getLogger(frmemp.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(frmemp.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(frmemp.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        btnupdate.setEnabled(true);
        btndelete.setEnabled(true);
    }//GEN-LAST:event_jTable1MouseClicked

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
       clsemps obj=new clsemps();
       clsempsprp objprp=new clsempsprp();
       objprp.setEmpcod(ecod);
        try {
            obj.delete_emps(objprp);
            btnupdate.setEnabled(false);
            btndelete.setEnabled(false);
        } catch (IOException ex) {
            Logger.getLogger(frmemp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(frmemp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(frmemp.class.getName()).log(Level.SEVERE, null, ex);
        }
        loaddata();
        clear();
    }//GEN-LAST:event_btndeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnpic;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnupdate;
    private javax.swing.JComboBox<String> cmbemploc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtempnam;
    private javax.swing.JTextField txtempphn;
    private javax.swing.JTextField txtemppic;
    // End of variables declaration//GEN-END:variables
}