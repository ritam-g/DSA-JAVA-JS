class BoxDimensions {  // Ya Box3D, Dimensions, MyBox – kuch bhi achha naam
    int length;
    int width;
    int height;

    BoxDimensions(int l, int w, int h) {
        this.length = l;
        this.width = w;
        this.height = h;
    }

    public void show() {
        System.out.println("Sum: " + (this.length + this.width + this.height));
    }
}
 class boxDim2 extends BoxDimensions {
    String name;
    boxDim2(int l, int w, int h,String name){
        super(l,w,h);
        this.name=name;
    }
    public void display(){
        System.out.println("Sum: " + (this.length + this.width + this.height)+" "+this.name);
    }
    
}
public class Box {
    public static void main(String[] args) {
        boxDim2 bd=new boxDim2(0, 0, 0, "ritam");
        bd.display();
    }
}