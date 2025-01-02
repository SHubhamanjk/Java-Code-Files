import java.util.*;


public class revision_again{

    public static int add(int a , int b){
        return a+b;
    }

    public static int sub(int a ,int b){
        return a-b;
    }

    public static int mult(int a , int b){
        return a*b;
    }

    public static float div(int a , int b){
        return a/b;
    }

    public static void calculater(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number :- ");
        int num1=sc.nextInt();
        System.out.print("Enter the Second Number :- ");
        int num2=sc.nextInt();
        System.out.print("Enter the Operator :- ");
        char opr=sc.next().charAt(0);
        sc.close();

        if(opr=='+'){
            System.out.println("Summation of "+num1+" and "+num2+" is "+add(num1, num2));
        }
        else if( opr=='-'){
            System.out.println("Subtraction of "+num1+" and "+num2+" is "+sub(num1, num2));
        }
        else if(opr=='*'){
            System.out.println("Multipication of "+num1+" and "+num2+" is "+mult(num1, num2));
        }
        else{
            System.out.println("Division of "+num1+" and "+num2+" is "+div(num1, num2));
        }


    }


    public static boolean check_prime(int num){
        if(num<=1){
            return false;
        }
        else if(num==2){
            return true;
        }
        else if(num%2==0){
            return false;
        }
        else{
            for(int i=3;i<Math.sqrt(num);i+=2){
                if(num%i==0){
                    return false;
                }
            }
            return true;
        }
    }

    public static int find_factorial(int num){
        int count=1;
        int result=num;
        while(count!=num){
            result*=count;
            count++;
        }

        return result;
    }


    public static boolean check_palindrom(String input){
        for(int i=0;i<input.length()/2;i++){
            if(input.charAt(i)!=input.charAt(input.length()-1-i)){
                return false;
            }
        }
        return true;
    }

    public static int[][] matrix_transpose(int arr[][]){
        int new_arr[][]=new int[arr[0].length][arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                new_arr[j][i]=arr[i][j];
            }
        }
        return new_arr;
    }

    public static int linear_search(int arr[] , int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i+1;
            }
        }
        return -1;
    }

    public static int binary_search(int arr[],int target){
        int first=0;
        int last=arr.length-1;
        int mid;
        while(first<=last){
            mid=(first+last)/2;
            if(target>arr[mid]){
                first=mid+1;
            }
            else if(arr[mid]>target){
                last=mid-1;
            }
            else{
                return mid+1;
            }
        }
        return -1;
    }

    public static int[] bubble_sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }

    public static int[] insertion_sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<i;j++){
                if(arr[j]>arr[i]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }

    public static int[] selection_sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        return arr;
    }





    public static void main(String args[]){

        System.out.println("\nTest Case 5 - Prime Check (Prime Number):");
        System.out.println(check_prime(7));  

        System.out.println("\nTest Case 6 - Prime Check (Non-prime Number):");
        System.out.println(check_prime(10));  

        System.out.println("\nTest Case 7 - Factorial:");
        System.out.println(find_factorial(5));  

        System.out.println("\nTest Case 8 - Palindrome Check (Palindrome String):");
        System.out.println(check_palindrom("madam"));  

        System.out.println("\nTest Case 9 - Palindrome Check (Non-palindrome String):");
        System.out.println(check_palindrom("hello"));  

        System.out.println("\nTest Case 10 - Matrix Transpose:");
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[][] transposedMatrix = matrix_transpose(matrix);
        for (int i = 0; i < transposedMatrix.length; i++) {
            for (int j = 0; j < transposedMatrix[i].length; j++) {
                System.out.print(transposedMatrix[i][j] + " ");
            }
            System.out.println();
        }  

        System.out.println("\nTest Case 11 - Linear Search (Element Found):");
        int[] arr1 = {10, 20, 30, 40, 50};
        System.out.println(linear_search(arr1, 30));  

        System.out.println("\nTest Case 12 - Linear Search (Element Not Found):");
        System.out.println(linear_search(arr1, 60));  

        System.out.println("\nTest Case 13 - Binary Search (Element Found):");
        int[] arr2 = {10, 20, 30, 40, 50};
        System.out.println(binary_search(arr2, 30));  

        System.out.println("\nTest Case 14 - Binary Search (Element Not Found):");
        System.out.println(binary_search(arr2, 60));  

        System.out.println("\nTest Case 15 - Bubble Sort:");
        int[] arr3 = {5, 2, 9, 1, 5, 6};
        System.out.println(Arrays.toString(bubble_sort(arr3)));  

        System.out.println("\nTest Case 16 - Insertion Sort:");
        int[] arr4 = {5, 2, 9, 1, 5, 6};
        System.out.println(Arrays.toString(insertion_sort(arr4))); 

        System.out.println("\nTest Case 17 - Selection Sort:");
        int[] arr5 = {5, 2, 9, 1, 5, 6};
        System.out.println(Arrays.toString(selection_sort(arr5)));  
    }

  



    class Student{
        String name;
        int id;
        int classs;
        float score;


        Student(){
            ;
        }

        Student(String name,int id,int classs,float score){
            this.name=name;
            this.id=id;
            this.classs=classs;
            this.score=score;
        
        }

        public void print_details(){
            System.out.println(" Name --> "+this.name);
            System.out.println(" Id --> "+this.id);
            System.out.println(" Class --> "+this.classs);
            System.out.println(" Score --> "+this.score);

        }

        private boolean fee_status;
        private int unique_id;

        public void set_fee_status(boolean status){
            this.fee_status=status;
        }

        public void set_u_id(int id){
            this.unique_id=id;
        }

        public void get_fee_status(){
            if(this.fee_status==true){
                System.out.println("Paid");
            }
            else{
                System.out.println("UnPaid");
            }
        }

        public void get_unique_id(){
            if(this.unique_id!=0){
                System.out.println("Unique Id --> "+this.unique_id);
            }
            else{
                System.out.println("Unique Id is not Assigned to this Student yet");
            }
        }

        
    } 

    public class CS_Student extends Student{
        String language;
        int no_of_projects_done;


    }
}