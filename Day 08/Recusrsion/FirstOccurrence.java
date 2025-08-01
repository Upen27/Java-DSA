import java.util.Scanner;

public class FirstOccurrence {


    public static int firstOccurrence(int[] arr, int idx, int key) {
        if (idx == arr.length) return -1;
        if (arr[idx] == key) return idx;
        return firstOccurrence(arr, idx + 1, key);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter element to find: ");
        int key = sc.nextInt();
        int index = firstOccurrence(arr, 0, key);
        if (index == -1)
            System.out.println("Element not found in array.");
        else
            System.out.println("First occurrence at index: " + index);

        sc.close();
    }
}
