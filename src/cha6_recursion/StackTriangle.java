package cha6_recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 计算三角数字 f(n)= f(n-1) + n;
 *  消除递归，  使用栈的数据结构算法
 */
public class StackTriangle {
    static int theNumber;
    static int theAnswer;
    static StackX theStack;

    public static void main(String[] args) throws IOException {
        System.out.println("Enter a number");
        theNumber = getInt();
        stackTriangle();
        System.out.println("Triangle=" + theAnswer);
    }

    public static void stackTriangle(){
        theStack = new StackX(10000);
        theAnswer = 0;
        while (theNumber >0){
            theStack.push(theNumber);
            --theNumber;
        }
        while (!theStack.isEmpty()){
            int newN = theStack.pop();
            theAnswer += newN;
        }
    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }

    public static int getInt() throws IOException {
        String s = getString();
        return  Integer.valueOf(s);
    }
}
