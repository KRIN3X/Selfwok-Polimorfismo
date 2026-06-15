package Es1;

public class Freelancer extends Employee {
    public String project;

    public Freelancer(String name, String surname, int age, int salary, String project) {
        super(name, surname, age, salary);
        this.project = project;
    }

    @Override
    public void displayInfo() {
        System.out.println("Freelancer: " + name + " " + surname + ", Age: " + age + ", Salary: " + salary + ", Project: " + project);
    }

    public void getSalaryCommission() {
        System.out.println("Freelancer's Salary with Commission: " + salary + " euro!");
    }

}
