
public class Static {
    static class Student {
        static int count=0;
        Student(){
            count++;
        }
    }
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();
        System.out.println("Number of objects created: "+Student.count);
    }
}
