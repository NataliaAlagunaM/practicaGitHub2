/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bird;

/**
 *
 * @author Janus
 */
public class Bird {

    // Attributes of the Bird class
    private String name;
    private String species;
    private int age;
    private boolean canFly; // Indicates if the bird can fly or not

    // Constructor for the Bird class
    public Bird(String name, String species, int age, boolean canFly) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.canFly = canFly;
    }

    // Getter and setter methods for the attributes
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean canFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

}
