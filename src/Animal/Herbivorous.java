package Animal;

import Food.*;

public abstract class Herbivorous extends Animal {

    @Override
    public void eat(Food food) throws Exception {
        try {
            if (food.id == 2) {
                System.out.println(name + " ест " + food.food);
            } else
                throw new Exception();
        } catch (Exception e) {
            System.err.println(name + " не может есть " + food.food);
        }
    }
}

