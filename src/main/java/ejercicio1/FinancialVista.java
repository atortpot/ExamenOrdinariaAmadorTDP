package ejercicio1;

public class FinancialVista {
    public void displayEnrollmentSuccess(String employeeName, String courseTitle) {
        System.out.println(employeeName + " has been successfully enrolled in " + courseTitle + ".");
    }

    public void displayGradeUpdate(String employeeName, String subjectName, double grade) {
        System.out.println("Grade updated for " + employeeName + " in " + subjectName + " to " + grade + ".");
    }

    public void displayCertificateIssued(String employeeName) {
        System.out.println("Certificate issued to " + employeeName + ".");
    }
}

