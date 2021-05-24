import java.text.DecimalFormat;
import java.util.Arrays;

public class Hospital {

    public static float[] generatePatientsTemperatures(int patientsCount) {

        //TODO: напишите метод генерации массива температур пациентов
        float[] temperatureData = new float[patientsCount];
        for (int i = 0; i < patientsCount; i++) {
            float value = (float) Math.round((32 + (8 * Math.random())) * 10) / 10;
            temperatureData[i] = value;
        }
        return temperatureData;
    }

    public static String getReport(float[] temperatureData) {
        /*
        TODO: Напишите код, который выводит среднюю температуру по больнице,количество здоровых пациентов,
            а также температуры всех пациентов.
        */
        StringBuilder result = new StringBuilder();
        for (float temperatureDatum : temperatureData) {
            result.append(temperatureDatum).append(" ");
        }
        String stringTemperatureData = result.toString().trim();

        float sumTemperatureData = 0;
        int healthyPatients = 0;
        for (int i = 0; i < temperatureData.length; i++) {
            sumTemperatureData = sumTemperatureData + temperatureData[i];
            if (temperatureData[i] >= 36.2 && temperatureData[i] <= 37.0) {
                healthyPatients = healthyPatients + 1;
            }
        }
        float averageTemperature = (float) Math.round((sumTemperatureData / temperatureData.length) * 100) / 100;

        String report =
                "Температуры пациентов: " + stringTemperatureData +
                        "\nСредняя температура: " + averageTemperature +
                        "\nКоличество здоровых: " + healthyPatients;

        return report;
    }
}
