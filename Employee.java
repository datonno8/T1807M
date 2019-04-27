package ASM2;

public class Employee {
    double salary;
    int id;
    String name;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee(double salary, int id, String name) {
        this.salary = salary;
        this.id = id;
        this.name = name;
    }

    public String toString(){
        return id+" "+ name + " " + salary;
    }

    public static void main (String args []){
        Employee e = new Employee(15000000, 101, "Chi Hao");
        System.out.println(e);
    }
}
