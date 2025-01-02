/*
 
Conditional Statement : if , else , else if , ternary , switch 

 */


// if , else

import java.util.*;
public class day5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Age :- ");
        int age=sc.nextInt();
        if (age>=18){
            System.out.println("Adult");
        }
        if (age>15){
            System.out.println("Teen");
        }
        else{
            System.out.println("Kimds");
        }
        sc.close();


    }

    
}


// WAP to find largest of two number 

import java.util.*;
public class day5{
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first numer :- ");
        float num1=sc.nextFloat();
        System.out.print("Enter the second number :- ");
        float num2=sc.nextFloat();
        if(num1>num2){
            System.out.println((num1)+" Is greater than "+(num2));
        }     
        else{
            System.out.println((num2)+" Is greater than "+num1);
        } 
        sc.close();
    }
}

// WAP to check number is even or odd

import java.util.*;
public class day5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :- ");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println((num)+" is a even number");
        }
        else{
            System.out.println((num)+" is a odd number");
        }

    }
}


// if , else if , else

import java.util.*;
public class day5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Age :- ");
        int age = sc.nextInt();
        if (age>=18){
            System.out.println("You are Adult");
        }
        else if(age>=13 && age<18){
            System.out.println("Bachi hai ❎ !! Bade to Hogi ✅");
        }
        else{
            System.out.println("Kimds");
        }
        sc.close();
    }
}

// WAP to calculate income tax on given price 

import java.util.*;
public class day5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Amount :- ");
        int amount = sc.nextInt();
        if (amount <= 500000){
            System.out.println("Tax on your amount is 0% and your tax amount is 0");
        }
        else if(amount>500000 && amount <= 1000000){
            float tax=amount*0.2f;
            System.out.println("Tax on your amount is 20% and your tax amount is "+(tax));
        }
        else{
            float tax = amount*0.3f;
            System.out.println("Tax on your amount is 30% and your tax amount is "+(tax));
        }
        sc.close();
       }
}


// WAP to find Largest of three numbers

import java.util.*;
public class day5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number :- ");
        int num1=sc.nextInt();
        System.out.print("Enter the second number :- ");
        int num2=sc.nextInt();
        System.out.print("Enter the third number :- ");
        int num3=sc.nextInt();
        if(num1>num2 && num1>num3){
            System.out.println((num1)+ " is Larger");
        }
        else if(num2>num1&&num2>num3){
            System.out.println((num2)+" Is Larger");
        }
        else if(num3>num2&&num3>num1){
            System.out.println((num3)+" Is Larger");
        }
        else{
            System.out.println("All Numbers are Equal");
        }
        sc.close();

    }
}


// Ternary Statement

import java.util.*;
public class day5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :- ");
        int num=sc.nextInt();
        String type = num%2==0?"Even":"Odd";
        System.out.println(type);
        sc.close();
    }
}


// WAP to check student is pass or fail

import java.util.*;
public class day5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks :- ");
        int marks = sc.nextInt();
        String res= marks>33?"Pass":"Fail";
        System.out.println(res);
        sc.close();
    }
}


// Switch Statement 

import java.util.*;
public class day5{
    public static void main(String args[]){
        int number=5;
        switch(number){
            case 1 :System.out.print("1");
                break;
            case 2 : System.out.print("2");
                break;
            case 3:System.out.print("3");
                break;
            case 4:System.out.print("4");
                break;
            default : System.out.print("5");        

        }
    }
}

// Make A Calculater

import java.util.*;
public class day5{
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number :- ");
        float num1=sc.nextFloat();
        System.out.print("Enter the second number :- ");
        float num2=sc.nextFloat();
        System.out.print("Which Operation You Want To Perform (+,-,*,/) ?  ");
        char opr=sc.next().charAt(0);
        if(opr=='+'){
            System.out.println(num1+num2);
        }
        else if(opr=='-'){
            System.out.println(num1-num2);
        }
        else if(opr=='*'){
            System.out.println(num1*num2);
        }
        else if(opr=='/'){
            System.out.println(num1/num2);
        }
        else{
            System.out.println("Please Enter Valid Operator!!");
        }
        sc.close();
    }
}


// Make a Calculater Using Switch Statement

import java.util.*;
public class day5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number :- ");
        float num1=sc.nextFloat();
        System.out.print("Enter the second number :- ");
        float num2=sc.nextFloat();
        System.out.print("What Operation you want to Perform (+,-,*,/) ? ");
        char opr=sc.next().charAt(0);
        switch(opr){
            case '+':System.out.println(num1+num2);
                break;
            case '-':System.out.println(num1-num2);
                break;
            case '*':System.out.println(num1*num2);
                break;
            case '/':System.out.println(num1/num2);
                break;
            default:System.out.println("Please Enter the Valid Operator !! ");      

        }
sc.close();
    }
}


// WAP to check a number is positive or not 

import java.util.*;
public class day5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number :- ");
        float num = sc.nextFloat();
        if(num>0){
            System.out.println("Number Is Positive");
        }
        else if(num<0){
            System.out.println("Number Is Negative");
        }
        else{
            System.out.println("Number is Zero");
        }
        sc.close();
    }
}

// WAP which will print you have fever if your temprature above 100 either no

import java.util.*;
public class day5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Temprature :- ");
        float temp = sc.nextFloat();
        String res=temp>100?"You've Fever":"No Fever";
        System.out.println(res);
        sc.close();
    }
}

// WAP in which user will input a number and return day according to the number

import java.util.*;
public class day5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number :- ");
        int num = sc.nextInt();
        switch(num){
            case 1 : System.out.println("Sunday");
                break;
            case 2 : System.out.println("Monday");
                break;
            case 3 : System.out.println("Tuesday");
                break;
            case 4 : System.out.println("Wednesday");
                break;
            case 5 : System.out.println("Thursday");
                break;
            case 6 : System.out.println("Friday");
                break;
            default : System.out.println("Saturday");              


        }
        sc.close();
    }
}


// Guess the output 

public class day5 {
    public static void main(String args[]) {
    int a = 63, b = 36;
    boolean x = (a < b ) ? true : false; // false
    int y= (a > b ) ? a : b; // 63
    System.out.println(x);
    System.out.println(y);
    }
    }


// WAP to check year is leap or not

import java.util.*;
public class day5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Year :- ");
        int year = sc.nextInt();
        if (year%100==0){
            if(year%400==0){
                System.out.println((year)+" is a Leap Year");
            }
            else{
                System.out.println((year)+" is not a leap year");
            }
        }    

        else{
            if (year%4==0){
                System.out.println((year)+" is a leap year");
            }
            else{
                System.out.println((year)+" is not a leap year");
            }

        }    
        sc.close();

    }
}