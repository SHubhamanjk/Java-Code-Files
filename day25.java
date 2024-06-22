/* 
These are the types of inheritance in Java:
    1. Single Level Inheritance: In this, one class inherits from another class. 
    2. Multi-Level Inheritance: In this, a class is derived from another derived class.
    3. Hierarchical Inheritance: In this, one base class has multiple derived classes.
    4. Hybrid Inheritance: This is a combination of two or more types of inheritance. 
       Note: Java doesn't support multiple inheritance directly to avoid complexity, but it can be achieved using interfaces.


Polymorphism: Polymorphism allows methods to do different things based on the object it is acting upon. 
    There are two types of polymorphism in Java:
    1. Compile-time polymorphism (Method Overloading): This occurs when multiple methods have the same name but different parameters.
    2. Runtime polymorphism (Method Overriding): This occurs when a subclass provides a specific implementation of a method that is already defined in its superclass.

    
Packages: Packages are used to group related classes, interfaces, enumerations, and annotations.
    There are two types of packages:
    1. Built-in Packages: These are provided by the Java API (e.g., java.util, java.io).
    2. User-defined Packages: These are created by the user to bundle related classes.

*/

public class day25 {
    public static void main(String[] args) {
        // Creating the object of the Parent class 
        Parent p1 = new Parent(); 
        p1.home_name = "Shubham Niwas";
        p1.family_members_count = 5;  
        p1.income = 150;

        System.out.println(p1.home_name);
        System.out.println(p1.family_members_count); 
        System.out.println(p1.income);

        System.out.println("*******************");
        
        // Setting values using setters
        Parent p2 = new Parent();
        p2.setHome_name("GEC Hostel");
        p2.setIncome(200);  
        p2.set_family_member_count(300);

        System.out.println(p2.getHome_name());
        System.out.println(p2.getIncome()); 
        System.out.println(p2.get_family_members_count());

        System.out.println("*******************");
        
        Parent p3 = new Parent();
        p3.set_all_properties(500, 3, "Aanand Bhawan");
        p3.get_all_properties();

        System.out.println("*******************");
        
        // Creating object using parameterized constructor
        Parent p4 = new Parent(2500, "Kilsa", 5); 
        p4.get_all_properties();

        System.out.println("*******************");
        
        // Creating object using copy constructor
        Parent p5 = new Parent(p2); 
        p5.get_all_properties();

        System.out.println("*******************");

        // Creating Child object to demonstrate single level inheritance
        Child c1 = new Child(); 
        c1.home_name = "Mistara";
        c1.family_members_count = 5;
        c1.income = 1000;
        c1.name = "Ayush";
        c1.height = 155;
        c1.age = 9;
        c1.weight = 41;

        System.out.println(c1.home_name);
        System.out.println(c1.name);
        System.out.println(c1.weight);

        System.out.println("*******************");

        // Creating Student object to demonstrate multi-level inheritance
        Student s1 = new Student();
        s1.name = "Aman";
        s1.marks = 96;
        s1.roll_no = 69;
        s1.Class = 4;
        s1.age = 15;
        s1.height = 158;
        s1.weight = 52;
        s1.home_name = "Vistara";
        s1.income = 658;
        s1.family_members_count = 4;

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.income);
        System.out.println(s1.marks);

        System.out.println("*******************");

        // Demonstrating method overriding
        Animal a1 = new Animal();
        a1.eats();

        System.out.println("*******************");

        Deer d1 = new Deer();
        d1.eats();
    }
}

class Parent { 
    int income;
    int family_members_count; 
    String home_name;

    void setHome_name(String home_name) { 
        this.home_name = home_name;
    }

    void setIncome(int income) {
        this.income = income;
    }

    void set_family_member_count(int family_members_count) {
        this.family_members_count = family_members_count;
    }

    String getHome_name() {
        return this.home_name;
    }

    int getIncome() {
        return this.income;
    }

    int get_family_members_count() {
        return this.family_members_count;
    }

    void set_all_properties(int income, int family_members_count, String home_name) {
        this.home_name = home_name;
        this.income = income;
        this.family_members_count = family_members_count;
    }

    void get_all_properties() {
        System.out.println("Home Name: " + this.home_name);
        System.out.println("Family Members Count in " + this.home_name + ": " + this.family_members_count);
        System.out.println("Income of " + this.home_name + " family: " + this.income);
    }

    // Examples of method overloading 
    Parent(int income, String home_name, int family_members_count) { 
        this.income = income;
        this.home_name = home_name;
        this.family_members_count = family_members_count;
    }

    Parent() { 
    }

    Parent(Parent object) { 
        this.home_name = object.home_name;
        this.family_members_count = object.family_members_count;
        this.income = object.income;
    }
}

// Single level inheritance example
class Child extends Parent { 
    String name;
    int age;
    int weight;
    int height;

    // Getters and setters for Child class can be added similarly
}

// Multi-level inheritance example
class Student extends Child {
    int marks;
    int roll_no;
    int Class;
    String school_name;

    // Getters and setters for Student class can be added similarly
}

// Method overriding example
class Animal {
    void eats() {
        System.out.println("Eats anything...");
    }
}

class Deer extends Animal {
    @Override
    void eats() {
        System.out.println("Eats grass...");
    }
}
