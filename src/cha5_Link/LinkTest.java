package cha5_Link;

public class LinkTest {
    public static void main(String[] args) {
        LinkList linkList = new LinkList();
        linkList.insertFirst(1,1.1);
        linkList.insertFirst(2,1.2);
        linkList.insertFirst(3,1.3);

        linkList.displayList();
    }
}
