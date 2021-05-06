/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example1;

/**
 *
 * @author S542269
 */
public class IAS extends civilServices {
     

    private String name;

    public IAS(String name, long id) {
        super(id);
        this.name = name;
    }

    @Override
    public String toString() {
        return "IAS{" + "name=" + name + '}';
    }

   
    
}
