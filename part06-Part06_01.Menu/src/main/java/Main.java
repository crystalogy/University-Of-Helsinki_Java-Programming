
public class Main {

    public static void main(String[] args) {
//        Menu exactum = new Menu();
//
//        exactum.addMeal("Smoked salmon, white wine and butter sauce with basil");
//        exactum.addMeal("Seasonal green salad with apple-honey vinegarette");
//        exactum.addMeal("Roasted lamb in a red wine sauce");
//
//        exactum.printMeals();
//
//        exactum.clearMenu();
//        exactum.printMeals();

        Menu menu = new Menu();
        menu.addMeal("Tofu ratatouille");
        menu.addMeal("Chilli Coconut Chicken");
        menu.addMeal("Chilli Coconut Chicken");
        menu.addMeal("Meatballs with mustard sauce");

        menu.printMeals();
        menu.clearMenu();

        System.out.println();
        menu.addMeal("Tomato and mozzarella salad");
        menu.printMeals();
    }
}
