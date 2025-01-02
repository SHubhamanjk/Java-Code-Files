// About Variables and Data Types and Comments :)

public class day2 {
    public static void main(String args[]){
        int a = 50;
        int b = 44;
        System.out.println(a);
        System.out.println(b);
        a= 54;
        b=69;
        System.out.println(a);
        System.out.println("a");
        System.out.println(b);
        String c= "Shubham";
        System.out.println(c);
        int d;
        d=44;
        System.out.println(d);
        System.out.println(a+d);
    }
    
}


// there are two type of data in java one is variable and second is litral
// variable is something which is changeable and litral is something which we cant change

// there are two types of data types in java --
// 1. Premetive :- inbuilt in java ( int, char , bool , byte , long , short , double , float)
// 2. non-premative :- we have to create this manually  ..( string , class etc)

// size of premetive data types 
//  int :-  4 byte  (1 byte == 8 bits)
// char :- 2 ('a','b' ...)
// bool :- 1 ( true or false)
// byte :- 1 ( 1 or 0)
// long :- 8 ( use to store last integrer values )
// short :- 2 
// double :- 8 ( use to store last float values )
// float :- 4 

/* commnet is something which is ignored by the compler in the code , it is use to increase the readability
   understandbality of the code
 */
//   there are two type of comments in java :
    // 1. single line comment
    /*

    2.multiline comment 
    
    */

 


// Input in Java :)

import java.util.*;
public class day2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // String input = sc.nextLine(); 

        int input = sc.nextInt();

        // float input = sc.nextFloat();
        System.out.print(input);
        sc.close();
    }
}


/*
 we can use nextDouble , NextLong etc ...
 */

// Sum of two numbers , taking input from user 

 import java.util.*;
 public class day2{
     public static void main(String args[]) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number");
         int num1 = sc.nextInt();
         System.out.println("Enter the number");
         int num2 = sc.nextInt();
         int sum = num1 + num2;
         System.out.println(sum);
         sc.close();
     }
 }
 

// Product of two numbers , taking input from user .. 

import java.util.*;
public class day2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int p = num1*num2;
        System.out.print(p);
        sc.close();

        }
    }


// Area of circle ..

import java.util.*;
public class day2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of circle :- ");
        float r=sc.nextFloat();
        float a = r * r * 3.14f;
        System.out.print("Area of Circle is :- ");
        System.out.print(a);
        sc.close();
        


    }
}

