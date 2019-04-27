package Runnale;

public class ASM3Thread {
    public static void main(String args []){
        FirstThread firstThread = new FirstThread();
        SecondThread secondThread = new SecondThread();
        ThirdThread thirdThread = new ThirdThread();

        Thread thread1 = new Thread(firstThread);
        thread1.start();
        Thread thread2 = new Thread(secondThread);
        thread2.start();
        Thread thread3 = new Thread(thirdThread);
        thread3.start();
    }
}
