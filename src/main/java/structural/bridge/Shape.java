package structural.bridge;

public abstract class Shape {

    protected Color color;

    void fillShape(){
        color.fill();
    }

    abstract void drawShape();
    abstract double getArea();

    public void setColor(Color color) {
        this.color = color;
    }
}
