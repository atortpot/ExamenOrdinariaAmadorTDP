package Ejercicio2;
import java.util.ArrayList;
import java.util.List;

public class Course {
    private String title;
    private List<Subject> subjects;

    public Course(String title) {
        this.title = title;
        this.subjects = new ArrayList<>();
    }

    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    public String getTitle() {
        return title;
    }

    public List<Subject> getSubjects() {
        return new ArrayList<>(subjects);
    }
}

