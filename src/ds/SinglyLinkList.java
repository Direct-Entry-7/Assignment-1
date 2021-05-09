package ds;

public class SinglyLinkList {
    private Node first;
    private Node last;
    private int size;


    public void add(int number){
        Node node = new Node(number);
        if(empty()){
            first = last = node;
            first.setValue(number);
        }else{
            last.setNext(node);
            last = node;
        }
        this.size++;
    }

    public void add(int index, int number){

    }

    public void remove(int index){

    }

    public int get(int index){
        return -1;
    }

    public void print(){
        if(empty()){
            System.out.println("[]");
            return;
        }else{
            Node current = first;
            System.out.print("[");
            while(current != null){
                System.out.print(current.getValue() + ",");
                current = current.getNext();
            }
            System.out.println("\b]");
        }
    }

    public void clear(){
        first = last = null;
        size = 0;
    }
    public int size(){
        return this.size;
    }

    public boolean contains(int number){
        return false;
    }

    public boolean empty(){
        return this.size() > 0 ? false : true;
    }
}
