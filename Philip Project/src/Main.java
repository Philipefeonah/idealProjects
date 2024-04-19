import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //EXERCISE
        // 1. Create an ArrayList of Accounts
        // 2. Display the number of deposits and withdrawals of each account

//        ArrayList<Account> accounts = new ArrayList<>();
//
//        Client \client = new Client(1, "Philip", "08129266549");
//
//        accounts.add(new Account(1, 1000,100,client));
//        accounts.add(new Account(2, 2000,200,client));
//
//        accounts.get(0).withdraw(1000);
//        accounts.get(0).withdraw(2000);
//        accounts.get(0).deposit(1000);
//        accounts.get(0).deposit(2000);
//
//        accounts.get(1).deposit(100);
//        accounts.get(1).deposit(200);
//
//        System.out.println(accounts.get(0));

//        for(Account account : accounts){
//            System.out.println("Account " + account.getId() + ":");
//        System.out.println("W " + account.countTransactions('W')+ ":");
//            System.out.println("D " + account.countTransactions('D')+ ":");

        //Trial
//        Account[] accounts = new Account[2];
//        accounts[0] = new Account(10, 1000,100,
//                new Client(1,"Philip","08129266549"));
//        accounts[0].deposit(500);
//        accounts[0].withdraw(300);
//
//        accounts[1] = new Account(20, 2000,200,
//                new Client(2,"Phil","08129266555"));
//        accounts[1].deposit(400);
//        accounts[1].withdraw(200);
//
//        System.out.println(accounts[0]);
//        System.out.println(accounts[1]);

        //EXERCISE
        // 1. Create an array of 2 clients
        // 2. Add 3 accounts for the first client and 3 for the second one
        // print the information of each client using toString()

//      Client[] clients = new Client[2];
//      clients[0] = new Client(11,"Philip", "08129266549");
//      clients[0].addAccount(new Account(12,1000,20));
//      clients[0].addAccount(new Account(13,2000,30));
//
//        clients[1] = new Client(14,"Samuel", "08129266555");
//        clients[1].addAccount(new Account(15,3000,40));
//        clients[1].addAccount(new Account(16,4000,50));
//        clients[1].addAccount(new Account(17,5000,60));
//
//        System.out.println(clients[0]);
//        System.out.println(clients[1]);
//
         // EXERCISE
        // 1. Create an Object of the Account class
        // 2. Withdraw 2500 from the Account
        // 3. Deposit 3000 to the Account
        // 4. Print out the Account's information

//        Account testAccount = new Account(1122, 20_000, 4.5);
//        if(testAccount.withdraw(2000)){
//            System.out.println("Withdraw succesful");
//        } else
]//            System.out.println("Withdraw Not successful");
//
//        testAccount.deposit(3000);
//        System.out.println(testAccount.getId() + " "
//                + testAccount.getBalance() + " "
//                + testAccount.getAnnualInterestRate() + " "
//                +testAccount.getDateCreated().toString());


//        Circle c1 = new Circle(new Point(1, 2), 3);
//        System.out.println(c1.getArea());

        //EXERCISE
        //Write a program that takes an integer input from the user and prints whether it is positive, negative, or zero

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int num = scanner.nextInt();
//
//        if (num > 0){
//            System.out.println("Positive");
//        } else if (num < 0) {
//            System.out.println("Negative");
//        } else {
//            System.out.println("Zero");
//        }

//        //Write a program that takes two integers from the user and prints their sum, difference, product, and quotient.
//        System.out.print("Enter two integers : ");
//        Scanner scanner = new Scanner(System.in);
//        int num1 = scanner.nextInt();
//        int num2 = scanner.nextInt();
//
//        int sum = num1 + num2;
//        System.out.println("Sum: " + sum);
//
//        int difference = num1 - num2;
//        System.out.println("Difference: " + difference);
//
//        int product = num1 * num2;
//        System.out.println("Product: " + product);
//
//        int quotient = num1 / num2;
//        System.out.println("Quotient: " + quotient);

//        //Write a program that takes an integer input from the user and prints whether it is odd or even.
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter an integer: ");
//        int num = scanner.nextInt();
//
//        if(num % 2 == 0){
//            System.out.println("Even number");
//        } else {
//            System.out.println("Odd number");
//        }

//        //Write a program that takes a character input from the user and prints whether it is a vowel or a consonant.
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a Character: ");
//        char c = scanner.next().charAt(0);
//
//        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
//            System.out.println("Vowel");
//        } else {
//            System.out.println("Consonant");
//        }

        //Write a program that takes a string input from the user and prints its length.
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter length of String: ");
//        String string = scanner.nextLine();
//        System.out.println(string.length());

//        //Write a program that takes a string input from the user and prints the reverse of the string.
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a String: ");
//        String string = scanner.nextLine();
//        String reverse = " ";
//        int len = string.length();
//        for (int i = len - 1; i >= 0; i--) {
//        reverse += string.charAt(i);
//        System.out.println(reverse);

//        String string = "Philip";
//        String reverse = " ";
//        for (int i = string.length()-1; i >= 0; i--) {
//            reverse = reverse + string.charAt(i);
//            System.out.println(reverse);

        //Write a program to find the smallest element in an array.

        //Write a program to find the index of a specific element in an array.
        //Write a program to sort an array in ascending order.
        //Write a program to remove duplicates from an array.
        //Write a program to reverse an array.


//
//    }
}
}

//        var control = new TextBox();
//        control.clear();
//        control.disable();
//        System.out.println(control.isEnabled());

//        var textBox1 = new TextBox();
//        textBox1.setText("Box 1");
//        System.out.println(textBox1.text.toUpperCase());
//
//        var textBox2 = new TextBox();
//        textBox2.setText("Box 2");
//        System.out.println(textBox2.text.toUpperCase());

//        var textBox1 = new TextBox();
//        var textBox2 = textBox1;
//        textBox2.setText("Hello World");
//        System.out.println(textBox1.text);

        //Calculate the salary wage
//        int baseSalary = 10_000;
//        int extraHours = 20;
//        int hourlyRate = 30;
//        int wage = calculateWage( baseSalary, extraHours, hourlyRate);
//        System.out.println(wage);
//    }
//    public static int calculateWage(int baseSalary,int extraHours, int hourlyRate){
//        return baseSalary + (extraHours * hourlyRate);

//        //Encapsulation
//      var employee = new Employee();
//      employee.baseSalary = 10_000;
//      employee.hourlyRate = 20;
//      int wage = employee.calculateWage(40);
//        System.out.println(wage);

        //GETTERS AND SETTERS
//        var employee = new Employee();
//        employee.setBaseSalary(50_000);
//        employee.setHourlyRate(20);
//        int wage = employee.calculateWage(40);
//        System.out.println(wage);

        //ABSTRACTION

        //INHERITANCE


        //CREATING METHOD
//       greetUser("Philip");
//       greetUser("Efeonah");

//        String message = greetUser("Philip", "Efeonah");
//        System.out.println(message);
//        }
//
//    public static String greetUser(String firstName, String secondName){
//        return "Hello " + firstName + " " + secondName;


//        System.out.println("Hello and welcome!");
//       for (int i = 1; i <= 5; i++) {
//            System.out.println("i = " + i);
//        }
//        Variables
//        int myAge = 30;
//        int herAge = myAge;
//        System.out.println(herAge);

//        Primitive Types => it is used for storing simple values like;
       /* Types     Bytes    Range
          Bytes       1       128, 127
          Short       2       -32k, 32k
          Int         4       -2B, 2B
          Long        8
          Float       4
          Double      8
          char        2        A,B,C
          Boolean     1        true or false

         Byte age = 30;
         int number = 32465;
         Long digit = 5_133_234_567L
         Float price = 10.99F;
         Char alphabet = 'A';

         byte x= 30;
         byte y= x;
         X=2;
         System.Out.Println(y);

          Reference Type => it is used to stored complex object like;
          date, mail messages. when declaring reference types we allocate memory using the new operator
          Reference type do not store an actual value, it is a pointer to the object in a memory*/
//          Date Now = new Date(); // the variable Now is an instance of the Date Class. classes is a template for creating a new object.
//        System.out.println(Now);

//        Point point1 = new Point(1,1);
//        Point point2 = point1;
//        point1.x = 2;
//        System.out.println(point2);

//          STRING => Strings are sequence of character.
//          String message = "Hello World" + "!!";
//        System.out.println(message.toUpperCase()); // you can use methods to Modify the string class.
//        System.out.println(message);

//          //Escape Sequences
//        String message = "Hello Philip";
//        String message2 = "Hello \"Philip\"";
//        String message3 = "c:\\Window...\\";
//        String message4 = "Hello \nPhilip";
//        String message5 = "hello \tPhilip";
//        System.out.println(message5);

//        //ARRAYS => Arrays are used to store a collection or lists of items.
//        int[] numbers = new int[5];
//        numbers[0] = 1;
//        numbers[1] = 2;
//        numbers[2] = 3;
//        System.out.println(Arrays.toString(numbers));
//
//        int[] numbers1 = {1,2,3,4,5};
//        System.out.println(numbers1.length);
//        Arrays.sort(numbers1);
//        System.out.println(Arrays.toString(numbers1));

//        //MULTIDIMENSIONAL ARRAY
//        int[][] numbers = new int[2][3];
//        numbers[0][0] = 1;
//        System.out.println(Arrays.deepToString(numbers));
//
//        int[][] numbers1 = {{1,2,3}, {4,5,6}};
//        numbers1[0][0] = 1;
//        System.out.println(Arrays.deepToString(numbers1));

        //CONSTANTS
//        final float PI = 3.142F;

//        ARITHMETIC EXPRESSION
//        +, -, /, *, x++ && ++x, +=,-=,/=,*=;

        //CASTING
//        //Implicit Casting => means automatic conversion. byte > short > int > long > float > double
//        short x =1;
//        int y = x + 2;
//        System.out.println(y);
//        //Explicit Casting => it only occurs with compatible types
//        double p =1.1;
//        int h = (int)p + 2; //=> explicit casting
//        System.out.println(h);
//        String n = "1";
//        int m = Integer.parseInt(n) + 3;
//        System.out.println(m);

//        The Math Class
//          Math.round(); Math.floor(); Math.ceil(); Math.random(); etc.

        //Formatting Numbers
//        NumberFormat currency = NumberFormat.getCurrencyInstance();
//        String result = currency.format(123456.56);
//        System.out.println(result);
//        NumberFormat percentage = NumberFormat.getPercentInstance();
//        String result1 = percentage.format(0.5);
//        System.out.println(result1);

        //Reading Input
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Name: ");
//         String Name = scanner.nextLine();
//        System.out.println("You are " + Name);

        //PROJECT => MORTGAGE CALCULATOR.
//        final byte Month_In_A_Year = 12;
//        final byte Percentage = 100;
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Principal");
//        int Principal = scanner.nextInt();
//
//        System.out.print("Annual Interest Rate");
//        float annualInterest = scanner.nextFloat();
//        float monthlyInterest = annualInterest/Percentage/Month_In_A_Year;
//
//        System.out.print("Years");
//        byte Years = scanner.nextByte();
//        int numberOfPayment = Years * Month_In_A_Year;
//
//        double mortgage = Principal * (monthlyInterest* Math.pow(1+monthlyInterest, numberOfPayment)
//                /(Math.pow(1+monthlyInterest, numberOfPayment)-1));
//
//        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(0.1);
//        System.out.println(mortgageFormatted);

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Number: ");
//        int Number = scanner.nextInt();
//
//        if(Number % 5 == 0 && Number % 3 == 0){
//            System.out.println("FizzBuzz");
//        } else if(Number % 5 == 0){
//            System.out.println("Fizz");
//        } else if (Number % 3 == 0) {
//            System.out.println("Buzz");
////        }
//        for (int i = 5; i >0; i-- ){
//            System.out.println("Hello World " + i);
//        };
//        int i = 0;
//        while(i <= 5){
//            System.out.println("Hello World " + i);
//            i++;
////        }
//        String[] fruits = {"Apple", "Mango", "Orange"};
//        for (int i = 0; i< fruits.length; i++)
//            System.out.println(fruits[i]);
//        for(String fruit : fruits)
//            System.out.println(fruit);





/* java was developed by James Gosling in 1995 at sun microsystem, which was later acquired by Oracle in 2010.
it was originally called oak, then later changed to green and finally renamed as Java.inspired from a coffee tea. just like the logo.
there are four editions of java for building different applications.
Java Standard Edition => this is the core Java Platform.it contains all the libraries every Java developers must learn.
Java Enterprise Edition => this is used for building very large scale and distributive systems. it is built on top of JSE
and provides additional libraries for building tolerant, distributed micro multi-tier software.
Jav Micro Edition => it is a subset of Java standard Edition designed for mobile devices.
Java Card => Java Card is used in smart cards.
The lastest edition of Java is Java SE 12. which was released in March 2019. Java has 9million developers worldwide.
3billion mobile phones run java, as well as 120 million tv sets.
Course Structure
TYPES
CONTROL FLOW
CLEAN CODING
FINDING AND FIXING ERRORS
PACKAGING YOUR APPLICATIONS

Function is a block of code that performs a task. we call a function in Java by specifying the return type.
some functions return a value like a number, a date time etc.while functions like Void do not return anything.
every function has a name.a function does not exist on it own.it has a class.these kinds of functions are refer to as Method
 A class is a container for related functions. class is used to organize our code. every class must at least
 contain a main function called Class Main. when a function belongs to a class, it is called A method of that class.
  a function outside the class is called Function. in Java naming convention system for classes.
  Classes uses PascalNamingConvention. which means every first letter is capitalized.
  Method uses camelNamingConvention. which means every first letter is capitalized except the first word letter

  Questions 1- What is the difference between a class and an object?  2- What does instantiating mean?  3- What is the difference between stack and heap memory? How are they managed?  4- What are the problems of procedural code? How does object-oriented  programming help solve these problems?  5- What is encapsulation?  6- Why should we declare fields as private?  7- What is abstraction? 8- What is coupling?  9- How does the abstraction principle help reduce coupling?  10- What are constructors?
11- What is method overloading?  12- What are static methods?

Answers1- A class is a blueprint or template for creating objects. An object is an instance of a class.
2- Instantiating means creating an instance of a class: new Customer()
3- Stack is used for storing primitive types (numbers, boolean and character) and variables that store references to objects in the heap. Variables stored in the stack are immediately cleared when they go out of scope (eg when a method finishes execution). Objects stored in the heap get removed later on when they’re no longer references. This is done by Java’s garbage collector.
 4- Big classes with several unrelated methods focusing on different concerns and responsibilities. These methods often have several parameters. You often see the same group of parameters repeated across these methods. All you see is procedures calling each other passing arguments around. By applying object-oriented programming techniques, we extract these repetitive parameters and declare them as fields in our classes. Our classes will then encapsulate both the data and the operations on the data (methods). As a result, our methods will have fewer parameters and our code will be cleaner and more reusable.
5- Encapsulation is the first principle of object-oriented programming. It suggests that we should bundle the data and operations on the data inside a single unit (class).
 6- How we store data in an object is considered an implementation detail. We may change how we store the data internally. Plus, we don’t want our objects to go into a bad state (hold bad data). That’s why we should declare fields as private and provide getters and or setters only if required. These setters can ensure our objects don’t go into a bad state by validating the values that are passed to them.
 7- Abstraction is the second principle of object-oriented programming. It suggests that we should reduce complexity by hiding the unnecessary implementation details. As a metaphor, think of the remote control of your TV. All the complexity inside the remote control is hidden from you. It’s abstracted away. You just work with a simple interface to control your TV. We want our objects to be like our remote controls.
 8- Coupling represents the level of dependency between software entities (eg classes). The more our classes are dependent on each other, the harder it is to change them. Changing one class may result in several cascading and breaking changes.
 9- By hiding the implementation details, we prevent other classes from getting affected when we change these details. For example, if the logic board and transistors inside a remote control change from one model to another, we’re not affected. We still use the same interface to work with our TV. Also, reducing these details and exposing fewer methods makes
our classes easier to use. For example, remote controls with fewer buttons are easier to use.
10- Constructors are called when we instantiate our class. We use them to initialize our objects. Initialization means putting an object into an early or initial state (eg giving it initial values).
11- Method overloading means declaring a method with the same name but with different signatures. The number, type and order of its parameters will be different.
12- Static methods are accessible via classes, not objects. */