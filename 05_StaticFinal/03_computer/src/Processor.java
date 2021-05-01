public class Processor {
    private final double frequency;
    private final int numberOfCores;
    private final ProcessorManufacturer processorManufacturer;
    private final int processorWeight;

    public Processor(double frequency, int numberOfCores, ProcessorManufacturer processorManufacturer, int processorWeight) {
        this.frequency = frequency;
        this.numberOfCores = numberOfCores;
        this.processorManufacturer = processorManufacturer;
        this.processorWeight = processorWeight;
    }

    public double getFrequency() {
        return frequency;
    }

    public int getNumberOfCores() {
        return numberOfCores;
    }

    public ProcessorManufacturer getProcessorManufacturer() {
        return processorManufacturer;
    }

    public int getProcessorWeight() {
        return processorWeight;
    }

    public String toString() {
        return "\n" + "Процессор: частота - " +
                frequency + " ГГц, количество ядер - " +
                numberOfCores + ", производитель - " +
                processorManufacturer + ", вес - " +
                processorWeight + " гр.";
    }
}
