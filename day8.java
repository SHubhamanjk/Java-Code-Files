// Function :-  Is a block of code which is used to perfrom a particular task and it is reusable
// When we call function it works like call stack

// in call by value copy of arguement passed to the function and the change only reflect locally but in
// in calll by reference origal arguement passed to the function and change being reflect globally

// Java Works on Call  By Value 

// Inbuilt methods are those which is already defind in java like .nxtInt , pow  and user defined are those which
// is defined by user 


// function overloading :-  when diffrent functions which has same name but diffrent parameters

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
    }
}
