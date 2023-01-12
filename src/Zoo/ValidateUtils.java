package Zoo;

public class ValidateUtils {

    public static String validateDefault(String value) {
        return value == null || value.isBlank() || value.isEmpty() ? "Заполнить строку" : value;
    }

    public static Integer validateNumber(Integer value) {
        return value == null || value < 0 ? 0000 : value;
    }

}

