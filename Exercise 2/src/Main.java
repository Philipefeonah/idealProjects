import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
   public static void main(String[] args) {

      //Activity 1
      //Loop through an array of words called  wordsArray and
      //print out the elements from back to front stopping at an element before index 0.

       List<String> wordsArray = Arrays.asList("Home", "Hello", "People", "Hope", "Hogwarts");
       for (int i = wordsArray.size() - 1; i > 0; i--)
           System.out.println(wordsArray.get(i));


      //Activity 2
      //loop through an array of elements (CONDITION: Do not use an iteration loop i.e. for-i loop

//       List<Object> elementsArray = Arrays.asList("Home", "Hello", true, "Hope", 1);
//       for (var name : elementsArray)
//           System.out.println(name);

       List<Object> elementsArray = Arrays.asList("Home", "Hello", true, "Hope", 1);
       for (Object name : elementsArray)
           System.out.println(name);

//      Scanner scanner = new Scanner(System.in);
//      int number = scanner.nextInt();
//
//      while (number < 1 || number > 10) {
//         System.out.println(number + " is not between 1 and 10. Try again: ");
//         number = scanner.nextInt();
//      }
//      System.out.println(number + " is between 1 and 10. ");


      //EXERCISE ON LOOPS

      //QUESTION 1
      //Write A Program which prints the even numbers between 1 and 100 in increasing order
//       for (int i = 0; i <= 100; i++)
//           if (i % 2 == 0)
//               System.out.println(i + "");
      //   OR
//       for (int i = 0; i <= 100; i+=2)
//               System.out.println(i + "");

      //QUESTION 2

      //Write A Program which prints the Odd numbers between 1 and 100 in decreasing order
//       for (int i = 100; i>0; i--)
//           if (i % 2 != 0)
//               System.out.println(i);
      // OR
//       for (int i = 99; i>0; i-=2)
//               System.out.println(i);

      //QUESTION 3
      //Write a Program which reads a sequence of integers from the user
      // and stops by displaying "Done" when the sum of these values exceeds 100

//       Scanner scanner = new Scanner(System.in);,
//       int sum = 0;
//       while (sum <= 100){
//           System.out.println("enter a number: ");
//           sum += scanner.nextInt();
//           System.out.println("Done " + sum);
//       }

//       int sum = 0;
//       while (true){
//           System.out.println("enter a number");
//           sum += scanner.nextInt();
//
//           if(sum > 100)
//               break;
//       }
//       System.out.println("Done: " + sum);

//       int sum = 0;
//       do {
//           System.out.println("enter a number: ");
//           sum += scanner.nextInt();
//       } while (sum <= 100);
//       System.out.println("Done " + sum);

      //QUESTION 4
      //write a program which displays the sum of the
      // strict divisors of an integer given by the user.

//     Scanner scanner = new Scanner(System.in);
//      System.out.print("enter an integer: ");
//      int num = scanner.nextInt();
//      int sum = 0;
//      for (int i = 1; i<= num/2; i++)
//         if (num % i == 0)
////            System.out.print(i + " ");
//
//            sum += i;
//
//      System.out.println(sum + num);

      //Question 5
      //write a program which read a positive number N
      // from the user then indicates if N is prime or not

//      Scanner p = new Scanner(System.in);
//      System.out.println("enter an integer: ");
//      int n = p.nextInt();
//      boolean isPrime = true;
//      for (int i = 2; i <= n / 2; i++)
//         if (n % i == 0) {
//            isPrime = false;
//            break;
//         }
//      System.out.println(isPrime ? "prime" : "not prime");

      //          OR

//      for (int i = 2; i <= n/2; i++)
//         if (n % i == 0) {
//           System.out.println("not prime");
//         } else if(n % i == 1)
//      System.out.println("prime");

      //   OR
//      int sum = 0;
//      for(int i = 1; i<=n; i++)
//         if(n % i == 0 )
//            sum += i;
//            System.out.println(sum == 1? "prime number" : "not prime number" );

      //Question 5

      // write a program that reads a sequence of positive integers.
      // the program stops when the user fills a negative value and shows the maximum and min of the numbers

//      Scanner input = new Scanner(System.in);
//      System.out.print("enter number: ");
//
//      int n = input.nextInt();
//      int max = n;
//      int min = n;
//
//      if (n >= 0) {
//         while (true) {
//            n = scanner.nextInt();
//
//            if (n < 0)
//               break;
//
////            if (n > max)
////               max = n;
////            if (n < min)
////               min = n;
//                 OR
//               max = n > max ? n : max;
//               min = n < min ? n : min;
//
//            }
//            System.out.println("max :" + max + ", min :" + min);
//         }
//         else
//            System.out.println("invalid");

      //Question 7
      //write a program which displays the sum of digits of an integer read from the user.

//      Scanner scanner = new Scanner(System.in);
//      System.out.print("enter number: ");
//
//      int n = scanner.nextInt();
//      int sum = 0;
//      while (n>0){
//         sum += n % 10; or sum = sum + n % 10;
//         n /= 10; or n = n / 10;
//      }
//      System.out.println(sum);

      //Question 7
      //write a java program to print fibonacci series

//       Scanner s = new Scanner(System.in);
//       System.out.print("Enter the number of terms: ");
//       int num = s.nextInt();
//
//
//       int firstNum = 0, secondNum = 1;
//
//
//       System.out.println("Fibonacci Series:");
//
//       for (int i = 1; i <= num; i++) {
//           System.out.print(firstNum + " ");
//
//           // Compute the next term in the series
//           int nextTerm = firstNum + secondNum;
//           firstNum = secondNum;
//           secondNum = nextTerm;
//       }


      //Question 8
      //Write a program that reads an integer n and display nth fibonacci number

//       Scanner scanner = new Scanner(System.in);
//       System.out.print("enter number: ");
//       int n = scanner.nextInt();
//
//       int result = 0;
//       int v1 = 1;
//       int v2 = 1;
//       for(int i = 1; i<= n - 2; i++){
//           result = v1 + v2;
//           v1 = v2;
//           v2 = result;
//       }
//       System.out.println("result = " + (result == 0? 1 : result));


      //Question 9
      // Write a program which displays a string with a space after each character.
//       String name = "Philip Efe";
//       for(int i = 0; i<= name.length()-1; i++)
//           System.out.print(name.charAt(i) + " ");


      //Question 10
      // write a program which displays the reverse of a string
//       String name = "Philip Trump";
//       for(int i = name.length()-1 ; i>=0 ; i--)
//           System.out.print(name.charAt(i));

      //Question 11
      //write a program which finds if a string is a palindrome string or not;
//       String name = "noon";
//       boolean isPalindrome = true;
//       for(int i = 0, j= name.length()-1; i < j; i++,j--) {
//           if (name.charAt(i) == name.charAt(j))
//               continue;
//           isPalindrome = false;
//           break;
//       }
//       System.out.println(isPalindrome? "palindrome" : "not palindrome");

      //Question 12
      //write a program that reads a positive integer from the user
      // and displays the following using nested loop.

//       1
//       2 2
//       3 3 3
//       4 4 4 4
//       5 5 5 5 5

//       int n = 5;
//       for (int i = 1; i <= n; i++) {
//           for (int j = 1; j <= i; j++) {
//               System.out.print(i);
//           }
//           System.out.println(" ");
//       }

      //Question 13;
      //write a program that reads a positive integer from the user
      // and displays the following using nested loop.

//              1
//            2 2
//          3 3 3
//        4 4 4 4
//      5 5 5 5 5

//       int n = 10;
////       for (int i = 1; i <= n; i++) {
//]
//           for (int j = 1; j <= n - i; j++)
//               System.out.print(" ");
//
//               for (int j = 1; j <= i; j++) {
//                   System.out.print(i);
//
//           }
//           System.out.println(" ");

      //write a program that reads a positive integer from the user
      // and displays the following using nested loop.

//             1
//           2  2
//         3  3  3
//        4  4  4  4
//      5  5  5  5  5

//       int n = 6;
//       for (int i = 1; i <= n; i++) {
//
//           for (int j = 1; j <= n - i; j++)
//               System.out.print(" ");
//
//           for (int k = 1; k <= 2*i -1; k++) {
//               System.out.print(i);
//
//           }
//           System.out.println(" ");
//       }

      //write a program that reads a positive integer from the user
      // and displays the following using nested loop.

//             *
//           *   *
//         *      *
//       *          *
//      *  *  *  *   *

//      int n = 6;
//       for (int i = 1; i <= n; i++) {
//
//           for (int j = 1; j <= n - i; j++)
//               System.out.print(" ");
//
//           for (int k = 1; k <= 2*i -1; k++) {
//              if (i == n)
//               System.out.print("*");
//              else
//                 if (k ==1 || k == 2*i - 1)
//                    System.out.print("*");
//                 else
//                    System.out.print(" ");
//
//           }
//           System.out.println(" ");
//       }
      //Question 14
      //write a program that reads a positive integer from the user
      // and displays the following using nested loop;

//      * * * * *
//      * * * * *
//      * * * * *
//      * * * * *

//      for (int i = 1; i <= 5; i++) {
//           for (int j = 1; j <=5 ; j++)
//               System.out.print("*");
//
//         System.out.println(" ");
//
//       }

      //write a program that reads a positive integer from the user
      // and displays the following using nested loop;

//      * * * * *
//      *       *
//      *       *
//      * * * * *

//        Scanner scanner = new Scanner(System.in);
//      System.out.print("enter number: ");
//        int n = scanner.nextInt();
//            for (int i = 1; i <= n; i++) {
//               if (i == 1 || i == n)
//           for (int j = 1; j <=n ; j++)
//                 System.out.print("*");
//           else
//                 for (int k = 1; k <=n ; k++)
//                    if (k == 1 || k == n)
//                       System.out.print("*");
//                    else
//                       System.out.print(" ");
//
//         System.out.println(" ");
//
//       }

      //write a program that reads a positive integer from the user
      // and displays the following using nested loop;

//      * * * * *
//       * * *
//       * * *
//     * * * * *

//      Scanner scanner = new Scanner(System.in);
//      System.out.print("enter number: ");
//        int n = scanner.nextInt();
//            for (int i = 1; i <= n; i++) {
//               if (i == 1 || i == n)
//           for (int j = 1; j <=n ; j++)
//                 System.out.print("*");
//           else
//                 for (int k = 1; k <=n ; k++)
//                    if (k == 1 || k == n)
//                       System.out.print(" ");
//                    else
//                       System.out.print("*");
//
//         System.out.println(" ");
//
//       }
      //      String name = "Gadibia";
//       int index = name.indexOf('i');
//       System.out.println(index);
//


//       for (int i = 1; i <= 5; i++) {
//           for (int j = 1; j <=i ; j++) {
//               System.out.print("*");
//           }
//           System.out.println(" ");
//       }


      //CLASS WORK
//   Find the number of characters before the first “I” in the word “GADIBIA”.
      //      String name = "Gadibia";
//       int index = name.indexOf('i');
//       System.out.println(index);
//


      //CLASS WORK 2.
      //Find the midpoint of the word "GADIBIA"
      // and replace the characters that come before the midpoint with those that come after the midpoint. i.e "BIAIGAD"

//     String word = "GADIBIA";
//     int length = word.length();
//     int midpoint =  length/2;
//
//     String beforeMidPoint = word.substring(0,3);
//     String afterMidPoint = word.substring(4,7);
//
//      String newWord = afterMidPoint + word.charAt(midpoint) + beforeMidPoint;
//
//      System.out.println(word);
//      System.out.println(midpoint);
//      System.out.println(newWord);


//       String yes0rNo = name.length() > 10? "Yes" : "No";
//       System.out.println(yes0rNo);

//       System.out.println(name.length());
//       if (name.length() > 10){
//           System.out.println("yes");
//       } else {
//           System.out.println("No");
//       }

      //Find the index
//        int[] arr = {1,2,3,4,5};
//        int index = 0;
//        for (int i = 0; i < arr.length; i++){
//            index = arr[i];
//            System.out.println(index);
//        }
      // Sort the array in an asc. order

//        int[] arr = {1,2,3,4,5};
//        int tempo = 0;
//        for (int i = 0; i< arr.length - 1; i++){
//            for (int j = 0; j< args.length - i -1; i++){
//                if (arr[i] > arr[j + 1]){
//                    tempo = arr[i];
//                    arr[i] = arr[j + 1];
//                    arr[j + 1] = tempo;
//                    for(int a : arr){
//                        System.out.println(a + "");
//                    }
//                }
//            }
//        }


//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter number: ");
//        int i = input.nextInt();
//        do {
//            System.out.println(i);
//
//        } while (i < 0 || i > 10){
//                System.out.println(i + " is not between 1 and 10. Try again: ");
//            i = input.nextInt();
//        }
//            System.out.println(i);


//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter number: ");
//        int i = input.nextInt();
//        while (i < 0 || i > 10) {
//            System.out.println(i + " is not between 1 and 10. Try again: ");
//            i = input.nextInt();
//        }
//            System.out.println(i + " is between 1 and 10.");

//        int i = 11;
//        while (i <= 10) {
//            if (i < 0 || i > 10) {
//                System.out.println(i + " is not between 1 and 10. Try  again");
//                break;
//            } else {
//                System.out.println(i);
//                i++;
//            }

      // Create A Calculator.

//        Scanner input = new Scanner(System.in);
//        System.out.println("Welcome to Philip's Calculator");
//        System.out.print("Enter first number: " );
//        System.out.print("Enter Operator: ");
//        System.out.print("Enter second number: ");
//        double num1 = input.nextDouble();
//        char operator = input.next().charAt(0);
//        double num2 = input.nextDouble();
//
//
//        if( operator == '+'){
//            double result = num1 + num2;
//            System.out.println("Result is: " + result);
//        } else if( operator == '-'){
//            double result = num1 - num2;
//            System.out.println("Result is: " + result);
//
//        } else if( operator == '*'){
//            double result = num1 * num2;
//            System.out.println("Result is: " + result);
//
//        }else if( operator == '/') {
//            double result = num1 / num2;
//            System.out.println("Result is: " + result);
//        } else {
//            System.out.println("Invalid operator");
//        }

      // Creating a Calculator using Switch Statement;
//       int num1 = 10; int num2 = 12;
//       String operation = "Sub";
//      switch(operation){
//         case "Add":
//            System.out.println(num1 + num2);
//            break;
//         case "Sub":
//            System.out.println(num1 - num2);
//            break;
//            case "Mul":
//            System.out.println(num1 * num2);
//            break;
//            case "Div":
//            System.out.println(num1 / num2);
//            break;
//            case "Default":
//            System.out.println("invalid number");
//            break;
//      }





      // Write a program that asks the user to enter four-digit number
      // and tell if the number is a lucky number or not

//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter four digit number: ");
//        int number = input.nextInt();
//
//        if (!(number > 999 && (number < 10000))){
//            System.out.println("number should contain only 4-digit");
//
//        }
//
//       int fourthDigit = number % 10;
//       int thirdDigit = (number % 10) % 10;
//       int secondDigit = (number % 100) % 10;
//       int firstDigit = (number % 1000) % 10;
//
//       if(firstDigit + secondDigit == thirdDigit + fourthDigit)
//           System.out.println("lucky number");
//       else
//           System.out.println("not lucky");

      //INFINITE LOOP
      // for(; ;){ OR for(; true)
      //System.out.println("hello");


      //MORE LOOP QUESTION
      // QUEST.1. WRITE A JAVA PROGRAM TO PRINT "HELLO JAVA" ON SCREEN 100 TIMES
//       for (int i = 1; i<=100; i++){
//           System.out.println("Hello java " + i);
//       };
      //QUEST 2. WRITE A JAVA PROGRAM(USING LOOP) TO PRINT NUMBER FROM 1 TO 100 AS 20 LINES
//       for (int i = 1; i<=100; i++){
//           System.out.print(i);
//           if (i % 5 == 0) System.out.println("  ");
//           if (i <= 100)
//               System.out.print(" ");
//       }
      //QUEST 3.  WRITE A JAVA PROGRAM (using loop) TO DISPLAY MULTIPLY BASED ON USER INPUT
//       System.out.println("Enter an integer: ");
//       Scanner s = new Scanner(System.in);
//       int n = s.nextInt();
//
//       for (int i = 1; i<=n; i++)
//           System.out.println(n + " x " + i + " = " + (n * i));
         // OR
      //System.out.println(n * i);

      //QUEST 4. WRITE A JAVA PROGRAM (using nested loop) to display star as picture;
//       for (int i = 0; i< 5; i++) {
//          for (int j = 0; j<=i; j++){
//             System.out.print("*");
//          }
//          System.out.println();
//       }

      //QUEST 5. WRITE A JAVA PROGRAM (using nested loop) to display star as picture;
//      int n = 5;
//      for (int i = 1; i<=n; i++) {
//         for (int j = 1; j<=n-i; j++)
//            System.out.print(" ");
//            for (int j = 1; j<= 2*i-1; j++){
//               System.out.print("*");
//            }
//         System.out.println();
//      }

      //QUESTION 6. WRITE A FUNCTION TO CHECK IF A NUMBER IS PRIMARY NUMBER USING LOOP.
//      System.out.println("Enter an integer: ");
//      Scanner s = new Scanner(System.in);
//      int n = s.nextInt();
//      int count = 0;
//
//      for (int i = 1; i<=n; i++) {
//         if(n % i == 0) {
//            count++;
//         }
//      }
//         if (count == 2) {
//            System.out.println("Prime");
//         } else {
//            System.out.println("Not Prime");
//      }

//      boolean isPrime = true;
//      for (int i = 2; i <= n / 2; ++i) {
//         if (n % i == 0)
//             isPrime = false;
//         break;
//      }
//         System.out.println(isPrime ? "prime" : "not prime");

      //QUEST. 7. WRITE A FUNCTION TO CALCULATE FACTORIAL NUMBER using loop.
//       int num = 5;
//      int fact = 1;
//      for(int i = 1; i<=num; i++){
//         fact = fact * i;
//         System.out.println(fact);
//



      //QUEST 8. WRITE A JAVA PROGRAM TO PRINT ODD NUMBER FROM 1 TO 100;
//      for (int i = 0; i<=100; i++ ){
//         if (i % 2 != 0)
//         System.out.println(i);
//      }

      //QUEST 9. WRITE A JAVA PROGRAM TO RANDOM AN INTEGER NUMBER.
      // LOOP TO TELL USER TO QUEST BY INPUT NUMBER
//      Scanner s = new Scanner(System.in);
//      int min = 1, max = 100,
//      n = (int) (Math.random() * (max - min + 1) + min);
//      System.out.println("The number is an integer and is generated randomly from 1 to 100 " + "\n------");
//      while (true){
//         System.out.print("Quest a number: ");
//         int quest = s.nextInt();
//         if (quest < n) {
//            System.out.println("The number is " + "bigger than " + quest);
//         }
//         else if (quest > n){
//            System.out.println("The number is " + "smaller than " + quest);
//      }
//         else {
//            System.out.println("Congratulation! You're " + "correct, the number is " + n);
//            break;
//         }
//         System.out.println("---------------");
//
//      }






//import java.util.Scanner;

//Method
//  public class  Main{
//     public static void main(String[] args) {
//        //System.out.println("enter name and age: ");
//        System.out.println(getUserName("Philip") + " is " + getUserAge(27) + " years old");
//
//  }
//    public static String getUserName(String name){
//       //return new Scanner(System.in).nextLine();
////       Scanner s = new Scanner(System.in);
////       String name = s.nextLine();
//       return name;
//    }
//    public static int getUserAge(int age){
//       //return  new Scanner(System.in).nextInt();
////       Scanner v = new Scanner(System.in);
////       int age = v.nextInt();
//       return age;
//    }

//}


      }
   }

