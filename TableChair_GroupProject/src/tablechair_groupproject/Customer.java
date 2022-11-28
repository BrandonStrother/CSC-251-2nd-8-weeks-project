/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablechair_groupproject;

/**
 *
 * @author kirchk0446
 */

public class Customer
{
    private String name;
    private int people;
    private double miles;
    private boolean creditordebit;
    
    public void setName(String orderName)
    {
        name = orderName;
    }
    public void setPeople(int orderPeople)
    {
        people = orderPeople;
    }
    public void setName(double orderDistance)
    {
        miles = orderDistance;
    }
    public void setCreditorDebit(boolean CreditDebit)
    {
        creditordebit = CreditDebit;
    }
}

