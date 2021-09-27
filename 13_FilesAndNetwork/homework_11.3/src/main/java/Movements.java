import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Movements {
    private List<Movement> movements;

    public Movements(String pathMovementsCsv) {
        this.movements = loadDataFromFile(pathMovementsCsv);
    }

    public double getExpenseSum() {
        return movements.stream()
                .map(Movement::getExpense)
                .reduce(Double::sum)
                .orElse(0.0);
    }

    public double getIncomeSum() {
        return movements.stream()
                .map(Movement::getIncome)
                .reduce(Double::sum)
                .orElse(0.0);
    }

    private List<Movement> loadDataFromFile(String path) {
        List<Movement> movements = new ArrayList<>();
        try {
            List<String> fileLines = Files.readAllLines(Paths.get(path));
            fileLines.remove(0);

            for (String fileLine : fileLines) {
                fileLine = fileLine.replaceAll("(\"\\d*),(\\d*\")", "$1.$2").replace("\"", "");
                String[] splitedText = fileLine.split(",");
                movements.add(new Movement(
                        Double.parseDouble(splitedText[7]),
                        Double.parseDouble(splitedText[6]),
                        splitedText[5]
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return movements;
    }

}
