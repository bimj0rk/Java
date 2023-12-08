package main.Part1.Ex1;

import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        ArrayList<GeometricalForm> forms = new ArrayList<GeometricalForm>();

        forms.add(new Rectangle(3, 5, 7, 10));
        forms.add(new Elipse(1, 7, 13, 12));

        for(GeometricalForm gf : forms) System.out.println(gf);

        for(GeometricalForm gf : forms){
            gf.enlarge();
            System.out.println(gf);
        }
        
        for(GeometricalForm gf : forms){
            gf.shrink();
            gf.shrink();
            System.out.println(gf);
        }

        for(GeometricalForm gf : forms){
            gf.changeFormColor("Red");
            gf.changeInnerColor("Green");
            System.out.println(gf);
        }
    }
}
