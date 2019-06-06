using System;

namespace Assignment6
{
    public class AXY
    {
        public static void Main(string[] args)
        {
            MyGenericList<string, int> m1 = new MyGenericList<string, int>();
            m1.value = 2;
            m1.key = "chia khoa";
            MyGenericList<int,string> m2 = new MyGenericList<int, string>();
            m2.key = 45;
            m2.value = "abcd";
            Console.WriteLine(m1.key+" "+m2.key);
            Console.WriteLine(m1.value+" "+m2.value);
        }
    }
}