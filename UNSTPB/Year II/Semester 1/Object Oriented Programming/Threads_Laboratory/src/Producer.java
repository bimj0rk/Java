public class Producer extends Thread{
    public Candidate candidate;
    private SharedRes sharedRes;

    public Producer(String n, SharedRes sR, Candidate c){
        super(n);
        this.sharedRes = sR;
        this.candidate = c;
    }

    @Override
    public void run() {
        sharedRes.produce(this.candidate);
        System.out.println(this.getName() + " added candidate " + candidate.getName());
    }
}
