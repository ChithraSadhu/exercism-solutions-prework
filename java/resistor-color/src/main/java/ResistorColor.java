import java.util.Arrays;

class ResistorColor {
    private final String[] colorsCode = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};

    int colorCode(String color) {
        return Arrays.asList(colorsCode).indexOf(color);
    }

    String[] colors() {
        return colorsCode;
    }
}
