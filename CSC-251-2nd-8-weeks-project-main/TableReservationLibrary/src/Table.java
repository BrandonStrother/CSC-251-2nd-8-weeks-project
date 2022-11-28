
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jalie Kirch
 */
public class Table
{
    private int numSeats; 
    private int people;
    private int chairsNeeded;
    private int getNumTables;

    public Table(int people , int numSeats, int chairsNeeded) { 
        this.numSeats = numSeats;
        this.people = people;
        this.chairsNeeded = chairsNeeded;
    }
    public int getPeople() { return this.people; }
    public int getNumTables() { return this.getNumTables; }
}
