import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите путь до папки: ");
        Scanner input = new Scanner(System.in);
        String path = input.nextLine();

        FileUtils fileUtils = new FileUtils();

        System.out.println("Размер папки: " + path + " - " + FileUtils.readableFileSize(FileUtils.calculateFolderSize(path)));
    }
}
