package javastart;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class ComparatorProblem {
    public static void main(String[] args) {
        Random random = new Random();
        Integer[] integers = new Integer[20];
        for (int i = 0; i < integers.length; i++) {
            integers[i] = random.nextInt(100);
        }

        printTable(integers);

        // Sortowanie rosnace
//        Arrays.sort(integers, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1.compareTo(o2);
//            }
//        });
        Arrays.sort(integers);

        printTable(integers);

        // Sortowanie malejace
        Arrays.sort(integers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -o1.compareTo(o2);
            }
        });

        printTable(integers);
    }

    // Alternatywnie mógłbym wykorzystać Arrays.toString()
    public static <T> void printTable(T[] table) {
        Arrays.stream(table).map(number -> number.toString() + ' ').forEach(System.out::print);
        System.out.println();
    }
}
