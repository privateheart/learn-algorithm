package cha6_recursion;

public class StackX {
    private int maxSize;
    private int[] stackArray;
    private int top;
    public StackX(int s){
        maxSize = s;
        stackArray = new int[s];
        top = -1;
    }

    public void push(int p) {
        stackArray[++top] = p;
    }

    public int pop(){
        return stackArray[top--];
    }

    public int peek(){
        return  stackArray[top];
    }

    public boolean isEmpty(){
        return top == -1;
    }
}
