package cha6_recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 递归
 * 输入 一个单词 打印出 所有的 变位字排列情况
 */
public class RecursionApplication {

    static int size;
    static int count;
    static char[] arrChar = new char[100];

    public static void main(String[] args) throws IOException {
        System.out.print("Enter a word");
        String input = getString();
        size = input.length();
        count = 0;
        for (int j=0; j<size; j++){
            arrChar[j] = input.charAt(j);
        }
        doAnagram(size);
    }

    public static void doAnagram(int newSize){
        if (newSize == 1){
            return;
        }
        for (int j=0; j< newSize; j++){// n次 和 之前 （n-1）次全排列 换位置
            doAnagram(newSize -1);
            if (newSize == 2){
                displayWord();
            }
            rotate(newSize);
        }
    }

    public static void rotate(int newSize){
        int j;
        int position = size - newSize;
         char temp = arrChar[position];
        for (j=position+1; j<size; j++){
            arrChar[j-1] = arrChar[j];
        }
        arrChar[j-1] = temp;
    }

    public static void displayWord(){
        if (count < 99){
            System.out.print(" ");
        }
        if (count < 9){
            System.out.print(" ");
        }
        System.out.print(++count + " ");
        for (int j=0; j<size; j++){
            System.out.print(arrChar[j]);
        }
        System.out.print(" ");
        System.out.flush();
        if (count%6 == 0){
            System.out.println(" ");
        }
    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }

}
