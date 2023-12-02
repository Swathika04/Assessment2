import java.util.Scanner;

public class Pairs {
    static void countKdivPairs(int[] A, int n, int K) {

        int count = 0;

        System.out.println("Sum of pairs divisible by " + K + " are:");
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((A[i] + A[j]) % K == 0) {
                    count++;
                    System.out.println("(" + A[i] + "," + A[j] + ")");
                }
            }
        }

        System.out.println("Sum of pairs divisible by " + K + ": " + count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n = sc.nextInt();
        int[] A = new int[n];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        System.out.print("Enter the K value: ");
        int K = sc.nextInt();

        countKdivPairs(A, n, K);
    }
}
