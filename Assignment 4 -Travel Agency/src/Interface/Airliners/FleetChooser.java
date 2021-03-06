/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Airliners;

import Business.Airliner;
import Business.AirlinerDirectory;
import Business.Fleet;
import Business.FleetDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author viee
 */
public class FleetChooser extends javax.swing.JPanel {

    private JPanel rightpane;
    private AirlinerDirectory airlinerDirectory;
    private Airliner airliner;
    private FleetDirectory fleetDirectory;
    private Fleet fleet;
    
    /**
     * Creates new form FleetChooser
     */
    

    FleetChooser(JPanel rightpane, AirlinerDirectory airlineDirectory, Airliner airliner, FleetDirectory fleetDirectory) {
         //To change body of generated methods, choose Tools | Templates.
        initComponents();
        this.rightpane=rightpane;
        this.airliner=airliner;
        this.airlinerDirectory=airlineDirectory;
        this.fleetDirectory=fleetDirectory;
        
        
        comboFleetSelection.removeAllItems();
        
       for(Fleet f : fleetDirectory.getFleetDirectory()) {
            if(airliner.getairlinerName().equalsIgnoreCase(f.getairPlaneName()))
            {
           comboFleetSelection.addItem(f);
            }
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
        fleetnamelabel = new javax.swing.JLabel();
        comboFleetSelection = new javax.swing.JComboBox();
        btnGO = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setLayout(new java.awt.CardLayout());

        jPanel2.setBackground(new java.awt.Color(102, 204, 255));

        fleetnamelabel.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        fleetnamelabel.setText("Fleet:");

        comboFleetSelection.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        comboFleetSelection.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboFleetSelection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboFleetSelectionActionPerformed(evt);
            }
        });

        btnGO.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        btnGO.setText("GO");
        btnGO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGOActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(267, Short.MAX_VALUE)
                .addComponent(fleetnamelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGO, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboFleetSelection, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(208, 208, 208))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fleetnamelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboFleetSelection, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(btnGO, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(302, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        add(jPanel1, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void comboFleetSelectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboFleetSelectionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboFleetSelectionActionPerformed

    private void btnGOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGOActionPerformed
        // TODO add your handling code here:
        Fleet f = (Fleet)comboFleetSelection.getSelectedItem();
        System.out.println(f);
        AirlinerTableDetails atd = new AirlinerTableDetails(rightpane, airliner, airlinerDirectory, f, fleetDirectory);
        rightpane.add("AirlinerTableDetails",atd);
        CardLayout layout = (CardLayout)rightpane.getLayout();
        layout.next(rightpane);
    }//GEN-LAST:event_btnGOActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        rightpane.remove(this);
        CardLayout layout = (CardLayout)rightpane.getLayout();
        layout.previous(rightpane);        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnGO;
    private javax.swing.JComboBox comboFleetSelection;
    private javax.swing.JLabel fleetnamelabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}

