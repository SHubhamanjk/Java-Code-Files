public class day30{
    public static void sort_string(String arr[]){
        // will compare first character
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length-1;j++){
                if(arr[i].compareTo(arr[j+1])>1){
                    String temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    public static void rotate_array(int arr[],int k){
        // to rotate array , we'll move arrays element with k position
        int res_arr[]=new int[arr.length];
        int n=arr.length;
        for(int i=0;i<n;i++){
                res_arr[(i+k)%n]=arr[i];
        }
        for(int i=0;i<res_arr.length;i++){
            System.out.print(res_arr[i]+" ");
        }
        

    }

    public static boolean sorted_rotated_array(int arr[]){
        // if more than one pair exist where left element is greater than right than , it will return false
        int count=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]>arr[i]){
                count++;
            }
        }
        if(arr[arr.length-1]>arr[0]){
            count++;
        }

        if(count==0||count==1){
            return true;
        }
        else{
            return false;

        }
    }

    public static void PrintArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void inversion_count(int arr[]){

        // how many elements left from array being sorted 
        // to this we if left element is greater than right then increase the count value
        // int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length-1;j++){
                if(arr[i]>arr[j]){
                    // count++;
                    System.out.print("("+arr[i]+","+arr[j]+")");
                }
            }
        }
        // return count;
    }

    public static void main(String args[]){
        // String words[] = {"banana", "apple", "orange", "grape", "pear"};
        // sort_string(words);
        // for(int i=0;i<words.length;i++){
        //     System.out.print(words[i]+" ");
        // }
        // int arr[]={15, 18, 2, 3, 6, 12};
        // System.out.println(sorted_rotated_array(arr));
        // PrintArray(arr);
        int arr[]={2,4,1,3,5};
        inversion_count(arr);

    }
}



