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
      int spaceCounter = 0;
      boolean isTrue = false;

      if (input.length() != 0) {
        spaceCounter++;

        for(int i = 0; i < input.length(); i++) {
          if (input.charAt(i) == ' ') {
            spaceCounter ++;
          }
        }
      }

      for(int i = 0; i < input.length(); i++) {
        char chrs = input.charAt(i);
        if (Character.UnicodeBlock.of(chrs) == Character.UnicodeBlock.CYRILLIC && input.indexOf(' ') != -1 && !input.equals(input.toLowerCase()) && spaceCounter == 3) {
          isTrue = true;
          break;
        }
      }

      if (isTrue) {
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