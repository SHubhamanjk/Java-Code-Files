/*
 Recursion: When a function calls itself repeatedly, this process is called recursion.

 Base Case: The condition that stops the function from calling itself.

 Rules for recursion:
    1. Create the function.
    2. Set the base case.
    3. Call the function within itself.

---Recursion works on a stack.

 Stack Overflow: When there is no base case in recursion or it is never met, stack overflow occurs because the function keeps calling itself indefinitely.
 */

 public class day27 {

    // Overloaded print methods for different data types
    public static void print(String c){
        System.out.println(c);
    }
    public static void print(StringBuilder c){
        System.out.println(c);
    }
    public static void print(int c){
        System.out.println(c);
    }
    public static void print(char c){
        System.out.println(c);
    }
    public static void print(float c){
        System.out.println(c);
    }
    public static void print(boolean c){
        System.out.println(c);
    }

    // Method to print numbers in decreasing order using recursion
    public static int print_numbers_decrs(int n){
        if(n == 0){  // Base case
            return 0;
        } else {
            System.out.print(" " + n + " ");
            return print_numbers_decrs(n - 1);  // Recursive call
        }
    }

    // Method to print numbers in increasing order using recursion
    public static void print_number_incrs(int n){
        if(n == 0){  // Base case
            return;
        } else {
            print_number_incrs(n - 1);  // Recursive call
            System.out.print(" " + n + " ");
        }
    }

    // Method to find factorial of a number using recursion
    public static int find_fact(int n){
        if(n == 1){  // Base case
            return 1;
        } else {
            return n * find_fact(n - 1);  // Recursive call
        }
    }

    // Method to find the sum of first n natural numbers using recursion
    public static int Natural_Sum(int n){
        if(n == 1){  // Base case
            return 1;
        } else {
            return n + Natural_Sum(n - 1);  // Recursive call
        }
    }

    // Method to find the nth Fibonacci number using recursion
    public static int print_nth_febonacci_num(int n){
        if(n == 0 ){  // Base case
            return 0;
        } else if(n == 1){  // Base case
            return 1;
        } else {
            return print_nth_febonacci_num(n - 1) + print_nth_febonacci_num(n - 2);  // Recursive call
        }
    }

    // Method to check if an array is sorted using recursion
    public static boolean is_sorted(int arr[], int i){
        if(i == arr.length - 1){  // Base case
            return true;
        } else {
            if(arr[i] > arr[i + 1]){
                return false;
            } else {
                return is_sorted(arr, i + 1);  // Recursive call
            }
        }
    }

    // Method to find the first occurrence of a target in an array using recursion
    public static int first_occurance(int arr[], int target, int i){
        if(i == arr.length - 1){  // Base case
            return -1;
        } else if(arr[i] == target){
            return i;
        } else {
            return first_occurance(arr, target, i + 1);  // Recursive call
        }
    }

    // Method to find the last occurrence of a target in an array using recursion
    public static int last_occurance(int arr[], int target, int i){
        if(i == arr.length){  // Base case
            return -1;
        } else if(arr[arr.length - 1 - i] == target){
            return arr.length - 1 - i;
        } else {
            return last_occurance(arr, target, i + 1);  // Recursive call
        }
    }

    // Method to calculate exponential value using recursion
    public static int exponential(int num, int power){
        if(power == 0){  // Base case
            return 1;
        } else {
            return num * exponential(num, power - 1);  // Recursive call
        }
    }

    // Optimized method to calculate exponential value using recursion
    public static int optimized_exponential(int num, int power){
        if(power == 0){  // Base case
            return 1;
        }
        
        int half_sqr = optimized_exponential(num, power / 2);  // Recursive call
        int final_sqr = half_sqr * half_sqr;
        
        if(power % 2 != 0){
            final_sqr = num * final_sqr;
        }

        return final_sqr;
    }

    // Method to remove duplicate characters from a string using iteration
    public static StringBuilder remove_dupilicates(StringBuilder inputt){
        StringBuilder input = new StringBuilder(inputt.toString().toLowerCase());
        for(int i = 0; i < input.length(); i++){
            for(int j = 0; j < input.length(); j++){
                if(i != j){
                    if(input.charAt(i) != ' '){
                        if(input.charAt(i) == input.charAt(j)){
                            input.replace(j, j + 1, "");
                        }
                    }
                }
            }
        }
        return input;
    }

    // Method to remove duplicate characters from a string using recursion
    public static void remove_duplicates_recursion(String input, StringBuilder output, int idx, boolean map[]){
        if(idx == input.length()){  // Base case
            System.out.println(output);
            return;
        }
        char curr_char = input.charAt(idx);
        if(map[curr_char - 'a'] == true){
            remove_duplicates_recursion(input, output, idx + 1, map);  // Recursive call
        } else {
            map[curr_char - 'a'] = true;
            remove_duplicates_recursion(input, output.append(curr_char), idx + 1, map);  // Recursive call
        }
    }

    public static void main(String[] args) {
        // Testing different methods
        print_numbers_decrs(10);  // Print numbers from 10 to 1
        print_number_incrs(10);  // Print numbers from 1 to 10
        System.out.println(find_fact(5));  // Print factorial of 5
        System.out.println(Natural_Sum(100));  // Print sum of first 100 natural numbers
        print(print_nth_febonacci_num(10));  // Print the 10th Fibonacci number
        int arr[] = {1, 3, 5, 8, 5, 5, 15};
        print(is_sorted(arr, 0));  // Check if array is sorted
        print(first_occurance(arr, 50, 0));  // Find first occurrence of 50 in array
        print(last_occurance(arr, 5, 0));  // Find last occurrence of 5 in array
        print(exponential(2, 10));  // Calculate 2^10
        print(optimized_exponential(2, 10));  // Calculate 2^10 using optimized method
        StringBuilder name = new StringBuilder("Shubham");
        print(remove_dupilicates(name));  // Remove duplicates from "Shubham"
        remove_duplicates_recursion("nidhi", new StringBuilder(""), 0, new boolean[26]);  // Remove duplicates from "nidhi" using recursion
    }
}
