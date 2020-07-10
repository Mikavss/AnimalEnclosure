package Animal;

public class Bear extends Carnivorous {
    public static int number = 1;

    public Bear() {
        name = "Медведь под номером " + number;
        number++;
    }
}
