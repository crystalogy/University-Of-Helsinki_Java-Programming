
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Crystal
 */
public class Stack {

    private ArrayList<String> values;

    public Stack() {
        this.values = new ArrayList<>();
    }

    public boolean isEmpty() {
        if (values.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public void add(String value) {
        this.values.add(value);
    }

    public ArrayList<String> values() {

        return values;
    }

    public String take() {
        if (!values.isEmpty()) {
            return values.remove(values.size() - 1);
        } else {
            return null; // Or throw an exception
        }
    }
}
