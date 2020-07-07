package cha7_advanced_sort;

public class QuickSort2App {
    public static void main(String[] args) {
        int maxSize = 16;
        ArrayIns2 arr;
        arr = new ArrayIns2(maxSize);

        for (int j=0; j<maxSize; j++){
            long n = (int) (Math.random()*99);
            arr.insert(n);
        }
        arr.display();
        arr.quickSort();
        arr.display();
    }
}
