package e14;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int[] arr = new int[100000];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(500);
        }
//        System.out.println(returnUniqueNumbers(arr));
        System.out.println(repeatedNumbers(arr));
        System.out.println("--------------------------");
        changeDuplicates(arr);
        System.out.println(repeatedNumbers(arr));



    }


    public static List<Integer> returnUniqueNumbers(int[] array) {
        return Arrays.stream(array)
                .boxed()
                .distinct()
                .collect(Collectors.toList());
    }

    public static List<Integer> repeatedNumbers(int[] array) {
        List<Integer> singleNumbers = new ArrayList<>();
        List<Integer> duplicates = new ArrayList<>();
        for (int nr : array) {
            if (!singleNumbers.contains(nr)) {
                singleNumbers.add(nr);
            } else {
                duplicates.add(nr);
            }
        }
        return duplicates.stream()
                .distinct()
                .collect(Collectors.toList());

    }

//    public static List<Integer> mostFrequent(int[] array) {
//
//    }

    public static void changeDuplicates(int[] array){
        Random random = new Random();
        List<Integer> intList = new ArrayList<>();
        intList = Arrays.stream(array)
                .boxed()
                .collect(Collectors.toList());

        for (int i = 0; i< intList.size(); i++) {
            if (intList.contains(array[i])) {
                array[i] = random.nextInt();
            }
        }

    }



}
