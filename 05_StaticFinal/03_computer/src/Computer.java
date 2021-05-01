public class Computer {
    private final String vendor;
    private final String name;
    public Processor processor;
    public RandomAccessMemory randomAccessMemory;
    public HardDisk hardDisk;
    public MonitorScreen monitorScreen;
    public Keyboard keyboard;

    public Computer(String vendor, String name, Processor processor, RandomAccessMemory randomAccessMemory, HardDisk hardDisk, MonitorScreen monitorScreen, Keyboard keyboard) {
        this.vendor = vendor;
        this.name = name;
        this.processor = processor;
        this.randomAccessMemory = randomAccessMemory;
        this.hardDisk = hardDisk;
        this.monitorScreen = monitorScreen;
        this.keyboard = keyboard;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public RandomAccessMemory getRandomAccessMemory() {
        return randomAccessMemory;
    }

    public void setRandomAccessMemory(RandomAccessMemory randomAccessMemory) {
        this.randomAccessMemory = randomAccessMemory;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public MonitorScreen getMonitorScreen() {
        return monitorScreen;
    }

    public void setMonitorScreen(MonitorScreen monitorScreen) {
        this.monitorScreen = monitorScreen;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public String getVendor() {
        return vendor;
    }

    public String getName() {
        return name;
    }

    public int totalWeight() {
        return processor.getProcessorWeight() + randomAccessMemory.getRAMWeight() + hardDisk.getHardDiskWeight() + monitorScreen.getMonitorWeight() + keyboard.getKeyboardWeight();
    }

    public String toString() {
        return "\n" + "Ноутбук: " + vendor + " " + name + "\n" +
                processor + "\n" +
                randomAccessMemory + "\n" +
                hardDisk + "\n" +
                monitorScreen + "\n" +
                keyboard + "\n"
                + "Общий вес компьютера: " + totalWeight() + " гр.";
    }
}
