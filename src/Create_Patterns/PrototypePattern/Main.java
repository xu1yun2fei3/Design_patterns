package Create_Patterns.PrototypePattern;

public class Main {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape cloneshape=(Shape) ShapeCache.getShape("1");
        cloneshape.draw();
        System.out.println("类型是："+cloneshape.getType());


        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("类型是 : " + clonedShape2.getType());

        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("类型是 : " + clonedShape3.getType());
    }
}
