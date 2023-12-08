package main.hw;
import java.util.*;

public class Portfolio{
    private int noShares; 
    private List<Share> shares = new ArrayList<Share>();

    public Portfolio(){
        this.noShares = 0;
    }

    public void addShare(Share s){
        shares.add(s);
    }

    public double computeSum(){
        double sum = 0;
        for(Share s : shares){
            sum += s.getValue();
        }
        return sum;
    }

    public int getNoShares() {
        return noShares;
    }

    public List<Share> getShares() {
        return shares;
    }

    public void setNoShares(int noShares) {
        this.noShares = noShares;
    }

    public void setShares(List<Share> shares) {
        this.shares = shares;
    }

    public static void main(String[] args){
        Portfolio p = new Portfolio();
        Company c1 = new Company("Ubisoft");
        Company c2 = new Company("Apple");
        Share s1 = new Share(1200,c1);
        Share s2 = new Share(500,c1);
        Share s3 = new Share(700,c1);
        Share s4 = new Share(800,c2);
        Share s5 = new Share(900,c2);
        Share s6 = new Share(100,c2);
        
        p.addShare(s1); 
        p.addShare(s2); 
        p.addShare(s3); 
        p.addShare(s4);
        p.addShare(s5); 
        p.addShare(s6);
        
        System.out.println(p.computeSum());
    }
}
