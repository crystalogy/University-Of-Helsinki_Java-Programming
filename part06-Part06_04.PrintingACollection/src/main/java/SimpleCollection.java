
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append("The collection " + name);

        if (elements.isEmpty()) {
            output.append(" is empty.");
        } else if (elements.size() == 1) {
            output.append(" has " + 1 + " element:\n");
            for (String element : elements) {
                output.append(element);
            }
        } else {
            output.append(" has " + elements.size() + " elements:\n");
            for (String element : elements) {
                output.append(element + "\n");
            }
        }
        return output.toString();
    }
}