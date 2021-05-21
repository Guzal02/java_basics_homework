import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            }
            //TODO:напишите ваш код тут, результат вывести в консоль.

            String stringNum = input.replaceAll("[^0-9]", "");

            if (stringNum.length() == 11 && (stringNum.matches("[78][0-9]+"))) {
                String value = stringNum.replaceFirst("8", "7");
                System.out.println(value);
            } else if (stringNum.length() == 10) {
                String firstNum = "7" + stringNum;
                System.out.println(firstNum);
            } else {
                System.out.println("Неверный формат номера");
            }
        }
    }
}
