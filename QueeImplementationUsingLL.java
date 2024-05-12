package queue;

public class QueeImplementationUsingLL {
    class Node{
        Object ele;
        Node next;
        Node(Object e,Node n){
            ele = e;
            next = n;
        }
    }
    private int count = 0;
    Node first;
    public void add(Object e){
        if (first == null){
            first = new Node(e,null);
            count++;
            return;
        }
        Node curr = first;
        while (curr.next != null){
            curr = curr.next;
        }
        curr.next = new Node(e,null);
        count++;
    }
    public int size(){
        return count;
    }
    public boolean isempty(){
        if (count == 0)
            return true;
        return false;
    }
    public Object peek(){
        if (count == 0)
            throw new IndexOutOfBoundsException();
        return first.ele;
    }
    public Object pool(){
        if (count == 0)
            throw new IndexOutOfBoundsException();
       Node curr = first;
       first = first.next;
       count--;
       return curr.ele;
    }
    public static void main(String[] args) {
      QueeImplementationUsingLL q = new QueeImplementationUsingLL();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        System.out.println(q.size());
        System.out.println(q.peek());
        System.out.println(q.pool());
        System.out.println(q.isempty());
        System.out.println(q.size());
        while (!q.isempty()){
            System.out.println(q.pool());
        }
    }
}
