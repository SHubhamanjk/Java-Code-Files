
// ArrayList : a inbuilt data strucutruture which is similar to array but dynamic in nature and
                // it is similar to python list




import java.util.*;
public class day32 {
    public static void find_subset(String word , String ans , int i){
        if(i==word.length()){
            if(ans.length()==0){
                System.out.println("NUll");
            }
            else{
                System.out.println(ans);
            }
            return;
        }

        find_subset(word, ans, i+1);
        find_subset(word, ans+word.charAt(i), i+1);
    }

    public static void main(String[] args) {
        // String word = "Abc";
        // find_subset(word, "", 0);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(9);
        list.add(15);
        list.add(3);
        list.add(4);
        list.add(7);

        /// programe to find max
        int max_idx = 0 ;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(max_idx)){
                max_idx=i;
            }
        }

        System.out.println(list);
        /// programe to swap
        int i1=2;
        int i2=4;
        int temp = list.get(i2);
        list.set(i2, list.get(i1));
        list.set(i1, temp);
        System.out.println(list);

    }
}
