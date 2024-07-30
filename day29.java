// public class day29 {
//     public static void reverse_array(int arr[]){
//         int n=arr.length/2;
//         for(int i=0;i<n;i++){
//             int temp=arr[i];
//             arr[i]=arr[arr.length-1-i];
//             arr[arr.length-1-i]=temp;

//         }
//     }

//     public static void pair_array(int arr[]){
//         for(int i=0;i<arr.length;i++){ 
//             for(int j=i+1;j<arr.length;j++){
//                 System.out.print("("+arr[i]+","+arr[j]+")");
//             }
//         }
//     }

//     public static void sub_array(int arr[]){
//         for(int i=0;i<arr.length;i++){ 
//             System.out.print("("+arr[i]+")");
//             for(int j=i+1;j<arr.length;j++){
//                 System.out.print("("+arr[i]+","+arr[j]+")");
//             }
//         }
//     }

//     public static void main(String[] args) {
//         int arr[]={6,9,4,3,5,7};
//         // reverse_array(arr);
//         // for(int i=0;i<arr.length;i++){
//         //     System.out.print(arr[i]+" ");
//         // }
//         sub_array(arr);
//     }
// }

public class day29{
    public static void sort_string(String arr[]){
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

    public static void main(String args[]){
        String words[] = {"banana", "apple", "orange", "grape", "pear"};
        sort_string(words);
        for(int i=0;i<words.length;i++){
            System.out.print(words[i]+" ");
        }

    }
}



