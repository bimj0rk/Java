package main.java.Ex1;

public class GameProduct extends SoftwareProduct{
    
    public GameProduct(String n, String p){
        super(n, p);
    }

    public boolean checkCompatibility(){
        if(this.getPlatform().equalsIgnoreCase("Bimbows")){
            System.out.println("Compatible");
            return true;
        } else {
            System.out.println("Not compatible");
            return false;
        }
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return super.getName();
    }

    @Override
    public String getPlatform() {
        // TODO Auto-generated method stub
        return super.getPlatform();
    }

    @Override
    public void setName(String name) {
        // TODO Auto-generated method stub
        super.setName(name);
    }

    @Override
    public void setPlatform(String platform) {
        // TODO Auto-generated method stub
        super.setPlatform(platform);
    }
}
