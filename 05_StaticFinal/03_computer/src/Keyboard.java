public class Keyboard {
    private final KeyboardType keyboardType;
    private final Backlight backlight;
    private final int keyboardWeight;

    public Keyboard(KeyboardType keyboardType, Backlight backlight, int keyboardWeight) {
        this.keyboardType = keyboardType;
        this.backlight = backlight;
        this.keyboardWeight = keyboardWeight;
    }

    public KeyboardType getKeyboardType() {
        return keyboardType;
    }

    public Backlight getBacklight() {
        return backlight;
    }

    public int getKeyboardWeight() {
        return keyboardWeight;
    }

    public String toString() {
        return "Клавиатура: тип - " +
                keyboardType + ", наличие подсветки - " +
                backlight + ", вес - " +
                keyboardWeight + " гр.";
    }
}
