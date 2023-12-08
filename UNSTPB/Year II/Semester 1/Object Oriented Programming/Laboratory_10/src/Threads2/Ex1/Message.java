package Threads2.Ex1;

public class Message{
    private String content;
    private String sourceMAC;
    private String destinationMAC;
    private Computer sourceC;
    private Computer destinationC;

    public Message(String content, Computer sourceC, Computer destinationC) {
        this.content = content;
        this.sourceC = sourceC;
        this.destinationC = destinationC;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSourceMAC() {
        return sourceMAC;
    }

    public void setSourceMAC(String sourceMAC) {
        this.sourceMAC = sourceMAC;
    }

    public String getDestinationMAC() {
        return destinationMAC;
    }

    public void setDestinationMAC(String destinationMAC) {
        this.destinationMAC = destinationMAC;
    }

    public Computer getSourceC() {
        return sourceC;
    }

    public void setSourceC(Computer sourceC) {
        this.sourceC = sourceC;
    }

    public Computer getDestinationC() {
        return destinationC;
    }

    public void setDestinationC(Computer destinationC) {
        this.destinationC = destinationC;
    }
}
