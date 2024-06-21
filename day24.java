// Constructors: A constructor is a special method that is invoked automatically at the time of object creation. 
// It allows us to initialize the object's properties. We can also pass parameters while creating an object of the class.

// There are 3 types of constructors:
// 1. Parameterized Constructor: Takes arguments to initialize the object.
// 2. Non-Parameterized Constructor: Does not take any arguments.
// 3. Copy Constructor: Initializes a new object as a copy of an existing object.

// Constructor Overloading: The concept of having more than one constructor with different parameters in the same class. 
// This is similar to method overloading and function overloading.

// Shallow and Deep Copy: 
// - Shallow Copy: The copied object shares the same references as the original object. Changes in one object reflect in the other.
// - Deep Copy: A new copy of the object's fields is created, so changes in one object do not affect the other.

// Destructors: In Java, destructors are used to delete unused objects from memory. This process happens automatically through garbage collection.

// Inheritance: When one class acquires the properties and methods of another class. This is known as inheritance.

public class day24 {
    public static void main(String[] args) {
        // Create a new Student object using the parameterized constructor
        Student s1 = new Student("Shubh");
        System.out.println(s1.Name); // Output the name of the student
        s1.roll = 631; // Set roll number
        s1.cgpa = 8; // Set CGPA
        s1.marks[0] = 80; // Set marks for 3 subjects
        s1.marks[1] = 100;
        s1.marks[2] = 70;

        // Creating a new Student object using the copy constructor
        Student s2 = new Student(s1);
        // Modifying the marks of s1 to demonstrate deep copy
        s1.marks[1] = 90;

        System.out.println(s2.Name); // Output the name of the copied student
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]); // Should print the original marks without the modification in s1
        }

        // Create a Fish object and call its methods
        Fish f1 = new Fish();
        f1.breath(); // Call the breath method from the Animal class
        f1.fins(); // Call the fins method from the Fish class
    }
}

class Student {
    String Name;
    int roll;
    double cgpa;
    int[] marks;

    // Parameterized Constructor
    Student(String name) {
        this.Name = name;
        this.marks = new int[3]; // Initialize the marks array
    }

    // Copy Constructor
    Student(Student s1) {
        this.Name = s1.Name; // Copy the name
        this.roll = s1.roll; // Copy the roll number
        this.cgpa = s1.cgpa; // Copy the CGPA
        this.marks = new int[3]; // Initialize the marks array
        
        // Deep copy: Copy each element individually to avoid sharing the same reference
        for (int i = 0; i < 3; i++) {
            this.marks[i] = s1.marks[i];
        }
    }
}

class Animal {
    // Method to simulate eating
    void eats() {
        System.out.println("Eating");
    }

    // Method to simulate breathing
    void breath() {
        System.out.println("Breathing");
    }
}

class Fish extends Animal {
    // Method to display information about fins
    void fins() {
        System.out.println("Number of fins are ::: ");
    }
}
