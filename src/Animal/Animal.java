package Animal;

import Food.Food;

public abstract class Animal {
    public String name;

    public void animal(String name) {
        this.name = name;
    }

    public abstract void eat(Food food) throws Exception;

}
