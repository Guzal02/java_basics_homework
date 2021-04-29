public class Country {
    private String name;
    private int populationSize;
    private int areaInSquareKm;
    private String nameOfTheCapital;
    private boolean landlocked;

    public Country(String nameOfTheCapital) {
        this.nameOfTheCapital = nameOfTheCapital;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulationSize() {
        return populationSize;
    }

    public void setPopulationSize(int populationSize) {
        this.populationSize = populationSize;
    }

    public int getAreaInSquareKm() {
        return areaInSquareKm;
    }

    public void setAreaInSquareKm(int areaInSquareKm) {
        this.areaInSquareKm = areaInSquareKm;
    }

    public String getNameOfTheCapital() {
        return nameOfTheCapital;
    }

    public void setNameOfTheCapital(String nameOfTheCapital) {
        this.nameOfTheCapital = nameOfTheCapital;
    }

    public boolean isLandlocked() {
        return landlocked;
    }

    public void setLandlocked(boolean landlocked) {
        this.landlocked = landlocked;
    }

}
