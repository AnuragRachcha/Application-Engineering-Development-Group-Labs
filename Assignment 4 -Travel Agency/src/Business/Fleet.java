/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author viee
 */
public class Fleet {
    
    private String airPlaneName;
    private String modelNumber;
    private int seats;

    public String getairPlaneName() {
        return airPlaneName;
    }

    public void setairPlaneName(String airPlaneName) {
        this.airPlaneName = airPlaneName;
    }
    

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
    
    @Override
    public String toString() {
        return this.getModelNumber();
    }
}
