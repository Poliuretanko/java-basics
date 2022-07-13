import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {

        gameLogic();
        System.out.println("Хотите попробовать ещё раз? (yes/no)");
        Scanner input = new Scanner(System.in);

        while (input.nextLine().equals("yes")) {
            gameLogic();
            System.out.println("Хотите попробовать ещё раз? (yes/no)");
        }

        System.out.println("Программа завершена");

    }

    public static void gameLogic() {

        int unknownNumber, userNumber = 0;
        int trysCount = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("ЗАДАЧА: Угадать число (от 0 до 100).");
        unknownNumber = (int) Math.floor(Math.random() * 100);

        System.out.print("Введите ваше число: ");
        userNumber = input.nextInt();

        for (int counter = 10; counter > 0 && userNumber != unknownNumber; --counter) {
            ++trysCount;

            if (userNumber > unknownNumber) {
                System.out.println("Моё число меньше. Осталось попыток " + counter);
                userNumber = input.nextInt();

            } else if (userNumber < unknownNumber) {
                System.out.println("Моё число больше. Осталось попыток " + counter);
                userNumber = input.nextInt();
            }
        }

        if (userNumber == unknownNumber) {
            System.out.println("Вы угадали! Количество потраченных попыток - " + trysCount);

        } else {
            System.out.println("Вы проиграли. Повезет в другой раз");
        }

    }
}
