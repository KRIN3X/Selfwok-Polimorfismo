package Es1;
public class App {
    public static void main(String[] args) throws Exception {
        Student student = new Student("John", "Doe", 20, 85);
        Teacher teacher = new Teacher("Jane", "Smith", 35, 50000, "Mathematics");

        student.displayInfo();
        teacher.displayInfo();

        Teacher mario = new Teacher("Mario", "Rossi", 40, 60000, "Java");
        mario.getSalary();
        mario.displayInfo();

        Freelancer luigi = new Freelancer("Luigi", "Verdi", 30, 40000, "React");
        luigi.getSalaryCommission();
        luigi.displayInfo();
    }
}
