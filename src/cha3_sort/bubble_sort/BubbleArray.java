package cha3_sort.bubble_sort;

import cha3_sort.Array;
import cha3_sort.SortAble;

/**
 * Created by chenchunli on 2017/7/14.
 */
public class BubbleArray extends Array implements SortAble{

    public BubbleArray(int max) {
        super(max);
    }

    @Override
    public void sort() {
        int temp = 0;
        for (int k= nElems-1; k>0; k--){
            for (int i = 0; i < k; i++) {
                if (a[i] > a[i+1]){
                    temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                }
            }
        }
    }

    public void oddEvenSort(){
        int temp;
        int count = 0;
        for (int i = 0; i < nElems; i++) {
            int movencount = 0;
            for (int j = 0; j < nElems-1; j=j+2) {
                if (a[j]>a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    movencount++;
                }
            }

            for (int k = 1; k < nElems-1; k=k+2) {
                if (a[k]>a[k+1]){
                    temp = a[k];
                    a[k] = a[k+1];
                    a[k+1] = temp;
                    movencount++;
                }
            }
            if (movencount==0){
                break;
            }
            count++;

        }
        System.out.println("两趟扫描的次数:"+count);
    }

}
