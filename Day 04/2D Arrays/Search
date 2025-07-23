import java.util.Scanner;
public class SearchSortedMatrix {
    // Brute Force Search
    public static boolean bruteForceSearch(int[][] arr, int key) {
        int rows = arr.length;
        int cols = arr[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] == key) {
                    return true;
                }
            }
        }
        return false;
    }
    // Optimized Search
    public static boolean optimizedSearch(int[][] arr, int key) {
        int rows = arr.length;
        int cols = arr[0].length;

        int i = 0, j = cols - 1; // start at top-right

        while (i < rows && j >= 0) {
            if (arr[i][j] == key) {
                return true;
            } else if (arr[i][j] > key) {
                j--; // move left
            } else {
                i++; // move down
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows and columns:");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int arr[][] = new int[rows][cols];

        System.out.println("Enter sorted matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter element to search:");
        int key = sc.nextInt();

        if (bruteForceSearch(arr, key))
            System.out.println("Found (Brute Force)");
        else
            System.out.println("Not Found (Brute Force)");

        if (optimizedSearch(arr, key))
            System.out.println("Found (Optimized)");
        else
            System.out.println("Not Found (Optimized)");

        sc.close();
    }
}
