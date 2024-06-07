// 2d Array :-  This is also the extension of normal array but this one is in 2 D ... if we visualize this
//              then this looks like a matrix


import java.util.*;
public class day16 {
    public static boolean search_arr(int arr[][],int key){
        int n=arr.length , m=arr[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==key){
                    System.out.println(i+","+j);
                    return true;
                }
            }
        }
        return false; 
    }

    public static void min_max(int arr[][]){
        int n=arr.length,m=arr[0].length;
        int min=arr[0][0],max=arr[0][0];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
                if(arr[i][j]<min){
                    min=arr[i][j];
                }
            }
        }
        System.out.println("Maximum Elemet of Array is : "+max);
        System.out.println("Minimum Elemet of Array is : "+min);
    }

    public static void print_Spiral_Matrix(int arr[][]){
        int sr=0,er=arr[0].length-1,sc=0,ec=arr.length-1;
        while(sr<=er && sc<=ec){
            for(int j=sc;j<=ec;j++){
                System.out.print(" "+arr[sr][j]+" ");
            }
            for(int i=sr+1;i<=er;i++){
                // if(sr==er){
                //     break;
                // }
                System.out.print(" "+arr[i][ec]+" ");
            }
            for(int j=ec-1;j>=sc;j--){
                // if(sc==ec){
                //     break;
                // }
                System.out.print(" "+arr[er][j]+" ");
            }
            for(int i=er-1;i>=sr+1;i--){
                System.out.print(" "+arr[i][sr]+" ");
            }
            sr++;
            er--;
            sc++;
            ec--;


        }
    }


    public static void main(String args[]){
        int arr[][]=new int[3][3]; // initialization of 2d array
        int n=arr.length,m=arr[0].length;
        int arr[][]={{1,2,3,4},
                    {9,6,5,6},
                    {7,11,25,9}
                    // {36,7,2,3}
                    };
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){ // this is how we can create 2d array by user input
            for(int j=0;j<m;j++){
                System.out.print("Enter the ("+i+","+j+") "+"Element :- ");
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){ // this is how we can print 2d array
            for(int j=0;j<m;j++){
                System.out.print(" "+arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
        System.out.print(search_arr(arr, 2));
        min_max(arr);
        print_Spiral_Matrix(arr);
        

    }
}
