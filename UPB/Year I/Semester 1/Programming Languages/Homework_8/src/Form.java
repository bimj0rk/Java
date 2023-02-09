abstract class Form{
    abstract double computeArea();

    abstract double computeVolume();
}

class Point extends Form{
    protected int x;
    protected int y;

    public Point(){
        this.x = 0;
        this.y = 0;
    }

    public Point(int a, int b){
        this.x = a;
        this.y = b;
    }

    public void setPoint(int a, int b){
        this.x = a;
        this.y = b;
    }

    public String toString() {
        return "X:" + x + ", Y:" + y;
    }

    @Override
    public double computeArea() {
        return 0;
    }

    @Override
    public double computeVolume() {
        return 0;
    }

    public void setXY(int i, int j) {
    }
}

class Circle extends Form{

    protected int radius;
    protected Point point;

    public Circle(){
        this.radius = 0;
    }

    public Circle(int r, int a, int b){
        this.radius = r;
        this.point = new Point(a, b);
    }

    public void setRadius(int r){
        this.radius = r;
    }

    public String toString() {
        return "Circle of origin X:" + point.x + " ,Y:" + point.y + " and radius " + radius;
    }

    @Override
    public double computeArea() {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    @Override
    public double computeVolume() {
        return 0;
    }
}

class Cylinder extends Form{

    private int height;
    protected Circle circle;

    public Cylinder(){
        this.height = 0;
    }

    public Cylinder(int h, int r, int a, int b){
        this.height = h;
        this.circle = new Circle(r, a ,b);
    }

    public void setHeight(int h){
        this.height = h;
    }

    public String toString() {
        return "Cylinder of height " + this.height + " with circle of radius " + circle.radius +
                " of origin X:" + circle.point.x + ", Y:" + circle.point.y;

    }

    @Override
    public double computeArea() {
        double area = 2 * Math.PI * circle.radius * (circle.radius + height);
        return area;
    }

    @Override
    public double computeVolume() {
        double volume = Math.PI * Math.pow(circle.radius, 2) * this.height;
        return volume;
    }
}