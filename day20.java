public class day20 {


    public static void check_odd_even(int inpt){
        int res = inpt & 1 ;
        if(res==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }

    // public static void get_ith_bit(int inpt,int n){
    //     Integer temp = inpt;
    //     String temp2=temp.toString();
    //     if(n<=0 || n>temp2.length()){
    //         System.out.println("Kya kr rha hai bhai tu !!! ");
    //     }
    //     else{
    //         System.out.println(temp2.charAt(n-1));
    //     }

    // }

    public static void get_ith_bit(int inpt , int n){
        if((inpt&(1<<n))==0){
            System.out.println(0);
        }
        else{
            System.out.println(1);
        }
    }

    public static void set_ith_bit(int inpt , int n){
        System.out.println(inpt|(1<<n));
    }

    public static void clear_ith_bit(int inpt , int n){
        if((inpt&(1<<n))==0){
            System.out.println(inpt);
        }
        else{
            System.out.println((inpt&(~(1<<n))));
        }
    }

    public static void update_ith_bit(int inpt , int n , int opr){
        if(opr == 1){
            set_ith_bit(inpt, n);
        }
        else{
            clear_ith_bit(inpt, n);
        }

    }

    public static void clear_till_ith_bit(int inpt , int n){
        System.out.println(inpt&((~0)<<n));
    }

    public static void clear_range_bit(int inpt , int st , int end){
        int temp1=(~0)<<st-1;
        int temp2=(~0)<<end+1;
        int temp3=temp1|temp2;
        System.out.println(inpt&temp3);
    }

    // public static void check_odd_even(int inpt){
    //     Integer temp = inpt ;
    //     String temp2 = temp.toString();
    //     int n =temp2.length();
    //     if(temp2.charAt(n-1)=='1'){
    //         System.out.println("Odd");
    //     }
    //     else{
    //         System.out.println("Even");
    //     }
    // }





    public static void main(String args[]){
        check_odd_even(6);
        get_ith_bit(100, 2);
        int inpt = 100;
        Integer num = 6 ;
        System.out.println(num.toString().charAt(num.toString().length()-1));
        Integer temp = inpt;
        String temp2=temp.toString();
        System.out.println(temp2.charAt(1));
        for(int i=0;i<temp2.length();i++){
            System.out.println(temp2.charAt(i));
        }
        get_ith_bit(4, 1);
        set_ith_bit(4, 1);
        System.out.println(1<<1);
        clear_ith_bit(10, 1);
        update_ith_bit(10, 3, 1);
        System.out.println(15>>2);
        clear_till_ith_bit(15, 2);
        clear_range_bit(10, 2, 4);
        // Integer temp = ((~0)<<2+1);
        System.out.println(temp.toString());


    }
    
}
