/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Crystal
 */
public class Archive {

    private String id;
    private String name;

    public Archive(String id, String name) {
        this.name = name;
        this.id = id;
    }

    public Archive(String id) {
        this.id = id;
    }

    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Archive)) {
            return false;
        }

        Archive comparedItem = (Archive) compared;
        
        return this.id.equals(comparedItem.id);
    }

    public String toString() {
        return this.id + ": " + this.name;
    }
}
