import java.util.Scanner;

public class Main {
    public static final String WRONG_EMAIL_ANSWER = "Неверный формат email";
    private static EmailList emailList = new EmailList();
    public static final String ADD = "ADD";
    public static final String LIST = "LIST";
    
    /* TODO:
        Пример вывода списка Email, после ввода команды LIST в консоль:
        test@test.com
        hello@mail.ru
        - каждый адрес с новой строки
        - список должен быть отсортирован по алфавиту
        - email в разных регистрах считается одинаковыми
           hello@skillbox.ru == HeLLO@SKILLbox.RU
        - вывод на печать должен быть в нижнем регистре
           hello@skillbox.ru
        Пример вывода сообщения об ошибке при неверном формате Email:
        "Неверный формат email"
    */

    public static void main(String[] args) {

        //TODO: write code here

        Scanner scanner = new Scanner(System.in);
        System.out.println("Спискок команд: \n LIST — ввыводит список электронных адресов;" +
                " \n ADD — проверяет и, если формат адреса верный, добавляет в множество;");
        System.out.println("Введите команду: ");

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            }
            String[] newLine = input.split("\\s");

            switch (newLine[0]) {
                case ADD:
                    emailList.add(getDeal(newLine, 1));
                    break;
                case LIST:
                    for (String email : emailList.getSortedEmails()) {
                        System.out.println(email);
                    }
                    break;
            }
        }
    }

    private static String getDeal(String[] newLine, int index) {
        StringBuilder deal = new StringBuilder();
        for (int i = index; i < newLine.length; i++) {
            deal.append(newLine[i]).append(" ");
        }
        return deal.toString().trim();
    }
}
