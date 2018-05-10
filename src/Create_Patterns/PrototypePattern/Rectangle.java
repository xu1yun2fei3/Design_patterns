package Create_Patterns.PrototypePattern;

public class Rectangle extends Shape {
    Rectangle(){
        type="Rectangle";
    }

    @Override
    void draw() {
        System.out.println("画出一个矩形");
    }
}
