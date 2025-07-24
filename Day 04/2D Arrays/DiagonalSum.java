import java.util.Scanner;

public class DiagonalSum {
    // Brute Force Method
    public static int diagonalSumBruteForce(int[][] arr) {
        int sum = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1) {
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }

    // Optimized Method
    public static int diagonalSumOptimized(int[][] arr) {
        int sum = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            sum += arr[i][i];              // main diagonal
            if (i != n - i - 1) {          // avoid double count for center
                sum += arr[i][n - i - 1];  // secondary diagonal
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of square matrix:");
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Diagonal sum (Brute Force): " + diagonalSumBruteForce(arr));
        System.out.println("Diagonal sum (Optimized): " + diagonalSumOptimized(arr));

        sc.close();
    }
}
