package cha7_advanced_sort;

/**
 * 希尔排序
 * 基于插入排序（增量为1） n-增量排序（希尔排序）
 * 增量排序： 将原数组中按一定间隔的数组先排序，让元素离正确的位置近一些。减少后续的没必要的复制。
 * Knuth间隔序列： h = 3*h + 1
 * 思路：
 *      1.一直重复增量排序，直到h=1,进行最后的插入排序。
 */
public class ArraySh {
    private long[] theArray;
    private int nElems;

    public ArraySh(int max) {
        theArray = new long[max];
        nElems = 0;
    }

    public void insert(long value) {
        theArray[nElems] = value;
        nElems++;
    }

    public void display(){
        System.out.print("A=");
        for (int j=0; j<nElems; j++){
            System.out.print(theArray[j] + " ");
        }
        System.out.println("");
    }

    public void shellSort(){
        int inner,outer;
        long temp;

        int h = 1;
        while (h <= nElems/3){
            h = h*3 +1;
        }
        while (h >0){
            for (outer=h; outer < nElems; outer++){
                temp = theArray[outer];
                inner = outer;
                while (inner > h-1 && theArray[inner-h] >= temp){
                    theArray[inner] = theArray[inner-h];
                    inner -= h;
                }
                theArray[inner] = temp;
            }
            h = (h-1)/3;
        }

    }
}
