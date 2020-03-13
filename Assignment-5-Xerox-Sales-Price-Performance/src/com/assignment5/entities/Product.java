/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment5.entities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author viee
 */
public class Product {
    
    int productId;
    int minPrice;
    int maxPrice;
    double targetPrice;
 //private List<Order> order;  ///  int supplierId;

   /* public List<Order> getOrder() {
        return order;
    }

    public void setOrder(List<Order> order) {
        this.order = order;
    }*/

    
   // Item item;
    
    public Product(int productId, int minPrice, int maxPrice, double targetPrice) {
        this.productId = productId;
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
        //this.supplierId = supplierId;
        this.targetPrice = targetPrice;
        //this.order = new ArrayList<>();
        
        //this.item = item;
    }
    
    public int getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(int minPrice) {
        this.minPrice = minPrice;
    }

    public int getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(int maxPrice) {
        this.maxPrice = maxPrice;
    }

    public double getTargetPrice() {
        return targetPrice;
    }

    public void setTargetPrice(int targetPrice) {
        this.targetPrice = targetPrice;
    }

    
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }
    
   /* public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }*/

    @Override
    public String toString() {
        return "Product{" + "productId=" + productId + ", minPrice=" + minPrice + ", maxPrice=" + maxPrice + ", targetPrice=" + targetPrice + '}';
    }
    
    
}
