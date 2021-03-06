/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.TravelAgency;

import Business.Airliner;
import Business.Customer;
import Business.CustomerDirectory;
import Business.Flightdetails;
import Interface.Airliners.ViewFlight;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class customerdetailsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form Customertbl
     */
    private JPanel rightpane;
    private CustomerDirectory customerDirectory;
    public customerdetailsJPanel(JPanel rightpane, CustomerDirectory customerDirectory) {
        initComponents();
        this.rightpane=rightpane;
        this.customerDirectory=customerDirectory;
        populate11();
    }
public void populate11(){
        int rowCount = custdetailstbl.getRowCount();
        DefaultTableModel dtm = (DefaultTableModel)custdetailstbl.getModel();
        dtm.setRowCount(0);
        for (Customer c : customerDirectory.getcustomerDirectory()){
            Object[] row = new Object[dtm.getColumnCount()];
            row[0] = c;
            row[1] = c.getphoneNumber();
            row[2] = c.getpassportNumber();
            row[9] = c.getSeat();
            row[8] = c.getDate();
            row[6]=c.getSource();
            row[7]=c.getDestination();
            row[3] =c.getAirlineName();
            row[4] = c.getAirplaneName();
            row[5] = c.getflighNumber();
            dtm.addRow(row);
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
        custdetailstbl = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnViewCustomer = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 204, 255));
        setMaximumSize(new java.awt.Dimension(900, 600));
        setPreferredSize(new java.awt.Dimension(900, 600));

        custdetailstbl.setFont(new java.awt.Font("Corbel Light", 0, 14)); // NOI18N
        custdetailstbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer Name", "Phone Number", "Passport No.", "Airline ", "Airplane", "Flight", "Departure Location", "Arrival Location", "Date", "Seat"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(custdetailstbl);
        if (custdetailstbl.getColumnModel().getColumnCount() > 0) {
            custdetailstbl.getColumnModel().getColumn(0).setResizable(false);
            custdetailstbl.getColumnModel().getColumn(0).setPreferredWidth(120);
            custdetailstbl.getColumnModel().getColumn(1).setResizable(false);
            custdetailstbl.getColumnModel().getColumn(2).setResizable(false);
            custdetailstbl.getColumnModel().getColumn(3).setResizable(false);
            custdetailstbl.getColumnModel().getColumn(4).setResizable(false);
            custdetailstbl.getColumnModel().getColumn(5).setResizable(false);
            custdetailstbl.getColumnModel().getColumn(5).setPreferredWidth(60);
            custdetailstbl.getColumnModel().getColumn(6).setResizable(false);
            custdetailstbl.getColumnModel().getColumn(6).setPreferredWidth(110);
            custdetailstbl.getColumnModel().getColumn(7).setResizable(false);
            custdetailstbl.getColumnModel().getColumn(7).setPreferredWidth(100);
            custdetailstbl.getColumnModel().getColumn(8).setResizable(false);
            custdetailstbl.getColumnModel().getColumn(9).setResizable(false);
        }

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnViewCustomer.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        btnViewCustomer.setText("View");
        btnViewCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewCustomerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1063, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnViewCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnViewCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(189, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewCustomerActionPerformed
        // TODO add your handling code here:
        int selectRow= custdetailstbl.getSelectedRow();
        if(selectRow<0)
        {
        JOptionPane.showMessageDialog(null,"Please select a row");
        }
        else{
        Customer c = (Customer) custdetailstbl.getValueAt(selectRow,0);
        viewcustomerdetails vcd = new viewcustomerdetails(this.rightpane,c);
        rightpane.add("viewcustomerdetails",vcd);
        CardLayout layout = (CardLayout)rightpane.getLayout();
        layout.next(rightpane);
        }
    }//GEN-LAST:event_btnViewCustomerActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        rightpane.remove(this);
        CardLayout layout=(CardLayout)rightpane.getLayout();
        layout.previous(rightpane);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnViewCustomer;
    private javax.swing.JTable custdetailstbl;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
