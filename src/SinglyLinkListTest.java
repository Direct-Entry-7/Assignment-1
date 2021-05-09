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
        linkList.add(100);
        linkList.add(200);
        linkList.add(300);
        linkList.add(400);
        linkList.add(500);
        linkList.print();
        System.out.println(linkList.contains(100));
    }
}
