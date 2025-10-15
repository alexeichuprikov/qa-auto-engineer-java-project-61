package hexlet.code;

public class Engine {

    private static final int ROUNDS = 3;
    //границы случайных чисел не были обозначены сделал от 1 до 100. требуется уточнение у аналитика
    private static final int MAX_NUMBER = 100;
    private static final String QUESTION_TEXT = "Question: ";
    private static final String ANSWER_TEXT = "Your answer: ";
    private static final String CORRECT_ANSWER = "Correct!";
    private static final String WRONG_ANSWER = "'%s' is wrong answer ;(. Correct answer was '%s'.";
    private static final String RETRY = "Let's try again, %s!";
    private static final String CONGRATULATIONS = "Congratulations, %s!";

    public static int getRounds() {
        return ROUNDS;
    }

    public static int getMaxNumber() {
        return MAX_NUMBER;
    }

    public static String getQuestionText() {
        return QUESTION_TEXT;
    }

    public static String getAnswerText() {
        return ANSWER_TEXT;
    }

    public static String getCorrectAnswer() {
        return CORRECT_ANSWER;
    }

    public static String getWrongAnswer() {
        return WRONG_ANSWER;
    }

    public static String getRetry() {
        return RETRY;
    }

    public static String getCongratulations() {
        return CONGRATULATIONS;
    }
}
