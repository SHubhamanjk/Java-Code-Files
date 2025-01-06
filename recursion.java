// How does function call works
    /*if there are multiple functions then 
         while executing : main-->funct1-->funct2-->funct3--->functn (stack) , things get saved in stack in this way in stack
         after executing the work  : functn-->funct3->funct2->funct1-->main , things get removed in this way from stack
     */
// What is recursion , why recursion 
    /*
      What ? : A function calling it self repeatavily , untill base condition meets.

      Why ? : to solve complex and bigger problems , and alternate of iteration ... it shows vica verca relation with iteration.
     */

public class recursion {


    public static int nth_febonacci(int n){
        if(n==0||n==1){
            return n;
        }
        return (nth_febonacci(n-1)+nth_febonacci(n-2));
    }


    public static int binary_search(int arr[] , int target , int first , int last){
        if(first>last){
            return -1;
        }

        int mid=first+((first-last)/2);
        if(arr[mid]==target){
            return mid;
        }

        if(arr[mid]>target){
            return binary_search(arr, target, mid+1, last);
        }
        else{
            return binary_search(arr, target, first, mid-1);
        }

    }


    public static void print_n_rev(int n){
        if(n==0){
            return;
        }

        System.out.print(n+" ");
        print_n_rev(n-1);
    }

    public static void print_n(int n){
        if(n==0){
            return;
        }
        print_n(n-1);
        System.out.print(n+" ");
    }

    public static int factorial(int n){
        if(n==1){
            return 1;
        }
        return n*factorial(n-1);
    }

    public static int sod(int n){
        if(n<1){
            return 0;
        }
        return (n%10)+sod((int) n/10);
    }

    public static int reverse(int n){
        int digits=(int)Math.log10(n)+1;
        return helper(n,digits);
    }

    private static int helper(int n,int digits){
        if(n%10==n){
            return n;
        }
        return ((n%10)*((int) Math.pow(10, digits-1))+helper(n/10, digits-1));
    }

    public static boolean is_palindrone(String n,int s,int e){
        if(s>=e){
            return true;
        }
        if(n.charAt(s)!=n.charAt(e)){
            return false;
        }
        return is_palindrone(n, s+1, e-1);
    }


    public static int count_steps(int n){
        return steps_helper(n,0);
    }

    private static int steps_helper(int n,int count){
        if(n==0){
            return count;
        }
        if(n%2==0){
            return steps_helper(n/2, count+1);
        }
        return steps_helper(n-1, count+1);
    }

    public static boolean is_sorted(int[] arr){
        return sorted_helper(arr, 0);
    }

    private static boolean sorted_helper(int[] arr,int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return sorted_helper(arr, i+1);
    }

    public static int linear_search(int arr[],int target,int index){
        if(index==arr.length-1){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return linear_search(arr, target, index+1);
    }






    public static void main(String[] args) {
        // System.out.println(nth_febonacci(10));
        // print_n(50);
        // System.out.println(factorial(5));
        // System.out.println((int) 164/10);
        // System.out.println(sod(1342));
        // System.out.println(reverse(1342));
        // System.out.println(is_palindrone("4554", 0, 3));
        // System.out.println(count_steps(41));
        int arr[]={1,2,3,4,5};
        System.out.println(is_sorted(arr));

    }
}
