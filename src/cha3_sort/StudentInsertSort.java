package cha3_sort;

/**
 * Created by chenchunli on 2017/7/13.
 */
public class StudentInsertSort {

    private Student[] students;
    private int nElems;

    public StudentInsertSort(int max){
       students = new Student[max];
        nElems = 0;
    }

    public void insert(Student student){
        students[nElems] = student;
        nElems++;
    }

    public void insertSort(){
        Student temp;
        int in;
        for (int i = 0; i < nElems; i++) {
            temp = students[i];
            in = i;
            while (in >0 && students[in-1].getLastName().compareTo(temp.getLastName()) >0){
                students[in] = students[in-1];
                in--;
            }
            students[in] = temp;
        }
    }

    public void displayStudents(){
        for (int i = 0; i < nElems; i++) {
            System.out.println(students[i].toString());
        }
    }

    public static void main(String[] args) {
        StudentInsertSort sort = new StudentInsertSort(10);

        sort.insert(new Student("Evans","Patty",24));
        sort.insert(new Student("Smith","Doc",59));
        sort.insert(new Student("Smith","Lorraine",37));
        sort.insert(new Student("Smith","Paul",37));
        sort.insert(new Student("Yee","Tom",43));
        sort.insert(new Student("Hashmoto","Sato",21));
        sort.insert(new Student("Stimson","Henry",29));
        sort.insert(new Student("Valasquez","jose",72));
        sort.insert(new Student("Vang","Minh",22));
        sort.insert(new Student("Creswell","lucinds",18));
        System.out.println("排序前:");
        sort.displayStudents();

        System.out.println("排序后:");
        sort.insertSort();
        sort.displayStudents();
    }

    static class Student {
        private String lastName;
        private String firstName;

        private int age;

        public Student(String lastName, String firstName, int age) {
            this.lastName = lastName;
            this.firstName = firstName;
            this.age = age;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "student[lastName='"+lastName+"',firstName='"+firstName+",age="+age+"']";
        }
    }
}
