package test;

public class BreakTest {
    public static void main(String[] args) {
        int i =0;
        for (;i<10;i++){
            if (i>3){
                break;
            }
            System.out.println("i=" + i);
        }
        System.out.println("跳出循环 i=" + i);
    }
}
