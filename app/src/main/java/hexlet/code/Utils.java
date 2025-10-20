package hexlet.code;

public class Utils {
    //границы случайных чисел не были обозначены сделал от 1 до 100. требуется уточнение у аналитика
    public static final int MIN_NUMBER = 1;
    public static final int MAX_NUMBER = 100;

    public static int generateNumber(int min, int max) {
        return (int) Math.floor(Math.random() * (max - min + 1)) + min;
    }

    public static int generateNumber() {
        return generateNumber(MIN_NUMBER, MAX_NUMBER);
    }
}
