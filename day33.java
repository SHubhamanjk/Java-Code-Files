/* 
    How ArrayList Internally Works ?

    This is basically a array and when half size of array is filled then a 
    new array is automatically created by java and all previous element copied
    in new array




*/ 


import java.util.*;
public class day33 {

    // public static int most_water(ArrayList<Integer> list){
    //     int res = 0;
    //     for(int i=0;i<list.size();i++){
    //         for(int j=i+1;j<list.size();j++){
    //             int height = Math.min(list.get(i), list.get(j));
    //             int width = j-i;
    //             int temp = height*width;
    //             if(temp>res){
    //                 res=temp;
    //             }
    //         }
    //     }
    //     return res;
    // }

    public static int most_water(ArrayList<Integer> list){
        int res  = 0;
        int lp = 0;
        int rp = list.size()-1;
        while(lp<rp){
            int height = Math.min(list.get(rp), list.get(lp));
            int width = rp-lp;
            int temp = height*width;
            if(temp>res){
                res=temp;
            }

            if(list.get(lp)>list.get(rp)){
                rp--;
            }
            else{
                lp++;
            }
        }
        return res;
    }
    public static void main(String ars[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        // Collections.sort(list); // this is sort array in ascending order
        // System.out.println(list);
        // Collections.sort(list ,Collections.reverseOrder());
        // System.out.println(list);
        // ArrayList<ArrayList<Integer>> mlist = new ArrayList<>();
        // mlist.add(list);
        // mlist.add(list);
        // System.out.println(mlist);
        // for(int i=0;i<mlist.size();i++){
        //     ArrayList<Integer> curr_l=mlist.get(i);
        //     for(int j=0;j<curr_l.size();j++){
        //         System.out.print(curr_l.get(j)+" ");
        //     }
        // }
        System.out.println(most_water(list));
    }
}
