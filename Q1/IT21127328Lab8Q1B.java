import java.util.Scanner;

public class IT21127328Lab8Q1B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] myArray = new int[5];
        int[] evenArray = new int[5];
        int evenIndex = 0;

        System.out.println("Enter 5 Numbers:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Number " + (i + 1) + ": ");
            myArray[i] = scanner.nextInt();

            if (myArray[i] % 2 == 0) {
                evenArray[evenIndex] = myArray[i];
                evenIndex++;
            }
        }

        System.out.println("\nmyArray Contents:");
        for (int num : myArray) {
            System.out.print(num + " ");
        }

        System.out.println("\n\nevenArray Contents:");
        for (int num : evenArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        scanner.close();
    }
}