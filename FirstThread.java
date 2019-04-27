package Runnale;

public class FirstThread implements Runnable{
    public void run(){
        for (int i = 1; i <= 50; i++){
            System.out.println("Message from First Thread: " + i);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){

            }
        }
        System.out.println("=== Done ===");
    }
}
