public class Main {

    public static void main(String[] args) {
        System.out.println(splitTextIntoWords("Everyone could notice that people often complain and say that it was better before. It may be a little nostalgia;\n" +
                "the old people would like to return in the 50s.\n"));
    }

    public static String splitTextIntoWords(String text) {
        //TODO реализуйте метод
        StringBuilder newWords = new StringBuilder();
        String[] words = text.split("[^a-zA-Z’]+");
        if (words.length > 100) {
            for (int i = 0; i < words.length; i++) {
                newWords.append(words[i]).append("\n");
            }
        }
        return newWords.toString().trim();
    }
}