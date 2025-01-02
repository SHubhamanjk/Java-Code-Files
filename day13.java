import java.util.Arrays;

public class day13 {
    public static int max_sum_SubArray(int arr[]){
        int n=arr.length;
        int curr_sum=0;
        int max_sum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            curr_sum=0;
            curr_sum+=arr[i];
            for(int j=i+1;j<n;j++){
                curr_sum+=arr[j];

            }
            if(curr_sum>max_sum){
                max_sum=curr_sum;
            }
            
        }
        return max_sum;
    
    }
}

    public static int max_sum_SubArray(int arr[]){ // using kadnes algo
        int n=arr.length;
        int curr_sum=0;
        int max_sum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            curr_sum+=arr[i];
            if(curr_sum<0){
                curr_sum=0;
            }
            max_sum=Math.max(max_sum, curr_sum);


        }
        if(max_sum<=0){
           max_sum = Arrays.stream(arr).max().getAsInt();

        }


        return max_sum;
    }



    public static void main(String args[]){
        int arr[]={-1,-2,-3};
        System.out.print(max_sum_SubArray(arr));
    }
    
}


// DSA Question seet


// WAP to find Maximum and Minimum of an array using minimum number of comparisions

/*
 Yet i have not studied the sorting techniques so i can't use binary search here so i am doing this using linear search
 */


public class day13{
    public static int[] max_min_array(int arr[]){
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }
        }
        int max_min[]= {max,min};
        return max_min;  
    }
    public static void main(String args[]){
        int arr[]={3,6,4,5,6,9,616,654,64,64,31,316,98,64,31,614,31,643,135,13,1};
        System.out.print("Max of Array is : "+max_min_array(arr)[0]+" and Min of Array is : "+max_min_array(arr)[1]);
    }
}



// WAP to reverse the Array

public class day13{
    public static void reverse(int arr[]){
        int st=0 , end=arr.length-1;
        while(st<=end){
            int temp=arr[st];
            arr[st]=arr[end];
            arr[end]=temp;
            st++;
            end--;
        }
    }
    public static void main(String args[]){
        int arr[]={3,6,4,5,6,9,616,654,64,64,31,316,98,64,31,614,31,643,135,13,1};
        reverse(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+(arr[i])+" ");
        }

    }
}


// WAP to find sum of max_sub array in an array 

public class day13{
    public static int sum_max_SubArray(int arr[]){
        int curr_sum=0;
        int max_sum=Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            curr_sum+=arr[i];
            if(curr_sum<0){
                curr_sum=0;
            }
            max_sum=Math.max(max_sum, curr_sum);
        }
        if(max_sum<=0){
            int max=arr[0];
            for(int i=0;i<arr.length;i++){
                if(arr[i]>max){
                    max=arr[i];
                }

            }
            max_sum=max;
        }
        return max_sum;
    }
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        System.out.print(sum_max_SubArray(arr));
    }
}



// WAP for Given an integer array nums, return true if any value appears at least twice in the array, and return false if 
// every element is distinct.

public class day13{
    public static boolean check_duplicate(int arr[]){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }

        }
        if(count>arr.length){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        System.out.print(check_duplicate(arr));

    }
}












