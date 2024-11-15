import java.util.*;

public class revision{

    public static void calculater(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number:- ");
        float num_1=sc.nextFloat();
        System.out.print("Enter the Second Number:- ");
        float num_2=sc.nextFloat();
        System.out.print("What Operation you want to Perform ?(+,-,*,/0) :- ");
        char opr=sc.next().charAt(0);
        if(opr=='+'){
            System.out.println("Summation of "+num_1+" and "+num_2+" Is "+(num_1+num_2));
        }
        else if (opr=='-') {
            System.out.println("Diffrence of "+num_1+" and "+num_2+" Is "+(num_1-num_2));
        }
        else if (opr=='*') {
            System.out.println("Multipication of "+num_1+" and "+num_2+" Is "+(num_1*num_2));
        }
        else if (opr=='/') {
            System.out.println("Division of "+num_1+" and "+num_2+" Is "+(num_1/num_2));
        }
        else{
            System.out.println("Please Choose Correct Operator!!");
        }
        sc.close();
    }

    public static boolean is_prime(int n){
        if(n<2){
            return false;
        }
        else if(n==2){
            return true;
        }
        else{
            for(int i=3;i<=Math.sqrt(n);i++){
                if (n%i==0){
                    return false;
                }                
            }
            return true;
        }
    }

    public static void print_first_prime(){
        Scanner sc = new Scanner(System.in);
        System.out.print("How Many first Prime Numbers you Want to See ? ");
        int n=sc.nextInt();
        sc.close();
        int count=0;
        for(int i=0;count<n;i++){
            if(is_prime(i)==true){
                System.out.print(i+" ");
                count++;
            }
        }
    }

    public static void print_start_pattern(int n){
        for(int row=0;row<=n;row++){
            for(int col=0;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void print_inverted_start_pattern(int n){
        for(int row=n;row>=0;row--){
            for(int col=0;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void print_half_pyramid_pattern(int n){
        for(int row=0;row<=n;row++){
            int count = 1 ;
            for(int col=0;col<=row;col++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }


    public static void print_max_min_array(int arr[]){
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Maximum Of Array is "+max+" And Minimum of Array is "+min);
    }

    public static void linear_search(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("Found at "+(i+1)+" Position");
                return;
            }
        }
        System.out.println("Not Found!!");
    }

    public static void binary_search(int arr[], int target) {
        int first = 0;
        int last = arr.length - 1;
        int mid;
    
        while (first <= last) {
            mid = first + (last - first) / 2;  
            if (target > arr[mid]) {  
                first = mid + 1;
            } else if (target < arr[mid]) {  
                last = mid - 1;
            } else { 
                System.out.println("Found at Position " + (mid + 1)); 
                return;
            }
        }
        System.out.println("Not Found!!");
        
    }
    

    public static int[] bubble_sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int temp;
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }

    public static int[] reverse_array(int arr[]){
        for(int i=0;i<(arr.length-1)/2;i++){
            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        return arr;
    }

    public static void print_pairs(int arr[]){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(i==j){
                    continue;
                }
                System.out.print("("+arr[i]+","+arr[j]+")");
                count++;
            }
            System.out.println();
        }
        System.out.println("Total Number of Pairs "+count);
    }

    public static void print_sub_array(int arr[]){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(i==j){
                    System.out.println(arr[i]+" ");
                    count++;
                    continue;
                }
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
                count++;
            }
            System.out.println();
        }
        System.out.println("Total Number of Pairs "+count);
    }

    public static void print_max_min_sum_sub_array(int arr[]){
        int count=0;
        int max_sum=0;
        int min_sum=arr[0];
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(i==j){
                    System.out.println(arr[i]+" ");
                    if(arr[i]>max_sum){
                        max_sum=arr[i];
                    }
                    if(min_sum>arr[i]){
                        min_sum=arr[i];
                    }
                    count++;
                    continue;
                }
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                    sum+=arr[k];
                }
                if(sum>max_sum){
                    max_sum=sum;
                }
                if(min_sum>sum){
                    min_sum=sum;
                }
                sum=0;
                System.out.println();
                count++;
            }
            System.out.println();
        }
        System.out.println("Total Number of Pairs "+count);
        System.out.println("Maximum Sum Of Sub Array is "+max_sum);
        System.out.println("Minimum Sum Of Sub Array is "+min_sum);
        System.out.println("Total Number of Pairs "+count);
    }


    public static void main(String agrs[]){
        // calculater();
        // print_first_prime();
        // print_inverted_start_pattern(5);
        // print_half_pyramid_pattern(5);
        int arr[]={4,2,6,8,10};
        // bubble_sort(arr);
        
        // binary_search(arr,12);
        // print_sub_array(arr);
        print_max_min_sum_sub_array(arr);
    
    }
}
