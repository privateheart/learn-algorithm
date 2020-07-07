package cha5_Link;

/**
 * 单链表
 */
public class LinkList {
    private Link first;

    public void insertFirst(int iData, double dData) {
        Link newLink = new Link(iData,dData);
        if (!isEmpty()){
            newLink.next = first;
        }
        first = newLink;
    }

    public boolean isEmpty(){
        if (first == null){
            return true;
        }
        return false;
    }

    public void deleteFirst(){
        if (!isEmpty()){
            if (first.next != null ){
                first = first.next;
            }else {
                first = null;
            }
        }
    }

    public void displayList(){
        Link currentLink = first;
        while (currentLink !=null){
            currentLink.displayLink();
            currentLink = currentLink.next;
        }
    }

}
