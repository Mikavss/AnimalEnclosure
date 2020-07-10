package Enclosure;

import Animal.Animal;

import java.util.ArrayList;

public class Enclosure {
    int max;

    ArrayList<Animal> enclosure = new ArrayList<>();

    public Enclosure(int max) {
        this.max = max;
    }

    public void addAnimal(Animal animal) {
        if (enclosure.size() < max) {
            enclosure.add(0, animal);
            System.out.println(animal.name + " теперь находится в вольере");
        } else {
            System.err.println("Нет мест");
        }
    }
    public ArrayList<Animal> getAnimals() {
        return enclosure;
    }
}
