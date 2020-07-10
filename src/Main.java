import Animal.*;
import Enclosure.*;
import Food.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Main {
    private final List<Enclosure> enclosures = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        Enclosure enclosure1 = new EnclosureForCarnivorous(4);
        Enclosure enclosure2 = new EnclosureForCarnivorous(5);
        Enclosure enclosure3 = new EnclosureForHerbivorous(5);
        Enclosure enclosure4 = new EnclosureForHerbivorous(4);
        Main animals = new Main();

        Date date = new Date();
        System.out.println("Добро пожаловать в зоопарк, дата и время посещения: " + date.toLocaleString() + "\n");
        Thread.sleep(2000);

        /*
         * Заполняем вольеры
         */

        System.out.println("Первый вольер для плотоядных");
        for (int i = 0; i < 4; i++) {

            switch ((int) (Math.random() * 3 + 1)) {
                case 1:
                    enclosure1.addAnimal(new Bear());
                    break;
                case 2:
                    enclosure1.addAnimal(new Tiger());
                    break;
                case 3:
                    enclosure1.addAnimal(new Lynx());
                    break;
                default:
                    System.out.println("Что-то пошло не так");
            }
        }
        animals.addEnclosure(enclosure1);

        System.out.println("--------------------------------");
        System.out.println("Второй вольер для плотоядных");
        for (int i = 0; i < 5; i++) {

            switch ((int) (Math.random() * 3 + 1)) {
                case 1:
                    enclosure2.addAnimal(new Bear());
                    break;
                case 2:
                    enclosure2.addAnimal(new Tiger());
                    break;
                case 3:
                    enclosure2.addAnimal(new Lynx());
                    break;
                default:
                    System.out.println("Что-то пошло не так");
            }

        }
        animals.addEnclosure(enclosure2);
        System.out.println("--------------------------------");
        System.out.println("Третий вольер для травоядных");
        for (int i = 0; i < 5; i++) {

            switch ((int) (Math.random() * 3 + 1)) {
                case 1:
                    enclosure3.addAnimal(new Duck());
                    break;
                case 2:
                    enclosure3.addAnimal(new Horse());
                    break;
                case 3:
                    enclosure3.addAnimal(new Zebra());
                    break;
                default:
                    System.out.println("Что-то пошло не так");
            }

        }
        animals.addEnclosure(enclosure3);

        System.out.println("--------------------------------");
        System.out.println("Четвёртый вольер для травоядных");
        for (int i = 0; i < 4; i++) {

            switch ((int) (Math.random() * 3 + 1)) {
                case 1:
                    enclosure4.addAnimal(new Duck());
                    break;
                case 2:
                    enclosure4.addAnimal(new Horse());
                    break;
                case 3:
                    enclosure4.addAnimal(new Zebra());
                    break;
                default:
                    System.out.println("Что-то пошло не так");
            }

        }
        animals.addEnclosure(enclosure4);

        System.out.println("--------------------------------");
        System.out.println("Кормим животных:");

        for (Enclosure enclosure : animals.getEnclosures()) {
            for (Animal animal : enclosure.getAnimals()) {

                switch ((int) (Math.random() * 6 + 1)) {
                    case 1:
                        animal.eat(Food.FISH);
                        break;
                    case 2:
                        animal.eat(Food.GRASS);
                        break;
                    case 3:
                        animal.eat(Food.HAY);
                        break;
                    case 4:
                        animal.eat(Food.MEAT);
                        break;
                    case 5:
                        animal.eat(Food.CHICKEN);
                        break;
                    case 6:
                        animal.eat(Food.APPLE);
                        break;
                    default:
                        System.out.println("Нет такой еды");
                }
            }

        }

    }

    List<Enclosure> getEnclosures() {
        return enclosures;
    }

    void addEnclosure(Enclosure enclosure) {
        enclosures.add(enclosure);
    }
}
