package Food;

public enum Food {
    MEAT ("Мясо", 1),
    GRASS ("Траву", 2),
    HAY ("Сено", 2),
    FISH ("Рыбу", 1),
    APPLE ("Яблоко", 2),
    CHICKEN ("Курицу", 1);

    public int id;
    public String food;

    Food(String food, int id) {
        this.food = food;
        this.id = id;
    }
}
