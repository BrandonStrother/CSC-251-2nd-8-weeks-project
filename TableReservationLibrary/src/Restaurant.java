
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kirchk0446
 */
class Restaurant implements Comparable {
    private String name;
    private List<Table> tables;

    public Restaurant(String name) {
        this.name = name; 
        this.tables = new ArrayList<Table>(); 
    }

    public void addTable(Table t) { this.tables.add(t); }
    public void removeTable(int id) {
       for (Table t : this.tables) {
           if (t.getId() == id) {
               this.tables.remove(t); 
               break;
           }
       }
    }    
    public int getCapacity() { 
        int capacity = 0;
        for (Table t : this.tables) {
            capacity += t.getNumSeats();
        }
        return capacity;
    }
    public int compareTo(Restaurant r) {
        return this.name.compareTo(r.name);
    }

    @Override
    public int compareTo(Object t)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}