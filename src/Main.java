
public class Main {
    public static void main(String[] args) {

        int balance = 200;
        int limit = 1000;
        int admission = 2000;
        int unit = 100;

        int bonus = balance + admission / unit;
        int total = balance + admission + bonus;

        if (admission < 1000){
            bonus = 0;
        }

        System.out.println("Бонус:" + bonus);
        System.out.println("Итоговый счёт:" + total);





    }
}