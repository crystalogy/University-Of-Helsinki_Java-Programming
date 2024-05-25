
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents >= 100) {
            euros += cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public Money plus(Money addition) {
        int newEuros = this.euros + addition.euros;
        int newCents = this.cents + addition.cents;

        if (newCents >= 100) {
            newEuros += newCents / 100;
            newCents = newCents % 100;
        }
        return new Money(newEuros, newCents);
    }
    
    public boolean lessThan(Money compared){
        if(this.euros < compared.euros){
            return true;
        } else if (this.euros == compared.euros){
            return this.cents < compared.cents;
        } else {
        return false;
        }
    }
    
    public Money minus(Money decreaser){
       int totalCenter = (this.euros * 100) + this.cents;
       int decreaserTotalCenter = (decreaser.euros * 100) + decreaser.cents;
       int difference = totalCenter - decreaserTotalCenter;
       
       if (difference <= 0){
           return new Money(0,0);
       }
       
       int newEuros = difference / 100;
       int newCents = difference % 100;
       
       return new Money(newEuros, newCents);
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
