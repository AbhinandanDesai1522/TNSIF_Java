package abstraction;

public class Square extends AbstractDemo {
    protected float s;

    public Square(float s) {
        super();
        this.s = s;
    }

    @Override
    void calculate() {
        super.area = s * s;
    }

    @Override
    public String toString() {
        return "Square [s=" + s + "]";
    }

    @Override
    void display() {
        System.out.println("Area of the given polynomial: " + area);
    }
}