/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coparttest;

import java.util.*;
import java.io.*;

/**
 *
 * @author mayur
 */
public class Coparttest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        int numStr;
         int maxCount = 1;
         
        String s = "";
        char repeatChar;
       String fileName="C:\\Users\\mayur\\Documents\\NetBeansProjects\\coparttest\\dna.txt";
        BufferedReader br = new BufferedReader(new FileReader(fileName));
    try {
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();

        while (line != null) {
            sb.append(line);
            //sb.append("\n");
            line = br.readLine();
        }
        String z = sb.toString();
        System.out.println("read the  sequence :   "+sb);
         char[] charArray = z.toCharArray(); // to convert into newly allocated character sequence
          repeatChar = charArray[0]; //initialize the repeating character element
         int arraySize =z.length();
         // System.out.println(z.getClass().getName());      
      for(int i = 0, j=0; i < arraySize-1; i++){
       //   for (int j=0; j<z.length();j++){
       //int j=0;
       
       if(i == j){
        int count = 1;
        j=j+1;
      //  System.out.println("before while"+j);
             while ((j < arraySize) && (charArray[i] == charArray[j])) {
            count++;            //if the repeating continuous char found then increase count
          //  System.out.println("in while"+j);
          //  System.out.print(count);
        j++;
        }
        if (count > maxCount) {
            repeatChar = charArray[i];//got repeating character
             maxCount = count;
         
        }else{
      //  System.out.println("go on..");
        }
           }
        //}
    } 
       System.out.println("output: "+repeatChar + " " + maxCount);
    
        
        
    } finally {
        br.close();
    }
   
       
        
                
    }
    
 
    
}
