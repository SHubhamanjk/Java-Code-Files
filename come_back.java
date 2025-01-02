import java.util.*;

public class come_back {

    // Binary search function
    public static int binary_search(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid;
        // Binary search loop
        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                return mid;  // Target found
            }
        }
        return -1;  // Target not found
    }

    // Bubble sort function
    public static void bubble_sort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    // Selection sort function
    public static void selection_sort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int k = i;
            for (int j = i; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    k = j;
                }
            }
            int temp = arr[i];
            arr[i] = min;
            arr[k] = temp;
        }
    }

    // Insertion sort function
    public static void insertion_sort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        // Example array
        int arr[] = {5, 9, 1, 6, 7, 3, 2, 12, 5, 19};

        // Sorting the array using bubble sort
        bubble_sort(arr);
        System.out.print("Bubble Sorted array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Sorting the array using insertion sort
        insertion_sort(arr);
        System.out.print("Insertion Sorted array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Searching in the array using binary search
        int target = 5;
        int result = binary_search(arr, target);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }

        // Working with Student class
        Student s1 = new Student();
        s1.set_name("Shubham");
        s1.set_cgpa(7.8f);
        s1.set_roll(631);

        System.out.println("Student CGPA: " + s1.get_cgpa());
        s1.CGPA = 8.8f;
        System.out.println("Updated CGPA: " + s1.get_cgpa());

        Student s2 = new Student("Shubham", 512, 9.0f);
        System.out.println("Student Details: " + s2.get_name() + " " + s2.get_roll() + " " + s2.get_cgpa());

        Student s3 = new Student(s1);
        System.out.println("Copied Student Details: " + s3.get_name() + " " + s3.get_roll() + " " + s3.get_cgpa());

        s1.work();

        // Working with Child class
        Child c1 = new Child();
        c1.work();
    }
}

// Student class
class Student {
    String name;
    float CGPA;
    int roll_no;

    public void work() {
        System.out.println("Studying");
    }

    public void set_name(String name) {
        this.name = name;
    }

    public String get_name() {
        return this.name;
    }

    public int get_roll() {
        return this.roll_no;
    }

    public void set_roll(int roll) {
        this.roll_no = roll;
    }

    public void set_cgpa(float cgpa) {
        this.CGPA = cgpa;
    }

    public float get_cgpa() {
        return this.CGPA;
    }

    // Constructor with parameters
    Student(String name, int roll, float CGPA) {
        this.name = name;
        this.roll_no = roll;
        this.CGPA = CGPA;
    }

    // Copy constructor
    Student(Student s) {
        this.name = s.name;
        this.roll_no = s.roll_no;
        this.CGPA = s.CGPA;
    }

    // Default constructor
    Student() {
    }
}

// Child class inheriting from Student class
class Child extends Student {
    String father_name;
    String mother_name;
    String address;

    @Override
    public void work() {
        System.out.println("Playing");
    }
}
