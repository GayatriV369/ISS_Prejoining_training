package Collections;

public class Student implements Comparable<Student> {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }

    // toString for easy printing
    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "'}";
    }

    // Comparable: sort by id
    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.id, other.id);
    }
}