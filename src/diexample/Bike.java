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
public class Bike {
    private String manufacturer;
    private String model;
    private int frame;
    private String serialNo;
    private double weight;
    private String status;

    public Bike(String manufacturer, String model, int frame, String serialNo, double weight, String status) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.frame = frame;
        this.serialNo = serialNo;
        this.weight = weight;
        this.status = status;
    }
    
    public String toString(){
        return "Bike : " +
                "manudacturer -- " + manufacturer +
                "\n: model -- " + model +
                "\n frame -- " + frame +
                "\n serialNo -- " + serialNo +
                "\n weight -- " + weight +
                "\n status -- " + status +
                ".\n";
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getFrame() {
        return frame;
    }

    public void setFrame(int frame) {
        this.frame = frame;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
