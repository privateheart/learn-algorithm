package cha2_array;

/**
 * Created by chenchunli on 2017/7/12.
 */
public class OrderedArray {
    private static OrderedArray orderedArray;
    private long[] a;
    private int nElems;

    public OrderedArray(int max){
        a = new long[max];
        nElems = 0;
    }

    public long[] getA() {
        return a;
    }

    public int size(){
        return nElems;
    }

    public Long getValueByIndex(int index){
        if (index < nElems){
            return a[index];
        }
        return null;
    }
    public void setElemByIndex(long value,int index){
        if (index < a.length){
            a[index] = value;
            nElems++;
        }
    }
    public int find(long searchKey){
        int lowerBound = 0;
        int upperBound = nElems -1;
        int curIn;

        while(lowerBound<=upperBound && lowerBound<nElems && upperBound < nElems){
            curIn = (lowerBound + upperBound)/2;
            if (a[curIn] == searchKey){
                return curIn;
            }else if (a[curIn] > searchKey){
                upperBound = curIn-1;
            }else {
                lowerBound = curIn+1;
            }
        }
        return nElems;
    }

    public int insert(long value){
        int j;

        for (j=0; j<nElems;j++){//线性查找
            if (a[j]>value)
                break;
        }

        for (int k=nElems; k>j;k--)
            a[k] = a[k-1];
        a[j] = value;
        nElems++;
        return j;
    }

    public boolean delete(long value){
        int i = find(value);
        if (i != nElems){//have found value
            for(int j=i;j<nElems-1; j++)
                a[j] = a[j+1];
            nElems--;
            return true;
        }
        return false;
    }

    public void display(){
        for (int i=0; i<nElems;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    public OrderedArray merge(OrderedArray arr){
        OrderedArray target = new OrderedArray(arr.size() + size());
        OrderedArray copy = arr;
        OrderedArray copy2 = this;
        if(arr.size() > size()){
            copy = this;
            copy2 = arr;
        }
        for (int i=0; i < copy.size(); i++){
           target.setElemByIndex(copy.getValueByIndex(i),i);
        }
        for (int j=0; j < copy2.size(); j++){
            target.insert(copy2.getValueByIndex(j));
        }
        return target;
    }

    public static void main(String[] args) {
        OrderedArray orderedArray = new OrderedArray(6);

        orderedArray.insert(1);
        orderedArray.insert(7);
        orderedArray.insert(9);
        orderedArray.insert(11);
        orderedArray.insert(5);
        orderedArray.insert(3);
        System.out.println("源数组一:");
        orderedArray.display();

        OrderedArray orderedArray2 = new OrderedArray(7);

        orderedArray2.insert(2);
        orderedArray2.insert(14);
        orderedArray2.insert(4);
        orderedArray2.insert(6);
        orderedArray2.insert(8);
        orderedArray2.insert(10);
        orderedArray2.insert(12);
        System.out.println("源数组二：");
        orderedArray2.display();

        OrderedArray merge = orderedArray2.merge(orderedArray);
        System.out.println("合并后的数组:");
        merge.display();

    }
}
