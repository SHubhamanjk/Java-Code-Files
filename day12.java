// Binary Searching : used to find element in array , it works only on sorted array and it's working process is like
// it use to divide the array into two parts and then do the seaching and repeat untill the element is found
// time complexity of binry search is log n 


import java.util.*;
public class day12 {
    public static int binary_search(int arr[],int key){
        int st=0;
        int ed=arr.length-1;
        while(st<=ed){
            int mid = (st+ed)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(key>arr[mid]){
                st=mid+1;
            }
            else{
                ed=mid-1;
            }
        }
        return -1;
    }


    public static int binary_search(int arr[],int key){
        int st=0,end=arr.length-1;
        for(int i=st;i<=end;){
            int mid=(st+end)/2;
            if(key==arr[mid]){
                return mid;
            }
            else if(key>arr[mid]){
                st=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void array_reverser(int arr[]){
        // int n=arr.length;
        // int new_arr[]= new int [n];
        int first=0 , last=arr.length-1;
        while(first<last){
            int temp1=arr[first];
            arr[first]=arr[last];
            arr[last]=temp1;
            first++;
            last--;


        }

        // return arr;
        
    // }

    public static void array_reverser(int arr[]){
        int first = 0 , last = arr.length-1;
        for(int i=first;i<last;){
            int temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            first++;
            last--;
        }
    }

    public static void print_pairs_array(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
                

            }
            System.out.println();
        }
    }

    public static void print_sub_arrays(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print("("+arr[i]+")");
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
                

            }
            System.out.println();
        }

    }

    public static int total_sub_arrays(int arr[]){
        int count=0;
        for(int i=0;i<arr.length;i++){
            // System.out.print("("+arr[i]+")");
            count++;
            for(int j=i+1;j<arr.length;j++){
                // System.out.print("("+arr[i]+","+arr[j]+")");
                count++;
                

            }
            
        }
        return count;

    }
    public static void main(String args[]){
        int arr[]={2,5,9,36,45,96,104,256,341,346,966};
        System.out.print(binary_search(arr, 9));
        array_reverser(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]+" ");
        }
        System.out.println(arr[2]);
        int arr[]=new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.print("Enter the "+(i+1)+"th element :- ");
            int n=sc.nextInt();
            arr[i]=n;

        }
        for(int i=0;i<5;i++){
            System.out.print(" "+arr[i]+" ");
        }
        sc.close();
        int arr[]={2,3,6,9};
        print_pairs_array(arr);
        print_sub_arrays(arr);
        n=arr.length;
        if((arr.length*(arr.length+1))/2==total_sub_arrays(arr)){
            System.out.print("True");
        }
        else{
            System.out.print("False");
        }


    }
}
