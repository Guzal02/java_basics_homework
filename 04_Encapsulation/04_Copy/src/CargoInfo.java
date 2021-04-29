public class CargoInfo {
    private final Dimensions dimensions;
    private final int weight;
    private final String deliveryAddress;
    private final Boolean isItPossibleToFlip;
    private final String registrationAddress;
    private final Boolean isTheCargoFragile;

    public CargoInfo(Dimensions dimensions, int weight, String deliveryAddress) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.deliveryAddress = deliveryAddress;
        isItPossibleToFlip = false;
        this.registrationAddress = "N/A";
        this.isTheCargoFragile = true;
    }
    public CargoInfo(Dimensions dimensions, int weight, String deliveryAddress, Boolean isItPossibleToFlip, String registrationAddress, Boolean isTheCargoFragile) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.deliveryAddress = deliveryAddress;
        this.isItPossibleToFlip = isItPossibleToFlip;
        this.registrationAddress = registrationAddress;
        this.isTheCargoFragile = isTheCargoFragile;
    }


    public CargoInfo setWeight(int weight) {
        return new CargoInfo(dimensions, weight, deliveryAddress, isItPossibleToFlip, registrationAddress, isTheCargoFragile);
    }
    public CargoInfo setDeliveryAddress(String deliveryAddress) {
        return new CargoInfo(dimensions, weight, deliveryAddress, isItPossibleToFlip, registrationAddress, isTheCargoFragile);
    }
    public CargoInfo setDimensions(Dimensions dimensions) {
        return new CargoInfo(dimensions, weight, deliveryAddress, isItPossibleToFlip, registrationAddress, isTheCargoFragile);
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public int getWeight() {
        return weight;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public Boolean getItPossibleToFlip() {
        return isItPossibleToFlip;
    }

    public String getRegistrationAddress() {
        return registrationAddress;
    }

    public Boolean getTheCargoFragile() {
        return isTheCargoFragile;
    }

    public String toString() {
        return   dimensions + "\n" +
                "Масса груза: " + weight + "кг" + "\n" +
                "Адрес доставки: " + deliveryAddress + "\n";
    }
}
