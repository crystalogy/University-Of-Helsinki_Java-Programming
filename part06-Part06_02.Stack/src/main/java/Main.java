
public class Main {

    public static void main(String[] args) {

        Stack stack1 = new Stack();
        System.out.println(stack1.isEmpty());
        System.out.println(stack1.values());
        stack1.add("Value");
        System.out.println(stack1.isEmpty());
        System.out.println(stack1.values());

        Stack stack2 = new Stack();
        stack2.add("1");
        stack2.add("2");
        stack2.add("3");
        stack2.add("4");
        stack2.add("5");

        while (!stack2.isEmpty()) {
            System.out.println(stack2.take());
        }
    }
}
