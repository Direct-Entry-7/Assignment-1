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
//        System.out.println(linkList.contains(100));
//        linkList.add(-1,11111);
//        linkList.add(5,11111);
//        linkList.add(0,11111);
//        linkList.print();
//        linkList.add(4,11111);
//        linkList.print();import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
//        linkList.add(1,11111);
//        linkList.print();
//        linkList.remove(0);
//        linkList.print();
//        System.out.println(linkList.size());
//        System.out.println(linkList.get(0));
//        System.out.println(linkList.get(4));
//        System.out.println(linkList.get(-1));
//        System.out.println(linkList.get(5));
//        linkList.add(0,1000);
//        linkList.print();
//        linkList.add(4,1000);
//        linkList.print();
//        linkList.add(5,1000);
//        linkList.add(-1,1000);
//        linkList.remove(0);
//        linkList.remove(4);
//        linkList.remove(3);
//        linkList.remove(-1);
//        linkList.remove(5);
//        linkList.print();
        linkList.print();
        System.out.println(linkList.get(0));
        System.out.println(linkList.get(4));
        System.out.println(linkList.get(3));
//        System.out.println(linkList.get(-1));
//        System.out.println(linkList.get(5));
        System.out.println(linkList.size());
        System.out.println(linkList.empty());
        linkList.clear();
        linkList.print();

    }
}
