package main.Part1.Ex1;

public class Elipse extends GeometricalForm{
    private Integer hRadius;
    private Integer vRadius;

    public Elipse(Integer x, Integer y, Integer hr, Integer vr){
        super(x, y);
        this.hRadius = hr;
        this.vRadius = vr;
    }
    
    public Integer getvRadius() {
        return vRadius;
    }

    public Integer gethRadius() {
        return hRadius;
    }

    @Override
    public void shrink() {
       this.hRadius -= 1;
       this.vRadius -= 1;
    }

    @Override
    public void enlarge() {
        this.hRadius += 1;
        this.vRadius += 1;
    }

    @Override
    public String toString() {
        return "Elipse: " + super.xCoord + ", " + super.yCoord + ", horizontal radius: " + this.hRadius + ", vertical radius: " + this.vRadius + ", inner color: " + super.iColor + ", form color: " + super.fColor;
    }
}
