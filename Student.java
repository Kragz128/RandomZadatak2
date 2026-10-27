package miniStudentManagementSystem;

public class Student {

    private String name;
    private String prezime;
    private int age;
    private int grade;

    public Student() {
    }

    public Student(String name, String prezime, int age, int grade) {
        this.name = name;
        this.prezime = prezime;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Ime: " + name + " | Prezime: " + prezime + " | Godine: " + age + " | Ocena: " + grade;
    }
}
