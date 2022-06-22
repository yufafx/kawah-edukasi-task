package ContohAbstak;

public abstract class Shape {
    String color;

    void setColor(String color){
        this.color = color;
    }

    String getColor(){
        return color;
    }

    abstract float getArea();
}
