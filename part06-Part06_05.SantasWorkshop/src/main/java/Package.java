/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Crystal
 */

import java.util.ArrayList;

public class Package {
//    private String gifts;

    public Package(){
//        this.gifts = gifts;
    }
    
    private ArrayList<Gift> gifts = new ArrayList<>();
    
    public void addGift(Gift gift){
        gifts.add(gift);
    }
    

    
    public int totalWeight(){
        int weight = 0;
        
        for (Gift gift : gifts){
            weight += gift.getWeight();
        }
        return weight;
    }
}
