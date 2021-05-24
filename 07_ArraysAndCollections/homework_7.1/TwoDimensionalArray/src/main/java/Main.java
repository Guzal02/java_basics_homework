import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Распечатайте сгенерированный в классе TwoDimensionalArray.java двумерный массив
        char[][] dimens = TwoDimensionalArray.getTwoDimensionalArray(7);
        String string = Arrays.deepToString(dimens);
        String[] newString =  string.split("\\[,");
        for (String s: newString) {
            System.out.println(s);
        }
    }
}
