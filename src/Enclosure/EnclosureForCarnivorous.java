package Enclosure;

import Animal.Animal;
import Animal.Carnivorous;

public class EnclosureForCarnivorous extends Enclosure {
    public EnclosureForCarnivorous(int max) {
        super(max);
    }

    @Override
    public void addAnimal(Animal animal) {
        if (animal instanceof Carnivorous) {
            super.addAnimal(animal);
        } else {
            System.err.println("Плотоядное животное не может быть в вольере для травоядных!");
        }
    }
}

