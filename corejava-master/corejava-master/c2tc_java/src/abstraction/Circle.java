package abstraction;

public class Circle extends AbstractDemo {
    protected float r;

    public Circle(float r) {
        this.r = r;
    }

    @Override
    void calculate() {
        super.area = 3.14f * r * r;
    }

    @Override
    void display() {
        System.out.println("Area of the given polynomial: " + area);
    }
}