/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diexample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author darivera
 */
public class ArrayListRentABike implements RentABike{
    private String storeName;
    final List bikes = new ArrayList();
    
    public ArrayListRentABike() {
        initBikes();
    }
    
    public ArrayListRentABike(String storeName) {
        this.storeName = storeName;
        initBikes();
    }
    
    @Override
    public String toString(){ return "RentABike: " + storeName; }

    public List getBikes() { return bikes; }
    
    public Bike getBike(String serialNo) {
        Iterator iter = bikes.iterator();
        
        while (iter.hasNext()) {            
            Bike bike = (Bike) iter.next();
            if(serialNo.equals(bike.getSerialNo())) return bike;
        }
        return null;
    }

    private void initBikes() {
        bikes.add(new Bike("Shimano", "Roadmaster", 20, "11111", 15, "Fair"));
        bikes.add(new Bike("Cannondale", "F20000 XTR", 18, "22222", 15, "Excellent"));
        bikes.add(new Bike("Trek", "6000", 19, "33333", 12.4, "Fair"));
    }
    
}
