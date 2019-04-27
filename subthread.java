package Lab2;

public class subthread extends Thread {
    public void run() {
        for(int i = 10 ; i > 0; i-=1){
            try {
                System.out.println(" \n" + i);
                Thread.sleep(1000);
            }catch (Exception e){

            }
        }

        System.out.println("You have nothing");
    }
}
