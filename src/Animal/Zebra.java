package Animal;

public class Zebra extends Herbivorous {
    public static int number = 1;

    public Zebra() {
        name = "Зебра под номером " + number;
        number++;
    }

}
