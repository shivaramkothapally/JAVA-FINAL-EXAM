/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question11;

import java.util.Objects;

/**
 *
 * @author S542269
 */

    public class Flute {

    private String name;// name of the flute
    private int numberofholes;//number of holes in the flute
    
    
    //constructor for flute class

    public Flute(String name, int numberofholes) {
        this.name = name;
        this.numberofholes = numberofholes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberofholes() {
        return numberofholes;
    }

    public void setNumberofholes(int numberofholes) {
        this.numberofholes = numberofholes;
    }

    @Override
    public String toString() {
        return "Flute{" + "name=" + name + ", numberofholes=" + numberofholes + '}';
    }

    
    // this method returns hash value of the object
    @Override
    public int hashCode() {
        int hash = 9;
        hash = 29 * hash + Objects.hashCode(this.name);
        hash = 29 * hash + this.numberofholes;
        return hash;
    }

    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Flute other = (Flute) obj;
        if 
                (this.numberofholes != other.numberofholes) {
            return false;
        }
        if 
                (!Objects.equals(this.name, other.name))
        {
            return false;
        }
        return true;
    }

}

    
