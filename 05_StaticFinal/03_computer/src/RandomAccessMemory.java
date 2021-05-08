public class RandomAccessMemory {
    private final TypeOfRAM typeOfRAM;
    private final int ramVolume;
    private final int ramWeight;

    public RandomAccessMemory(TypeOfRAM typeOfRAM, int ramVolume, int ramWeight) {
        this.typeOfRAM = typeOfRAM;
        this.ramVolume = ramVolume;
        this.ramWeight = ramWeight;
    }

    public TypeOfRAM getTypeOfRAM() {
        return typeOfRAM;
    }

    public int getRamVolume() {
        return ramVolume;
    }

    public int getRamWeight() {
        return ramWeight;
    }

    public String toString() {
        return "Оперативная память: тип - " +
                typeOfRAM + ", объём оперативной памяти - " +
                ramVolume + " Гб, вес - " +
                ramWeight + " гр.";
    }
}
