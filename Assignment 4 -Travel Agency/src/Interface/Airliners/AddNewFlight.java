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
import Business.Flightdetails;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author admin
 */
public class AddNewFlight extends javax.swing.JPanel {

    /**
     * Creates new form AddNewFlight
     */
    
JPanel rightpane;
Airliner airliner;
AirlinerDirectory airlinerDictionary;
FleetDirectory fleetDirectory;
Fleet fleet;
    
AddNewFlight(JPanel rightpane, Airliner airliner, AirlinerDirectory airlinerDictionary, FleetDirectory fleetDirectory, Fleet fleet) {
        initComponents();
        this.rightpane=rightpane;
        this.airliner=airliner;
        this.airlinerDictionary = airlinerDictionary;
        this.fleetDirectory=fleetDirectory;
        this.fleet=fleet;
        txtAir.setText(airliner.getairlinerName());
        airtxt.setText(airliner.getairlinerName());
        modeltxt.setText(fleet.getModelNumber());
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void backAction() {
        rightpane.remove(this);
        Component[] componentArray = rightpane.getComponents();
        Component component = componentArray[componentArray.length - 1];
        AirlinerTableDetails atd = (AirlinerTableDetails) component;
        atd.populate1();
        CardLayout layout = (CardLayout) rightpane.getLayout();
        layout.previous(rightpane);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fnolabel = new javax.swing.JLabel();
        sourcelabel = new javax.swing.JLabel();
        destlabel = new javax.swing.JLabel();
        seatlabel = new javax.swing.JLabel();
        datelabel = new javax.swing.JLabel();
        pricelabel = new javax.swing.JLabel();
        txtFlightNumber = new javax.swing.JTextField();
        txtDepartureLocation = new javax.swing.JTextField();
        txtArrivalLocation = new javax.swing.JTextField();
        txtSeats = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        pricelabel1 = new javax.swing.JLabel();
        txtFlightDuration = new javax.swing.JTextField();
        txtAir = new javax.swing.JTextField();
        fnolabel1 = new javax.swing.JLabel();
        modeltxt = new javax.swing.JTextField();
        fnolabel2 = new javax.swing.JLabel();
        airtxt = new javax.swing.JTextField();

        setBackground(new java.awt.Color(102, 204, 255));
        setMaximumSize(new java.awt.Dimension(900, 600));
        setPreferredSize(new java.awt.Dimension(900, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fnolabel.setBackground(new java.awt.Color(255, 255, 255));
        fnolabel.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        fnolabel.setText("Flight Number:");
        add(fnolabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 148, -1));

        sourcelabel.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        sourcelabel.setText("Departure Location:");
        add(sourcelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 161, 189, -1));

        destlabel.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        destlabel.setText("Arrival Location:");
        add(destlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 171, -1));

        seatlabel.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        seatlabel.setText("Seats:");
        add(seatlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 132, -1));

        datelabel.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        datelabel.setText("Date:");
        add(datelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 113, -1));

        pricelabel.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        pricelabel.setText("Price:");
        add(pricelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 149, -1));

        txtFlightNumber.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        txtFlightNumber.setPreferredSize(new java.awt.Dimension(34, 29));
        txtFlightNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFlightNumberActionPerformed(evt);
            }
        });
        add(txtFlightNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 151, 30));

        txtDepartureLocation.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        txtDepartureLocation.setPreferredSize(new java.awt.Dimension(34, 29));
        add(txtDepartureLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 153, 151, 30));

        txtArrivalLocation.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        txtArrivalLocation.setPreferredSize(new java.awt.Dimension(34, 29));
        add(txtArrivalLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 217, 151, 30));

        txtSeats.setEditable(false);
        txtSeats.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        txtSeats.setText("150");
        txtSeats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSeatsActionPerformed(evt);
            }
        });
        add(txtSeats, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 280, 151, -1));

        txtDate.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        txtDate.setPreferredSize(new java.awt.Dimension(34, 29));
        txtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateActionPerformed(evt);
            }
        });
        add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 348, 151, -1));

        txtPrice.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        txtPrice.setPreferredSize(new java.awt.Dimension(34, 29));
        add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 416, 151, -1));

        btnCreate.setBackground(new java.awt.Color(255, 255, 255));
        btnCreate.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 552, 168, 44));

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 11, 111, 38));

        jLabel1.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Adding flight in :");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 15, 245, 30));

        pricelabel1.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        pricelabel1.setText("Flight Duration (In hours):");
        add(pricelabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 220, -1));

        txtFlightDuration.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        txtFlightDuration.setPreferredSize(new java.awt.Dimension(34, 29));
        txtFlightDuration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFlightDurationActionPerformed(evt);
            }
        });
        add(txtFlightDuration, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 484, 151, -1));

        txtAir.setEditable(false);
        txtAir.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        txtAir.setPreferredSize(new java.awt.Dimension(34, 29));
        txtAir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAirActionPerformed(evt);
            }
        });
        add(txtAir, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 13, 209, -1));

        fnolabel1.setBackground(new java.awt.Color(255, 255, 255));
        fnolabel1.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        fnolabel1.setText("Model Number:");
        add(fnolabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 148, -1));

        modeltxt.setEditable(false);
        modeltxt.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        modeltxt.setPreferredSize(new java.awt.Dimension(34, 29));
        modeltxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modeltxtActionPerformed(evt);
            }
        });
        add(modeltxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, 151, -1));

        fnolabel2.setBackground(new java.awt.Color(255, 255, 255));
        fnolabel2.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        fnolabel2.setText("Airline:");
        add(fnolabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, 148, -1));

        airtxt.setEditable(false);
        airtxt.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        airtxt.setPreferredSize(new java.awt.Dimension(34, 29));
        airtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                airtxtActionPerformed(evt);
            }
        });
        add(airtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 170, 151, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
                // TODO add your handling code here:
        
        backAction();
    }//GEN-LAST:event_btnBackActionPerformed

    
    
    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
          HashMap<String , Boolean> h  = new HashMap <String, Boolean>();
        h.put("A1", Boolean.TRUE);
        h.put("A2", Boolean.TRUE);
        h.put("A3", Boolean.TRUE);
        h.put("A4", Boolean.TRUE);
        h.put("A5", Boolean.TRUE);
        h.put("B1", Boolean.TRUE);
        h.put("B2", Boolean.TRUE);
        h.put("B3", Boolean.TRUE);
        h.put("B4", Boolean.TRUE);
        h.put("B5", Boolean.TRUE);
        h.put("C1", Boolean.TRUE);
        h.put("C2", Boolean.TRUE);
        h.put("C3", Boolean.TRUE);
        h.put("C4", Boolean.TRUE);
        h.put("C5", Boolean.TRUE);
        h.put("D1", Boolean.TRUE);
        h.put("D2", Boolean.TRUE);
        h.put("D3", Boolean.TRUE);
        h.put("D4", Boolean.TRUE);
        h.put("D5", Boolean.TRUE);
        h.put("E1", Boolean.TRUE);
        h.put("E2", Boolean.TRUE);
        h.put("E3", Boolean.TRUE);
        h.put("E4", Boolean.TRUE);
        h.put("E5", Boolean.TRUE);
        h.put("F1", Boolean.TRUE);
        h.put("F2", Boolean.TRUE);
        h.put("F3", Boolean.TRUE);
        h.put("F4", Boolean.TRUE);
        h.put("F5", Boolean.TRUE);
        h.put("G1", Boolean.TRUE);
        h.put("G2", Boolean.TRUE);
        h.put("G3", Boolean.TRUE);
        h.put("G4", Boolean.TRUE);
        h.put("G5", Boolean.TRUE);
        h.put("H1", Boolean.TRUE);
        h.put("H2", Boolean.TRUE);
        h.put("H3", Boolean.TRUE);
        h.put("H4", Boolean.TRUE);
        h.put("H5", Boolean.TRUE);
        h.put("I1", Boolean.TRUE);
        h.put("I2", Boolean.TRUE);
        h.put("I3", Boolean.TRUE);
        h.put("I4", Boolean.TRUE);
        h.put("I5", Boolean.TRUE);
        h.put("J1", Boolean.TRUE);
        h.put("J2", Boolean.TRUE);
        h.put("J3", Boolean.TRUE);
        h.put("J4", Boolean.TRUE);
        h.put("J5", Boolean.TRUE);
        h.put("K1", Boolean.TRUE);
        h.put("K2", Boolean.TRUE);
        h.put("K3", Boolean.TRUE);
        h.put("K4", Boolean.TRUE);
        h.put("K5", Boolean.TRUE);
        h.put("L1", Boolean.TRUE);
        h.put("L2", Boolean.TRUE);
        h.put("L3", Boolean.TRUE);
        h.put("L4", Boolean.TRUE);
        h.put("L5", Boolean.TRUE);
        h.put("M1", Boolean.TRUE);
        h.put("M2", Boolean.TRUE);
        h.put("M3", Boolean.TRUE);
        h.put("M4", Boolean.TRUE);
        h.put("M5", Boolean.TRUE);
        h.put("N1", Boolean.TRUE);
        h.put("N2", Boolean.TRUE);
        h.put("N3", Boolean.TRUE);
        h.put("N4", Boolean.TRUE);
        h.put("N5", Boolean.TRUE);
        h.put("O1", Boolean.TRUE);
        h.put("O2", Boolean.TRUE);
        h.put("O3", Boolean.TRUE);
        h.put("O4", Boolean.TRUE);
        h.put("O5", Boolean.TRUE);
        h.put("P1", Boolean.TRUE);
        h.put("P2", Boolean.TRUE);
        h.put("P3", Boolean.TRUE);
        h.put("P4", Boolean.TRUE);
        h.put("P5", Boolean.TRUE);
        h.put("Q1", Boolean.TRUE);
        h.put("Q2", Boolean.TRUE);
        h.put("Q3", Boolean.TRUE);
        h.put("Q4", Boolean.TRUE);
        h.put("Q5", Boolean.TRUE);
        h.put("R1", Boolean.TRUE);
        h.put("R2", Boolean.TRUE);
        h.put("R3", Boolean.TRUE);
        h.put("R4", Boolean.TRUE);
        h.put("R5", Boolean.TRUE);
        h.put("S1", Boolean.TRUE);
        h.put("S2", Boolean.TRUE);
        h.put("S3", Boolean.TRUE);
        h.put("S4", Boolean.TRUE);
        h.put("S5", Boolean.TRUE);
        h.put("T1", Boolean.TRUE);
        h.put("T2", Boolean.TRUE);
        h.put("T3", Boolean.TRUE);
        h.put("T4", Boolean.TRUE);
        h.put("T5", Boolean.TRUE);
        h.put("U1", Boolean.TRUE);
        h.put("U2", Boolean.TRUE);
        h.put("U3", Boolean.TRUE);
        h.put("U4", Boolean.TRUE);
        h.put("U5", Boolean.TRUE);
        h.put("V1", Boolean.TRUE);
        h.put("V2", Boolean.TRUE);
        h.put("V3", Boolean.TRUE);
        h.put("V4", Boolean.TRUE);
        h.put("V5", Boolean.TRUE);
        h.put("W1", Boolean.TRUE);
        h.put("W2", Boolean.TRUE);
        h.put("W3", Boolean.TRUE);
        h.put("W4", Boolean.TRUE);
        h.put("W5", Boolean.TRUE);
        h.put("X1", Boolean.TRUE);
        h.put("X2", Boolean.TRUE);
        h.put("X3", Boolean.TRUE);
        h.put("X4", Boolean.TRUE);
        h.put("X5", Boolean.TRUE);
        h.put("Y1", Boolean.TRUE);
        h.put("Y2", Boolean.TRUE);
        h.put("Y3", Boolean.TRUE);
        h.put("Y4", Boolean.TRUE);
        h.put("Y5", Boolean.TRUE);
        
        
        
       
        
         if (txtFlightNumber.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Enter Flight Number");
            throw new IllegalArgumentException("User has not entered Flight Number");
        } else if (txtDepartureLocation.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Enter Departure Location");
            throw new IllegalArgumentException("User has not entered Departure Location");
        }else if (txtArrivalLocation.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Enter Arrival Location");
            throw new IllegalArgumentException("User has not entered Arrival Location");
        }
        else if (txtDate.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Enter Date  ");
            throw new IllegalArgumentException("User has not entered flight date ");
        }
        else if (txtPrice.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Enter Price for a Ticket");
            throw new IllegalArgumentException("User has not price per ticket");
        }   else if (txtFlightDuration.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Enter Flight Duration ");
            throw new IllegalArgumentException("User has not entered Flight Duration");
        }
        String name=txtAir.getText().trim();
        String number=txtFlightNumber.getText().trim();
        String src=txtDepartureLocation.getText().trim();
        String dest=txtArrivalLocation.getText().trim();
        int seat= fleet.getSeats();
        String date=txtDate.getText().trim();
        if(!datePatternChecker()){
            JOptionPane.showMessageDialog(null, " Expected Date Format :- mm-dd-yyyy ");
        }else{
       try{
         int duration = Integer.parseInt(txtFlightDuration.getText().trim());
         try{
          int val=Integer.parseInt(txtPrice.getText().trim());
        
        
        Flightdetails fd = airliner.getflightDetails().addFlight();
        fd.setName(name);
        fd.setflighNumber(number);
        fd.setSource(src);
        fd.setDestination(dest);
        fd.setSeats(seat);
        fd.setDate(date);
        fd.setPrice(val);
        fd.setDuration(duration);
        fd.setH(h);
        fd.setairPlaneName(airliner.getairlinerName());
        fd.setModelNumber(fleet.getModelNumber());
        System.out.println(airliner);
        JOptionPane.showMessageDialog(null, "Airliner successfully added", "Warning", JOptionPane.INFORMATION_MESSAGE);
        txtFlightNumber.setText("");
        txtDepartureLocation.setText("");
        txtArrivalLocation.setText("");
        txtSeats.setText("");
        txtDate.setText("");
        txtPrice.setText("");
        txtFlightDuration.setText("");
        }catch(NumberFormatException n)
            {
            JOptionPane.showMessageDialog(null, "Price Should be Numeric entry", "Warning", JOptionPane.INFORMATION_MESSAGE);
            }
        }catch(NumberFormatException n){
           JOptionPane.showMessageDialog(null, "Flight Duration should be Numeric entry", "Warning", JOptionPane.INFORMATION_MESSAGE);

        }
        }
          
    }//GEN-LAST:event_btnCreateActionPerformed
       boolean datePatternChecker()  {
        Pattern p= Pattern.compile("^(0?[1-9]|1[012])[-]([0-2][0-9]|3[01])[-]([0-9]{4})$");
        Matcher m = p.matcher(txtDate.getText());
        return m.matches();
    }
    private void txtFlightDurationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFlightDurationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFlightDurationActionPerformed

    private void txtFlightNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFlightNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFlightNumberActionPerformed

    private void txtAirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAirActionPerformed

    private void modeltxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modeltxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modeltxtActionPerformed

    private void airtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_airtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_airtxtActionPerformed

    private void txtSeatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSeatsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSeatsActionPerformed

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField airtxt;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JLabel datelabel;
    private javax.swing.JLabel destlabel;
    private javax.swing.JLabel fnolabel;
    private javax.swing.JLabel fnolabel1;
    private javax.swing.JLabel fnolabel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField modeltxt;
    private javax.swing.JLabel pricelabel;
    private javax.swing.JLabel pricelabel1;
    private javax.swing.JLabel seatlabel;
    private javax.swing.JLabel sourcelabel;
    private javax.swing.JTextField txtAir;
    private javax.swing.JTextField txtArrivalLocation;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtDepartureLocation;
    private javax.swing.JTextField txtFlightDuration;
    private javax.swing.JTextField txtFlightNumber;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtSeats;
    // End of variables declaration//GEN-END:variables
}