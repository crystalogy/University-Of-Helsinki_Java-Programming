/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Crystal
 */
public class PaymentCard {
    private double initialBalance;
    
    
    public PaymentCard(double openingBalance){
        this.initialBalance = openingBalance;
    }
    
    public String toString(){
        return "The card has a balance of " + this.initialBalance + " euros";
    }
    
    public void eatAffordably() {
        if (this.initialBalance >= 2.60){
            this.initialBalance -= 2.60;
        }
    }

    public void eatHeartily() {      
        if (this.initialBalance >= 4.60){
            this.initialBalance -= 4.60;
        }
    }
    
    public void addMoney(double amount) {
 
        if (amount > 0) {
            this.initialBalance += amount;         
        }
        if (this.initialBalance >= 150){
//            System.out.println("Balance is at Max cant deposit requested amount");
//            Double change = openingBalance - 150;
            this.initialBalance = 150;
//            System.out.println("Here's your left over amount: " + change); 
        }
    }
}
