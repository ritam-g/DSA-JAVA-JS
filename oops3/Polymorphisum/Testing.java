
class parent {
    public void display(){
        System.out.println("i am parent");
    }
}
class child extends parent{
    public void display(){
        System.out.println("i am child");
    }
}
public class Testing {
    public static void main(String[] args) {
        parent obj=new child();
        obj.display();

    }
}
