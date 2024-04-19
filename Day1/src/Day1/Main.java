package Day1;

import Day2.Liberian;
import Day2.Person;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String name = new String("Daro");

        PhilipString philip = new PhilipString();
        PhilipString someoneName = new PhilipString("Laptop");

        someoneName.callMyName();

        System.out.println(name);
        System.out.println(someoneName);
        System.out.println(philip);

        Animal humanDaro = new Animal();
        humanDaro.setName("Daro");
        humanDaro.setComplexion("Dark");
        humanDaro.setAge(20);
        humanDaro.setAlive(true);
        humanDaro.setEyesAvailable(true);
        humanDaro.setNumberOfLeg(2);

        System.out.println(humanDaro);


        Animal animalDog = new Animal();

//TODO: FIND ENCAPSULATION
        //The wrapping up of data into a single entity; for example Class; is known as encapsulation.
        // It is the act of putting various entities together.
        // In java, encapsulation helps to keep the sensitive data hidden from the users
//TODO: FIND POLYMORPHISM
        //Polymorphism means many forms. In java, polymorphism can be achieved using method overloading and method overriding.
        // When a method has the same name but differs in either return type or parameter list they are known as overloaded functions
        // and are an example of polymorphism.
        //There are two types of polymorphism in java; namely, compile-time polymorphism and runtime polymorphism.
//TODO: CREATE INHERITANCE
        //Inheritance as the name suggests is the act of inheriting properties of the previously declared class

//TODO: FIND/CREATE ABSTRACTION
        // Abstraction is the process of hiding implementation details from the end-user.
    }
}