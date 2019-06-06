using System;
using System.Threading;
namespace lab7
{
    public class lap777
    {
        public static void Main(string[] aros)
        {
           // Thread t1 = new Thread(Omedeto);
           // t1.Start();
           
           Thread t2 = new Thread(HaflLife);
           t2.Start(3);
        }

        public static void Omedeto()
        {
            while (true)
            {
                for (int i = 10; i >0; i--)
            {
                Console.WriteLine(+i);
                if (i<=1)
                {
                    Console.WriteLine("chuc muong ban da danh giai nhat");
                }
                Thread.Sleep(millisecondsTimeout:1000);

            }
            }
        }

        public static void HaflLife(object phut)
        {
            int p = (int) phut;
            int g = 23;
            int i;
            int j;
            for (i = p; i >=0; i--)
            {
                for (j = g; j >=0; j--)
                {
                    if (j==0)
                    {
                        if (i==0)
                        {
                            Console.WriteLine(i+": bum");
                            break;
                        }
                    }
                    Console.WriteLine(i+":"+j);
                    Thread.Sleep(millisecondsTimeout:100);
                }
                g = 60;

            }
        }
    }
}