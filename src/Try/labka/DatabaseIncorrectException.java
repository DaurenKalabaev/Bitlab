package Try.labka;

public class DatabaseIncorrectException extends Exception {
    @Override
    public String getMessage() {
        return "Java Connection Exception at databaseDriver caused by incorrect data....";
    }
}
