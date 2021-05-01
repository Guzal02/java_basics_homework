public class HardDisk {
    private final HardDiskType hardDiskType;
    private final int hardDiskMemory;
    private final int hardDiskWeight;

    public HardDisk(HardDiskType hardDiskType, int hardDiskMemory, int hardDiskWeight) {
        this.hardDiskType = hardDiskType;
        this.hardDiskMemory = hardDiskMemory;
        this.hardDiskWeight = hardDiskWeight;
    }

    public HardDiskType getHardDiskType() {
        return hardDiskType;
    }

    public int getHardDiskMemory() {
        return hardDiskMemory;
    }

    public int getHardDiskWeight() {
        return hardDiskWeight;
    }

    public String toString() {
        return "Жёсткий диск: тип - " +
                hardDiskType + ", объём памяти - " +
                hardDiskMemory + " Гб, вес - " +
                hardDiskWeight + " гр.";

    }
}