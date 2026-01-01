interface parent {
    void call();
    
}
interface chile {

    void display();
}
public class Interface implements parent,chile{
    public static void main(String[] args) {
        Interface i=new Interface();
        i.call();
        i.display();
    }
    public void call(){
        System.out.println("hellow");
    }
    public void display(){
        System.out.println("welcome bro ");
    }
}
