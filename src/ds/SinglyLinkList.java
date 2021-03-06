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
        }
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

        this.size++;
    }

    public void remove(int index) {
        if (empty()) {
            throw new RuntimeException("Cannot remove item from empty Link List");
        } else if (index > size() - 1 || index < 0) {
            throw new RuntimeException("Invalid Index");
        } else {
            Node current = first;
            if (index == 0) {
                Node next = current.getNext();
                current.setNext(null);
                first = next;
            }

            if (index == size() - 1) {
                while (current != null) {
                    if (current.getNext() == last) {
                        current.setNext(null);
                        last = current;
                        break;
                    }
                    current = current.getNext();
                }

            }

            int count = 0;
            while (current != null) {
                if (count == index - 1) {
                    Node node = current.getNext();
                    Node next = node.getNext();
                    current.setNext(next);
                    node.setNext(null);
                }
                current = current.getNext();
                count++;
            }
        }
        size--;

    }

    public int get(int index) {
        if (empty()) {
            throw new RuntimeException("Cannot get item from empty Link List");
        }
        if (index > size() - 1 || index < 0) {
            throw new RuntimeException("Index Error");
        }

        if(index == 0){
            return first.getValue();
        }

        if(index == size()-1){
            return last.getValue();
        }

        Node current = first;
        int count = 0;
        int value = 0;

        while (current != null) {
            if (count == index) {
                value = current.getValue();
            }
            current = current.getNext();
            count++;
        }
        return value;
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
