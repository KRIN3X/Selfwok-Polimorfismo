package Es1;

public class Employee extends Person {
    public int salary;

    public Employee(String name, String surname, int age, int salary) {
        super(name, surname, age);
        this.salary = salary;
    }

    @Override
    public void displayInfo() {
        System.out.println("Employee: " + name + " " + surname + ", Age: " + age + ", Salary: " + salary);
    }

}
