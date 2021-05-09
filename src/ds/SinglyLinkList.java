package ds;

public class SinglyLinkList {
    private Node first;
    private Node last;
    private int size;


    public void add(int number) {
        Node node = new Node(number);
        if (empty()) {
            first = last = node;
            first.setValue(number);
        } else {
            last.setNext(node);
            last = node;
        }
        this.size++;
    }

    public void add(int index, int number) {
        if (index > size() - 1 || index < 0) {
            throw new RuntimeException("Invalid index");
        } else {
            Node node = new Node(number);
            if (index == 0) {
                node.setNext(first);
                first = node;
            } else {
                Node current = first;
                int count = 0;
                while (current != null) {
                    if (count == index - 1) {
                        node.setNext(current.getNext());
                        current.setNext(node);
                        break;
                    }
                    current = current.getNext();
                    count++;
                }
            }
        }
    }

    public void remove(int index) {

    }

    public int get(int index) {
        return -1;
    }

    public void print() {
        if (empty()) {
            System.out.println("[]");
            return;
        } else {
            Node current = first;
            System.out.print("[");
            while (current != null) {
                System.out.print(current.getValue() + ",");
                current = current.getNext();
            }
            System.out.println("\b]");
        }
    }

    public void clear() {
        first = last = null;
        size = 0;
    }

    public int size() {
        return this.size;
    }

    public boolean contains(int number) {
        if (empty()) {
            return false;
        }
        Node current = first;
        while (current != null) {
            if (current.getValue() == number) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    public boolean empty() {
        return this.size() > 0 ? false : true;
    }
}
