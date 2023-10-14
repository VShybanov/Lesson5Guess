import java.util.Random;
import java.util.Scanner;

public class Lesson5Guess {
    static final int NUMBER_RANGE = 10;

    public static void main(String[] args) {
        Random rnd = new Random();
        int num = rnd.nextInt(NUMBER_RANGE+1);
        boolean isGuess = false;
        int guessNum;
        System.out.println("Загадано число від 0 до 10.");
        System.out.println("Є 3 спроби щоб вгадати.");
        Scanner scan = new Scanner(System.in);
        for (int i = 1; i < 4; i++) {
            System.out.println("Спроба № " + i);
            System.out.print("Введіть число: ");
            try {
                guessNum = scan.nextInt();
            } catch (Exception e) {
                System.out.println("Помилка. Це не число.");
                scan = new Scanner(System.in);
                continue;
            }
            if (guessNum == num) {
                System.out.println("Вірно!");
                isGuess = true;
                break;
            } else {
                System.out.println("Невірно.");
            }
        }
        if (!isGuess)
            System.out.println("Загадане число "+num);
        System.out.println("Кінець гри.");
    }
}
