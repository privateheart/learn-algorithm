package cha3_sort.insert_sort;

import cha3_sort.Array;
import cha3_sort.SortAble;

/**
 * Created by chenchunli on 2017/7/14.
 */
public class InsertArray extends Array implements SortAble {

    public InsertArray(int max){
       super(max);
    }

    /**
     * 去重复的 插入排序
     * 1.依次从左到右取元素，存入temp, 此位置(out)左边都是有序的
     * 2.将temp和之前局部有序的元素比较，放入合适的位置 (第一次小于(或等于)temp)
     * 3.如果temp和插入位置之前元素不等，则将temp插入, 如果temp和 插入位置之前一位的元素相同，则从插入位置之后的元素都往前移动一位，nElems-1，并且继续从 out位置重新走 1-2-3部;
     */
    public void insertSortNodups(){
        int[] arr = a;
        int in;
        int i;
        int temp;

        for (i = 0; i < nElems; i++) {
            in = i;
            temp = a[i];

            while (in>0 && a[in-1] > temp){
                a[in] = a[in-1];
                in--;
            }

            if (in >0 && a[in-1] == temp){//数据重复 将数据in的位置向前移一个位置
                while (in <= i){
                    a[in] = a[in+1];
                    in++;
                }
                int k =i;
                while (k<a.length-1){
                    a[k] = a[k+1];
                    k++;
                }
                nElems--;//少了一个元素
                i--;//继续从 i 开始
                continue;
            }
            a[in] = temp;

        }

    }
    public void noReaptSort(){
        int in;
        int i;
        int temp;
        int repeatCount = 0;
        for (i = 0; i < nElems; i++) {
            in = i;
            temp = a[i];
            //将重复的数标记为 -1
            if (temp != -1){ // 判断未标记的数是否重复
                for (int j = i+1; j < nElems; j++) {
                    if (temp == a[j]){
                        a[j] = -1;
                        repeatCount++;
                    }
                }
            }

            for (; in >0 ; in--) {
                if (a[in-1] >= temp){
                    a[in] = a[in-1];
                }else {
                    break;
                }
            }
            a[in] = temp;
        }
        //清除-1

        for (int j = 0,k = repeatCount; k <nElems; j++) {
            a[j] = a[k];
            k++;
        }
        nElems = nElems-repeatCount;
    }

    @Override
    public void sort() {
        int in;
        int i;
        int temp;
        int compareCount = 0;
        int copyCount = 0;
        for (i = 0; i < nElems; i++) {
            in = i;
            temp = a[i];
            for (; in >0 ; in--) {
                if (a[in-1] >= temp){
                    a[in] = a[in-1];
                    copyCount++;
                    compareCount++;
                }else {
                    break;
                }
                compareCount++;
            }
            a[in] = temp;
        }

        System.out.println("比较次数:"+compareCount);
        System.out.println("复制次数:"+copyCount);
    }

}
