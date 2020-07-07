package cha4_stack_queue;

/**
 * Created by chenchunli on 2017/7/15.
 */
public class XStack {

    private int[] a;
    private int maxSize;
    private int pop;

    public XStack(int maxSize){
        a = new int[maxSize];
        maxSize = maxSize;
        pop = -1;
    }

    public void push(int value){
        a[++pop] = value;
    }

    public int pop(){
        return a[--pop];
    }

    public int peek(){
        return a[pop];
    }

    public boolean isEmpty(){
        return pop == -1;
    }

    public boolean isFull(){
        return pop == (maxSize-1);
    }

}
