package ASM2;

public class Main {
    public static void main(String[] args) {
        PersonModel<Student> studentPersonModel = new PersonModel<>();
        studentPersonModel.add(new Student(1, 30, "Hao"));
        studentPersonModel.add(new Student(2, 20, "Giang"));
        studentPersonModel.input();
        PersonModel<Employee> employeePersonModel = new PersonModel<>();
        employeePersonModel.add(new Employee(15.000, 4, "Ba"));
        employeePersonModel.add(new Employee(40.000, 5, "Chou"));
        employeePersonModel.input();
    }
}
