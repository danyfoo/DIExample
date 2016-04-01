/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diexample;

import java.util.Iterator;

/**
 *
 * @author darivera
 */
public class CommandLineView {
    private RentABike rentaBike;

    public CommandLineView() {
        this.rentaBike = new RentABike("Bruce's Bikes");
    }
    
    public void printAllBikes(){
        System.out.println(rentaBike.toString());
        Iterator iter = rentaBike.getBikes().iterator();
        while (iter.hasNext()) {
            Bike bike = (Bike) iter.next();
            System.out.println(bike.toString());
        }
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CommandLineView clv = new CommandLineView();
        clv.printAllBikes();
    }
}
