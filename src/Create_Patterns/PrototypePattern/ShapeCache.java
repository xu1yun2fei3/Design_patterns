package Create_Patterns.PrototypePattern;

import java.util.Hashtable;

public class ShapeCache {
    private static Hashtable<String,Shape> shapMap=new Hashtable<String, Shape>();

    public static Shape getShape(String shapeId){
        Shape cacheShape=shapMap.get(shapeId);
        return (Shape) cacheShape.clone();
    }

    public static void loadCache(){
        Circle circle=new Circle();
        circle.setId("1");
        shapMap.put(circle.getId(),circle);

        Rectangle rectangle=new Rectangle();
        rectangle.setId("2");
        shapMap.put(rectangle.getId(),rectangle);

        Square square=new Square();
        square.setId("3");
        shapMap.put(square.getId(),square);
    }
}
