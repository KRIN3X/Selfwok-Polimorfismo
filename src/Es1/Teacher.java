package Es1;

public class Teacher extends Employee {
    public String subject;

    public Teacher(String name, String surname, int age, int salary, String subject) {
        super(name, surname, age, salary);
        this.subject = subject;
    }

    @Override
    public void displayInfo() {
        System.out.println("Teacher: " + name + " " + surname + ", Age: " + age + ", Salary: " + salary + ", Subject: " + subject);
    }

    public void getSalary() {
        System.out.println("Teacher's Salary: " + salary);
    }

}
