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

            if (stringNum.length() == 11) {
                if(stringNum.charAt(0) == '7'){
                    System.out.println(stringNum);
                } else if(stringNum.charAt(0) == '8'){
                    String value = stringNum.replaceFirst("8", "7");
                    System.out.println(value);
                } else {
                    System.out.println("Неверный формат номера");
                }
            } else if (stringNum.length() == 10 && (stringNum.charAt(0) != '7' || stringNum.charAt(0) != '8')) {
                String firstNum = "7" + stringNum;
                System.out.println(firstNum);
            } else {
                System.out.println("Неверный формат номера");
            }
        }
    }
}
