import java.util.Stack;
public class stack_day_3 {
    public static void main(String args[]){
        // String input = "(((a+b)+(c+d)))";
        // System.out.println(duplicate_paranthesis(input));
        // System.out.println(simplfy_root("/home/user")); // Output: "/home/docs"
        // System.out.println(simplfy_root("/a/./b/../../c/"));    // Output: "/c"
        // System.out.println(simplfy_root("/../"));               // Output: "/"
        // System.out.println(simplfy_root("/home//user//")); // Output: "/home/user
        // int stocks[]={100,80,60,70,60,85,100};
        // stockSpan(stocks);
        int arr[]={6,8,0,1,3};
        nextGreater(arr);
        
    }

    public static boolean valid_paranthesis(String paranthesis){
        Stack<Character> s = new Stack<>();
        for(int i=0;i<paranthesis.length();i++){
            char curr_char = paranthesis.charAt(i);
            if(curr_char=='(' || curr_char=='{' || curr_char=='['){
                s.push(curr_char);
            }
            else{
                if(s.isEmpty()==true){
                    return false;
                }
                char top = s.peek();
                if((curr_char==')' && top=='(')||(curr_char==']' && top=='[')||(curr_char=='}' && top=='{')){
                    s.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(s.isEmpty()==true){
            return true;
        }
        else{
            return false;
        }
    } 


    public static boolean duplicate_paranthesis(String input) {
        Stack<Character> s = new Stack<>();
        // boolean foundDuplicate = false;
    
        for (int i = 0; i < input.length(); i++) {
            char curr_char = input.charAt(i);
            if(curr_char==')'){
                int count=0;
                while(s.peek()!='('){
                    count++;
                    s.pop();
                }
                if(count<1){
                    return true;
                }
                else{
                    s.pop();
                }
            }
            else{
                s.push(curr_char);
            }     
        }
        return false;
    }

    public static void stockSpan(int stocks[]){
        int span[]=new int[stocks.length];
        span[0]=1;
        Stack<Integer> s = new Stack<>();
        s.push(0);
        for(int i=1;i<stocks.length;i++){
            int curr = stocks[i];
            while(!s.isEmpty() && curr>stocks[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()==true){
                span[i]=i+1;
            }
            else{
                int prvHigh=s.peek();
                span[i]=i-prvHigh;
            }
            s.push(i);
        }  

        for(int i=0;i<span.length;i++){
            System.out.print(span[i]+" ");
        }
    }

    public static void nextGreater(int arr[]){
        int res[]=new int[arr.length];
        Stack<Integer> s = new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && s.peek()<arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                res[i]=-1;
                s.push(arr[i]);
            }
            else{
                res[i]=s.peek();
                s.push(arr[i]);
            }
        }

        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
    public static String simplfy_root(String input) {
        String[] arr = input.split("/");
        Stack<String> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
    
        for (String element : arr) {
            if (element.equals("") || element.equals(".")) {
                continue;
            } else if (element.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                if (!stack.isEmpty() && !stack.peek().equals("/")) {
                    sb.append("/");
                }
                stack.push(element);
            }
        }
    
        if (stack.isEmpty()) {
            sb.append("/");
        } else {
            while (!stack.isEmpty()) {
                sb.append("/").append(stack.pop());
            }
        }
    
        return sb.toString();
    }

}
