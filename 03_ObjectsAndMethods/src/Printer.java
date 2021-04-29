public class Printer {

    private static int count = 0;
    String queue = "";
    int totalPagesQueued;
    int totalDocumentsQueued;
    int totalPageInAllTime;
    int totalDocumentsInAllTime;

    public void append(String text) {
        append(text, "Name", 1);
    }
    public void append(String text, String name) {
        append(text, name, 1);
    }
    public void append(String text, String name, int pageCount) {
        queue = queue + "\n" + text + " - " + name + " - " + pageCount + " стр.";
        totalPagesQueued += pageCount;
        totalDocumentsQueued += 1;
    }

    public void clear() {
        queue = "";
        totalPagesQueued = 0;
        totalDocumentsQueued = 0;
    }

    public int getTotalPagesQueued() {
        return totalPagesQueued;
    }
    public int getTotalDocumentsQueued() {
        return totalDocumentsQueued;
    }

    public int getTotalPageInAllTime() {
        return totalPageInAllTime;
    }
    public int getTotalDocumentsInAllTime() {
        return totalDocumentsInAllTime;
    }

    public void print(String title) {
        System.out.println(title);
        if (queue.isEmpty()) {
            System.out.println("В принтере документов нет");
        } else {
            System.out.println(queue);
            totalPageInAllTime += totalPagesQueued;
            totalDocumentsInAllTime += totalDocumentsQueued;
            clear();
        }

    }
}
