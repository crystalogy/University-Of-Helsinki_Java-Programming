/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Crystal
 */
public class Gauge {
    private int value;
    
    public Gauge(){
        this.value = value;
    }  
    public void increase(){
        if (value < 5){
            value += 1;
        } 
    }   
    public void decrease(){
        if (value > 0){
            value -= 1;
        }
    }  
    public int value(){
        return this.value;
    }   
    public boolean full(){
        if (value == 5){
            return true;
        } else {
            return false;
        }
    }
}
