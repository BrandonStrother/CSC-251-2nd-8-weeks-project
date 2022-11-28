/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablechair_groupproject;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author strotheb6455
 */
public class TableChair_GroupProject
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        new OrderForm().setVisible(true);
        
        try {
            print(order_name, distance, shipping_address, num_chairs, num_tables, total);
        } 
        catch (IOException ex) {
            Logger.getLogger(OrderForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private static String order_name;
    private static int num_chairs;
    private static int num_tables;
    private static String shipping_address;
    private static double distance;
    private static double total;
    
    public void setName(String order_Name)
    {
        order_name = order_Name;
    }
    public void setName2(int num_Chairs)
    {
        num_chairs = num_Chairs;
    }
    public void setName3(int num_Tables)
    {
        num_tables = num_Tables;
    }
    public void setName4(String shipping_Address)
    {
        shipping_address = shipping_Address;
    }
    public void setName5(double Distance)
    {
        distance = Distance;
    }
    public void setName6(double Total)
    {
        total = Total;
    }
    public static void print(String order_name,double distance, String shipping_address,int num_tables, int num_chairs, double total) throws IOException{
        PrintWriter outputfile = new PrintWriter(order_name+" Billing.txt");
        outputfile.println("Thank you " + order_name + "\n"
                + "You have ordered " + num_chairs + " chairs" + "\n"
                + "You have ordered " + num_tables + " tables" + "\n"
                + "Address: " + shipping_address + "\n"
                + "Distance to venue in miles: " + distance + "\n"
                + "The total for this order is $"+ String.format("%.2f", total));
        outputfile.close();
        }
    
}
