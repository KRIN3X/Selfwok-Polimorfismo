package Es1;

public class Student extends Person {
    public int averageGrade;

    public Student(String name, String surname, int age, int averageGrade) {
        super(name, surname, age);
        this.averageGrade = averageGrade;
    }

    @Override
    public void displayInfo() {
        System.out.println("Student: " + name + " " + surname + ", Age: " + age + ", Average Grade: " + averageGrade);
    }

}
