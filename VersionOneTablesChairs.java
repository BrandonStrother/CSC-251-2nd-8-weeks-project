/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package versiononetableschairs;

import java.util.Scanner;
public class VersionOneTablesChairs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        // declaring prices
         int numPeople = 0;
         int chairsNeeded;
         int getNumTables;
         int groupNum = 0;
         int moreChairs;
         
         //Reservation name
         String name;
         
         
         //declaring subtotal, total variables and discount
         double subTotal;
         double totalCost;
         double discount;
         
        
         
         //Create a readers instance
         Scanner userInputScanner = new Scanner(System.in);  // Create a Scanner object
         System.out.print("How many tables do you need? ");
         getNumTables = userInputScanner.nextInt();  // Read user input
         
         
         //claculation for the number of tables needed 
        
        // try
           // {
               // name = NameInputField.getText();
                // numPeople = Integer.parseInt(groupNumField.getText());
             
           // }
        // catch(Exception e)
        // {
           //  System.out.println("Please enter a correct integer");
             
        // }
         
         
         if (numPeople != 0)
         {
             groupNum = numPeople;
             
         }
         getNumTables = ((groupNum -2)/2) +1 ;
         
         chairsNeeded = (2 +(2*getNumTables));
         moreChairs = chairsNeeded  - groupNum;
         if (moreChairs == 2)
         {
             getNumTables -=1;
             moreChairs = 0 ;
             chairsNeeded -= 2;
         }

    }
    
}
