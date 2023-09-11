public class MoreThan10Exception extends Exception {
    public MoreThan10Exception() {
        super("Вхідний аргумент має значення 10 або більше.");
    }
    public MoreThan10Exception( String message) {
        super(message);
    }
}
