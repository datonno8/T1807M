package Lab;

public class MyThread extends Thread {
    public void run(){

        int n = 30;
        System.out.printf("Tat ca cac so nguyen to nho hon %d là: ", n);

        if (n >= 2) {
            System.out.print(2);
        }

        for (int i = 3; i < n; i+=2) {

            if (isPrimeNumber(i)) {
                try {

                    Thread.sleep(1500);
                }catch (Exception e){

                }
                System.out.print(" \n" + i);
            }

        }

    }

    public static boolean isPrimeNumber(int n) {

        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    }
