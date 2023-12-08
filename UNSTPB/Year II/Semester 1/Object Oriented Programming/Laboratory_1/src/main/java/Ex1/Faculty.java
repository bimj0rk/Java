package Ex1;

import java.util.*;

public class Faculty {
    private int id;
    private String name;

    public Faculty(int id, String n){
        this.id = id;
        this.name = n;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
