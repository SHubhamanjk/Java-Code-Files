public class LL_day_1 {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add_first(1);
        ll.add_first(5);
        ll.add_last(12);
        ll.add_first(-4);

        ll.print_LL();
    }

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

        public void add_first(int data){
            Node newNode = new Node(data);
            if(head==null){
                head = tail = newNode;
                return;
            }
            else{
                newNode.next = head;
                head = newNode;
            }
        }

        public void add_last(int data){
            Node newNode = new Node(data);
            if(head==null){
                head=tail=newNode;
                return;
            }
            else{
                tail.next = newNode;
                tail=newNode;
            }


        }

        public void print_LL(){
            if(head==null){
                System.out.println("LL Is empty");
            }
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+"-->");
                temp=temp.next;
            }
            System.out.println("Null");
        }
    
    }
}
