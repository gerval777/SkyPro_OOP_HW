package Transport;

public class ValidateUtils {
    public static String validateDefault(String value) {
        return value == null || value.isBlank() || value.isEmpty() ? "Некорректные данные" : value;
    }

    public static Integer validateNumber(Integer value) {
        return value == null || value < 0 ? 0000 : value;
    }

    public static String validateColor(String value) {
        return value == null || value.isBlank() || value.isEmpty() ? "Белый" : value;
    }

    public static Integer validateYear(Integer value) {
        return value == null || value < 0 ? 2000 : value;
    }
}
