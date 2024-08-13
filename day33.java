/* 
    How ArrayList Internally Works ?

    This is basically a array and when half size of array is filled then a 
    new array is automatically created by java and all previous element copied
    in new array




*/ 


import java.util.*;
public class day33 {

   // Function to find the container that can hold the most water
// public static int mostWater(ArrayList<Integer> heights) {
    /*
    Approach:
    To find the container that can hold the most water, we evaluate multiple pairs of lines (heights) 
    and calculate the water quantity for each pair. The water quantity is determined by the height 
    of the shorter line and the distance between the lines (width). We compare the calculated quantities 
    and update the maximum quantity accordingly. The final result is the maximum amount of water that 
    can be contained between any two lines.
    */
    
//     int maxWater = 0;  // Variable to store the maximum water found

//     for (int i = 0; i < heights.size(); i++) {
//         for (int j = i + 1; j < heights.size(); j++) {
//             // Calculate the height of the water using the shorter of the two lines
//             int height = Math.min(heights.get(i), heights.get(j));
            
//             // Calculate the width (distance between the two lines)
//             int width = j - i;
            
//             // Calculate the water quantity for the current pair of lines
//             int currentWater = height * width;
            
//             // Update the maximum water if the current quantity is greater
//             if (currentWater > maxWater) {
//                 maxWater = currentWater;
//             }
//         }
//     }
    
//     return maxWater;  // Return the maximum water found
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
