
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
public class Room {

    private ArrayList<Person> persons;

    public Room() {
        this.persons = new ArrayList<>();
    }

    public void add(Person person) {
        this.persons.add(person);
    }

    public boolean isEmpty() {
        if (persons.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<Person> getPersons() {
        return this.persons;
    }

    public Person shortest() {

        if (persons.isEmpty()) {
            return null;
        }

        Person shortest = persons.get(0);

        for (Person person : persons) {
            if (person.getHeight() < shortest.getHeight()) {
                shortest = person;
            }
        }
        return shortest;
    }

    public Person take(){
        if (persons.isEmpty()) {
            return null;
        }
        
        Person takePerson = this.shortest();
        persons.remove(takePerson);
        return takePerson;
        
    }

}
