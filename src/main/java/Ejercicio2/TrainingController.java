package Ejercicio2;
public class TrainingController {
    private TrainingSystem trainingSystem;
    private FinancialVista view;

    public TrainingController(TrainingSystem system, FinancialVista view) {
        this.trainingSystem = system;
        this.view = view;
    }

    public void enrollToCourse(String employeeName, String courseTitle) {
        Employee employee = trainingSystem.findEmployeeByName(employeeName);
        Course course = trainingSystem.findCourseByTitle(courseTitle);
        trainingSystem.enrollEmployee(employee, course);
        view.displayEnrollmentSuccess(employeeName, courseTitle);
    }

    public void assignGrade(String employeeName, String subjectName, double grade) {
        Employee employee = trainingSystem.findEmployeeByName(employeeName);
        Subject subject = trainingSystem.findSubjectByName(subjectName);
        trainingSystem.recordGrade(employee, subject, grade);
        view.displayGradeUpdate(employeeName, subjectName, grade);
    }

    public void issueCertificate(String employeeName) {
        Employee employee = trainingSystem.findEmployeeByName(employeeName);
        trainingSystem.issueCertificate(employee);
        view.displayCertificateIssued(employeeName);
    }
}
