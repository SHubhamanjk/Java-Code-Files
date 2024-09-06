import java.util.ArrayList;

public class Queue_day1 {
    public static void main(String args[]){
        Queue_AL q = new Queue_AL();
        q.enqueue(5);
        q.enqueue(6);
        q.enqueue(3);
        q.enqueue(7);

        System.out.println(q.dequeue());
        System.out.println(q.dequeue());

        Queue_LL qq = new Queue_LL();
        qq.enqueue(5);
        qq.enqueue(6);
        qq.enqueue(3);
        qq.enqueue(7);

        System.out.println(qq.dequeue());
        System.out.println(qq.reer());
    }


    // Implementiing Queue Using ArrayList

   public static class Queue_AL{
        ArrayList<Integer> q = new ArrayList<>();

        public void enqueue(int data){
            q.add(data);
        }

        public int dequeue(){
            return q.remove(0);
        }

        public int reer(){
            return q.get(0);
        }

        public int get_size(){
            return q.size();
        }
    }  
    

    // Implementing using LinkedList

    public static class Queue_LL{
        public static class LinkedList{
            public class Node{
                int data;
                Node next;

                public Node(int data){
                    this.data=data;
                    this.next=null;
                }
            }

            public static Node head;
            public static Node tail;

            public void add_last(int data){
                Node newNode=new Node(data);
                if(head==null){
                    head=tail=newNode;
                    return;
                }
                tail.next=newNode;
                tail=newNode;
            }

            public int remove_first(){
                if(head==null){
                    return -1;
                }
                else{
                    int temp=head.data;
                    head=head.next;
                    return temp;
                }    
                
            }

            public int show_first(){
                if(head==null){
                    return -1;
                }
                return head.data;
            }

            public int size(){
                Node temp=head;
                int temp2=1;
                while(temp!=null){
                    temp2++;
                    temp=temp.next;
                }
                return temp2;
            }
        }

        LinkedList q = new LinkedList();

        
        public void enqueue(int data){
            q.add_last(data);
        }

        public int dequeue(){
            return q.remove_first();
        }

        public int reer(){
            return q.show_first();
        }
        
        public int get_size(){
            return q.size();
        }


    } 

}
