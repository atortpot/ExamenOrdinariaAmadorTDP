package Ejercicio2;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public class AcademicRecord {
    private Map<Subject, Double> grades;
    private List<String> certificates;

    public AcademicRecord() {
        this.grades = new HashMap<>();
        this.certificates = new ArrayList<>();
    }

    public void addGrade(Subject subject, double grade) {
        grades.put(subject, grade);
    }

    public double calculateAverage() {
        return grades.values().stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
    }

    public void addCertificate(String certificate) {
        certificates.add(certificate);
    }

    public Map<Subject, Double> getGrades() {
        return new HashMap<>(grades);
    }

    public List<String> getCertificates() {
        return new ArrayList<>(certificates);
    }
}
