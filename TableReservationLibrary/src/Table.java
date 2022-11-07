
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
    private int id; 
    private int numSeats; 
    private int getNumSeats;

    public Table(int id, int numSeats) { 
        this.id = id;
        this.numSeats = numSeats; 
    }
    public int getId() { return this.id; }
    public int getNumSeats() { return this.getNumSeats; }
}
