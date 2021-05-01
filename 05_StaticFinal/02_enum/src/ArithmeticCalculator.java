public class ArithmeticCalculator {
    public int a;
    public int b;

    public ArithmeticCalculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void calculate(Operation type) {

        switch (type) {
            case ADD:
                System.out.println("Результат сложения равен: " + (a + b));
                break;

            case SUBTRACT:
                System.out.println("Результат вычитания равен: " + (a - b));
                break;

            case MULTIPLY:
                System.out.println("Результат умножения равен: " + (a * b));
                break;
        }

   /*
        if (type == Operation.ADD) {
            System.out.println("ADD: " + (a + b));
        } else if (type == Operation.SUBTRACT) {
            System.out.println("SUBTRACT: " + (a - b));
        } else {
            int c = a - b;
            System.out.println("MULTIPLY: " + (a * b));
        }*/

    }
}
