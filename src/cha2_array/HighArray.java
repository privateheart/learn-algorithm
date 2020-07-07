package cha2_array;

/**
 * Created by chenchunli on 2017/7/12.
 */
public class HighArray {

    private long[] a;
    private int nElems;

    public HighArray(int max){
        a = new long[max];
        nElems = 0;
    }

    /**
     * 查找元素
     * @param searchKey
     * @return
     */
    public boolean find(long searchKey){
        int j;
        for (j=0; j<nElems; j++){
            if (a[j] == searchKey)
                break;
        }
        if (j == nElems){
            return false;
        }else {
            return true;
        }
    }

    /**
     * 插入元素
     * @param value
     */
    public void insert(long value){
        a[nElems] = value;
        nElems ++;
    }

    /**
     * 删除元素
     * @param value
     * @return
     */
    public boolean delete(long value){

        int j;
        for (j=0; j<nElems; j++){
            if (a[j] == value)
                break;
        }
        if (nElems != j){
            for (int k=j; k<nElems-1; k++){
                a[k] = a[k+1];
            }
            return true;
        }else {
            return false;
        }


    }

    /**
     * 展示数组元素
     */
    public void display(){
        for (int j=0; j<nElems; j++){
            System.out.print(a[j] + " ");
        }
        System.out.println();
    }

    /**
     * 去除重复的元素
     */
    public void noDup(){
        for (int i = 0; i < nElems; i++) {
            for (int j=(i+1); j<nElems;j++){
                if (a[i] == a[j]){
                    a[j] = -1;// - 标识为空
                }
            }
        }
        long[] arr = new long[a.length];
        int index = 0;
        for (int i=0; i<nElems; i++){
            if (-1 != a[i]){
                arr[index] = a[i];
                index++;
            }
        }
        nElems = index;
        a = arr;
    }

    public static void main(String[] args) {
        HighArray highArray = new HighArray(9);
        highArray.insert(1);
        highArray.insert(6);
        highArray.insert(2);
        highArray.insert(5);
        highArray.insert(5);
        highArray.insert(5);
        highArray.insert(4);
        highArray.insert(3);
        highArray.insert(5);

        System.out.println("原始数组元素:");
        highArray.display();

        highArray.noDup();
        System.out.println("去重的后数组元素:");
        highArray.display();
    }
}
