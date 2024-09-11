import java.util.Deque;
import java.util.LinkedList;

public class queue_day5{
    public static void main(String args[]){
        stack s = new stack();
        s.push(5);
        s.push(7);
        s.push(15);

        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }

        System.out.println();

        
        queue q = new queue();

        q.enqueue(5);
        q.enqueue(7);
        q.enqueue(15);

        while(!q.isEmpty()){
            System.out.print(q.deenqueue()+" ");
        }

        
    }


    public static class stack{
        Deque<Integer>  dq = new LinkedList<>();

        public void push(int data){
            dq.addFirst(data);
        }

        public int peek(){
            return dq.peekFirst();
        }

        public int pop(){
            return dq.removeFirst();
        }

        public boolean isEmpty(){
            return dq.isEmpty();
        }

    }


    public static class queue{
        Deque<Integer> dq= new LinkedList<>();

        public void enqueue(int data){
            dq.addLast(data);
        }

        public int deenqueue(){
            return dq.removeFirst();
        }

        public int rear(){
            return dq.peekFirst();
        }

        public boolean isEmpty(){
            return dq.isEmpty();
        }
    }
}