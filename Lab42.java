package Lab4;

import java.util.Scanner;

public class Lab42 {
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

        int result = GreaterThree(array);
        System.out.println("Сума елементів більших за 3: " + result);
    }

    public static int GreaterThree(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            if (num > 3) {
                sum += num;
            }
        }
        return sum;
    }
}
