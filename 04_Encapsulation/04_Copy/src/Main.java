public class Main {
    public static void main(String[] args) {

        Dimensions h2 = new Dimensions(2, 5, 5);
        System.out.println(h2);
        CargoInfo info = new CargoInfo(h2, 56, "Ленина 56"  );
        System.out.println(info);
    }
}
