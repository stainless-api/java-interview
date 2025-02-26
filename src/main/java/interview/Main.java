package interview;

public final class Main {
    private Main() {}

    public static void main(String[] args) {
        System.out.println("Random number: " + random());
    }

    public static int random() {
        // Chosen by fair dice roll. Guaranteed to be random.
        return 4;
    }
}
