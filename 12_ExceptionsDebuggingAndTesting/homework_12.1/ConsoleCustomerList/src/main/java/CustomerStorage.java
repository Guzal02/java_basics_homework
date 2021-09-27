import java.util.HashMap;
import java.util.Map;

public class CustomerStorage {
    private final Map<String, Customer> storage;

    public CustomerStorage() {
        storage = new HashMap<>();
    }

    public void addCustomer(String data) {
        final int INDEX_NAME = 0;
        final int INDEX_SURNAME = 1;
        final int INDEX_EMAIL = 2;
        final int INDEX_PHONE = 3;
        final String EMAIL_REGEX = "^([a-z0-9_\\-\\.])+\\@([A-Za-z0-9_\\-\\.])+\\.([A-Za-z]{2,4})$";

        String[] components = data.split("\\s+");
        if (components.length != 4) {
            throw new IllegalArgumentException("Wrong format. Correct format: \n" +
                    "add Василий Петров vasily.petrov@gmail.com +79215637722");
        }
        String name = components[INDEX_NAME] + " " + components[INDEX_SURNAME];

        if (!components[INDEX_EMAIL].matches(EMAIL_REGEX)) {
            throw new IllegalArgumentException("Wrong format. Correct format: vasily.petrov@gmail.com");
        }
        if (!components[INDEX_PHONE].matches("\\+\\d+")) {
            throw new IllegalArgumentException("Wrong format. Correct format: +79215637722");
        }
        storage.put(name, new Customer(name, components[INDEX_PHONE], components[INDEX_EMAIL]));
        System.out.println("Добавлен новый клиент!");
    }

    public void listCustomers() {
            storage.values().forEach(System.out::println);
    }

    public void removeCustomer(String name) {
        storage.remove(name);
    }

    public Customer getCustomer(String name) {
        return storage.get(name);
    }

    public int getCount() {
        return storage.size();
    }
}