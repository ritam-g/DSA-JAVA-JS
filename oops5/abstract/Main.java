abstract class Parent{
     abstract  void call();
}
public class Main extends  Parent {
    
    public static void main(String[] args) {
        Main m=new Main();
        m.call();
    }
    @Override
    void call(){
        System.out.println("hello wrold");
    }

}
