package org.example.Seminar_3.hw4;

import java.util.*;

/**
 * При входном массиве, вернуть массив массивов со всеми перестановками его элементов. (со звездочкой)
 * Пример входных данных:
 * [1,2,3]
 * Пример выходных данных:
 * [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество элементов в массиве: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Введите значения для занесения в массив: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int[][] result = mixedArrays(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.println(Arrays.toString(result[i]));
        }

    }

    public static int[][] mixedArrays(int[] arr) {
        int count = (arr.length - 1) * arr.length;
        int[][] array = new int[count][arr.length];
        array[0] = arr;
        for (int i = 1; i < count; i++) {
            List<Integer> tempList = Arrays.asList(Arrays.stream(arr).boxed().toArray(Integer[]::new));
            int countOf;
            do {
                countOf = 0;
                Collections.shuffle(tempList);
                int[] temp = new int[tempList.size()];
                for (int j = 0; j < tempList.size(); j++) {
                    temp[j] = tempList.get(j);
                }
                for (int[] el : array) {
                    if (Arrays.equals(el, temp)) countOf++;
                }
            } while (countOf != 0);
            for (int j = 0; j < tempList.size(); j++) {
                array[i][j] = tempList.get(j);
            }
        }
        return array;
    }
}
