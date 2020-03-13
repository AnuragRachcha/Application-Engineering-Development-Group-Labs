/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment5.analytics;
import com.assignment5.entities.Order;
import com.assignment5.entities.Product;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
/**
 *
 * @author Admin
 */
public class AnalysisHelper {
    
    public void threeBestNegotiatedProducts() {

        //Map<Integer, User> users = DataStore.getInstance().getUsers();
        Map<Integer, Integer> prodOrderStore = new HashMap<>();
        Map<Integer, Product> product = DataStore.getInstance().getProduct();
        Map<Integer, Order> order = DataStore.getInstance().getOrder();
        Map<Integer, Double> targetPriceMap = DataStore.getInstance().getTargetPrice();
        //System.out.println(order);

        for (Order o : order.values()) {
            int productId = o.getItem().getProductId();

            double targetPrice = targetPriceMap.get(productId);
            int salesPrice = o.getItem().getSalesPrice();
            double revenue = salesPrice - targetPrice;
            int quant = o.getItem().getQuantity();
            if (revenue > 0) {
                if (prodOrderStore.containsKey(productId)) {
                    int temp = prodOrderStore.get(productId);
                    quant += temp;
                }

                prodOrderStore.put(productId, quant);
            }
        }

        List<Map.Entry<Integer, Integer>> list
                = new LinkedList<Map.Entry<Integer, Integer>>(prodOrderStore.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> o1,
                    Map.Entry<Integer, Integer> o2) {
                return (o2.getValue()).compareTo(o1.getValue());
            }

        });

        System.out.println("Three Best Negotiated Product:");
        for (int i = 0; i < list.size() && i < 3; i++) {

            System.out.println("Product id is: " + list.get(i).getKey() + " Product quantity is: " + list.get(i).getValue());

        }
        System.out.println();
    }
    
    public void topThreeCustomers(){
              System.out.println();
       Map<Integer, Integer> bestCustomer = new HashMap<Integer, Integer>();
       Map<Integer, Order> order = DataStore.getInstance().getOrder();
       Map<Integer, Product> prod = DataStore.getInstance().getProduct();
      // Map<Integer, Customer> customer = DataStore.getInstance().getCustomer();

       for(Order o : order.values()){
          int diff=0;
          if(bestCustomer.containsKey(o.getCustomerId()))
          {
               diff = bestCustomer.get(o.getCustomerId());
          }

          Product product = prod.get(o.getItem().getProductId());
               diff+= (o.getItem().getSalesPrice()-product.getTargetPrice());
               bestCustomer.put(o.getCustomerId(), diff);
        }
      
     //  System.out.println("Customer ID:"+bestCustomer.keySet()+"total contributed amount:- "+bestCustomer.values());
        
      
       List<Entry<Integer,Integer>> sortedList = new ArrayList<Entry<Integer,Integer>>(bestCustomer.entrySet());
        //List<Integer> sorted=new ArrayList<>(bestCustomers.values());
        Collections.sort(sortedList, new Comparator<Map.Entry<Integer,Integer>>() {

            @Override
            public int compare(Entry<Integer, Integer> t, Entry<Integer, Integer> t1) {
                    return (t1.getValue()).compareTo(t.getValue());
            }
        });
        int iteration =0;
            
        System.out.println("The top 3 Customers are:");
        for(Map.Entry<Integer, Integer> entry : sortedList){
           // System.out.println("Rank "+i+""++"="+sorted.get(i));
            
            if(iteration<3)
            
            System.out.println("Customer id is: "+entry.getKey()+" total contributed amount: "+entry.getValue());
           else
                break;
        iteration++;
        }
        
        System.out.println("-----------------------------------------------------");
       
        System.out.println();
    }
    
    public void threeMostSalesPerson(){
System.out.println();
       Map<Integer, Integer> allSalesPeople = new HashMap<Integer, Integer>();
       Map<Integer, Integer> salesPeopleWhoMadeprofit = new HashMap<Integer, Integer>();
       Map<Integer, Order> order = DataStore.getInstance().getOrder();
       Map<Integer, Product> prod = DataStore.getInstance().getProduct();
  
       for(Order o : order.values()){
          int profit=0;
          if(allSalesPeople.containsKey(o.getSupplierId()))
          {
               profit = allSalesPeople.get(o.getSupplierId());
          }

          Product product = prod.get(o.getItem().getProductId());
               profit+= (o.getItem().getSalesPrice()-product.getTargetPrice())*o.getItem().getQuantity();
              
               allSalesPeople.put(o.getSupplierId(), profit);
               
            
        }
       for(Map.Entry<Integer,Integer> m:allSalesPeople.entrySet()){    
      // System.out.println(m.getKey()+" "+m.getValue());
       if(m.getValue() > 0){
           salesPeopleWhoMadeprofit.put(m.getKey(), m.getValue());
           //System.out.println(m.getKey()+" "+m.getValue());
       }
      }  
       System.out.println("Supplier ID:"+salesPeopleWhoMadeprofit.keySet()+"has made profit of: "+salesPeopleWhoMadeprofit.values());
       System.out.println("Supplier ID:"+allSalesPeople.keySet()+"has made profit of: "+allSalesPeople.values());
       System.out.println();
       System.out.println();
         List<Entry<Integer,Integer>> salesList = new ArrayList<Entry<Integer,Integer>>(salesPeopleWhoMadeprofit.entrySet());
        //List<Integer> sorted=new ArrayList<>(bestCustomers.values());
        Collections.sort(salesList, new Comparator<Map.Entry<Integer,Integer>>() {

            @Override
            public int compare(Entry<Integer, Integer> t, Entry<Integer, Integer> t1) {
                    return (t1.getValue()).compareTo(t.getValue());
            }
        });
        int iteration =0;

        System.out.println("The top 3 Sales Person are:");
        for(Map.Entry<Integer, Integer> entry : salesList){
           // System.out.println("Rank "+i+""++"="+sorted.get(i));
          if(iteration<3)
            
            System.out.println("SalesPerson id is: "+entry.getKey()+" has made profit of: "+entry.getValue());
          else
                break;
        iteration++;
        }
       System.out.println("-----------------------------------------------------");
       System.out.println();
    }
    
    public void revenuefortheyear(){
System.out.println();
       Map<Integer, Integer> bestSalesPeople = new HashMap<Integer, Integer>();
       Map<Integer, Order> order = DataStore.getInstance().getOrder();
       Map<Integer, Product> prod = DataStore.getInstance().getProduct();
     

       for(Order o : order.values()){
          int profit=0;
          if(bestSalesPeople.containsKey(o.getSupplierId()))
          {
               profit = bestSalesPeople.get(o.getSupplierId());
          }

          Product product = prod.get(o.getItem().getProductId());
               profit+= (o.getItem().getSalesPrice()-product.getTargetPrice())*o.getItem().getQuantity();
               bestSalesPeople.put(o.getSupplierId(), profit);
        }
      
      
         List<Entry<Integer,Integer>> salesList = new ArrayList<Entry<Integer,Integer>>(bestSalesPeople.entrySet());
       
        Collections.sort(salesList, new Comparator<Map.Entry<Integer,Integer>>() {

            @Override
            public int compare(Entry<Integer, Integer> t, Entry<Integer, Integer> t1) {
                    return (t1.getValue()).compareTo(t.getValue());
            }
        });
        int revenue =0;
        for (Integer i : bestSalesPeople.values()) {
            if(i>0) {
                revenue += i;
            }
        }
        
        System.out.println("Our total revenue for the year that is above expected target : "+revenue);
        System.out.println("-----------------------------------------------------");
        System.out.println();

    }
    
    public void companyPricing() {
System.out.println();
        Map<Integer, Double> averageSalesPrice = new HashMap<>();
        Map<Integer, Double> originalTargetPrice = new HashMap<>();
        Map<Integer, Double> modifiedTargetPrice = new HashMap<>();

        Map<Integer, Double> differenceSalesTarget = new HashMap<>();
        Map<Integer, Double> newDifferenceSalesTarget = new HashMap<>();

        Map<Integer, Double> randomcheck = new HashMap<>();

      

        Map<Integer, Product> prod = DataStore.getInstance().getProduct();

        Map<Integer, Order> order = DataStore.getInstance().getOrder();
        Map<Integer, Double> targetPriceMap = DataStore.getInstance().getTargetPrice();

        int productId = 0;
        double targetPrice = 0;
        double salesPrice = 0;
        double fullSalesPrice = 0;
        int quantity = 0;
        double avgSalesPrice = 0, total = 0, sumquant = 0;

        for (Product p : prod.values() ) {
            
            for (Order o : order.values()) {
                if(p.getProductId()==o.getItem().getProductId())
                {
                productId = o.getItem().getProductId();
                targetPrice = targetPriceMap.get(productId);
                salesPrice = o.getItem().getSalesPrice();
                quantity = o.getItem().getQuantity();

                fullSalesPrice = quantity * salesPrice;
                total += fullSalesPrice;
                sumquant += quantity;
                }
                

            }
            avgSalesPrice = Math.round(total / sumquant);
                
                //System.out.println("Product id: " + productId + " Sales " + total+" Quant "+sumquant);
                averageSalesPrice.put(productId, avgSalesPrice);
        }

        double difference = 0;
        for (int targetKey : targetPriceMap.keySet()) {
            if (averageSalesPrice.containsKey(targetKey) && targetPriceMap.containsKey(targetKey)) {
                difference = Math.round(averageSalesPrice.get(targetKey) - Math.round(targetPriceMap.get(targetKey)));
            }

            differenceSalesTarget.put(targetKey, difference);
        }
        
        LinkedHashMap<Integer, Double> sortedMapOG
                = differenceSalesTarget.entrySet().stream().
                        sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).
                        collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                                (e1, e2) -> e1, LinkedHashMap::new));
        
        
         Object arre1[] = sortedMapOG.keySet().toArray();
         
          System.out.println("===============================================================================================");
        System.out.println("ORIGINAL TARGET PRICE TABLE");
        System.out.println("===============================================================================================");
        System.out.println("Product ID     Avg Selling Price        Original Target Price          Difference Selling- Target");

        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println("ASP < ORIGINAL TARGET PRICE");
        for (Object i : arre1) {

// System.out.println();
            int productId1 = (int) i;
            double salesPrice1 = averageSalesPrice.get(i);
            double tp2 = targetPriceMap.get(i);
            double diff4 = sortedMapOG.get(i);
            if (salesPrice1 < tp2) {
                System.out.println(productId1 + "\t\t\t" + salesPrice1 + "\t\t\t" + tp2 + "\t\t\t" + diff4);
            }
        }
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println("ASP >= ORIGINAL TARGET PRICE");

        for (Object i : arre1) {

// System.out.println();
            int productId1 = (int) i;
            double salesPrice1 = averageSalesPrice.get(i);
            double tp2 = targetPriceMap.get(i);
            double diff4 = sortedMapOG.get(i);
            if (salesPrice1 >= tp2) {
                System.out.println(productId1 + "\t\t\t" + salesPrice1 + "\t\t\t" + tp2 + "\t\t\t" + diff4);
            }
        }


        double posFivePercent = 0;
        double negFivePercent = 0;
        double newAvgSP = 0;

        modifiedTargetPrice.putAll(targetPriceMap);
        for (int keyset : modifiedTargetPrice.keySet()) {
            posFivePercent = (0.05 * averageSalesPrice.get(keyset)) + averageSalesPrice.get(keyset);
            negFivePercent = averageSalesPrice.get(keyset) - (0.05 * averageSalesPrice.get(keyset));

        

            if (targetPriceMap.get(keyset) > posFivePercent) {
                // System.out.println("---------------------------------------------------------"+ keyset);
                newAvgSP = averageSalesPrice.get(keyset) + (averageSalesPrice.get(keyset) * 0.05);

                modifiedTargetPrice.put(keyset, newAvgSP);
            }
            
            else {
                newAvgSP = averageSalesPrice.get(keyset) - (averageSalesPrice.get(keyset) * 0.05);
                modifiedTargetPrice.put(keyset, newAvgSP);
                
            }

        }

        double difference1 = 0;

        for (int key1 : modifiedTargetPrice.keySet()) {
            if (averageSalesPrice.containsKey(key1) && targetPriceMap.containsKey(key1)) {
                difference1 = Math.round(averageSalesPrice.get(key1) - modifiedTargetPrice.get(key1));
                newDifferenceSalesTarget.put(key1, difference1);
            }
        }
        
        
         Map<Integer, Double> errorStore = new HashMap<>();
        int count = 0;
        for (int diffKey : modifiedTargetPrice.keySet()) {

            double targetPrice1 = modifiedTargetPrice.get(diffKey);
            double avgSales = 0.0;
            if (averageSalesPrice.containsKey(diffKey)) {
                count++;
                avgSales = averageSalesPrice.get(diffKey);
            }

            double diff = targetPrice1 - avgSales;
            //   System.out.println("Average Sales "+avgSales+" diff "+ diff);
            double error = (diff) / avgSales;
            //     System.out.print("Error"+ error + "   ");
            //System.out.format("Product ID: " + diffKey + " Error Margin %.2f ", error);
            //System.out.println();
            errorStore.put(diffKey,error);
        }
             LinkedHashMap<Integer, Double> sortedMapMod
                = newDifferenceSalesTarget.entrySet().stream().
                        sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).
                        collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                                (e1, e2) -> e1, LinkedHashMap::new));
               Object arrr1[] = sortedMapMod.keySet().toArray();
               
               
        System.out.println("=======================================================================================================================================");
        System.out.println("MODIFIED TARGET PRICE TABLE");
        System.out.println("=======================================================================================================================================");
        System.out.println("Product ID           Avg SP            Modified Target SP         Difference SP- modified TP         Error Margin");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("ASP < MODIFIED TARGET PRICE");

        for (Object i : arrr1) {
// System.out.println();
            int productId1 = (int) i;
            double salesPrice1 = averageSalesPrice.get(i);
            double tp2 = modifiedTargetPrice.get(i);
            double diff4 = sortedMapMod.get(i);
            double error1 = errorStore.get(i);
            if (salesPrice1 < tp2) {
                System.out.println(productId1 + "\t\t\t" + salesPrice1 + "\t\t\t" + tp2 + "\t\t\t" + diff4 + "\t\t\t" + errorStore.get(i));
            }
        }
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("ASP >= MODIFIED TARGET PRICE");
        for (Object i : arrr1) {
// System.out.println();
            int productId1 = (int) i;
            double salesPrice1 = averageSalesPrice.get(i);
            double tp2 = modifiedTargetPrice.get(i);
            double diff4 = sortedMapMod.get(i);
            double error1 = errorStore.get(i);
            if (salesPrice1 >= tp2) {
                System.out.println(productId1 + "\t\t\t" + salesPrice1 + "\t\t\t" + tp2 + "\t\t\t" + diff4 + "\t\t\t" + errorStore.get(i));
            }

        }

        System.out.println();
    }
    
}
