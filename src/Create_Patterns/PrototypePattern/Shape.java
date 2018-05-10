package Create_Patterns.PrototypePattern;


public abstract class Shape implements Cloneable {
    private String id;
    protected String type;
    //protected修饰的方法或变量将会被任何位置的子类继承，但是永远只能被最早定义他的父类所在的包的类所见

    abstract void draw();

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    protected Object clone() {
        Object clone=null;
        try {
            clone=super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return clone;
    }
}
