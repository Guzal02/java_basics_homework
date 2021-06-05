import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class EmailList {
    TreeSet<String> treeSet = new TreeSet<>();
    String EMAIL_REGEX = "^([a-z0-9_\\-\\.])+\\@([A-Za-z0-9_\\-\\.])+\\.([A-Za-z]{2,4})$";
    public void add(String email) {
        // TODO: валидный формат email добавляется
        if(email.matches(EMAIL_REGEX)) {
            treeSet.add(email);
        } else {
            System.out.println("Введите корректный email!");
        }
    }

    public List<String> getSortedEmails() {
        // TODO: возвращается список электронных адресов в алфавитном порядке
        return new ArrayList<>(treeSet);
    }

}
