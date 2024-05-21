/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Crystal
 */
public class Fitbyte {
    private int age, restingHeartRate;
    
    public Fitbyte(int age , int restingHeartRate){
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }
    
    public double targetHeartRate(double percentageOfMaximum){
        double MaximumHeartRate = 206.3 - (0.711 * age);
        return (MaximumHeartRate - restingHeartRate) * (percentageOfMaximum) + restingHeartRate;
    }
    
}
