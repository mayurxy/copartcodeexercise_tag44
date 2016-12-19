/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package closefacility;

import java.util.*;

/**
 *
 * @author mayur
 */
public class Closefacility {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("give zipcode");
        Scanner sc1 = new Scanner(System.in);
        int zipcode = sc1.nextInt();
        System.out.println("customer ID");
        Scanner sc2 = new Scanner(System.in);
       String customerId = sc2.nextLine();
     //  System.out.println(zipcode);
      // System.out.println(customerId);

        Map<Integer, Map<String,String>> mymultiMap = new HashMap<Integer,Map<String,String>>();
        Map<String,String> innerMap = new HashMap<String,String>();
      
        
       mymultiMap.put(94523, innerMap);
       innerMap.put( "A001","Vallejo, CA");
       innerMap.put( "A003","Martinez, CA");
       innerMap.put( "A003","Venezuella, CA");   
        System.out.println("closest facility of copart is:  "+mymultiMap.get(zipcode).get(customerId));
                
    }
    
}
