import java.util.*;
public class day34 {
    public static int most_water(ArrayList<Integer> list){
        int lp = 0;
        int rp = list.size()-1;
        int res = 0 ;
        while(rp>lp){
            int height = Math.min(list.get(rp), list.get(lp));
            int width = rp-lp;
            int temp = height*width;
            if(temp>res){
                res=temp;
            }
            if(list.get(rp)>list.get(lp)){
                lp++;
            }
            else{
                rp--;
            }
        }
        return res;

    }

    public static void pair_sum(ArrayList<Integer> list , int target){
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)+list.get(j)==target){
                    System.out.println("("+list.get(i)+","+list.get(j)+")");
                    break;
                
                }
                
            }
        
        }
    }

    public static void pair_sum_optimized(ArrayList<Integer> list , int target){
        int lp = 0;
        int rp = list.size()-1;
        while(rp>lp){
            if(list.get(rp)+list.get(lp)>target){
                rp--;
            }
            else if(list.get(rp)+list.get(lp)<target){
                lp++;
            }
            else if(list.get(rp)+list.get(lp)==target){
                System.out.println("("+list.get(lp)+","+list.get(rp)+")");
                rp--;
                lp++;
                // break;
            }
            else{
                
            }
        }
    }
    public static void main(String agrs[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        // list.add(8);
        // list.add(3);
        // list.add(7);
        pair_sum_optimized(list,5);
    }
}
