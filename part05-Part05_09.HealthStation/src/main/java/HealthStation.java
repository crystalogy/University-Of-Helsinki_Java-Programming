
public class HealthStation {
    private int weighings;


    public int weigh(Person person) {
        weighings++;
        return person.getWeight();
    }
    
    public void feed(Person person){
        int weight = person.getWeight();
        weight++;
        person.setWeight(weight);
    }
    
    public int weighings(){
        return weighings;
    }

}
