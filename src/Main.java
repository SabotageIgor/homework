public class Main {

    public static void main(String[] args) {
        int score = 100;
        int deposit = 1400;
        int bonus;

        if (deposit > 1000) {
            bonus = deposit / 100;
        }
        else  {
            bonus = 0;
        }

        int balance = score + deposit + bonus;
        System.out.println("Зравствуйте, спасибо за Ваш платеж. Ваш баланс: " + balance + " руб." +
                " Ваш бонус: " + bonus + " руб.");
    }
}

