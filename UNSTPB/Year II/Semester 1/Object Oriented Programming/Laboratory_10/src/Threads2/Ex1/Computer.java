package Threads2.Ex1;

public class Computer {
    private String name;
    private String MAC;
    private String IP;

    public Computer(String name, String MAC, String IP) {
        this.name = name;
        this.MAC = MAC;
        this.IP = IP;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMAC() {
        return MAC;
    }

    public void setMAC(String MAC) {
        this.MAC = MAC;
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }
}
