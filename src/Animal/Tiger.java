package Animal;

public class Tiger extends Carnivorous {
    public static int number = 1;

    public Tiger() {
        name = "Тигр под номером " + number;
        number++;
    }
}
