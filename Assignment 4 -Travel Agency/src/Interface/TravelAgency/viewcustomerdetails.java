/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.TravelAgency;

import Business.Customer;
import Interface.Airliners.AirlinerTableDetails;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class viewcustomerdetails extends javax.swing.JPanel {

    /**
     * Creates new form viewcustomerdetails
     */
    private JPanel rightpane;
    private Customer c;
    public viewcustomerdetails(JPanel rightpane, Customer c) {
        initComponents();
        this.rightpane=rightpane;
        this.c=c;
        
        nametxt.setText(c.getName());
        phonetxt.setText(c.getphoneNumber());
        passporttxt.setText(c.getpassportNumber());
        notxt.setText(c.getflighNumber());
        sourcetxt.setText(c.getSource());
        desttxt.setText(c.getDestination());
        pricetxt.setText(String.valueOf(c.getPrice()));
        seatTxt.setText(c.getSeat());
        
    }

   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        namelbl = new javax.swing.JLabel();
        phonelbl = new javax.swing.JLabel();
        passportlbl = new javax.swing.JLabel();
        passporttxt = new javax.swing.JTextField();
        phonetxt = new javax.swing.JTextField();
        nametxt = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        fnolabel = new javax.swing.JLabel();
        sourcelabel = new javax.swing.JLabel();
        destlabel = new javax.swing.JLabel();
        pricelabel = new javax.swing.JLabel();
        pricetxt = new javax.swing.JTextField();
        desttxt = new javax.swing.JTextField();
        sourcetxt = new javax.swing.JTextField();
        notxt = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        seatTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 204, 255));
        setMaximumSize(new java.awt.Dimension(900, 600));
        setPreferredSize(new java.awt.Dimension(900, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        namelbl.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        namelbl.setText("Name:");
        add(namelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 69, 48));

        phonelbl.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        phonelbl.setText("Phone No.:");
        add(phonelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 104, 50));

        passportlbl.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        passportlbl.setText("Passport No.:");
        add(passportlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 128, 39));

        passporttxt.setEditable(false);
        passporttxt.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        passporttxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passporttxtActionPerformed(evt);
            }
        });
        add(passporttxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 150, 30));

        phonetxt.setEditable(false);
        phonetxt.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        phonetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phonetxtActionPerformed(evt);
            }
        });
        add(phonetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 150, 30));

        nametxt.setEditable(false);
        nametxt.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        nametxt.setPreferredSize(new java.awt.Dimension(10, 26));
        add(nametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 150, 30));

        btnUpdate.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 490, 112, 39));

        btnSave.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 490, 112, 39));

        fnolabel.setBackground(new java.awt.Color(255, 255, 255));
        fnolabel.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        fnolabel.setText("Flight Number:");
        add(fnolabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, 38));

        sourcelabel.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        sourcelabel.setText("Source:");
        add(sourcelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 90, 36));

        destlabel.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        destlabel.setText("Destination:");
        add(destlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 137, 34));

        pricelabel.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        pricelabel.setText("Price:");
        add(pricelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 94, 35));

        pricetxt.setEditable(false);
        pricetxt.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        add(pricetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, 150, 30));

        desttxt.setEditable(false);
        desttxt.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        desttxt.setMaximumSize(new java.awt.Dimension(10, 26));
        desttxt.setPreferredSize(new java.awt.Dimension(10, 26));
        add(desttxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, 150, 30));

        sourcetxt.setEditable(false);
        sourcetxt.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        sourcetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sourcetxtActionPerformed(evt);
            }
        });
        add(sourcetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 150, 30));

        notxt.setEditable(false);
        notxt.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        add(notxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 150, 30));

        btnBack.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 112, 39));

        seatTxt.setEditable(false);
        seatTxt.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        add(seatTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 440, 120, 30));

        jLabel1.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        jLabel1.setText("Seat");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 440, 50, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        nametxt.setEditable(true);
        phonetxt.setEditable(true);
        passporttxt.setEditable(true);
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String name= nametxt.getText().trim();
        String phone=phonetxt.getText().trim();
        String passport=passporttxt.getText().trim();
        c.setName(name);
        c.setphoneNumber(phone);
        c.setpassportNumber(passport);
        
        JOptionPane.showMessageDialog(null, "updated successfully");
        
        nametxt.setEditable(false);
        phonetxt.setEditable(false);
        passporttxt.setEditable(false);
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void backAction() {
        rightpane.remove(this);
        Component[] componentArray = rightpane.getComponents();
        Component component = componentArray[componentArray.length - 1];
        customerdetailsJPanel cdj = (customerdetailsJPanel) component;
        cdj.populate11();
        CardLayout layout = (CardLayout) rightpane.getLayout();
        layout.previous(rightpane);
    }
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        backAction();
            
    }//GEN-LAST:event_btnBackActionPerformed

    private void sourcetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sourcetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sourcetxtActionPerformed

    private void phonetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phonetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phonetxtActionPerformed

    private void passporttxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passporttxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passporttxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel destlabel;
    private javax.swing.JTextField desttxt;
    private javax.swing.JLabel fnolabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel namelbl;
    private javax.swing.JTextField nametxt;
    private javax.swing.JTextField notxt;
    private javax.swing.JLabel passportlbl;
    private javax.swing.JTextField passporttxt;
    private javax.swing.JLabel phonelbl;
    private javax.swing.JTextField phonetxt;
    private javax.swing.JLabel pricelabel;
    private javax.swing.JTextField pricetxt;
    private javax.swing.JTextField seatTxt;
    private javax.swing.JLabel sourcelabel;
    private javax.swing.JTextField sourcetxt;
    // End of variables declaration//GEN-END:variables
}
