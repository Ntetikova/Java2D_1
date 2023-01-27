public class Main {
    public static void main(String[] args) {

        int cost = 10_000; //стоимость билета
        int bonus = 20; //количество рублей для 1 бонусной мили
        int BonusMiles = cost / bonus;
        System.out.println(BonusMiles);

    }
}