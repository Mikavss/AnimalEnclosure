package Animal;

public class Horse extends Herbivorous {
    public static int number = 1;

    public Horse() {
        name = "Лошадь под номером " + number;
        number++;
    }
}
