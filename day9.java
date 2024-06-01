public class day9{

    public static void hollow_pattern(int row , int cols){
        for (int i =1 ; i<=row;i++){
            for(int j = 1 ; j<=cols;j++){
                if(i==1||i==row||j==1||j==cols){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
                
            }
            System.out.println();
        }
    }

    public static void inverted_halfpyramid(int rows){
        for (int i=1;i<=rows;i++){
            for(int j=1;j<=rows-i;j++){
                System.out.print("   ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void floyds_triange(int rows){
        int count = 1 ;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" "+(count)+" ");
                count++;
            }
            System.out.println();
        }

    }

    public static void zero_one_triange(int rows){
        int out=1;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" "+(out)+" ");
                if(out==0){
                    out=1;
                }
                else{
                    out=0;
                }

            }
            System.out.println();

        }
    }

    public static void butterfly(int rows){
        for (int i=1;i<=rows;i++){
            for (int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            for(int k=1;k<=(2*rows)-(2*i);k++){
                System.out.print("   ");
            }
            for(int l=1;l<=i;l++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        for(int m=rows;m>=1;m--){
            for(int n=1;n<=m;n++){
                System.out.print(" * ");

            }
            for(int o=1;o<=(2*rows)-(2*m);o++){
                System.out.print("   ");
            }
            for(int p=1;p<=m;p++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        
        
    }

    public static void solid_rombhos(int rows){
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows-i;j++){
                System.out.print("   ");
            }
            for(int k=1;k<=rows;k++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void hollow_rombhus(int rows){
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                if(i==1||i==rows||j==1||j==rows){
                    if(i==1||j==1){
                        for(int k=1;k<2*rows;k++){
                            if(k==rows-i){
                                System.out.print("   ");
                            }
                            else{
                                System.out.print(" * ");
                            }
                        }

                    }
                    else{
                        System.out.print(" * ");
                    }
                }
                else{
                    for(int l=2;l<=rows-1;l++){
                        for(int m=1;m<=rows-i;m++){
                            System.out.print("   ");
                        }
                        for(int n=1;n<=rows;n++){
                            System.out.print(" * ");
                        }
                    }
                }

            }
            System.out.println();
        }
    }
    public static void main(String args[]){

    // hollow_pattern(10, 5);
    // inverted_halfpyramid(10);
    // floyds_triange(10);
    // zero_one_triange(10);
    // butterfly(5);
    // solid_rombhos(10);
    // hollow_rombhus(5);

    }
}


// WAP to print Hollow Square Pattern


import java.util.*;
public class day9{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter number of rows :- ");
            int rows=sc.nextInt();
            System.out.print("Enter Number of cols :- ");
            int cols=sc.nextInt();
            for(int i=1;i<=rows;i++){
                for(int j=1;j<=cols;j++){
                    if(i==1 || i==rows||j==1||j==cols){
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


// WAP to print inverted and half rotated pyramid

import java.util.*;
public class day9{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines :- ");
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

    }
}

// WAP to print floyd's pattern

import java.util.*;
public class day9{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number Of Lines :- ");
        int  rows = sc.nextInt();
        int count = 1 ;
        for(int i=1;i<=rows;i++){
            for(int j= 1;j<=i;j++){
                System.out.print(" "+(count)+" ");
                count++;
            }
            System.out.println();
        }
        sc.close();



    }
}

// WAP to print 0 1 triangle

import java.util.*;

public class day9{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines :- ");
        int rows = sc.nextInt();
        int opt=1;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" "+opt+" ");
                if(opt==1){
                    opt=0;
            
                }
                else{
                    opt=1;
                }
                


            }
            System.out.println();
            
        }
        sc.close();



    }
}


// WAP to print Butterfly pattern


import java.util.*;
public class day9{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n :- ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            for(int k=1;k<=(2*n)-(2*i);k++){
                System.out.print("   ");
            }
            for(int l=1;l<=i;l++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        for(int m=n;m>=1;m--){
            for(int o=1;o<=m;o++){
                System.out.print(" * ");
            }
            for(int p=1;p<=(2*n)-(2*m);p++){
                System.out.print("   ");
            }
            for(int q=1;q<=m;q++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    sc.close();   

    }
    
}


// WAP to print solid rombhus patter

import java.util.*;
public class day9{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of lines :- ");
        int rows=sc.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows-i;j++){
                System.out.print("   ");
            }
            for(int k=1;k<=rows;k++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        sc.close();


    }
}