/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.javakt.views;


import java.util.List;

import javax.swing.JFrame;
import javax.swing.event.ListSelectionEvent;

import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

import com.mycompany.javakt.models.PhongBan;
import com.mycompany.javakt.presenters.PhongBanPresenter;
import com.mycompany.javakt.views.interfaces.PhongBanView;


public class PHONGBAN extends javax.swing.JFrame implements PhongBanView {

    public DefaultTableModel tbm = new DefaultTableModel(new String[][]{}, new String[]{"Mã số","Tên Phòng Ban"});

    private String idSelected;

    public ActionListener OnAdd;
    public ActionListener OnEdit;
    public ActionListener OnDelete;

    public String getTenPhongBan() {
       return txtTenPB.getText();
    }
    public void addRow(PhongBan pb) {
      tbm.addRow(new String[] {String.valueOf(pb.getMaPB()), pb.getTenPB()});
    } 
    public String getIdSelected() {
      return this.idSelected;
    }

    public PHONGBAN() {
        initComponents();
        tblPhongban.setModel(tbm);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPhongban = new javax.swing.JTable();
        txtTenPB = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnEdit.setText("EDIT");

        btnDelete.setText("DELETE");

        btnAdd.setText("ADD");

        tblPhongban.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Mã Phòng Ban", "Tên Phòng Ban"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPhongban);

        jLabel1.setText("Tên Phòng Ban : ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btnAdd)
                .addGap(24, 24, 24)
                .addComponent(btnEdit)
                .addGap(18, 18, 18)
                .addComponent(btnDelete)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(txtTenPB, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTenPB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnEdit)
                    .addComponent(btnDelete))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void initEvents() {
        btnDelete.addActionListener(OnDelete);
        btnEdit.addActionListener(OnEdit);
        btnAdd.addActionListener(OnAdd);
        tblPhongban.getSelectionModel().addListSelectionListener((ListSelectionEvent event) -> {
            if(tbm.getRowCount() > 0) {
            this.idSelected = tblPhongban.getValueAt(tblPhongban.getSelectedRow(),0).toString();
            this.txtTenPB.setText(tblPhongban.getValueAt(tblPhongban.getSelectedRow(),1).toString());
            }
        });
    }
   
    public void XoaBang() {
        tbm.setRowCount(0);
    }
    public void NapdulieuchoTable(List<PhongBan> list)
    {
      for(PhongBan pb : list) {
         tbm.addRow(new String[] {String.valueOf(pb.getMaPB()),pb.getTenPB()});
      }
    }
    
    
    /**
     * @param args the command line arguments
     */

    
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
            java.util.logging.Logger.getLogger(PHONGBAN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PHONGBAN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PHONGBAN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PHONGBAN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PHONGBAN().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPhongban;
    private javax.swing.JTextField txtTenPB;
    // End of variables declaration//GEN-END:variables
    @Override
    public void open() {
      this.setVisible(true);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void setOnAdd(ActionListener onAdd) {
      OnAdd = onAdd;
    }


    public void setOnEdit(ActionListener onEdit) {
      OnEdit = onEdit;
    }


    public void setOnDelete(ActionListener onDelete) {
      OnDelete = onDelete;
    }


}