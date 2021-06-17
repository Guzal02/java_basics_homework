import java.util.*;

public class Main {
    /*
    TODO:
     - реализовать методы класса CoolNumbers
     - посчитать время поиска введимого номера в консоль в каждой из структуры данных
     - проанализоровать полученные данные
     */

    public static void main(String[] args) {
        List<String> strings = CoolNumbers.generateCoolNumbers();
        /*Поиск перебором: номер найден/не найден, поиск занял 34нс*/
        String number = "А999МО05";
        long startTime1 = System.nanoTime();
        boolean b = CoolNumbers.bruteForceSearchInList(strings, number);
        long endTime1 = System.nanoTime();
        System.out.println("Поиск перебором: " + (b ? "номер найден, " : "не найден, " + "поиск занял - ") + (String.format("%.10f", (endTime1 - startTime1) * 0.000000001)) + " сек");

        Collections.sort(strings);
        long startTime2 = System.nanoTime();
        boolean b1 = CoolNumbers.binarySearchInList(strings, number);
        long endTime2 = System.nanoTime();
        System.out.println("Бинарный поиск: " + (b1 ? "номер найден, " : "не найден, " + "поиск занял - ") + (String.format("%.10f", (endTime2 - startTime2) * 0.000000001)) + " сек");

        Collections.shuffle(strings);
        HashSet<String> stringsSet = new HashSet<>(strings);
        long startTime3 = System.nanoTime();
        boolean b2 = CoolNumbers.searchInHashSet(stringsSet, number);
        long endTime3 = System.nanoTime();
        System.out.println("Поиск в HashSet: " + (b2 ? "номер найден, " : "не найден, " + "поиск занял - ") + (String.format("%.10f", (endTime3 - startTime3) * 0.000000001)) + " сек");

        TreeSet<String> stringsTreeSet = new TreeSet<>(strings);
        long startTime4 = System.nanoTime();
        boolean b3 = CoolNumbers.searchInTreeSet(stringsTreeSet, number);
        long endTime4 = System.nanoTime();
        System.out.println("Поиск в TreeSet: " + (b3 ? "номер найден, " : "не найден, " + "поиск занял - ") + (String.format("%.10f", (endTime4 - startTime4) * 0.000000001)) + " сек");
    }
/*   --------------------------------------------------------------------
    Вывод:
    Cамый быстрый - Поиск в HashSet!, а самый медленный -Поиск перебором!
 */
}
