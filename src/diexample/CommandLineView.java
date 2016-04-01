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

    public CommandLineView() {}
    
    public void setRentaBike(RentABike rentaBike){
        this.rentaBike = rentaBike;
    }

    public RentABike getRentaBike() {
        return rentaBike;
    }
    
    public void printAllBikes(){
        System.out.println(rentaBike.toString());
        Iterator iter = rentaBike.getBikes().iterator();
        while (iter.hasNext()) {
            Bike bike = (Bike) iter.next();
            System.out.println(bike.toString());
        }
    }
}
