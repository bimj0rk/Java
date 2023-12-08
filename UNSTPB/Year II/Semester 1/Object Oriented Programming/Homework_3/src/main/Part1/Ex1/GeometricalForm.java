package main.Part1.Ex1;

public abstract class GeometricalForm implements FormOperations{
    protected Integer xCoord;
    protected Integer yCoord;
    protected String iColor;
    protected String fColor;

    public GeometricalForm(Integer x, Integer y){
        this.xCoord = x;
        this.yCoord = y;
    }

    @Override
    public void move(Integer x, Integer y) {
        this.xCoord = x;
        this.yCoord = y;
    }

    @Override
    abstract public void shrink();

    @Override
    abstract public void enlarge();

    abstract public String toString();

    @Override
    public void changeInnerColor(String color) {
        this.iColor = color;
    }

    @Override
    public void changeFormColor(String color) {
       this.fColor = color;
    }

    public Integer getxCoord() {
        return xCoord;
    }

    public Integer getyCoord() {
        return yCoord;
    }

    public String getiColor() {
        return iColor;
    }

    public String getfColor() {
        return fColor;
    }
}
