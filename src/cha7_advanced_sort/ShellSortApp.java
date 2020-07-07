package cha7_advanced_sort;

public class ShellSortApp {
    public static void main(String[] args){
        int maxSize = 20;
        ArraySh arr;
        arr = new ArraySh(maxSize);

        for (int j=0; j<maxSize; j++){
            long n = (int) (Math.random()*99);
            arr.insert(n);
        }

        arr.display();
        System.out.println("开始执行希尔排序：" + System.currentTimeMillis());
        arr.shellSort();
        System.out.println("希尔排序结束：" + System.currentTimeMillis());
        arr.display();
    }
}
