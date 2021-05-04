import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String boxes = scanner.nextLine();

        double numBoxes = Double.parseDouble(boxes);

        // TODO: вывести в консоль коробки разложенные по грузовикам и контейнерам
        // пример вывода при вводе 2
        // для отступа используйте табуляцию - \t

        /*
        Грузовик: 1
            Контейнер: 1
                Ящик: 1
                Ящик: 2
        Необходимо:
        грузовиков - 1 шт.
        контейнеров - 1 шт.
        */
        final int MAX_CONTAINERS = 12;
        final int MAX_BOXES = 27;
        int box = 0;
        int truck = 0;
        int container = 0;
        double ceil = Math.ceil(numBoxes / (MAX_BOXES * MAX_CONTAINERS));
        int trucks = (int) ceil;
        int containers = (int) Math.ceil(numBoxes / MAX_BOXES);

        for (int i = truck; i < trucks; i++) {
            truck += 1;
            if (truck == 1) {
                System.out.println("Грузовик: " + truck);
            }
            for (int j = container; j < containers; j++) {
                container += 1;
                if (container == 1) {
                    System.out.println("\tКонтейнер: " + container);
                }
                for (int k = box; k < numBoxes; k++) {
                    box += 1;
                    if (box > (MAX_BOXES * (MAX_CONTAINERS * truck))) {
                        truck += 1;
                        System.out.println("Грузовик: " + truck);
                    }
                    if (box > (MAX_BOXES * container)) {
                        container += 1;
                        System.out.println("\tКонтейнер: " + container);
                    }
                    System.out.println("\t\tЯщик: " + box);
                }
            }
        }
        System.out.println("Необходимо:" + System.lineSeparator() +
                            "грузовиков - " + trucks + " шт." +
                            System.lineSeparator() + "контейнеров - " + containers + " шт.");
    }
}