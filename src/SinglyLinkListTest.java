import ds.SinglyLinkList;

public class SinglyLinkListTest {
    public static void main(String[] args) {
        SinglyLinkList linkList = new SinglyLinkList();
        System.out.println(linkList.empty());
        System.out.println(linkList.size());
        linkList.add(10);
        linkList.add(20);
        linkList.add(30);
        linkList.add(40);
        linkList.add(50);
        linkList.print();
        linkList.clear();
        linkList.print();
        System.out.println(linkList.empty());
        System.out.println(linkList.size());
    }
}
