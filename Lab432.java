package Lab4;

import java.util.Scanner;

public class Lab432 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть розмір масиву: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Введіть елементи масиву:");

        for (int i = 0; i < size; i++) {
            System.out.print("Елемент " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        int result = element(array);
        System.out.println("Сума парних елементів на непарних місцях: " + result);
    }

    public static int element(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i += 2) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }
        return sum;
    }
}




