import java.util.*;
public class day35 {
    public static boolean monotonic_array(ArrayList<Integer> list){
        int count = 0;
        if(list.get(0)<list.get(list.size()-1)){
            for(int i=0;i<list.size()-1;i++){
                if(list.get(i)<=list.get(i+1)){
                    count++;
                }                
            }
        }
        else if(list.get(0)>list.get(list.size()-1)){
            for(int i=0;i<list.size()-1;i++){
                if(list.get(i)>=list.get(i+1)){
                    count++;
                }
        
                
            }
        }

        else{
            for(int i=0;i<list.size()-1;i++){
                if(list.get(i)==list.get(i+1)){
                    count++;
                }
        
                
            }
        }
        if(count==list.size()-1){
            return true;
        }
        else{
            return false;
        }
        
        
    }

    public static void lonely_number(ArrayList<Integer> list){
        ArrayList<Integer> res_list = new ArrayList<>();
        for(int i=0;i<list.size();i++){
            for(int j=i;j<list.size();j++){
                if(i!=j){
                    if(list.get(i)!=list.get(j)||list.get(i)!=list.get(j)+(1)||list.get(i)!=list.get(j)-1){
                        res_list.add(list.get(i));
                    }
                }
            }
        }
        System.out.println(res_list);
    }

    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(8);
        list.add(5);
        list.add(6);
        // System.out.println(monotonic_array(list));
        lonely_number(list);
    }
}
