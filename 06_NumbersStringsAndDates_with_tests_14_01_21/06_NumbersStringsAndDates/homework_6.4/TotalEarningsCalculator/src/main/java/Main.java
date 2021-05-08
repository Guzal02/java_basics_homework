public class Main {

    public static void main(String[] args) {

        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        //TODO: напишите ваш код, результат вывести в консоль

        int vasyaFirstIndex = text.indexOf("Вася заработал");
        int vasyaSecondIndex = text.indexOf("рублей");
        String vasyaSum = text.substring(vasyaFirstIndex + 14, vasyaSecondIndex).trim();

        int petyaFirstIndex = text.indexOf("Петя - ");
        int petyaSecondIndex = text.indexOf("рубля");
        String petyaSum = text.substring(petyaFirstIndex + 6, petyaSecondIndex).trim();


        int mashaFirstIndex = text.indexOf("Маша - ");
        int mashaSecondIndex = text.lastIndexOf("рублей");
        String mashaSum = text.substring(mashaFirstIndex + 6, mashaSecondIndex).trim();

        int sum = Integer.parseInt(vasyaSum)+Integer.parseInt(petyaSum) + Integer.parseInt(mashaSum);
        System.out.println(sum);

        // Нижеследующий код подсчитывает сумму для любой строки!

/*        int sum = 0;
        String sumString = "";

        for (int i = 0; i < text.length(); i++) {
            char chrs = text.charAt(i);

            if (chrs == ' ' && sumString.length() > 0) {
                sum += Integer.parseInt(sumString);
                sumString = "";
            }
            if (Character.isDigit(chrs)) {
                sumString += chrs;
            }
        }
        System.out.println(sum);*/
    }
}