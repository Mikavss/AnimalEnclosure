package Animal;

public class Lynx extends Carnivorous {
    public static int number = 1;

    public Lynx() {
        name = "Рысь под номром " + number;
        number++;
    }
}
