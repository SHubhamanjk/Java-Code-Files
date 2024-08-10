public class day31 {
    public static void change_arr(int arr[],int val , int idx){
        if(idx==arr.length-1){
            print_arr(arr);
            return;
        }
        
        arr[idx]=val;
        change_arr(arr, val+1, idx+1);
        arr[idx]=arr[idx]-2;
    }

    public static void print_arr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[]=new int[5];
        change_arr(arr, 1, 0);
        print_arr(arr);
        

    }
}
