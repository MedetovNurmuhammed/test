
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {2, 4, 1, 4, 2, 6, 9, 4, 8, 8, 8, 2, 12, 23, 12, 1,12,12};
        System.out.println("Берилген массив: " + Arrays.toString(array));
        int[] newarray = new int[array.length];
        int k = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i; j < array.length - 1; j++) {
                if (array[i] == array[j + 1]) newarray[k++] = array[i];
            }
        }
        int[] newarray1 = new int[k];
        for (int i = 0; i < k; i++) {
            newarray1[i] = newarray[i];
        }
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < (k - 1 - i); j++) {
                if (newarray1[j] > newarray1[j + 1]) {
                    int temp = newarray1[j];
                    newarray1[j] = newarray1[j + 1];
                    newarray1[j + 1] = temp;
                }
            }
        }
        System.out.println("Arrays.toString(newarray1) = " + Arrays.toString(newarray1));
        System.out.print("Массивдеги окшош сандар:");
        for (int i = 0; i < newarray1.length - 1; i++) {
            if (newarray1[i] != newarray1[i + 1] && newarray1.length - 2 == i) {
                System.out.println(" " +newarray1[i] + " " +  newarray1[i + 1]);
            } else if (newarray1[i] != newarray1[i + 1]) {
                System.out.print(" " + (newarray1[i]));
            } else if (newarray1[i] == newarray1[i + 1] && newarray1.length - 2 == i) {
                System.out.println(" " + newarray1[i + 1]);
            }
        }
    }
}