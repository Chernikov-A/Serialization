public class Student {
    private String id;
    private String name;
    private double gpa;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGPA() {
        return gpa;
    }

    public void setGPA(double gpa) {
        if (gpa >= 0 && gpa <= 4.0) {
            this.gpa = gpa;
        } else {
            this.gpa = 0;
        }
    }
    public Student(String id, String name, double gpa) {
        setId(id);
        setName(name);
        setGPA(gpa);
    }
}
