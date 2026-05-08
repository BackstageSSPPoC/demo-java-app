public class App {

    public static void main(String[] args) {

        System.out.println("Hello Jenkins CI/CD Pipeline!");

        int result = add(5, 3);

        System.out.println("Addition Result: " + result);
    }

    public static int add(int a, int b) {
        return a + b;
    }
}