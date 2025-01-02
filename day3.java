// Type Convertion :- When we convert one data type to another with the agreement of compliter without any loss
// of data then it's known as type convertion

public class day3 {
    public static void main(String args[]){
        int a = 8 ;
        long b = a ;
        System.out.println(a);
        System.out.println(b);
        long c = 12 ;
        int d = c ; // It will give the error bcoz we cant't convert big size data into the small one

    }
    
}

/*
 Type convertion only occurs when :
     Converting type should compatiable (number to number , char to char)
     Size of Destination data type >= Size of old data type
 */

 // Take a integer from user and convert it into the double 


import java.util.*;;

public class day3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :- ");
        int num = sc.nextInt();
        double num2=num;
        System.out.print(num2);
        sc.close();
    }
} 


// Type Casting :- when we forcefully convert one data type to another then it's called type casting
// we might loose the data in this process

// take a double value as input and convert it into the int

import java.util.*;
public class day3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double num1= sc.nextFloat();
        int num2=(int)num1;
        System.out.println(num1);
        System.out.println(num2);
        sc.close();
    }
}


// Type Promotion 

/*
 Basic Rules of Type Promotion :
    1.If an expression contain the char , short , byte data types then everydata type will automatically promoted into
    the int and we'll int as output untill and unless we do the type casting

    2.If and expression contain the long , double kind of data types then every data type will automatically promoted
    into the largest size data type with above exception

 */


 public class day3{
    public static void main(String args[]){
        byte a=51;
        char b='c';
        char c='a';
        int d = a+b+c;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
    
 }



// WAP to take input 3 numbers from user as input and find their average :

import java.util.*;
public class day3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number :- ");
        float num1=sc.nextFloat();
        System.out.print("Enter the second number :- ");
        float num2=sc.nextFloat();
        System.out.print("Enter the third number :- ");
        float num3=sc.nextFloat();
        float avg=(num1+num2+num3)/3;
        System.out.print("Average is :- ");
        System.out.print(avg);
        sc.close();
    }
}

// WAP to take side of square as input from user and find it's square:

import java.util.*;
public class day3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of Square :- ");
        float side = sc.nextFloat();
        float area=side*side;
        System.out.print("Area of Square is :- ");
        System.out.print(area);
        sc.close();



    }
}


/*  Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
an eraser. You have to output the total cost of the items back to the user as their bill.
(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem) */

import java.util.*;
public class day3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Price of Pencil :- ");
        float pencil_price=sc.nextFloat();
        System.out.print("Enter Price of Pen :- ");
        float pen_price = sc.nextFloat();
        System.out.print("Enter Price of Eraser :- ");
        float eraser_price=sc.nextFloat();
        float sum = pen_price+pencil_price+eraser_price;
        float tp=sum+(sum*18)/100;
        System.out.print("Pencil : ");
        System.out.println(pencil_price);
        System.out.print("Pen : ");
        System.out.println(pen_price);
        System.out.print("Eraser : ");
        System.out.println(eraser_price);
        System.out.print("Sum : ");
        System.out.println(sum);
        System.out.print("Total Price with GST : ");
        System.out.println(tp);
    }
}


public class day3{
    public static void main(String args[]){
        byte b = 4;
        char c = 'a';
        short s = 512;
        int i = 1000 ;
        float f = 3.14f;
        double d = 99.9954;
        double result = (f*b)+(i%c)-(d*s);
        System.out.println(result);
        int $ = 24;
        System.out.print($);
    }
}