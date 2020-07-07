package cha8_tree;

/**
 * 树的节点
 */
public class Node {

    int iData;
    double fData;

    Node leftChild;
    Node rightChild;

    public void display(){
        System.out.println("key=" + iData);
    }
}
