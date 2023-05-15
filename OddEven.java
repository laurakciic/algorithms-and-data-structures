public class OddEven {
    public static void main(String[] args) {
        int testNumber = 4;
        System.out.println("Even: " + isEven(testNumber));
        System.out.println("Odd: " + isOdd(testNumber));
    }

    public static Boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static Boolean isOdd(int n) {
        return n % 2 != 0;
    }
}
