public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        String englishAlphabet = "abcdifghijklmnopqrstvwxyz";
        int letterIndex = 0;

        for (int i = letterIndex; i < englishAlphabet.length(); ++i) {
            char symbol = englishAlphabet.charAt(letterIndex);
            ++letterIndex;
            System.out.println(symbol + " " + symbol);
        }

    }
}
