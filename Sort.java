// package com.foo.sort;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Comparator;

public class Sort {
    private final ArrayList<Integer> data = new ArrayList<>();
    private final Duration timeElapsed;

    public Sort(int size, String sorter) {
        Instant start = Instant.now();  // time capture -- start
        // build an array
        for (int i = 0; i < size; i++) {
            data.add((int)(Math.random() * (size+1)));
        }
        // use Inheritance and Polymorphism to replace data.sort with your own algorithm
        // data.sort(Comparator.naturalOrder());

        // enhanced switch statement? intellij turned my switch into this
        switch (sorter) {
            case "bubble" -> bubbleSort(data);
            case "insertion" -> insertionSort(data);
            case "merge" -> mergeSort(data);
        }

        Instant end = Instant.now();    // time capture -- end
        this.timeElapsed = Duration.between(start, end);
    }

    public ArrayList<Integer> getData() {
        return data;
    }

    public int getTimeElapsed() {
        return timeElapsed.getNano();
    }


    public static void main(String[] args) {
        int sum = 0, time = 0, TIMES = 12, SIZE = 5000;
        String[] options = {"bubble", "insertion", "merge"};

        for (String option : options) {
            System.out.println("Sort Type: " + option);
            System.out.println("--------------------------------------");
            for (int i = 0; i < TIMES; i++) {
                Sort s = new Sort(SIZE, option);
                for (int j = 0; j < s.getData().size(); j++) {
                    // To see data, uncomment next line
                    // System.out.println(s.getData());
                    sum += s.getData().get(j);
                }
                System.out.println("Average random: " + sum / ((i + 1) * SIZE));
                System.out.println("Nanoseconds: " + s.getTimeElapsed());
                time += s.getTimeElapsed();
            }
            System.out.println("--------------------------------------");
            System.out.println("Average random: " + sum / (TIMES * SIZE));
            System.out.println("Total Nanoseconds: " + time);
            System.out.println("Total Seconds: " + time / 1000000000.0);
            System.out.println("--------------------------------------\n\n");
        }
    }

    public static void bubbleSort(ArrayList<Integer> array) {
        for (int i = 0; i < array.size(); i++) {
            for (int j = 0; j < array.size() - 1; j++) {
                if (array.get(j) > array.get(j + 1)) {
                    int temp = array.get(j);
                    array.set(j, array.get(j + 1));
                    array.set(j + 1, temp);
                }
            }
        }
    }

    public static void insertionSort(ArrayList<Integer> array) {
        int n = array.size();
        for (int i = 1; i < n; ++i) {
            int key = array.get(i);
            int j = i - 1;
            while (j >= 0 && array.get(j) > key) {
                array.set(j + 1, array.get(j));
                j = j - 1;
            }
            array.set(j + 1, key);
        }

    }

    public static void mergeSort(ArrayList<Integer> array) {
        int n = array.size();
        if (n < 2)
            return;
        ArrayList<Integer> left = new ArrayList<Integer>();
        ArrayList<Integer> right = new ArrayList<Integer>();
        for (int i = 0; i < n / 2; i++) {
            left.add(array.get(i));
        }
        for (int i = n / 2; i < n; i++) {
            right.add(array.get(i));
        }
        mergeSort(left);
        mergeSort(right);
        merge(left, right, array);
    }

    private static void merge(ArrayList<Integer> left, ArrayList<Integer> right, ArrayList<Integer> array) {
        int i = 0, j = 0, k = 0;
        while (i < left.size() && j < right.size()) {
            if (left.get(i) < right.get(j)) {
                array.set(k, left.get(i));
                i++;
            } else {
                array.set(k, right.get(j));
                j++;
            }
            k++;
        }
        while (i < left.size()) {
            array.set(k, left.get(i));
            i++;
            k++;
        }
        while (j < right.size()) {
            array.set(k, right.get(j));
            j++;
            k++;
        }
    }

}