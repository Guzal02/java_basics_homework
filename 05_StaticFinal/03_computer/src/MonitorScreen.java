public class MonitorScreen {
    private final double diagonal;
    private final MonitorType monitorType;
    private final int monitorWeight;

    public MonitorScreen(double diagonal, MonitorType monitorType, int monitorWeight) {
        this.diagonal = diagonal;
        this.monitorType = monitorType;
        this.monitorWeight = monitorWeight;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public MonitorType getMonitorType() {
        return monitorType;
    }

    public int getMonitorWeight() {
        return monitorWeight;
    }

    public String toString() {
        return "Экран: диагональ - " +
                diagonal + " дюйма, тип - " +
                monitorType + ", вес - " +
                monitorWeight + " гр.";
    }
}
