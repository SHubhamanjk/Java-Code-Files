public class day28 {

    public static int find_occurance(int arr[], int target ,int i, int res){
        // int res=0;
        if(i==arr.length){
            return res;
        }
        if(arr[i]==target){
            res++;
            return find_occurance(arr, target, i+1,res);
        }
        else{
            return find_occurance(arr, target, i+1,res);
        }
        // System.out.println(res);
        // return res;
    }

    public static int find_lenth(String input , int lenth,int i){
        if(i==input.length()){
            return lenth;
        }
        else{
            lenth++;
            return find_lenth(input, lenth, i+1);
        }
    }

    public static void int_to_word(int num){
        String map[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        if(num==0){
            return;
        }
        else{
            int last = num%10;
            String last_word = map[last];
            int_to_word(num/10);
            System.out.print(last_word+" ");
            

        }

        
    }

    public static void main(String[] args) {
        // int arr[]={2,3,5,8,6,4,5,12,15,3,5,5,5,5};
        // int res;
        // System.out.println(find_occurance(arr, 5, 0,res=0));
        // System.out.println(find_lenth("Shubh", 0, 0));
        // String name = "Shubh";
        // name.charAt(4);
        
        int_to_word(1457);
    }


    
}
