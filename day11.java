// Array : is a data structute in which we store similar kind of data and in this data stores in continious manner
// Array follow the pass by reference if we passed it in any fucntion



// Linear Search Is a searching algoritham which is used to search any
// element in array ,it search index by index to that elemetn


import java.util.*;
public class day11 {
    public static int linearSearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
        
        
    }

    public static int max_array(int arr[]){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        

        }
        return max;
    }
    public static void main(String args[]){
        int ar[]=new int[5];
        int arr2[]={98,96,45};
        String arr3[]={"shubh","gta"};
        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }
        for(int i=0;i<arr2.length;i++){
            arr2[i]-=10;

        }
        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }
        System.out.print(arr2[2]);
        int num[]={2,5,3,8,6,7,9,45,36,12,85,963,78,15,3};
        System.out.print(linearSearch(num,3));
        System.out.print(max_array(num));
    }


    
}
