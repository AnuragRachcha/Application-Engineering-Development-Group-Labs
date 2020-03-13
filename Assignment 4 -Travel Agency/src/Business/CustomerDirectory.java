/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import Business.Flightdetails;
/**
 *
 * @author admin
 */

public class CustomerDirectory {
    
    private ArrayList<Customer> customerDirectory;
    
    private Flightdetails fd;
    public CustomerDirectory()
    {
        customerDirectory= new ArrayList<Customer>();
        this.fd = fd;
    }

    public ArrayList<Customer> getcustomerDirectory() {
        return customerDirectory;
    }

    public void setcustomerDirectory(ArrayList<Customer> customerDirectory) {
        this.customerDirectory = customerDirectory;
    }
    
    public Customer addCustomer()
    {
    Customer c=new Customer();
    customerDirectory.add(c);
    return c;
    }
    
    public void removeCustomer(Customer c) {
        customerDirectory.remove(c);
    }
    
    
}
