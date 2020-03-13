/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author admin
 */
public class Airliner {
     private String airlinerName;
     private FlightdetailsDirectory flightDetails;
     
     public Airliner()
     {
     flightDetails=new FlightdetailsDirectory();
     }

    public String getairlinerName() {
        return airlinerName;
    }

    public void setairlinerName(String airlinerName) {
        this.airlinerName = airlinerName;
    }

    public FlightdetailsDirectory getflightDetails() {
        return flightDetails;
    }

    public void setflightDetails(FlightdetailsDirectory flightDetails) {
        this.flightDetails = flightDetails;
    }

    @Override
    public String toString(){
        return this.airlinerName;
    }
}
