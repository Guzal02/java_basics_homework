public class Book {
    private final String name;
    private final String author;
    private final int amountOfPages;
    private final int ISBNNumber;


    public Book(String name, String author, int amountOfPages, int ISBNNumber) {
        this.name = name;
        this.author = author;
        this.amountOfPages = amountOfPages;
        this.ISBNNumber = ISBNNumber;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getAmountOfPages() {
        return amountOfPages;
    }

    public int getISBNNumber() {
        return ISBNNumber;
    }
}



