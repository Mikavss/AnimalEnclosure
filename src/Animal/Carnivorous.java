package Animal;

import Food.*;


public abstract class Carnivorous extends Animal {

    @Override
    public void eat(Food food) throws Exception {
        try {
            if (food.id == 1) {
                System.out.println(name + " ест " + food.food);
            } else
                throw new Exception();
        } catch (Exception e) {
            System.err.println(name + " не может есть " + food.food);
        }
    }
}
