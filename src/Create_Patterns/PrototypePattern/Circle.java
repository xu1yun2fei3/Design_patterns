package Create_Patterns.PrototypePattern;

public class Circle extends Shape {
    Circle(){
        type="circle";
    }

    @Override
    void draw() {
        System.out.println("画了一个圆形");
    }
}
