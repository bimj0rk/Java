package main.java.Ex1;

public class Computer{

    private int RAM;
    private String CPU;

    public Computer(int r, String p) throws Exception{
        this.CPU = p;
        this.RAM = r;

        if(r != 2 && r != 4 && r != 8) throw new Exception("RAM NOT VALID");
        if(!p.equalsIgnoreCase("i3") 
            && !p.equalsIgnoreCase("i5") 
            && !p.equalsIgnoreCase("i7")) throw new Exception("CPU NOT VALID");
    }

    public String getCPU() {
        return CPU;
    }

    public int getRAM() {
        return RAM;
    }

    public void setCPU(String cPU) {
        CPU = cPU;
    }

    public void setRAM(int rAM) {
        RAM = rAM;
    }
}
