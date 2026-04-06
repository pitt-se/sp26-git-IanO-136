public class CommitCafe {

    private static String barista = "Ian"; // STUDENT_TODO_1A: Change name
    private static String baristaTitle = "Valued Employee";

    private static int cups = 0;

    public static void brew(String drink) {
        cups++;
        System.out.println("Brewing Cup!");
        System.out.println("You are brewing a " + drink);
    }

    public static void printSummary() {
        System.out.println("[SUMMARY] " + barista + " brewed " + cups + " cups today.");
    }

    public static void main(String[] args) {
        brew("Espresso");
        brew("Latte");
        printSummary();
    }
}