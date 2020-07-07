package cha7_advanced_sort;

/**
 * 快速排序
 */
public class ArrayIns {
    private long[] theArray;
    private int nElems;

    public ArrayIns(int max){
        theArray = new long[max];
        nElems = 0;
    }

    public void insert(long value){
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

    public void quickSort(){
        recQuickSort(0,nElems-1);
    }

    public void recQuickSort(int left, int right){
        if (right-left <=0){
            return;
        }else {
            //选出枢纽
            long pivot = theArray[right];
            //开始划分
            int partition = partitionIt(left, right, pivot);
            //递归操作 两个划分出来的小数组
            recQuickSort(left, partition-1);
            recQuickSort(partition+1,right);
        }
    }

    private int partitionIt(int left, int right, long pivot) {
        int leftPtr = left-1;
        int rightPtr = right;
        while (true){
            //find bigger item
            while (theArray[++leftPtr] < pivot);
            // find smaller item
            while (rightPtr >0 && theArray[--rightPtr] > pivot);
            if (leftPtr >= rightPtr){
                break;
            }else {
                swap(leftPtr,rightPtr);
            }
        }
        swap(leftPtr,right);
        return leftPtr;
    }

    private void swap(int dex1, int dex2) {
        long temp = theArray[dex1];
        theArray[dex1] = theArray[dex2];
        theArray[dex2] = temp;
    }
}
