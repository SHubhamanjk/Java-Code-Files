public class day21{
    public static void check_odd_even(int n){
        if((n&(1<<0))==1){
            System.out.println(n+" is a odd number");
        }
        else{
            System.out.println(n+" is a even number");
        }

    }

    public static void get_ith_bit(int num , int i){
        if((num&(1<<i))==0){
            System.out.println(0);
        }
        else{
            System.out.println(1);
        }
    }

    public static void set_ith_bit(int num , int i ){
        System.out.println((num|(1<<i)));
    }

    public static void clear_ith_bit(int num , int i){
        if((num&(1<<i))==0){
            System.out.println(num);
        }
        else{
            System.out.println((num&(0<<i)));
        }

    }

    public static void update_ith_bit(int num , int n , int opr){
        if(opr==0){
            clear_ith_bit(num, opr);
        }
        else{
            set_ith_bit(num, opr);
        }
    }

    public static void clear_ith_bits(int num , int i){
        System.out.println((num&((~0)<<i)));
    }

    public static void clear_range_bits(int num , int start_point  , int end_point){
        int temp1 = ((~0)<<(end_point+1));
        int temp2 = (1<<start_point)-1;
        int temp3=temp1|temp2;
        System.out.println(num&temp3);
    }

    public static boolean is_power_of_2(int num){
        if((num & (num-1))==0){
            return true;
        }
        else{
            return false;
        }
    }

    public static int count_set_bits(int num){
        int count=0;
        while(num>0){
            if((num&1)==1){
                count++;
            }
            num=num>>1;
        }
        return count;
    }

    public static int fast_expo(int num , int power){
        int ans = 1;
        while(power>0){
            if((power&1)==1){
                ans*=num;
            }
            num *= num;
            power=power>>1;
        }
        return ans;
    }

    public static void main(String[] args) {
        check_odd_even(88);
        get_ith_bit(10, 2);
        set_ith_bit(10, 2);
        clear_ith_bit(4, 1);
        clear_ith_bits(29, 3);
        clear_range_bits(29, 1, 3);
        System.out.println(is_power_of_2(8));
        System.out.println(count_set_bits(15));
        System.out.println(fast_expo(10,8));
    }
}