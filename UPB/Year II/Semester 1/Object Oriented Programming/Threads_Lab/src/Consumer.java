import java.io.*;

public class Consumer extends Thread{
    private SharedRes sharedRes;

    public Consumer(String n, SharedRes sR){
        super(n);
        this.sharedRes = sR;
    }
    
    @Override
    public void run() {
        while(true){
            Candidate c = sharedRes.remove();
            System.out.println(getName() + " removed " + c.getName() + " from queue.");
            if(c.getEducationLevel() > 3)
                try{
                    System.out.println("Candidate " + c.getName() + " passed");
                    FileWriter fw = new FileWriter(c.getName() + ".txt");
                    fw.write(c.toString());
                    fw.close();
                }catch(IOException e){
                    System.out.println("Error");
                    e.printStackTrace();
                }
            else
                try{
                    System.out.println("Candidate " + c.getName() + " failed.");
                    FileWriter fw = new FileWriter("rejected.txt", true);
                    fw.write(c.toString());
                    fw.close();
                }catch(IOException e){
                    System.out.println("Error");
                }    
        }
    }
}
