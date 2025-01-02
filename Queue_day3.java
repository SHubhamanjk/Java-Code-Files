import java.util.LinkedList;
import java.util.Queue;

public class Queue_day3 {
    public static void main(String[] args) {
        // // Create a FIFO queue using LinkedList
        // Queue<Integer> queue = new LinkedList<>();

        // // // Add items to the queue
        // queue.offer(1);
        // queue.offer(2);
        // // queue.

        // // // Remove and retrieve items from the queue
        // System.out.println(queue.peek());  // Outputs: 1
        // System.out.println(queue.poll());  // Outputs: 2

        // // Check if the queue is empty
        // System.out.println(queue.isEmpty());  // Outputs: true

        // Stack s = new Stack();
        // s.push(4);
        // s.push(6);
        // s.push(16);
        // s.push(78);
        // while(!s.isEmpty()){
        //     System.out.println(s.pop());
        // }
        // System.out.println(s.pop());
        // System.out.println(s.pop());
        PrintNonRepeating("aabccxb");
    }


    public static void PrintNonRepeating(String words){
        Queue<Character> q = new LinkedList<>();
        int freq[]=new int[26];
        for(int i=0;i<words.length();i++){
            char temp=words.charAt(i);
            q.offer(temp);
            freq[temp-'a']++;
            while(!q.isEmpty() && freq[q.peek()-'a']>1){
                q.poll();
            }

            if(q.isEmpty()){
                System.out.print(-1+" ");
            }
            else{
                System.out.print(q.peek()+" ");
            }
            
        }
        System.out.println();
    }

    public static class Stack{
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        public void push(int data){
            if(q2.isEmpty()){
                q1.offer(data);
            }
            else{
                q2.offer(data);
            }
        }

        public int pop(){
            int temp;
            if(q1.isEmpty() && q2.isEmpty()){
                return -1;
            }
           
            if(q1.isEmpty()==false){
                while(q1.size()>1){
                    temp=q1.peek();
                    q2.offer(q1.poll());
                }
                temp=q1.poll();
                return temp;
            }
            else{
                while(q2.size()>1){
                    temp=q2.peek();
                    q1.offer(q2.poll());
                }
                temp=q2.poll();
                return temp;
            }
            // return temp;
        }

        public boolean isEmpty(){
            if(q1.isEmpty() && q2.isEmpty()){
                return true;
            }
            return false;
        }
    }
}
