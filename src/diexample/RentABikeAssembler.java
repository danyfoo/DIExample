/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diexample;

/**
 *
 * @author darivera
 */
public class RentABikeAssembler {
    public static void main(String[] args) {
        CommandLineView clv = new CommandLineView();
        RentABike rentABike = new ArrayListRentABike("Bruce's Bikes");
        clv.setRentaBike(rentABike);
        clv.printAllBikes();
    }
}
