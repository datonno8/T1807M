package ASM2;

public class Student {
    int id;
    int age;
     String name;

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Student(int id, int age, String name){
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public String toString(){
        return id+" "+age+" "+name;
    }

    public static void main(String args []){
        Student s1 = new Student(101,20,"hao");

        System.out.println(s1);
    }
}
