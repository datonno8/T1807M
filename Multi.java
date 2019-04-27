package Thread;

public class Multi extends Thread {
    public static void main(String args []){
        Multi1 t1 = new Multi1();
        t1.start();
        Multi2 t2 = new Multi2();
        t2.start();
        Multi3 t3 = new Multi3();
        t3.start();

    }
}
