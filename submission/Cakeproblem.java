/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package cakeproblem;

import java.io.*;
import java.util.*;

/**
 *
 * @author mayur
 */
public class Cakeproblem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
       String filename="cake.txt";
         FileReader fileReader = new FileReader(filename);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        List<String> lines = new ArrayList<String>();
        String line = null;
        while ((line = bufferedReader.readLine()) != null) {
            lines.add(line);
        }
        bufferedReader.close();
         lines.toArray(new String[lines.size()]);
       System.out.println("file read input::");
         System.out.println(lines);
        int[] numbers = new int[lines.size()];
            for(int i = 0;i < lines.size();i++)
            {   
              numbers[i] = Integer.parseInt(lines.get(i));
            }
         int arraySize = numbers[0];
         System.out.println("number of inputs:"+arraySize);
          int[] answer = new int[arraySize+1];
          
  // for (int j=1; j<=arraySize;j++){
  // System.out.println(numbers[j]);
   
//   }

int N = 35;


            int factor1 = 0;
            
            int increamentFactor1=0;
            int perimeter = 0;

            for (int k=1;k<=arraySize;k++){
                int factor2 = numbers[k];
            for (factor1 = 1; factor1 <= factor2; factor1++) { // going frim o to big number for factor determiation
                if ((factor1 * factor2) == numbers[k]){
                    perimeter = 2 * (factor1 + factor2);//is area is found then calculate perimeter
                }
                increamentFactor1= factor1+1;
                //System.out.println(increamentFactor1);
                if (numbers[k] % (increamentFactor1) == 0) 
                    factor2 = numbers[k]/(increamentFactor1);
            }
            answer[k-1] = perimeter;
//           System.out.println("perimeter: " + perimeter);
            
            }
            
   System.out.println("expected results::");
   for (int j=0; j<answer.length-1;j++){
   System.out.println(answer[j]);
      }
           
    }
    
}
