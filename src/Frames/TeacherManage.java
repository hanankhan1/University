
package Frames;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import subClasses.Teacher;
import subClasses.University;


public class TeacherManage extends javax.swing.JFrame {

   
    public TeacherManage() {
        initComponents();
    }

    public void reset() {
        tName.setText("");
        tId.setText("");
        tSalary.setText("");
        tPhone.setText("");
        taddress.setText("");
        Tdept.setText("");

    }

    public void setTable() {
        ArrayList<Teacher> tec = University.getAllTeacher();
        if (tec != null) {
            DefaultTableModel model = (DefaultTableModel) Teacherlist.getModel();
            model.setRowCount(0);
            for (int i = 0; i < tec.size(); i++) {
                Object[] cols = new Object[6];
                cols[0] = tec.get(i).gettName();
                cols[1] = tec.get(i).gettId();
                cols[2] = tec.get(i).getSalary();
                cols[3] = tec.get(i).getDeprt();
                cols[4] = tec.get(i).getAddress();
                cols[5] = tec.get(i).getPhoneNo();
                model.addRow(cols);
            }

        }

    }

    public void singleItem(Teacher t) {
        DefaultTableModel model = (DefaultTableModel) Teacherlist.getModel();
        model.setRowCount(0);
        Object[] cols = new Object[7];
        cols[0] = t.gettName();
        cols[1] = t.gettId();
        cols[2] = t.getSalary();
        cols[3] = t.getDeprt();
        cols[4] = t.getAddress();
        cols[5] = t.getPhoneNo();

        model.addRow(cols);

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Teacherlist = new javax.swing.JTable();
        tByName = new javax.swing.JTextField();
        remove = new javax.swing.JButton();
        back = new javax.swing.JButton();
        add = new javax.swing.JButton();
        search = new javax.swing.JButton();
        update = new javax.swing.JButton();
        tName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tSalary = new javax.swing.JTextField();
        Tdept = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        taddress = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tPhone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Teacherlist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "ID", "Salary", "Deperatment", "Address", "Class Time"
            }
        ));
        jScrollPane2.setViewportView(Teacherlist);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(452, 68, -1, 473));

        tByName.setBorder(null);
        jPanel2.add(tByName, new org.netbeans.lib.awtextra.AbsoluteConstraints(452, 12, 452, 44));

        remove.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        remove.setText("Remove");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });
        jPanel2.add(remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 414, -1, 31));

        back.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel2.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, 90, 31));

        add.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel2.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 100, 33));

        search.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel2.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 478, 100, 29));

        update.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel2.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 478, -1, 29));
        jPanel2.add(tName, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 71, 265, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Name");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 68, 113, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 129, 124, 30));
        jPanel2.add(tId, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 132, 265, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Salary");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 192, 89, 30));
        jPanel2.add(tSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 195, 265, 30));
        jPanel2.add(Tdept, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 256, 265, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Depertment");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 253, 124, 30));
        jPanel2.add(taddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 304, 265, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Address");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 301, 89, 30));
        jPanel2.add(tPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 355, 265, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Phone No.");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 352, 124, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 927, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        AdminDas a = new AdminDas();
        a.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        if (!tName.getText().isEmpty()
                && !tId.getText().isEmpty()
                && !tSalary.getText().isEmpty()
                && !Tdept.getText().isEmpty()
                && !taddress.getText().isEmpty()
                && !tPhone.getText().isEmpty()) {
            Teacher t = new Teacher();
            t.settName(tName.getText());
            t.settId(tId.getText());
            t.setSalary(tSalary.getText());
            t.setDeprt(Tdept.getText());
            t.setAddress(taddress.getText());
            t.setPhoneNo(tPhone.getText());
            University.addTeacher(t);
            setTable();
            reset();

        } else {
            University.showMsgError("Filled th required filed..!");
        }

    }//GEN-LAST:event_addActionPerformed

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        // TODO add your handling code here:
        if (!tName.getText().isEmpty()
                && !tId.getText().isEmpty()
                && !tSalary.getText().isEmpty()
                && !Tdept.getText().isEmpty()
                && !taddress.getText().isEmpty()
                && !tPhone.getText().isEmpty()) {
            Teacher t = new Teacher();
            t.settName(tName.getText());
            t.settId(tId.getText());
            t.setSalary(tSalary.getText());
            t.setDeprt(Tdept.getText());
            t.setAddress(taddress.getText());
            t.setPhoneNo(tPhone.getText());
            University.delTeacher(t);
            reset();

        } else {
            University.showMsgError("Filled th required filed..!");
        }

    }//GEN-LAST:event_removeActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        if (!tName.getText().isEmpty()
                && !tId.getText().isEmpty()
                && !tSalary.getText().isEmpty()
                && !Tdept.getText().isEmpty()
                && !taddress.getText().isEmpty()
                && !tPhone.getText().isEmpty()) {
            Teacher t = new Teacher();
            t.settName(tName.getText());
            t.settId(tId.getText());
            t.setSalary(tSalary.getText());
            t.setDeprt(Tdept.getText());
            t.setAddress(taddress.getText());
            t.setPhoneNo(tPhone.getText());
            University.update(t.gettId(), t);
            reset();
        } else {
            University.showMsgError("Filled the required fields..!");

        }


    }//GEN-LAST:event_updateActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        if (!tByName.getText().isEmpty()) {
            Teacher t = University.tSearchByName(tByName.getText());
            if (t != null) {
                this.singleItem(t);
            } else {
                University.showMsgError("Teacher not found..!");
            }

        } else {
            University.showMsgError("Filled th required filed..!");
        }

    }//GEN-LAST:event_searchActionPerformed

   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TeacherManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeacherManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeacherManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeacherManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeacherManage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Tdept;
    private javax.swing.JTable Teacherlist;
    private javax.swing.JButton add;
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton remove;
    private javax.swing.JButton search;
    private javax.swing.JTextField tByName;
    private javax.swing.JTextField tId;
    private javax.swing.JTextField tName;
    private javax.swing.JTextField tPhone;
    private javax.swing.JTextField tSalary;
    private javax.swing.JTextField taddress;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
