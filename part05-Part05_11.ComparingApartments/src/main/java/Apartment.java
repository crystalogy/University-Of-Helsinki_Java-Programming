
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public int pricePerSquare(int price){
    return price * this.squares;
    }
    

    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
        } else {
            return false;
        }
    }

    public int priceDifference(Apartment compared) {
        int price, comparedPrice;
        price = this.pricePerSquare * this.squares;
        comparedPrice = compared.pricePerSquare * compared.squares;
        if (price > comparedPrice){
            return price - comparedPrice;
        } else {
            return comparedPrice - price;
        }
    }
    
    
    public boolean moreExpensiveThan(Apartment compared){
        int currentApt = this.squares * compared.pricePerSquare;
        int comparedApt = compared.squares * compared.pricePerSquare;
        
        if (currentApt > comparedApt){
            return true;
        } else {
            return false;
        }
    }

}
