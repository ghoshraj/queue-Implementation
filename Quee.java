package queue;

class QueeImplementation{
    Object [] arr = new Object[10];
    private int count = 0;
    public void increasearraysize(){
        Object [] temp = new Object[arr.length+3];
        System.arraycopy(arr,0,temp,0,arr.length);
        arr = temp;
    }
    public void add(Object ele){
        if (count>=arr.length)
            increasearraysize();
        arr[count] = ele;
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
        return arr[0];
    }
    public Object poll(){
        if (count == 0)
            throw new IndexOutOfBoundsException();
        Object temp = arr[0];
        for (int i = 1; i < size(); i++){
            arr[i - 1] = arr[i];
        }
        arr[count - 1] = null;
        count--;
        return temp;
    }
}
public class Quee {
    public static void main(String[] args) {
        QueeImplementation q = new QueeImplementation();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        System.out.println(q.size());
        System.out.println(q.poll());
        System.out.println(q.isempty());
        System.out.println(q.peek());
        System.out.println(q.size());
        while (!q.isempty()){
            System.out.println(q.poll());
        }
    }
}
