package Threads3;
import java.util.*;
import java.util.concurrent.*;

public class OnlineShop{
    private Map<String, Integer> stock = new HashMap<>();
    private BlockingQueue<Request> requests = new ArrayBlockingQueue<>(10);

    class Request{
        private String productName;
        private Integer quantity;
    
        public Request(String aProductName, Integer aQuantity){
            this.productName = aProductName;
            this.quantity = aQuantity;
        }
        
        public String getProductName() {
            return productName;
        }
    
        public Integer getQuantity() {
            return quantity;
        }
    }

    class Client implements Runnable{
        private String productName;
        private Integer quantity;
    
        public Client(String aProductName, Integer aQuantity){
            this.productName = aProductName;
            this.quantity = aQuantity;
        }
    
        @Override
        public void run(){
            Request request = new Request(productName, quantity);
            try{
                requests.put(request);
                System.out.println("Request added.");
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    class Employee implements Runnable{
        @Override
        public void run(){
            while(true){
                try{
                    Request request = requests.take();
                    String productName = request.getProductName();
                    Integer quantity = request.getQuantity();
                    int stockQuantity = stock.getOrDefault(productName, 0);

                    if(stockQuantity >= quantity){
                        stock.put(productName, stockQuantity - quantity);
                        System.out.println("Request handled");
                    } else System.out.println("Request cannot be handled");
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
