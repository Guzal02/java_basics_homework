public class Main {
    public static void main(String[] args) {
        System.out.println(searchAndReplaceDiamonds("Номер кредитной карты <4008 1234 5678> 8912", "***"));
    }

    public static String searchAndReplaceDiamonds(String text, String placeholder) {
        int openingAngleBracketIndex = 0;
        int closingAngleBracketIndex = 0;
        String safe = "";

        for (int i = 0; i < text.length(); ++i) {
            char chrs = text.charAt(i);
            if (chrs == '<') {
                openingAngleBracketIndex = text.indexOf(chrs);
            }

            if (chrs == '>') {
                closingAngleBracketIndex = text.indexOf(chrs);
            }

            if (closingAngleBracketIndex > 0) {
                safe = text.substring(openingAngleBracketIndex, closingAngleBracketIndex + 1);
                text = text.replace(safe, placeholder);
                openingAngleBracketIndex = 0;
                closingAngleBracketIndex = 0;
            }
        }
        return text;
    }
}