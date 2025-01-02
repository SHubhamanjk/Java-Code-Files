// Function :-  Is a block of code which is used to perfrom a particular task and it is reusable
// When we call function it works like call stack

// in call by value copy of arguement passed to the function and the change only reflect locally but in
// in calll by reference origal arguement passed to the function and change being reflect globally

// Java Works on Call  By Value 

// Inbuilt methods are those which is already defind in java like .nxtInt , pow  and user defined are those which
// is defined by user 


// function overloading :-  when diffrent functions which has same name but diffrent parameters


import java.util.*;
public class day8 {
    public static void PrintHelloworld(){
        System.out.println("Hellow World !!!! ");
    }

    public static void sum(int a , int b){ // Parameter or formal parameter
        System.out.println("Sum of "+a+" and "+b+" is " +(a+b));
    }

    public static void productof(int a , int b){
        System.out.println("Product of "+a+" and "+b+" is "+(a*b));
    }

    public static void find_factorial(int a){
        int fact = 1;
        for(int i=1;i<=a;i++){
            fact*=i;
        }
        System.out.println("Factorial of "+a+" is "+fact);
    }

    public static int return_factorial(int n){
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }

    public static int find_sum(int a , int b){
        return a+b;
    }

    public static int find_sum(int a , int b , int c){
        return a+b+c;
    }

    public static float find_sum(float a,float b){
        return a+b;
    }

    public static void find_binocoeff(int n , int r){
        int fact_n=return_factorial(n);
        int fact_r=return_factorial(r);
        int fact_nr=return_factorial(n-r);
        int bino_coeff = fact_n/(fact_nr*fact_r);
        System.out.println("Binomial Coeffician is "+(bino_coeff));


    }


    public static boolean is_prime(int n){
        if(n<2){
            return false;
        }
        else if(n==2){
            return true;
        }
        else{
            for(int i = 2;i<=Math.sqrt(n);i++){ // previously i used n and now for more optimization i am using sqaure root of n
                if (n%i==0){
                    return false;

                }
                    // break;
                

            }
            return true;
        }

    }

    public static void print_prime(int st_pt , int ed_pt){
        for (int i = st_pt;i<=ed_pt;i++){
            if (is_prime(i)==true){
                System.out.print((i)+" ");
            }
        }
    }

    public static int bin_to_dec(int binary){ // 1000 10101 
        int temp=binary;
        int r;
        // int rev=0;
        int decimal=0;
        int count = 0;
        while(temp>0){
            r=temp%10; // 4586 6 6854
            decimal+=(r*(Math.pow(2, count)));
            count++;
            temp/=10;  

        }
        return decimal;


    }

    public static String dec_to_bin(int num){
        int temp=num;
        int r=0;
        String bin="";
        while(temp>0){
            r=temp%2;
            bin=r+bin;
            temp/=2;

        }
        return bin;


    }

    public static float avg_3(float num1,float num2,float num3){
        float sum = num1+num2+num3;
        float avg = sum/3;
        return avg;
    }

    public static boolean is_even(int num){
        if(num%2==0){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean num_is_palindrone(int num){
        int temp=num;
        int r=0;
        int rev=0;
        while(temp>0){
            r=temp%10;
            rev=rev*10+r;
            temp/=10;
        }
        if (num==rev){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean str_is_palindrone(String input){
        // String temp=input;
        int n=input.length();
        String rev="";
        for(int i=n-1;i>=0;i--){
            rev+=input.charAt(i);

        }
        if(rev.toLowerCase().equals(input.toLowerCase())){
            return true;
        }
        else{
            return false;
        }
    }

    public static void iss_palindrone(){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("What you want to check (number or letter) :- ");
        String cfr1=sc.nextLine();
        if (cfr1.toLowerCase().equals("number")){
            System.out.print("Enter the Number :- ");
            int num=sc.nextInt();
            if(num_is_palindrone(num)==true){
                System.out.println("Yes !!! Number is Palindrone");
            }
            else{
                System.out.println("No !!!! Not a Palidrone");
            }
            sc.close();
        }    
        else if (cfr1.toLowerCase().equals("letter")){
            Scanner sc2 = new Scanner(System.in);
            System.out.print("Enter the Letter :- ");
            String input=sc2.nextLine();
            if(str_is_palindrone(input)==true){
                System.out.println("Yes !!! Letter is Palindrone");
            }
            else{
                System.out.println("No !!!! Not a Palidrone");
            }
            sc2.close();

        }
        else{
            System.out.println("Please Enter a Valid Input !!! ");
        }    
        }  

        public static int sod(int num){
            int r;
            int sum=0;
            while(num>0){
                r=num%10;
                sum+=r;
                num/=10;

            }
            return sum;
        }





    
    public static void main(String args[]){
        sum(20,25); // Arguements or Actural parameter
        productof(45, 3);
        find_factorial(5);
        find_binocoeff(5,3);

        System.out.println(find_sum(8,9));
        System.out.println(find_sum(8,9,5));
        System.out.println(find_sum(4.8f,9.6f));
        System.out.println(is_prime(69));
        System.out.println(bin_to_dec(1111));
        System.out.println(dec_to_bin(8));
        System.out.println(avg_3(12, 12,12));
        System.out.println(is_even(48));
        System.out.println(str_is_palindrone("Jahaj"));
        iss_palindrone();
        System.out.println(sod(458));
        System.out.println(Math.pow(5,3));
        System.out.println(Math.sqrt(49));
        System.out.println(Math.min(78, 45));
        System.out.println(Math.max(48,96));
        System.out.println(Math.abs(-89));

      
    }
    }    



