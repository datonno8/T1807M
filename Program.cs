using System;

namespace C_Session2
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            Student st = new Student();
            st.inputInfo();
            st.showInfo();
            st.scholarship();
        }
    }

    class Student
    {
        private String ID;
        private int avange;
        private int age;
        private string classId;

        public Student(string id, int avange, int age, string classId)
        {
            ID = id;
            this.avange = avange;
            this.age = age;
            this.classId = classId;
        }

        public Student()
        {
        }

        public string Id
        {
            get { return ID; }
            set { ID = value; }
        }

        public int Avange
        {
            get
            {return avange;
            }
            set  {
            avange = value;
        }
        }

        public int Age
        {
            get
            {
               return age;
            }
            set { age = value; }
        }

        public string ClassId
        {
            get { return classId; }
            set { classId = value; }
        }

        public void inputInfo()
        {
            Console.WriteLine("nhap vao ID:"+ID);
            ID = Convert.ToString(Console.ReadLine());
            
            Console.WriteLine("nhap vao diem trung binh:"+avange);
            avange = Convert.ToInt32(Console.ReadLine());
            
            Console.WriteLine("nhap vao tuoi:"+age);
            age = Convert.ToInt32(Console.ReadLine());
            
            Console.WriteLine("nhap vao lop:"+classId);
            classId = Convert.ToString(Console.ReadLine());

        }

        public void showInfo()
        {
            Console.WriteLine("Thong tin hoc sinh:");
            Console.WriteLine("ID:"+ID);
            Console.WriteLine("avange:"+avange);
            Console.WriteLine("age:"+age);
            Console.WriteLine("classID:"+classId);
        }

        public void scholarship()
        {
            if (avange>=8.0)
            {
                Console.WriteLine("hoc sinh ID:"+ID+" dat hoc bong");

            }
            else
            {
                Console.WriteLine("hoc sinh khong dat hoc bong");
            }
        }
    }
}