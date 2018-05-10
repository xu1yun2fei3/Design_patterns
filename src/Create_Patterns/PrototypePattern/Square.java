package Create_Patterns.PrototypePattern;

public class Square extends Shape {
    Square(){
        type="Square";
    }

    @Override
    void draw() {
        System.out.println("画出一个正方形");
    }
}
