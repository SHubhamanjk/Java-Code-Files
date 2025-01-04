// How does function call works
    /*if there are multiple functions then 
         while executing : main-->funct1-->funct2-->funct3--->functn (stack) , things get saved in stack in this way in stack
         after executing the work  : functn-->funct3->funct2->funct1-->main , things get removed in this way from stack
     */
// What is recursion , why recursion 
    /*
      What ? : A function calling it self repeatavily , untill base condition meets.

      Why ? : to solve complex and bigger problems , and alternate of iteration ... it shows vica verca relation with iteration.
     */

public class recursion {


    public static int nth_febonacci(int n){
        if(n==0||n==1){
            return n;
        }
        return (nth_febonacci(n-1)+nth_febonacci(n-2));
    }
    public static void main(String[] args) {
        System.out.println(nth_febonacci(10));
    }
}
