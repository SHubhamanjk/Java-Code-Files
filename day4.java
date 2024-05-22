// Operators : Operators are used to perform operations on operands.

/*
 Type of Operator:
    1.Arthemetic Operators
    2.Relation Operator
    3.Logical Operator
    4.Assignment Operator
    5.BitWise Operator
 */

 /*
  Arthemetic Operators: + - * / % ++ -- 
  */

import java.util.*;
public class day4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number :- ");
        int num1=sc.nextInt();
        System.out.print("Enter the second number :- ");
        int num2=sc.nextInt();
        System.out.println("Addition is "+ (num1+num2));
        System.out.println("Substraction is "+(num1-num2));
        System.out.println("Multipication is "+(num1*num2));
        System.out.println("Division is "+(num1/num2));
        System.out.println("Module is "+(num1%num2));
        System.out.println(num1++);
        System.out.println(++num1);
        System.out.println(num1--);
        System.out.println(--num1);

        sc.close();


    }
    
}

/*
 Relation Operator : > , < , >= , <= , == , != 
 */


public class day4{
    public static void main(String args[]){
        int a = 5;
        int b = 9 ;
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a==b);
        System.out.println(a!=b);
    }
} 


/*
 Logical Operator : && , || , !
 */
import java.util.*;
 public class day4{
    public static void main(String args[]){
        int a = 5;
        int b = 9 ;
        System.out.println(a>3 && b<12); // True
        System.out.println(a>3 && b<8);  // False
        System.out.println(a<3 && b<8);  // False
        System.out.println(a>3 || b<8);  // True
        System.out.println(a>3 || b<12); // True
        System.out.println(a<3 || b>12); // False
        System.out.println(!(a<3 || b>12)); // True
        System.out.println(!(a>3 && b<12)); // False


    }
}  

/*
 Assignment Operator: = , += , -= , *= , /=
 */

import java.util.*;
public class day4{
    public static void main(String args[]){
        int a = 5;
        int b = a;
        System.out.println(a);
        System.out.println(b);
    }
}


// Questions:

// Question : What will be the output of the following programs :

public class day4 {
    public static void main(String[] args){
    int x = 2, y = 5;
    int exp1 = (x * y / x); // 5 
    int exp2 = (x * (y / x)); // 5 but actual is 4
    System.out.print(exp1 + (" , ")); // 5,
    System.out.print(exp2); //5 but actual is 4
    }
}

public class day4 {
    public static void main(String[] args) {
    int x = 200, y = 50, z = 100;
    if(x > y && y > z){
    System.out.println("Hello");
    }
    if(z > y && z < x){
    System.out.println("Java");
    } // java
    if((y+200) < x && (y+150) < z){
    System.out.println("Hello Java");
    }
    }
    }
    

public class day4 {
    public static void main(String[] args){
    int x, y, z;
    x = y = z = 2;
    x += y; // x = 4
    y -= z; // y = 0
    z /= (x + y); // z = 0
    System.out.println(x + " " + y + " " + z); // 4 0 0
    }
    }


public class day4 {
    public static void main(String[] args){
    int x = 9, y = 12;
    int a = 2, b = 4, c = 6;
    int exp = 4/3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b*y);
    System.out.println(exp); // 8
    }
    }

public class day4 {
    public static void main(String[] args){
    int x = 10, y = 5;
    int exp1 = (y * (x / y + x / y)); // 20
    int exp2 = (y * x / y + y * x / y); // 10+10=20
    System.out.println(exp1);
    System.out.println(exp2);
    }
    }