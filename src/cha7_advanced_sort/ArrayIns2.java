package cha7_advanced_sort;

/**
 * 快速排序的优化
 *  1.小于3的数组 手动排序，减少递归层数。
 *  2.不再以最右边为一个枢纽，而是在3个元素中找 中间大小的那个，避免快速排序最差的情况发生。
 *  选中一个中间值，有利于划分两个大小差不多的子数组。
 */
public class ArrayIns2 {

    private long[] theArray;
    private int nElems;

    public ArrayIns2(int max){
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
        int size = right-left+1;
        if (size <=3){
            manualSort(left,right);
        }else {
            long median = medianOf3(left, right);
            int partition = partitionIt(left, right, median);
            recQuickSort(left,partition-1);
            recQuickSort(partition+1, right);
        }
    }

    private int partitionIt(int left, int right, long pivot) {
        int leftPtr = left;
        int rightPtr = right -1;
        while (true) {
            while (theArray[++leftPtr] < pivot);
            while (theArray[--rightPtr] > pivot);
            if (leftPtr >= rightPtr){
                break;
            }else {
                swap(leftPtr,rightPtr);
            }
        }
        swap(leftPtr, right-1);
        return leftPtr;
    }

    public void manualSort(int left, int right){
        int size = right-left +1;
        if (size<=1){
            return;
        }else if (size ==2){
            if (theArray[left] > theArray[right]){
                swap(left,right);
            }
        }else { // size 为3
            if (theArray[left] > theArray[right-1]){
                swap(left,right-1);
            }
            if (theArray[left] > theArray[right]){
                swap(left,right);
            }
            if (theArray[right-1] > theArray[right]){
                swap(right-1, right);
            }
        }
    }
    private long medianOf3(int left, int right) {
        int center = (left+right)/2;

        if (theArray[left] >theArray[center]){
            swap(left,center);
        }
        if (theArray[left] > theArray[right]){
            swap(left,right);
        }
        if (theArray[center] > theArray[right]){
            swap(center,right);
        }
        swap(center,right-1); //put pivot on right
        return theArray[right-1];// return median value
    }

    private void swap(int dex1, int dex2) {
        long temp = theArray[dex1];
        theArray[dex1] = theArray[dex2];
        theArray[dex2] = temp;
    }
}
