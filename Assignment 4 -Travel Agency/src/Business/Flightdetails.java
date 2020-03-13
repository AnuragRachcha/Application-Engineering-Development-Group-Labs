/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import java.util.HashMap;

/**
 *
 * @author admin
 */
public class Flightdetails implements Comparable<Flightdetails>  {
    
    private String flighNumber;
    private String name;
    private int price;
    private int seats;
    private String source;
    private String destination;
    private String date; 
    private int duration;
    private String time;
    private String airPlaneName;
    private String modelNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    private HashMap<String, Boolean> hashmap;

    public HashMap<String, Boolean> getH() {
        return hashmap;
    }

    public void setH(HashMap<String, Boolean> h) {
        this.hashmap = h;
    }
    
    public String getflighNumber() {
        return flighNumber;
    }

    public void setflighNumber(String flighNumber) {
        this.flighNumber = flighNumber;
    }

    

   

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    @Override
    public String toString(){
        return this.flighNumber;
    }

    @Override
    public int compareTo(Flightdetails o) {
       return (int)(price-o.price);
    }
    
   
}
