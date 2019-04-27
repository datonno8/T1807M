package Thread;

public class Multi2 extends Thread {
    public void run(){
        for (int i = 1; i <= 50; i++){
            System.out.println("Message from Thread 2: "+i);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){

            }
        }
        System.out.println("=== Done ===");
    }
}
