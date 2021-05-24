import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Распечатайте сгенерированный в классе TwoDimensionalArray.java двумерный массив
        char[][] dimens = TwoDimensionalArray.getTwoDimensionalArray(7);
        System.out.println(Arrays.deepToString(dimens));
    }
}
