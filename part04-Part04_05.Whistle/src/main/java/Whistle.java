/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Crystal
 */
public class Whistle {
    
    private String sound; // created variable 
    
    public Whistle(String whistleSound){ // created the constructor
        this.sound = whistleSound; // passing one parameter
    }
    
    public void sound(){ // created the method sound that prints the whistle's sound.
        System.out.println(sound);
        
    }
    
}
