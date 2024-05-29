package Ejercicio2;
import java.util.List;
import java.util.ArrayList;

public class TrainingSystem {
    private List<Employee> employees;
    private List<Course> courses;

    public TrainingSystem() {
        this.employees = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public Employee findEmployeeByName(String name) {
        return employees.stream().filter(e -> e.getName().equals(name)).findFirst().orElse(null);
    }

    public Course findCourseByTitle(String title) {
        return courses.stream().filter(c -> c.getTitle().equals(title)).findFirst().orElse(null);
    }

    public void enrollEmployee(Employee employee, Course course) {
        course.getSubjects().forEach(s -> employee.getRecord().addGrade(s, 0.0));  // Inicia todas las materias con calificación inicial
    }

    public void recordGrade(Employee employee, Subject subject, double grade) {
        employee.getRecord().addGrade(subject, grade);
    }

    public void issueCertificate(Employee employee) {
        if (employee.getRecord().calculateAverage() >= 90.0) {
            employee.getRecord().addCertificate("Certified in Course");
        }
    }
}

