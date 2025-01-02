// In below example, Student is a class, and name, roll_no, and CGPA are properties of that class. 
// s1 is an object of the Student class.


// Access modifiers determine the accessibility of properties and methods of a class. 
// There is some sensitive information which we don't want to be accessible outside the class. 
// To manage this, we use different access modifiers.


// To solve the accessibility problem, we use setters and getters in Java.
// Setter: to set the value.
// Getter: to get the value.


// Encapsulation: Wrapping up data and methods into a single class is known as encapsulation.
// It means initiating a class, defining its attributes, and hiding data. When all of this 
// happens in a single class, it falls under encapsulation.
// For instance, below we have created a Student class, defined its attributes and their visibility, 
// and created setters and getters. This all falls under encapsulation.

public class day23 {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Shubham");
        // s1.roll_no = 631; // This will throw an error because roll_no is private.
        s1.setRollNo(631); // This is how we can set the roll_no value.
        System.out.println(s1.getRollNo()); // This is how we can get the roll_no value.
        
        s1.setCGPA(9.0f); // This is how we can set the CGPA value.
        System.out.println(s1.getName()); // This will print the name.
        System.out.println(s1.getCGPA()); // This will print the CGPA.
        
        s1.setCGPA(8.0f); // Updating the CGPA value.
        System.out.println(s1.getCGPA()); // This will print the updated CGPA.
    }
}

class Student {
    private String name;
    private int roll_no; // roll_no is private, so it cannot be accessed directly from outside the class.
    private float CGPA;

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for roll_no
    public int getRollNo() {
        return roll_no;
    }

    public void setRollNo(int roll_no) {
        this.roll_no = roll_no;
    }

    // Getter and Setter for CGPA
    public float getCGPA() {
        return CGPA;
    }

    public void setCGPA(float CGPA) {
        this.CGPA = CGPA;
    }
}
