public class RandomAccessMemory {
    private final TypeOfRAM typeOfRAM;
    private final int RAMVolume;
    private final int RAMWeight;

    public RandomAccessMemory(TypeOfRAM typeOfRAM, int RAMVolume, int RAMWeight) {
        this.typeOfRAM = typeOfRAM;
        this.RAMVolume = RAMVolume;
        this.RAMWeight = RAMWeight;
    }

    public TypeOfRAM getTypeOfRAM() {
        return typeOfRAM;
    }

    public int getRAMVolume() {
        return RAMVolume;
    }

    public int getRAMWeight() {
        return RAMWeight;
    }

    public String toString() {
        return "Оперативная память: тип - " +
                typeOfRAM + ", объём оперативной памяти - " +
                RAMVolume + " Гб, вес - " +
                RAMWeight + " гр.";
    }
}
