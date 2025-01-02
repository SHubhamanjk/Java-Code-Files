public class day17 {

    public static void spiral_matrix(int arr[][]){
        int sr=0,er=arr.length-1,sc=0,ec=arr[0].length-1;
        while(sr<=er && sc<=ec){
            for(int j=sc;j<=ec;j++){
                System.out.print(" "+arr[sr][j]+" ");
            }
            for(int i=sr+1;i<=er;i++){
                System.out.print(" "+arr[i][ec]+" ");
            }
            for(int j=ec-1;j>=sc;j--){
                if(er==sr){
                    break;
                }
                System.out.print(" "+arr[er][j]+" ");
            }

            for(int i=er-1;i>=sr+1;i--){
                if(sc==ec){
                    break;
                }
                System.out.print(" "+arr[i][sc]+" ");
            }
            sr++;
            er--;
            sc++;
            ec--;
        }
    }

    public static int diogonal_sum_matrix(int arr[][]){
        int primary_sum=0,secondry_sum=0,n=arr.length;
        for(int i=0;i<n;i++){
            if(n%2!=0){
                if(n/2==i){
                    primary_sum+=arr[i][i];
                    continue;
                }
            }    
            for(int j=i;j<=i;j++){
                primary_sum+=arr[i][j];
                secondry_sum+=arr[i][n-1-i]; 
            }
        }    
    
    return primary_sum+secondry_sum;
    }

    public static boolean find_key_matrix_b(int arr[][],int key){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int si=0,ei=arr[i].length-1;
            while(si<=ei){
                int mi=(si+ei)/2;
                if(key>arr[i][mi]){
                    si=mi+1;
                }
                else if(arr[i][mi]>key){
                    ei=mi-1;
                }
                else{
                    return true;
                        
                }
            }
        }
        return false;
    }

    public static boolean find_key_matrix(int arr[][],int key){
        int row=0;
        int col=arr.length-1;
        while(row < arr.length && col >= 0){
            if(key==arr[row][col]){
                return true;
            }
            else if(key>arr[row][col]){
                row++;
            }
            else{
                col--;
            }
        }
        return false;

    }

    public static void traspose(int arr[][]){
        int transpose_matrix[][]=new int [arr[0].length][arr.length];
        // int temp1[][]=arr;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                transpose_matrix[j][i]=arr[i][j];
            }
        }
        for(int i=0;i<transpose_matrix.length;i++){
            for(int j=0;j<transpose_matrix[0].length;j++){
                System.out.print(" "+transpose_matrix[i][j]+" ");
            }
            System.out.println();
        }
    }


    public static void main(String args[]){
        int arr[][]={{2,3,7},
                    {9,4,3},
                    {3,7,1}};
                            
        spiral_matrix(arr);

        int arr_1[][]={{1,2,3,4},
                    {5,6,7,5},
                    {10,11,12,6},
                    {7,8,9,10}};
        System.out.println(diogonal_sum_matrix(arr_1));

        int arr_2[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        System.out.print(find_key_matrix(arr_2, 35));

        // print number of 7 in this array 
        int arr_3[][]={{4,7,8},{8,8,7}};
        int count=0;
        for(int i=0;i<arr_3.length;i++){
            for(int j=0;j<arr_3[0].length;j++){
                if(arr_3[i][j]==7){
                    count++;
                }

            }
        }
        System.out.println(count);

        // print sum of numbers of second array of nums
        int num[][]={{1,4,9},{11,4,3},{2,2,3}};
        int sum=0;
        for(int i=0;i<num[1].length;i++){
            sum+=num[1][i];
        }
        System.out.println(sum);
        int arr_4[][]={{2,3,7},
                    {9,4,3},
                    {3,7,1},
                    {4,5,6}};
        traspose(arr_4);

    }
    
}
