public class Main {
    public static void main(String[] args) {
        Processor processor = new Processor(1.1, 4, ProcessorManufacturer.INTEL, 665);
        RandomAccessMemory randomAccessMemory = new RandomAccessMemory(TypeOfRAM.DDR4, 4,350);
        HardDisk hardDisk = new HardDisk(HardDiskType.HDD, 64, 350);
        MonitorScreen monitorScreen = new MonitorScreen(11.6, MonitorType.TN, 665);
        Keyboard keyboard = new Keyboard(KeyboardType.MEMBRANE, Backlight.YES, 30);
        Computer computer = new Computer( "Acer","TravelMate", processor, randomAccessMemory, hardDisk, monitorScreen, keyboard);
        System.out.println(computer);

        Processor processor1 = new Processor(2.0, 8, ProcessorManufacturer.APPLE, 550);
        RandomAccessMemory randomAccessMemory1 = new RandomAccessMemory(TypeOfRAM.DDR4, 8, 330);
        HardDisk hardDisk1 = new HardDisk(HardDiskType.SSD, 256, 360);
        MonitorScreen monitorScreen1 = new MonitorScreen(13.3, MonitorType.IPS, 430);
        Keyboard keyboard1 = new Keyboard(KeyboardType.BUTTERFLY, Backlight.YES, 50);
        Computer computer1 = new Computer("Apple", "MacBook Air", processor1, randomAccessMemory1, hardDisk1, monitorScreen1, keyboard1);
        System.out.println(computer1);

        Processor processor2 = new Processor(3.1, 2, ProcessorManufacturer.AMD, 350);
        RandomAccessMemory randomAccessMemory2 = new RandomAccessMemory(TypeOfRAM.DDR4, 16, 250);
        HardDisk hardDisk2 = new HardDisk(HardDiskType.SSD, 256, 340);
        MonitorScreen monitorScreen2 = new MonitorScreen(17.3, MonitorType.TN, 440);
        Keyboard keyboard2 = new Keyboard(KeyboardType.MEMBRANE, Backlight.No, 60);
        Computer computer2 = new Computer("ASUS", "VivoBook", processor2, randomAccessMemory2, hardDisk2, monitorScreen2, keyboard2);
        System.out.println(computer2);


    }
}
