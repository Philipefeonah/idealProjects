import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

import static java.util.Arrays.parallelSetAll;
import static java.util.Arrays.sort;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 4, 3, 5));
//        HashSet<Integer> hashSet = new HashSet<>(numbers);
//        System.out.println(hashSet);
               //OR
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 4, 3, 5));
        HashSet<Integer> hashSet = new HashSet<>();
        for (Integer i : numbers)
            hashSet.add(i);
        System.out.println(hashSet);



        //WRITE A PROGRAM THAT FILLS AN ARRAY WITH N INTEGERS ENTERED BY USER
        //SUPPOSE THE USER CAN ENTER ATLEAST 1 NUMBER AND AT MOST 20 NUMBER.

//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter number (Max of 20): ");
//        int num = input.nextInt();
//
//        while (num > 20 || num <=0) {
//            System.out.print("invalid number, try again:");
//            num = input.nextInt();
//        }
//
//        int[] numbers = new int[num];
//        fillArrayOfIntegers(numbers);
//        printArrayOfIntegers(numbers);
//    }
//
//    private static void printArrayOfIntegers(int[] numbers) {
//        System.out.print("The Elements are: ");
//        System.out.print(Arrays.toString(numbers));
//    }
//
//    private static void fillArrayOfIntegers(int[] numbers) {
//        Scanner input = new Scanner(System.in);
//
//        for (int i = 0; i<=numbers.length; i++)
//            numbers[i] = input.nextInt();

                              //QUEST 2.
                              //WRITE A PROGRAM THAT DISPLAYS THE SUM, PRODUCT,
                              // AND AVERAGE OF THE ELEMENTS OF AN INTEGER ARRAY

//        int[] numbers = {1,2,3,4,5,};
//        int sum = 0;
//        int product = 1;
//        double average;
//
//        for (int i = 0; i<numbers.length; i++){
//            sum += numbers[i];
//            product *= numbers[i];
//        }
//        average = (double)sum / numbers.length;
//
//        System.out.println("Sum = " + sum + " Product = " + product + " average = " + average);

                              //Quest 3.
                              // WRITE A PROGRAM THAT DISPLAYS THE NUMBER OF OCCURRENCES OF AN ELEMENT IN THE ARRAY

//        int[] numbers = {1,1,1,2,3,4};
//        int searchElement = 1;
//
//        System.out.println(getNumberOfOccurrence(numbers,searchElement));
//
//    }
//    public static int getNumberOfOccurrence(int[] numbers, int searchElement){
//        int occ = 0;
//        for (int i = 0; i<numbers.length; i++)
//            if (searchElement == numbers[i])
//                occ++;
//        return occ;

                              //QUESTION 4
                              //WRITE A PROGRAM THAT DISPLAYS THE MAXIMUM AND MINIMUM ELEMENTS OF AN ARRAY

//        int[] numbers = {1, 2, 3, 4, 5,};
//        int max = numbers[0];
//        int min = numbers[0];
//
//        for (int i = 0; i < numbers.length; i++) {
//            max = (numbers[i] > max) ? numbers[i] : max;
//            min = (numbers[i] < min) ? numbers[i] : min;
//
//        }
//        System.out.println("Max = " + max + " Min = " + min);

                              //QUESTION 5
                              // WRITE A PROGRAM THAT PLACES THE ODD ELEMENTS OF AN ARRAY BEFORE THE EVEN ELEMENTS

//        int[] numbers = {1,2,4,5,7,9,-2,3};
//        int[] temp = new int[numbers.length];
//        int j = 0;
//        int k = numbers.length - 1;
//
//        for (int i = 0; i < numbers.length; i++)
//            if (numbers[i] % 2 !=0)
//                temp[j++] = numbers[i];
//            else
//                temp[k--] = numbers[i];
//
//            copyArray(temp, numbers);
//        System.out.println(Arrays.toString(numbers));
//            }
//
//    private static void copyArray(int[] temp, int[] numbers) {
//        for (int i = 0; i < temp.length; i++) {
//            numbers[i] = temp[i];
//
//        }

//        int[][] integers = {{3,5,7},{10,2,9}};
//        for(int i = 0; i<2; i++)
//            for (int j = 0; j < 3; j++)
//                System.out.println(integers[i][j] + " ");
//
//            }
//
//    }




//        int [] numbers = {5, 2, 3, -1, 0, 4, 1};
//        Arrays.sort(numbers);
//        System.out.println(Arrays.toString(numbers));

//        char[] characters = {'a','g','f', 'b', 'c'};
//        Arrays.sort(characters);
//        System.out.println(Arrays.toString(characters));
//
//        int [] unicodes = {'a','z','b','A','Z','C'};
//        Arrays.sort(unicodes);
//        System.out.println(Arrays.toString(unicodes));
//
//        String[] strings = {"hij", "abc", "efg"};
//        Arrays.sort(strings);
//        System.out.println(Arrays.toString(strings));
//
//        int[] numbers1 = {5,4,3,2,1,0,-1};
//        Arrays.sort(numbers1,3,7);
//
//        int [] numbers = {5, 2, 3, -1, 0, 4, 1};
//        Arrays.sort(numbers);
//        System.out.println(Arrays.binarySearch(numbers,4));
//        System.out.println(Arrays.binarySearch(numbers,3));
//        System.out.println(Arrays.binarySearch(numbers,-3));
//        System.out.println(Arrays.binarySearch(numbers,6));

//   2D array
//  int[][] numbers = new int[5- numberOfRows][3- numberOfColumns];
        }
}