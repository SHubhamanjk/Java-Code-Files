/*

Abstraction

    Definition: Abstraction is the concept of hiding unnecessary details from the user and showing only the important details.

    Types:

        Abstract Classes: These are classes that cannot be instantiated. They can have abstract methods (without body) and concrete methods 
        (with body).You can still call the constructors of abstract classes.

        Interfaces: These are blueprints for classes. They can only have abstract methods (until Java 8), and classes implementing interfaces 
        must provide the implementation for all the methods declared in the interface.


Static Keyword

    Definition: The static keyword is used to indicate that a particular member (variable or method) belongs to the class itself, rather than to 
    instances of the class. It means that the value is shared among all instances of the class.


Super Keyword
    Definition: The super keyword is used to access methods and constructors of the immediate parent class. It is useful to call parent 
    class methods and constructors, particularly when you want to override methods or extend the constructor's functionality.

 */

import java.util.Scanner;

// Main class to demonstrate various concepts in Java
public class day26 {
    public static void main(String[] args) {
        // Abstraction example using the Animal class
        System.out.println("OOP Example:");
        horse h1 = new horse();
        h1.eats(); // Calling the eats method of horse
        h1.walks(); // Calling the walks method of horse

        // Complex Number Calculator
        Scanner sc = new Scanner(System.in);
        System.out.println("\nWelcome to Complex Calculator...");
        System.out.print("What Operation do you want to perform (+, -, *)? ");
        char opr = sc.nextLine().charAt(0);
        System.out.println("Nice !!! You want to perform " + opr + " Operation");

        // Getting user input for the first complex number
        System.out.print("Enter the Real Part of 1st Complex Number: ");
        int temp_real_1 = sc.nextInt();
        System.out.print("Enter the Imaginary Part of 1st Complex Number: ");
        int temp_imaginary_1 = sc.nextInt();

        // Getting user input for the second complex number
        System.out.print("Enter the Real Part of 2nd Complex Number: ");
        int temp_real_2 = sc.nextInt();
        System.out.print("Enter the Imaginary Part of 2nd Complex Number: ");
        int temp_imaginary_2 = sc.nextInt();

        // Creating Complex objects for the input numbers
        Complex c1 = new Complex(temp_real_1, temp_imaginary_1);
        Complex c2 = new Complex(temp_real_2, temp_imaginary_2);

        Complex result = null;
        // Performing the chosen operation
        switch (opr) {
            case '+':
                result = Complex.sum_of_two_complex(c1, c2);
                break;
            case '-':
                result = Complex.diff_of_two_complex(c1, c2);
                break;
            case '*':
                result = Complex.product_of_two_complex(c1, c2);
                break;
            default:
                System.out.println("Invalid Operation!");
                return;
        }

        // Displaying the result
        System.out.print("The result is: ");
        result.get_complex_number();
        sc.close();
    }
}

// Abstract class demonstrating abstraction
abstract class Animal {
    // Constructor of Animal class
    Animal() {
        System.out.println("Animal Constructor called !!!");
    }

    // Non-abstract method
    void runs() {
        System.out.println("Running ");
    }

    // Abstract methods to be implemented by subclasses
    abstract void eats();

    abstract void walks();
}

// Subclass extending abstract class Animal
class horse extends Animal {
    // Constructor of horse class
    horse() {
        System.out.println("Horse Constructor Called !!!");
    }

    // Implementation of abstract methods
    void walks() {
        System.out.println("Horse walks");
    }

    void eats() {
        System.out.println("Horse Eats");
    }
}

// Subclass extending abstract class Animal
class chicken extends Animal {
    // Constructor of chicken class
    chicken() {
        System.out.println("Chicken Constructor Called !!!");
    }

    // Implementation of abstract methods
    void walks() {
        System.out.println("Chicken walks");
    }

    void eats() {
        System.out.println("Chicken Eats");
    }
}

// Class demonstrating complex number operations
class Complex {
    int real_part;
    int imaginary_part;

    // Setter and getter methods
    void set_real_part(int num) {
        this.real_part = num;
    }

    int get_real_part() {
        return this.real_part;
    }

    void set_imaginary_part(int num) {
        this.imaginary_part = num;
    }

    int get_imaginary_part() {
        return this.imaginary_part;
    }

    void set_complex_number(int real_part, int imaginary_part) {
        this.real_part = real_part;
        this.imaginary_part = imaginary_part;
    }

    // Method to display the complex number
    void get_complex_number() {
        System.out.println(this.real_part + " + " + this.imaginary_part + "i");
    }

    // Constructors
    Complex() {
    }

    Complex(int real_part, int imaginary_part) {
        this.real_part = real_part;
        this.imaginary_part = imaginary_part;
    }

    Complex(Complex c) {
        this.real_part = c.real_part;
        this.imaginary_part = c.imaginary_part;
    }

    // Static method to sum two complex numbers
    public static Complex sum_of_two_complex(Complex c1, Complex c2) {
        int temp_real = c1.real_part + c2.real_part;
        int temp_imaginary = c1.imaginary_part + c2.imaginary_part;
        return new Complex(temp_real, temp_imaginary);
    }

    // Static method to find the difference between two complex numbers
    public static Complex diff_of_two_complex(Complex c1, Complex c2) {
        int temp_real = c1.real_part - c2.real_part;
        int temp_imaginary = c1.imaginary_part - c2.imaginary_part;
        return new Complex(temp_real, temp_imaginary);
    }

    // Static method to find the product of two complex numbers
    public static Complex product_of_two_complex(Complex c1, Complex c2) {
        int temp_real = (c1.real_part * c2.real_part) - (c1.imaginary_part * c2.imaginary_part);
        int temp_imaginary = (c1.real_part * c2.imaginary_part) + (c1.imaginary_part * c2.real_part);
        return new Complex(temp_real, temp_imaginary);
    }
}
