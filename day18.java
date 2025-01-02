// String : are used to store character in java ... strings are immutable

import java.util.Arrays;

public class day18 {
    public static int find_key_string(String word , char key){
        int n=word.length();
        for(int i=0;i<n;i++){
            if(word.charAt(i)==key){
                return i;

            }

        }
        return -1;
    }

    public static boolean is_palindrone(String word){
        for(int i=0;i<word.length()/2;i++){
            if(word.toLowerCase().charAt(i)!=word.toLowerCase().charAt(word.length()-1-i)){
                return false;
            }
        }
        return true;
    }

    public static float sortest_path(String dir){
        int x=0;
        int y=0;
        int n=dir.length();
        for(int i=0;i<n;i++){
            if(dir.toLowerCase().charAt(i)=='n'){
                x++;
            }
            else if(dir.toLowerCase().charAt(i)=='s'){
                x--;
            }
            else if(dir.toLowerCase().charAt(i)=='e'){
                y++;
            }
            else{
                y--;
            }
        }
        int res = x*x+y*y;
        return (float)Math.sqrt(res);

    }

    public static void print_substring(String word , int starting_index , int ending_index){
        for(int i=starting_index;i<ending_index;i++){
            System.out.print(word.charAt(i));
        }
    }

    public static String largest_string(String arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            if(arr[i].compareTo(arr[i+1])>0){
                String temp = arr[i+1];
                arr[i+1]=arr[i];
                arr[i]=temp;
            }
        }
        return arr[n-1];
    }

    public static StringBuilder compressed_string(String word){
        int n=word.length();
        
        StringBuilder compressed_word = new StringBuilder();
        for(int i=0;i<n;i++){
            int count = 1;
            for(int j=i+1;j<n;j++){
                if(word.charAt(i)==word.charAt(j)){
                   
                    count++;
                }
            }
            i=i+count-1;
            if(count>1){
                compressed_word.append(word.charAt(i));
                compressed_word.append(count);   
            }
            else{
                compressed_word.append(word.charAt(i));
            }

            
        }
        return compressed_word;
    }

    public static boolean check_anagrams(String word1,String word2){
        // int count=0;
        word1=word1.replace(" ", "");
        word2=word2.replace(" ", "");
        word1=word1.toLowerCase();
        word2=word2.toLowerCase();
        char word1_arr[]=word1.toCharArray();
        char word2_arr[]=word2.toCharArray();
        Arrays.sort(word1_arr);
        Arrays.sort(word2_arr);
        boolean result = Arrays.equals(word1_arr, word2_arr);
        return result;
    }


    public static void main(String args[]){
        String name="ajahaja";
        String name2=new String("shubham");
        System.out.println(name+name2);
        Scanner sc = new Scanner(System.in);
        String name3=sc.nextLine();
        System.out.println(name3);
        System.out.println(name3.length());
        System.out.println(name.charAt(4));
        System.out.println(find_key_string(name, 'b'));
        System.out.println(is_palindrone(name));
        String dir="WNEENESENNN";
        System.out.print(sortest_path(dir));
        String name = "shubham";
        print_substring(name, 2, 5);
        String arr[]={"orange","apple","mango","banana"};
        System.out.print(largest_string(arr));
        System.out.print(arr[1].compareTo(arr[0]));
        Integer a = 10;
        System.out.println(a.toString());
        
        StringBuilder name_2 = new StringBuilder("SHubham"); // this is mutable
        System.out.println(name_2);
        for(char i='a';i<='z';i++){
            name_2.append(i);
        }
        System.out.println(name);

        // WAP to conver "i am shubham kumar" to "I Am Shubham Kumar"

        StringBuilder sent = new StringBuilder("Hey , i am shubham currently pursuing my btech from IITP . it was nice to meet you");
        sent.append(" nidhi");
        for(int i=0;i<sent.length();i++){
            if(i==0){
                sent.setCharAt(0, Character.toUpperCase(sent.charAt(0)));
            }
            
            if(sent.charAt(i)==' '){
                char temp = Character.toUpperCase(sent.charAt(i + 1));
                sent.setCharAt(i+1,temp);
            }
        }
        System.out.println(sent);
        StringBuilder sent = new StringBuilder();
        sent.append("s");
        System.out.println(sent);
        String input = "abcabcabcabc";
        System.out.println(input.length());
        System.out.println(compressed_string(input)+" " +compressed_string(input).length());

        String inpt = "Apna College";
        int count = 0;
        for(int i=0;i<inpt.length();i++){
            if(inpt.charAt(i)=='a'||inpt.charAt(i)=='e'||inpt.charAt(i)=='i'||inpt.charAt(i)=='o'||inpt.charAt(i)=='u'){
                count++;
            }
        }
        System.out.println(count);
        System.out.println(inpt.replace('l', ' '));
        System.out.println(check_anagrams("dormitory", "dirty room"));
        if("dormitory".replace(" ", "").length()=="dirty room".replace(" ", "").length()){
            System.out.println("True");
        }


        
    }
    
}

