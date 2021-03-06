/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Customer;

import Business.Airliner;
import Business.AirlinerDirectory;
import Business.CustomerDirectory;
import Business.Flightdetails;
import Interface.Airliners.AirlinerTableDetails;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author admin
 */
public class FlightBookingPage1 extends javax.swing.JPanel {

    /**
     * Creates new form FlightBookingPage1
     */
   private JPanel rightpane;
    private AirlinerDirectory airlinerDirectory;
    private ArrayList<Flightdetails> customerSearch;
    private CustomerDirectory customerDirectory;
    private Airliner airliner;
    public FlightBookingPage1(JPanel rightpane, AirlinerDirectory airlinerDirectory,CustomerDirectory customerDirectory) {
        initComponents();
        this.rightpane=rightpane;
        this.airlinerDirectory=airlinerDirectory;
        customerSearch= new ArrayList<Flightdetails>();
        this.customerDirectory=customerDirectory;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fromlbl = new javax.swing.JLabel();
        tolbl = new javax.swing.JLabel();
        fromtxt = new javax.swing.JTextField();
        totxt = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        locationlabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 204, 255));
        setPreferredSize(new java.awt.Dimension(900, 600));

        fromlbl.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        fromlbl.setText("Departure Location");

        tolbl.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        tolbl.setText("Arrival Location");

        fromtxt.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        fromtxt.setBorder(null);

        totxt.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        totxt.setBorder(null);

        btnSearch.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        locationlabel.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        locationlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        locationlabel.setText("Customer Search Entries");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tolbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(totxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fromlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(fromtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(locationlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(locationlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fromlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fromtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tolbl, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String src = fromtxt.getText();
        String destination= totxt.getText();
        for(Airliner airliner : airlinerDirectory.getairlinerDirectory()){
        ArrayList<Flightdetails> s= airliner.getflightDetails().getflightDetails();
        // airliner.getairlinerName();
        for(Flightdetails f:s){
        if(f.getSource().equalsIgnoreCase(src) && f.getDestination().equalsIgnoreCase(destination)){
        customerSearch.add(f);
                    }
                }
        }
        if(customerSearch.isEmpty()){
            JOptionPane.showMessageDialog(null,"Flight not found");
            
        }
        else{
        FlightBookingPage2 ffd = new FlightBookingPage2(rightpane, customerSearch,customerDirectory, airliner);
        rightpane.add("flightfilterdata",ffd);
        CardLayout layout = (CardLayout)rightpane.getLayout();
        layout.next(rightpane);
        }
        
    }//GEN-LAST:event_btnSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel fromlbl;
    private javax.swing.JTextField fromtxt;
    private javax.swing.JLabel locationlabel;
    private javax.swing.JLabel tolbl;
    private javax.swing.JTextField totxt;
    // End of variables declaration//GEN-END:variables
}
