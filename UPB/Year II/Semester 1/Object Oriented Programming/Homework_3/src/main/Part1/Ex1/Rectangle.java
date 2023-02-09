package main.Part1.Ex1;

public class Rectangle extends GeometricalForm{
    private Integer width;
    private Integer height;

    public Rectangle(Integer x, Integer y, Integer width, Integer height){
        super(x, y);
        this.height = height;
        this.width = width;
    }

    public Integer getWidth() {
        return width;
    }

    public Integer getHeight() {
        return height;
    }

    @Override
    public void shrink() {
        this.width -= 1;
        this.height -= 1;
    }

    @Override
    public void enlarge() {
        this.width += 1;
        this.height += 1;
    }

    @Override
    public String toString() {
        return "Rectangle: " + super.xCoord + ", " + super.yCoord + ", height: " + this.height + ", width: " + this.width + ", inner color: " + super.iColor + ", form color: " + super.fColor;
    }
}
