public class Main {
    public static void main(String[] args) {
        int sum = 100;
        int refill = 1100;
        //логика
        int bonus = refill > 1000 ? refill / 100 : 0;
        int total = sum + refill + bonus;
        System.out.println("Итоговый счет: " + total);
        System.out.println("Бонусные рубли: " + bonus);
    }
}
