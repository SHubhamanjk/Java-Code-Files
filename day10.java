// WAP to print Hollow Rectange Pattern


import java.util.*;
public class day10 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows :- ");
        int rows = sc.nextInt();
        System.out.print("Enter the Number Of Columns :- ");
        int cols = sc.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=cols;j++){
                if(i==1||i==rows||j==1||j==cols){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        sc.close();

    }
    
}


// WAP to print inverted and half pyramid rotated pattern

import java.util.*;

public class day10{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number Of Lines :- ");
        int rows = sc.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows-i;j++){
                System.out.print("   ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        sc.close();
    }
}


// WAP to print inverted half pyramid pattern with numbers 

import java.util.*;

public class day10{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number Of Lines :- ");
        int rows = sc.nextInt();
        for(int i=1;i<=rows;i++){
            int temp=1;
            for(int j=1;j<=(rows+1)-i;j++){
                System.out.print(" "+temp+" ");
                temp++;
            }
            System.out.println();
        }
        sc.close();
    }
}


// WAP to print Floyd's Triange

import java.util.*;

public class day10{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of lines :- ");
        int rows = sc.nextInt();
        int count = 1;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" "+count+" ");
                count++;

            }
            System.out.println();
        }
        sc.close();
    }
}

// WAP to print 0  1 triange pattern

import java.util.*;

public class day10{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Lines :- ");
        int rows = sc.nextInt();
        int output=1;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" "+output+" ");
                if(output==1){
                    output=0;
                }
                else{
                    output=1;
                }
            }
            System.out.println();

        }
        sc.close();

        
    }
}


// WAP to print butterfly pattern

import java.util.*;
public class day10{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value of n :- ");
        int rows = sc.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            for(int k=1;k<=(2*rows)-2*i;k++){
                System.out.print("   ");
            }
            for(int l=1;l<=i;l++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        for(int i=rows;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            for(int k=1;k<=(2*rows)-2*i;k++){
                System.out.print("   ");
            }
            for(int l=1;l<=i;l++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        sc.close();
        
    }
}


// WAP to print solid rombhos pattern

import java.util.*;
public class day10{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value of n :- ");
        int n= sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("   ");
            }
            for(int k=1;k<=n;k++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        sc.close();

    }
}


// WAP to print Hollow Rombhus Pattern

import java.util.*;
public class day10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value of n :- ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("   ");
            }
            for(int k=1;k<=n;k++){
                if(i==1||i==n||k==1||k==n){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        sc.close();
        
    }
}


// WAP to print Diamond Pattern

import java.util.*;
public class day10{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value of n :- ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("   ");
            }
            for(int k=1;k<=(2*i)-1;k++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print("   ");
            }
            for(int k=1;k<=(2*i)-1;k++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        sc.close();
        
    }
}


// WAP to print complete pyramid with nymbers

import java.util.*;
public class day10{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number Of Lines :- ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("   ");
            }
            for(int k=1;k<=(2*i)-1;k++){
                System.out.print(" "+i+" "+" ");
            }
            System.out.println();

        }
        sc.close();

    }
}

// WAP to print Palindrominc pattern with number


import java.util.*;
public class day10{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Lines :- ");
        int rows = sc.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows-i;j++){
                System.out.print("   ");
            }
            for(int k=i;k>=2;k--){
                System.out.print(" "+k+" ");
            }
            for(int l=1;l<=i;l++){
                System.out.print(" "+l+" ");
            }
            System.out.println();
        }
        sc.close();

    }
}