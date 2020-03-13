/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment5.xerox;

import com.assignment5.analytics.AnalysisHelper;
import java.io.IOException;

import com.assignment5.analytics.DataStore;
import com.assignment5.entities.Item;
import com.assignment5.entities.Order;
import com.assignment5.entities.Product;
import java.util.*;
import java.util.Map;

/**
 *
 * @author kasai
 */
public class GateWay {

    DataReader productReader;
    DataReader salesReader;
    AnalysisHelper helper;

    public GateWay() throws IOException {
        DataGenerator generator = DataGenerator.getInstance();
        productReader = new DataReader(generator.getProductCataloguePath());
        salesReader = new DataReader(generator.getOrderFilePath());
        helper = new AnalysisHelper();
    }

    public static void main(String args[]) throws IOException {

        GateWay inst = new GateWay();
        inst.readData();

    }

    private void readData() throws IOException {
        String[] row;
        while ((row = productReader.getNextRow()) != null) {
            generateProduct(row);
        }
        while ((row = salesReader.getNextRow()) != null) {
            
            generateOrder(row);
        }
        runAnalysis();
    }

    

    private void generateProduct(String[] row) {
        // TO
        /*int userID = Integer.parseInt(row[0]);
        User user = new User(userID, row[1], row[2]);
        DataStore.getInstance().getUsers().put(userID, user); */
        int productId = Integer.parseInt(row[0]);
        int minPrice = Integer.parseInt(row[1]);
        int maxPrice = Integer.parseInt(row[2]);
        double targetPrice = Double.parseDouble(row[3]);
        
        Product p = new Product(productId, minPrice, maxPrice, targetPrice);
        DataStore.getInstance().getProduct().put(productId, p);
        //Map<Integer, Product> product = DataStore.getInstance().getProduct();
        DataStore.getInstance().getTargetPrice().put(productId, targetPrice);
        //System.out.println(product);
    }

    private void generateOrder(String[] row){
       
        
        int orderId = Integer.parseInt(row[0]);
        int supplierId = Integer.parseInt(row[4]);
        int customerId = Integer.parseInt(row[5]);
        int productId=Integer.parseInt(row[2]);
        int salesPrice=Integer.parseInt(row[6]);
        int quantity=Integer.parseInt(row[3]);
         Item item = new Item(productId, salesPrice, quantity);
         item.setProductId(productId);
         item.setQuantity(quantity);
         item.setSalesPrice(salesPrice);
        Order o = new Order(orderId, supplierId, customerId, item);
        DataStore.getInstance().getOrder().put(orderId, o);
        Map<Integer, Order> order = DataStore.getInstance().getOrder();
        //System.out.println(order);
       //List<Order> odr=new ArrayList<Order>(order.values());
    }
        /*for(Order od: odr)
        {
            System.out.println(od);
        }*/
    
    
    
    private void runAnalysis(){
        
        helper.threeBestNegotiatedProducts();
        
        helper.topThreeCustomers();
        
        helper.threeMostSalesPerson();
        helper.revenuefortheyear();
        helper.companyPricing();
      
        }

   
}
