public class Arithmetic {
    private int num1;
    private int num2;

    public Arithmetic(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int sumOfNumbers() {
        return num1 + num2;
    }

    public int differenceOfNumbers() {
        return num1 - num2;
    }

    public int productsOfNumbers() {
        return num1 * num2;
    }

    public double averageValueOfNumbers() {
        return (num1 + num2) / 2.0;
    }

    public int maxOfNumbers() {
        return num1 > num2 ? num1 : num2;
    }

    public int minOfNumbers() {
        if (num1 < num2) {
            return num1;
        }
        return num2;
    }

    public static void main(String[] args) {
        Arithmetic newArithmetic = new Arithmetic(5, 6);
        System.out.println(newArithmetic.sumOfNumbers());
        System.out.println(newArithmetic.differenceOfNumbers());
        System.out.println(newArithmetic.productsOfNumbers());
        System.out.println(newArithmetic.averageValueOfNumbers());
        System.out.println(newArithmetic.maxOfNumbers());
        System.out.println(newArithmetic.minOfNumbers());
    }
}

