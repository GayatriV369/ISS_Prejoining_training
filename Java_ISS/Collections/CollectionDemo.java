package Collections;

import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {
        // List of primitives
        List<Integer> intList = new ArrayList<>(Arrays.asList(5, 2, 9, 1));
        Collections.sort(intList); // Sort primitives
        System.out.println("Sorted intList: " + intList);

        // List of custom objects
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(2, "Alice"));
        studentList.add(new Student(1, "Bob"));
        studentList.add(new Student(3, "Charlie"));

        // Sort using Comparable (by id)
        Collections.sort(studentList);
        System.out.println("Sorted studentList by id: " + studentList);

        // Sort using Comparator (by name)
        studentList.sort(Comparator.comparing(Student::getName));
        System.out.println("Sorted studentList by name: " + studentList);

        // Set of custom objects (no duplicates)
        Set<Student> studentSet = new HashSet<>(studentList);
        System.out.println("studentSet: " + studentSet);

        // Map of custom objects
        Map<Integer, Student> studentMap = new HashMap<>();
        for (Student s : studentList) {
            studentMap.put(s.getId(), s);
        }
        System.out.println("studentMap: " + studentMap);

        // Accessing from Map
        System.out.println("Student with id=2: " + studentMap.get(2));
    }
}