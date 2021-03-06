/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.TravelAgency;

import Business.Airliner;
import Business.Flightdetails;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class viewairlinerdetails extends javax.swing.JPanel {

    /**
     * Creates new form viewairlinerdetails
     */
    private JPanel rightpane;
    private Airliner a;
    public viewairlinerdetails(JPanel rightpane, Airliner a) {
        initComponents();
        this.rightpane=rightpane;
        this.a=a;
        airlinername.setText(a.getairlinerName());
        populate12();
    }

    public void populate12() {
        int rowCount = airlinerdetailstbl.getRowCount();
        DefaultTableModel model = (DefaultTableModel)airlinerdetailstbl.getModel();
        model.setRowCount(0);
        //for(int i=rowCount-1;i>=0;i--) {
          //  model.removeRow(i);
        //}
        
        
        for(Flightdetails fd : a.getflightDetails().getflightDetails()) {
            Object row[] = new Object[model.getColumnCount()];
            row[0]=  a.getairlinerName();
            row[1] = fd;
            row[2] = fd.getSource();
            row[3] = fd.getDestination();
            row[4] = fd.getSeats();
            row[5] = fd.getDate();
            row[6] = fd.getPrice();
            model.addRow(row);
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
        airlinerdetailstbl = new javax.swing.JTable();
        airlinernamelbl = new javax.swing.JLabel();
        airlinername = new javax.swing.JTextField();
        airlinerheading = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 204, 255));
        setMaximumSize(new java.awt.Dimension(900, 600));
        setPreferredSize(new java.awt.Dimension(900, 600));

        airlinerdetailstbl.setFont(new java.awt.Font("Corbel Light", 0, 14)); // NOI18N
        airlinerdetailstbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Airliner", "Flight Name", "Source", "Destination", "Seats", "Price", "Date"
            }
        ));
        jScrollPane1.setViewportView(airlinerdetailstbl);

        airlinernamelbl.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        airlinernamelbl.setText("Airliner:");

        airlinername.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        airlinername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                airlinernameActionPerformed(evt);
            }
        });

        airlinerheading.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        airlinerheading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        airlinerheading.setText("Airliner Details");

        btnBack.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(283, 283, 283)
                .addComponent(airlinernamelbl)
                .addGap(18, 18, 18)
                .addComponent(airlinername, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(airlinerheading, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 852, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(airlinerheading, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(airlinername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(airlinernamelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void airlinernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_airlinernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_airlinernameActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        rightpane.remove(this);
         CardLayout layout = (CardLayout)rightpane.getLayout();
        layout.previous(rightpane);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable airlinerdetailstbl;
    private javax.swing.JLabel airlinerheading;
    private javax.swing.JTextField airlinername;
    private javax.swing.JLabel airlinernamelbl;
    private javax.swing.JButton btnBack;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
