// Patterns

// WAP to print square pattern

public class day7{
    public static void main(String args[]){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}


// WAP to print this star pattern

/*
 * 
 * *
 * * * 
 * * * * 
 */


public class day7 {
    public static void main(String args[]){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
    
}


// WAP to print inverted star pattern

/*
 * * * * *
 * * * *
 * * *
 * *
 * 

 */

public class day7{
    public static void main(String args[]){
        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}


// WAP to print Half Piramid pattern

/*

1
1 2
1 2 3
1 2 3 4
1 2 3 4 5  

 */

public class day7{
    public static void main(String args[]){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

// WAP to print this pattern

/*
 1
 2 3
 4 5 6
 7 8 9 10
 11 12 13 14 15
 16 17 18 19 20 21

 */

public class day7{
    public static void main(String args[]){
        int count = 1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" "+(count)+" ");
                count++;

            }
            System.out.println();
        }
    }
}

// WAP to print this pattern

/* 

 A 
 B  C 
 D  E  F 
 G  H  I  J 
 K  L  M  N  O 

 */


 public class day7{
    public static void main(String args[]){
        char count = 65 ;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" "+(count)+" ");
                count++;
            }
            System.out.println();
        }
    }
 }
 

 // OR 

 public class day7{
    public static void main(String args[]){
        char count = 'A' ;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" "+(count)+" ");
                count++;
            }
            System.out.println();
        }
    }
 }

// OR

public class day7{
    public static void main(String args[]){
        int count = 65 ;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                char ch=(char) count;
                System.out.print(" "+(ch)+" ");
                count++;
            }
            System.out.println();
        }
    }
 }