
public class ClassConstuctor {
    public static void main(String[] args) {
        Student s1=new Student("Ritam maty", 60, 90.2f);
        s1.showDetails();
    }
    static class Student{
        int roll;
        float marks=22.0f;
        String name="Student name";
        Student(String name,int roll, float marks){
            this.name=name;
            this.roll=roll;
            this.marks=marks;
        }
        public void showDetails(){
            System.out.println(this.name);
            System.out.println(this.roll);
            System.out.println(this.marks);
        }
    }
}
