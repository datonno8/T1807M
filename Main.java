package Lab;

public class Main {
    public static void main(String [] args){
        MyThread t = new MyThread();
        System.out.println("Ten Thread hien tai la: " +t);
        t.setName("myJavaThread");
        System.out.println("Ten Thread sau khi doi la: "+t);
        t.start();
    }
}
