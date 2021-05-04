public class GeometryCalculator {
    // метод должен использовать абсолютное значение radius
    public static double getCircleSquare(double radius) {
        return Math.PI * Math.abs(Math.pow(radius, 2.0));
    }

    // метод должен использовать абсолютное значение radius
    public static double getSphereVolume(double radius) {
        return (4.0 / 3.0) * Math.PI * Math.abs(Math.pow(radius, 3.0));
    }

    public static boolean isTrianglePossible(double a, double b, double c) {
        return a + c > b & b + c > a & a + b > c;
    }

    // перед расчетом площади рекомендуется проверить возможен ли такой треугольник
    // методом isTrianglePossible, если невозможен вернуть -1.0
    public static double getTriangleSquare(double a, double b, double c) {
        if (!isTrianglePossible(a, b, c)) {
            return -1;
        } else {
            double p = (a + b + c) / 2.0;
            double s = p * (p - a) * (p - b) * (p - c);
            return Math.sqrt(s);
        }
    }
}
