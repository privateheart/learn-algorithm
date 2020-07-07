package cha8_tree;

/**
 * 二叉树 (搜索二叉树  左子节点<父节点<右子节点)
 */
public class Tree {

    Node root;

    public Node find(int key){
        Node findIndex = root;
        if (findIndex == null){
            return null;
        }
        while (findIndex!=null && findIndex.iData != key){
            if (findIndex.iData > key){
                findIndex = findIndex.leftChild;
            }else {
                findIndex = findIndex.rightChild;
            }
        }
        return findIndex;
    }

    public void insert(Node node){
        if (isEmpty()){
            root = node;
            return;
        }
        Node insertIndex = root;
        Node parent = null;
        boolean isLeft = true;
        while (insertIndex !=null ){
            parent = insertIndex;
            if (insertIndex.iData <= node.iData){
                insertIndex = insertIndex.rightChild;
                isLeft = false;
            }else {
                insertIndex = insertIndex.leftChild;
                isLeft = true;
            }
        }
        if (isLeft){
            parent.leftChild = node;
        }else {
            parent.rightChild = node;
        }
    }

    public void delete(int key){
        /**
         * 思路
         *1.找到删除的节点
         *    2.找到后  有三种情况 去找后继节点 （后继节点一定没有左子节点）
         *  2-a.删除节点无子节点  无需后继节点
         *  2-b.删除节点有左子节点  左子节点就是后继节点
         *  2-c.删除节点有右子节点
         *      2-c-a:右子节点没有左子节点，右子节点就是后继节点
         *      2-c-b:右子节点有最底层左子节点（后继节点）：
         *          2-c-b-a:后继节点有右子节点
         *          2-c-b-b:后继节点没有右子节点
         */
    }

    public Node findMax(){
        if (isEmpty()){
            return null;
        }
        Node current = root;
        while (root.rightChild == null){
            current = current.rightChild;
        }
        return current;
    }

    public Node findMin(){
        if (isEmpty()){
            return null;
        }
        Node current = root;
        while (root.leftChild == null){
            current = current.leftChild;
        }
        return current;
    }

    public void foreach(){
        inOrder(root);
    }

    public boolean isEmpty(){
        return root==null;
    }

    public void inOrder(Node root){
        if (root != null ){
            inOrder(root.leftChild);
            System.out.println("key:" + root.iData);
            inOrder(root.rightChild);
        }
    }
}
