package Enclosure;

import Animal.Animal;
import Animal.Herbivorous;

public class EnclosureForHerbivorous extends Enclosure{
    public EnclosureForHerbivorous(int max) {
        super(max);
    }

    @Override
    public void addAnimal(Animal animal) {
        if (animal instanceof Herbivorous) {
            super.addAnimal(animal);
        }
        else{
            System.err.println("Травоядное животное не может быть в вольере для плотоядных");
        }
    }
}
