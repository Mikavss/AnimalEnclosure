package Animal;

public class Duck extends Herbivorous {
    public static int number = 1;

    public Duck() {
        name = "Утка под номером " + number;
        number++;
    }
}
