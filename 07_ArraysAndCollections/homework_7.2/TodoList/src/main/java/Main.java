import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static final String ADD = "ADD";
    public static final String LIST = "LIST";
    public static final String EDIT = "EDIT";
    public static final String DELETE = "DELETE";

    private static TodoList todoList = new TodoList();

    public static void main(String[] args) {
        // TODO: написать консольное приложение для работы со списком дел todoList

        System.out.println("Спискок команд: \n LIST — выводит дела с их порядковыми номерами;" +
                " \n ADD — добавляет дело;" +
                " \n EDIT — заменяет дело с указанным номером;" +
                " \n DELETE — удаляет дело.");
        System.out.println("Выберите команду: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            while (true) {
                String line = reader.readLine();
                if (line == null || line.trim().length() == 0) {
                    System.out.println("Введите команду и название дела!");
                    break;
                }
                String[] newLine = line.split("\\s");

                switch (newLine[0]) {
                    case ADD:
                        if (newLine[1].matches("\\d")) {
                            int index = Integer.parseInt(newLine[1]);
                            todoList.add(index, getDeal(newLine, 2));
                        } else {
                            todoList.add(getDeal(newLine, 1));
                        }
                        break;
                    case EDIT:
                        if (newLine[1].matches("\\d")) {
                            int index = Integer.parseInt(newLine[1]);
                            todoList.edit(getDeal(newLine, 2), index);
                        } else {
                            System.out.println("Введите номер дела!");
                        }
                        break;
                    case DELETE:
                        if (newLine[1].matches("\\d")) {
                            int index = Integer.parseInt(newLine[1]);
                            todoList.delete(index);
                        } else {
                            System.out.println("Введите номер дела!");
                        }
                        break;
                    case LIST:
                        for (int i = 0; i < todoList.getTodos().size(); i++) {
                            System.out.println(i + " - " + todoList.getTodos().get(i));
                        }
                }
            }
        } catch (IOException e) {
            System.out.println("Что-то пошло не так!");
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