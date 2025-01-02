// Loops : while , for , do while


// while 

public class day6 {
    public static void main(String args[]){
        int count = 0;
        while(count<100){
            System.out.println("Shubham");
            count ++;
        }
    }
    
}

// WAP to print number from 1 to n

import java.util.*;
public class day6{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value of n :- ");
        int num = sc.nextInt();
        int count = 1;
        while(count<=num){
            System.out.println(count);
            count++;
        }
        sc.close();

        
    }
}


// WAP to find sum of first n natural numbers

import java.util.*;
public class day6{
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n :- ");
        int num = sc.nextInt();
        int sum =0;
        int count = 1;
        while(count<=num){
            sum+=count;
            count++;
        }
        System.out.println("Sum of first "+num+" numbers is "+sum);
        sc.close();

        
    }
}


// for loop

public class day6{
    public static void main(String args[]){
        for(int i=0;i<10;i++){
            System.out.println("Hellow World!!");
            System.out.println(i);
        }
    }
}

// WAP to print start pattern

public class day6{
    public static void main(String args[]){
        for(int i=0;i<=4;i++){
            for(int j=0;j<=4;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
// 1569

// WAP to get reverse of a number

import java.util.*;
public class day6{
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number :- ");
        int num=sc.nextInt();
        int temp=num;
        // int r;
        int n;
        int rev=0;
        while(temp>0){
            n=temp%10;
            rev=rev*10+n;
            temp/=10;    
        }
        System.out.println(rev);
        sc.close();
    }
}



// do while

public class day6{
    public static void main(String args[]){
        int counter = 0 ;
        do{
            System.out.println("Hello Worlds");
            counter ++ ;
        }
        while(counter>10);

    }
}


// Break Statement

public class day6{
    public static void main(String args[]){
        // int count=3;
        for(int i =0 ; i<=10;i++){
            if (i==5){
                break;
            }
            System.out.println(i);
        }
    }
}


// WAP in which will run untill the user enters the multiple of 10

import java.util.*;
public class day6{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number :- ");
        int num = sc.nextInt();
        // System.out.println(num);
        do{
            System.out.println(num);
            if (num%10==0){
                break;
            }
            System.out.print("Enter the Number :- ");
            num = sc.nextInt();

        }
        while(num%10!=0);
        // while(num%10!=0){
            // System.out.print("Enter the Number :- ");
            // num = sc.nextInt();
        //     System.out.println(num);
        // }
        sc.close();

    }
}

// Continue

import java.util.*;
public class day6{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter the number :- ");
            int num = sc.nextInt();
            if (num%10==0){
                continue;
            }
            System.out.println(num);
        }while(true);

        // sc.close();
        
    }
}


// WAP to check number is prime or not 

import java.util.*;

public class day6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number :- ");
        int num = sc.nextInt();
        
        if (num < 2) {
            System.out.println("Not Prime");
        } else if (num == 2) {
            System.out.println("Prime");
        } else {
            boolean isPrime = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("Prime");
            } else {
                System.out.println("Not Prime");
            }
        }
    }
}



public class day6 {
    public static void main(String[] args){
    for(int i=0; i<5; i++) {
    System.out.println("Hello"); 
    i+=2;
    }
    }
    }
    

// Write a program to find the factorial of any number entered by the user.

import java.util.*;
public class day6{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number :- ");
        int num = sc.nextInt();
        int fact=1;
        for(int i=1;i<=num;i++){
            fact*=i;
        }
        System.out.println(fact);
        sc.close();
        
    }
}

// Write a program to print the multiplication table of a number N, entered by the user.

import java.util.*;
public class day6{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number :- ");
        int num = sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println((num)+" X "+ (i) +"=" +  num*i);

        }
    }

}
