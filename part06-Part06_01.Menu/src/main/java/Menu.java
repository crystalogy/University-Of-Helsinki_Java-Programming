
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    public void addMeal(String meal){
        if (meals.contains(meal) ){
            System.out.println("This meal is already on the menu");
        } else {
        this.meals.add(meal);
        }
    }
    
    public void printMeals(){
        for (String meal: this.meals){
            System.out.println(meal);
        }
    }
    
    public void clearMenu(){
        for (int i = meals.size() -1; i >= 0; i--){
        this.meals.remove(i);
        }
    }
}
