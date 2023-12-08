package Threads2.Ex1;

public class SwitchService{
    public static void main(String arg[]) {
        try {
            Message event = null;
            for (int i= 0; i < 10; i++) {
                event = new Message("Content " + i, new Computer("John's PC", "00:F1:B2:C2:D8:1A", "192.168.0.20"),
                        new Computer("Lilly's PC", "10:F1:B2:C2:D8:1A", "192.168.0.21"));
                event.setContent("Content2");
                QueueService.getInstance().putEventInQueue(event);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}