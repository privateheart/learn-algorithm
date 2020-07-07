package cha3_sort;

/**
 * Created by chenchunli on 2017/7/14.
 * 数组基类
 */
public class Array {

    public int[] a;
    public int nElems;

    public Array(int max){
        a = new int[max];
        nElems = 0;
    }

    public void insert(int value){
        a[nElems] = value;
        nElems++;
    }

    public void show(){
        for (int i = 0; i < nElems; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
