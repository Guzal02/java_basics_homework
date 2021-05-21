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
            //При невалидном ФИО вывести в консоль: Введенная строка не является ФИО

            String lastName = "";
            String fistName = "";
            String surname = "";

            if (input.matches("([А-я-аЯЁ]+[а-яё]+\\s*){3}")) {
                int SpaceIndex = input.indexOf(' ');
                lastName = input.substring(0, SpaceIndex).trim();

                int lastSpaceIndex = input.lastIndexOf(' ');
                fistName = input.substring(SpaceIndex, lastSpaceIndex).trim();

                int lastIndex = input.length() - 1;
                surname = input.substring(lastSpaceIndex, lastIndex + 1).trim();

                System.out.println("Фамилия: " + lastName + "\nИмя: " + fistName + "\nОтчество: " + surname + "\n");
            } else {
                System.out.println("Введенная строка не является ФИО");
            }
        }
    }
}

/*
"([А-ЯЁ]+[а-яё]+\\s*){3}"*/
