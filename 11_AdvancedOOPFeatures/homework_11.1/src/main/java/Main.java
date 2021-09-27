import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static final String STAFF_TXT = "data/staff.txt";

    public static void main(String[] args) {
        List<Employee> staff = Employee.loadStaffFromFile(STAFF_TXT);
       sortBySalaryAndAlphabet(staff);
//        for(Employee employee : staff) {
//            System.out.println(employee);
//        }
        /// staff.forEach(employee -> System.out.println(employee));
        staff.forEach(System.out::println);

        /// Сортировка при помощи интерфейса Stream!
        System.out.println("------------------------------");
        Stream<Employee> stream = staff.stream();
        stream.filter(employee -> employee.getSalary() > 100000).forEach(System.out::println);
        // Короткий вариант
        //  staff.stream().filter(e -> e.getSalary() > 100000).forEach(System.out::println);
    }

    public static void sortBySalaryAndAlphabet(List<Employee> staff) {
        //TODO Метод должен отсортировать сотрудников по заработной плате и алфавиту.
        Collections.sort(staff, (o1, o2) -> {
            int i = o1.getSalary().compareTo(o2.getSalary());
            if (i == 0) {
                return o1.getName().compareTo(o2.getName());
            }
            return i;
        });
        // staff.sort(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName));  - короткий метод!

    }
}