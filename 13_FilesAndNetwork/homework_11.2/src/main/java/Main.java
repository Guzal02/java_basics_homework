import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите путь до папки, которую необходимо копировать: ");
        Scanner input = new Scanner(System.in);
        String sourceDirectory = input.nextLine();

        FileUtils fileUtils = new FileUtils();

        System.out.println("Исходная папка " + sourceDirectory + "\n" + "Папка куда скопировали: ");
    }
}

