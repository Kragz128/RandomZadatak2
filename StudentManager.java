package miniStudentManagementSystem;

import java.util.ArrayList;

public class StudentManager {

    private ArrayList<Student> students;

    public StudentManager() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void showStudents() {
        if (students.isEmpty()) {
            System.out.println("Nema dodatih ucenika.");
            return;
        }

        System.out.println("Lista ucenika:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void searchStudent(String name) {
        boolean found = false;

        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                System.out.println("Pronadjen ucenik:");
                System.out.println(student);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Ucenik nije pronadjen.");
        }
    }

    public void removeStudent(String name) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equalsIgnoreCase(name)) {
                students.remove(i);
                System.out.println("Ucenik je obrisan.");
                return;
            }
        }

        System.out.println("Ucenik nije pronadjen.");
    }

    public double calculateAverageGrade() {
        if (students.isEmpty()) {
            System.out.println("Nema ucenika za racunanje proseka.");
            return 0;
        }

        double sum = 0;

        for (Student student : students) {
            sum += student.getGrade();
        }

        return sum / students.size();
    }
}