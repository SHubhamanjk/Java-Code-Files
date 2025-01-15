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

import java.util.Arrays;

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

    public static int[] merge_short(int arr[]){
        if(arr.length<=1){
            return arr;
        }
        int mid=arr.length/2;
        int left[]=merge_short(Arrays.copyOfRange(arr, 0,mid));
        int right[]=merge_short(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left,right);

    }

    public static int[] merge(int left[],int right[]){
        int i=0,j=0,k=0;
        int arr[]=new int[left.length+right.length];
        while(i<left.length&&j<right.length){
            if(left[i]<=right[j]){
                arr[k]=left[i];
                i=i+1;
            }
            else{
                arr[k]=right[j];
                j=j+1;
            }
            k=k+1;
        }

        while(i<left.length){
            arr[k]=left[i];
            i=i+1;
            k=k+1;
        }
        while(j<right.length){
            arr[k]=right[j];
            j=j+1;
            k=k+1;
        }
        return arr;
    }

    public static void quick_sort(int arr[],int low , int high){
        if(low>=high){
            return;
        }
        int s=low;
        int e=high;
        int mid=s+(e-s)/2;
        int pivot=arr[mid];

        while(s<=e){
            while(arr[s]<=pivot){
                s++;
            }
            while(arr[e]>pivot){
                e--;
            }
            
            if(s<=e){
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
        }

        quick_sort(arr, low, e);
        quick_sort(arr, s, high);


        /*
         Basically , sabse pahle base lgao then start , end and mid initiate kro then tb tk loop chlao jb tk s aur e mil ni jata aur check kro
         kii rules follow ho rhe hai yaa nhi , ab 2 cases hai agr rules follow ho gye to naya pivot bnao and repeat this process for other elements
         otherwise jaha violacne hua waha interchange kro elements ko and then do same for next elements..
         */

        

    }


    public static void skip_char(String neww , String old , char target ){
        if(old.length()==0){
            System.out.println(neww);
            return;
        }

        if(old.charAt(0)==target){
            skip_char(neww, old.substring(1), target);
        }
        else{
            skip_char(neww+old.charAt(0), old.substring(1), target);
        }

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
        // int arr[]={1,9,3,14,5};
        // System.out.println(is_sorted(arr));
        // arr=merge_short(arr);
        // System.out.println(Arrays.toString(arr));
        // System.out.println(is_sorted(arr));
        skip_char("", "shubham", 'h');


    }
}
