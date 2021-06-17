import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static final String LIST = "LIST";
    private static PhoneBook phoneBook = new PhoneBook();

    public static void main(String[] args) {
        System.out.println("Введите номер, имя или команду: ");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            while (true) {
                String input = reader.readLine();
                if (input.equals("0")) {
                    break;
                }

                if (LIST.equals(input)) {
                    Set<String> allContacts = phoneBook.getAllContacts();
                    if (allContacts.size() == 0) {
                        System.out.println("Телефонная книга пуста!");
                    } else {
                        System.out.println(allContacts);
                        continue;
                    }
                }

                if (input.matches("([А-я-аЯЁ]+[а-яё]+)")) {
                    Set<String> phonesByName = phoneBook.getPhonesByName(input);
                    if (phonesByName.size() == 0) {
                        System.out.println("Такого имени в телефонной книге нет." +
                                "\nВведите номер телефона для абонента " + '"' + input + '"');
                        String inputNum = reader.readLine();
                        if (inputNum.matches("\\d+")) {
                            phoneBook.addContact(inputNum, input);
                            System.out.println("Контакт сохранен!");
                        } else {
                            System.out.println("Неверный формат ввода");
                            continue;
                        }
                    } else {
                        System.out.println(phonesByName);
                        continue;
                    }
                }

                if (input.matches("\\d+")) {
                    String nameByPhone = phoneBook.getNameByPhone(input);
                    if (nameByPhone.length() == 0) {
                        System.out.println("Такого номера нет в телефонной книге" +
                                "\n Введите имя абонента для номера " + '"' + input + '"');
                        String inputName = reader.readLine();
                        if (inputName.matches("[A-Яа-яёЁ]+")) {
                            phoneBook.addContact(input, inputName);
                            System.out.println("Контакт сохранен!");
                        } else {
                            System.out.println("Неверный формат ввода");
                            continue;
                        }
                    } else {
                        System.out.println(nameByPhone);
                        continue;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Что-то пошло не так!");
        }
    }
}
