package Ejercicio2;
public class Employee {
    private String name;
    private AcademicRecord record;

    public Employee(String name) {
        this.name = name;
        this.record = new AcademicRecord();
    }

    public String getName() {
        return name;
    }

    public AcademicRecord getRecord() {
        return record;
    }
}

