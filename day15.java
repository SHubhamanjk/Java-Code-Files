// Sorting : In java sorting is refer to Arranging to elemts of array in logical order.


// Bubble Sort : In this we compare the elements and push the highest elements in the last of array and we repeat 
//                 this process till n times then we got the sorted array.


// Selection Sort : In this we find the min of the given array and put in in the new array and return
              //  that new array in last that new array will be a sorted array.


// insertion sort: in this we compare the elements and fit it to the apropriate position .
         
public class day15 {
    public static void bubble_sort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    public static void selection_sort(int arr[]){
        int n = arr.length;
        
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[min]>arr[j]){
                    min=j;

                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;

        }
    }

    public static void insertion_sort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j-1]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        
    }

    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]+" ");
        }
    }


public static void main(String args[]){
    int[] arr = {1,64, 34, 25, 12, 22, 11, 901,1};
    insertion_sort(arr);
    printArr(arr);

}
}






// WAP to sort an array in acensding and descending order using bubble sort and do the same
// with selection sort

import java.util.*;
public class day15{
    public static void bubble_sort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-2;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }

            }
        }
    }

    public static void selection_sort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int min_index=i;
            for(int j=i+1;j<n-1;j++){
                if(arr[min_index]>arr[j]){
                    min_index=j;
                }

            }
            int temp=arr[i];
            arr[i]=arr[min_index];
            arr[min_index]=temp;
        }
    }

    public static void insertion_sort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;

                }
            }
        }
    }



    public static void main(String args[]){
        int arr[]={1,64, 34, 25, 12, 22, 11,9};
        // bubble_sort(arr);
        // selection_sort(arr);
        insertion_sort(arr);

        Scanner sc = new Scanner(System.in);
        System.out.print("In Which You Want The Array (for Ascending Enter 1 , For Descending Enter 0) :- ");
        int temp=sc.nextInt();
        if(temp==1){
            for(int i=0;i<arr.length;i++){
                System.out.print(" "+arr[i]+" ");

            }
        }
        else if(temp==0){
            for(int i=arr.length-1;i>=0;i--){
                System.out.print(" "+arr[i]+" ");

            }

        }
        else{
            System.out.print("Please Enter the Correct Input!!");
        }
        sc.close();
    }
}


