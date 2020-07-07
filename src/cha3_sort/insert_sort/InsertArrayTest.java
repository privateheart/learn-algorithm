package cha3_sort.insert_sort;

/**
 * Created by chenchunli on 2017/7/14.
 */
public class InsertArrayTest {

    public static void main(String[] args) {

        InsertArray array = new InsertArray(14);

        array.insert(1);
        array.insert(1);
        array.insert(6);
        array.insert(6);
        array.insert(6);
        array.insert(8);
        array.insert(2);
        array.insert(4);
        array.insert(7);
        array.insert(7);
        array.insert(2);
        array.insert(3);
        array.insert(3);
        array.insert(5);

        System.out.println("去重插入排序");
        array.noReaptSort();
        array.show();


//        array.insert(14);
//        array.insert(13);
//        array.insert(12);
//        array.insert(11);
//        array.insert(10);
//        array.insert(9);
//        array.insert(8);
//        array.insert(7);
//        array.insert(6);
//        array.insert(5);
//        array.insert(4);
//        array.insert(3);
//        array.insert(2);
//        array.insert(1);


//        array.insert(1);
//        array.insert(2);
//        array.insert(3);
//        array.insert(4);
//        array.insert(5);
//        array.insert(6);
//        array.insert(7);
//        array.insert(8);
//        array.insert(9);
//        array.insert(10);
//        array.insert(11);
//        array.insert(12);
//        array.insert(13);
//        array.insert(14);
//
//        array.sort();
//        array.show();

    }
}
