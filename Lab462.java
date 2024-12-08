package Lab_4;

import java.util.Scanner;

public class Lab462 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть розмір масиву: ");
        int size = scanner.nextInt();

        int[] orArray = new int[size];
        System.out.println("Введіть елементи масиву:");

        for (int i = 0; i < size; i++) {
            System.out.print("Елемент " + (i + 1) + ": ");
            orArray[i] = scanner.nextInt();
        }

        double[] trArray = traArray(orArray);

        System.out.println("Перетворений масив:");
        printArray(trArray);
    }

    public static double[] traArray(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Масив не може бути пустим.");
        }

        int minElement = arr[0];
        for (int num : arr) {
            if (num < minElement) {
                minElement = num;
            }
        }

        double[] trArray = new double[arr.length];
        if (minElement != 0) {
            for (int i = 0; i < arr.length; i++) {
                trArray[i] = (double) arr[i] / minElement;
            }
        } else {
            for (int i = 0; i < arr.length; i++) {
                trArray[i] = -10.0;
            }
        }

        return trArray;
    }

    public static void printArray(double[] arr) {
        for (double num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}


