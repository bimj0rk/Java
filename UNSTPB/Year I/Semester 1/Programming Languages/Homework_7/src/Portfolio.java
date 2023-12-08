class Portfolio {
    private Share[] shares = new Share[100];
    private int noShares;

    public Portfolio(){
        this.noShares = 0;
    }

    public void addShare(Share s){
        this.noShares++;
        this.shares[noShares] = s;
    }

    public double computeSum(){
        double sum = 0;
        for(int i = 1; i <= noShares; i++){
            sum += this.shares[i].value;
        }
        return sum;
    }
}

class Share{
    protected double value;
    private Company company;

   public Share(){
        this.value = 0;
    }

    public Share(double v, Company c){
        this.value = v;
        this.company = c;
    }
}

class Company{
    private String name;

    public Company(String n){
        this.name = n;
    }
}