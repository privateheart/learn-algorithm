package cha6_recursion;

/**
 * 递归的特征：
 * 1.调用自身
 * 2.当它调用自身的时候，他这样做是为了解决更小的问题。
 * 3.存在某个足够简单的问题的层次，在这一层算法不需要调用自己就可以直接解答，且返回结果
 */
public class DArray {
    private long[] theArray;
    private  int nElems;

    public DArray(int max){
        theArray = new long[max];
        nElems = 0;
    }

    public void insert(long value){
        theArray[nElems] = value;
        nElems++;
    }

    public void display(){
        for (int j=0; j<nElems; j++){
            System.out.print(theArray[j] + ",");
        }
        System.out.println("");
    }

    public void mergeSort(){
        long[] workSpace = new long[nElems];
        recMergeSort(workSpace, 0, nElems-1);
    }

    private void recMergeSort(long[] workSpace, int lowerBound, int upperBound) {
        if (lowerBound == upperBound) {//数组只有一个元素
            return;
        } else {
            //find midpoint
            int mid = (lowerBound + upperBound) /2;
            // sort low half
            recMergeSort(workSpace, lowerBound, mid);
            //sort low half
            recMergeSort(workSpace,mid +1, upperBound);
            //sort high half
            merge(workSpace, lowerBound, mid+1, upperBound);
        }

    }

    private void merge(long[] workSpace, int lowPtr, int highPtr, int upperBound) {
        int j = 0;
        int lowerBound = lowPtr;//第一个位置
        int mid = highPtr -1;//中间值
        int n = upperBound-lowerBound+1;//总的元素个数
        while ( lowPtr <=mid && highPtr <= upperBound){
            if (theArray[lowPtr] < theArray[highPtr]){
                workSpace[j++] = theArray[lowPtr++];
            }else {
                workSpace[j++] = theArray[highPtr++];
            }
        }
        while (lowPtr <= mid){
            workSpace[j++] = theArray[lowPtr++];
        }
        while (highPtr <= upperBound){
            workSpace[j++] = theArray[highPtr++];
        }
        for (j=0; j<n; j++){
            theArray[lowerBound+j]=workSpace[j];
        }
    }
}
