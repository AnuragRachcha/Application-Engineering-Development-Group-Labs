/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class FlightdetailsDirectory {
    
     private ArrayList<Flightdetails> flightDetails;
     
     public FlightdetailsDirectory() {
        flightDetails = new ArrayList<Flightdetails>();
    }

    public ArrayList<Flightdetails> getflightDetails() {
        return flightDetails;
    }
    
    public Flightdetails addFlight() {
        Flightdetails fd = new Flightdetails();
        flightDetails.add(fd);
        return fd;
    }
    
    public void removeFlight(Flightdetails fd) {
        flightDetails.remove(fd);
    }
}
