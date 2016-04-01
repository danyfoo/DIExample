/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diexample;

import java.util.List;

/**
 *
 * @author darivera
 */
interface RentABike {
    List getBike();
    Bike getBike(String serialNo);
}
