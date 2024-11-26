public class Fibonacci {

    // Hàm đệ quy để tính số Fibonacci tại vị trí n
    public static long getFibonacci(int n) {
        if (n <= 1) {
            return n; // Trả về 0 hoặc 1 cho các vị trí đầu tiên
        }
        return getFibonacci(n - 1) + getFibonacci(n - 2); // Công thức đệ quy
    }

    // Hàm hiển thị 45 số Fibonacci đầu tiên
    public static void displayFibonacciSequence(int limit) {
        System.out.println("The first " + limit + " Fibonacci numbers are:");
        for (int i = 0; i < limit; i++) {
            System.out.print(getFibonacci(i) + " ");
        }
        System.out.println();
    }
}
