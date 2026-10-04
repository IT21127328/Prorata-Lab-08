public class IT21127328Lab8Q2 {

    public static void main(String[] args) {
        int[] A = {10, 20, 30, 40, 50};
        int[] B = {34, 67, 12, 89, 12};
        int[] C = new int[5];

        for (int i = 0; i < 5; i++) {
            C[i] = A[i] + B[i];
        }

        System.out.println("A Array Contents:");
        for (int num : A) {
            System.out.print(num + " ");
        }

        System.out.println("\n\nB Array Contents:");
        for (int num : B) {
            System.out.print(num + " ");
        }

        System.out.println("\n\nC Array Contents (A + B):");
        for (int num : C) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}