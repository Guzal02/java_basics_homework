import java.util.*;

public class CoolNumbers {

    public static List<String> generateCoolNumbers() {
        final String LETTERS = "АВЕКМНОРСТУХ";
        final String NUMBERS = "0123456789";
        int[] carPlateNumbers = new int[2000000];
        Random random = new Random();
        List<String> randomCarPlateNumbers = new ArrayList<>();
        StringBuilder randomLettersNumbers = new StringBuilder();

        List<String> regions = new ArrayList<>();
        for (int i = 1; i < 200; i++) {
            regions.add(i < 10 ? "0" + i : "" + i);
        }

        for (int i = 0; i < carPlateNumbers.length; i++) {

            for (int j = 0; j < 3; j++) {
                char number = NUMBERS.charAt(random.nextInt(NUMBERS.length()));
                randomLettersNumbers.append(number);
            }

            for (int k = 0; k < 2; k++) {
                char letter = LETTERS.charAt(random.nextInt(LETTERS.length()));
                randomLettersNumbers.append(letter);
            }

            randomCarPlateNumbers.add(LETTERS.charAt(random.nextInt(LETTERS.length())) + randomLettersNumbers.toString() + regions.get(random.nextInt(regions.size())));
            randomLettersNumbers.setLength(0);
        }
        return randomCarPlateNumbers;
    }

    public static boolean bruteForceSearchInList(List<String> list, String number) {
        for (String item : list) {
            if (item.equals(number)) {
                return true;
            }
        }
        return false;
    }

    public static boolean binarySearchInList(List<String> sortedList, String number) {
        int index = Collections.binarySearch(sortedList, number);
        return index >= 0;
    }


    public static boolean searchInHashSet(HashSet<String> hashSet, String number) {
        return hashSet.contains(number);
    }

    public static boolean searchInTreeSet(TreeSet<String> treeSet, String number) {
        return treeSet.contains(number);
    }
}
