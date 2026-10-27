package miniStudentManagementSystem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        int choice;

        do {
            System.out.println();
            System.out.println("===== MENI =====");
            System.out.println("1. Dodaj ucenika");
            System.out.println("2. Prikazi sve ucenike");
            System.out.println("3. Pretrazi ucenika po imenu");
            System.out.println("4. Izracunaj prosek ocena");
            System.out.println("5. Obrisi ucenika");
            System.out.println("6. Izlaz");
            System.out.print("Izaberite opciju: ");

            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Unesite ime: ");
                    String name = input.nextLine();

                    System.out.print("Unesite prezime: ");
                    String prezime = input.nextLine();

                    System.out.print("Unesite godine: ");
                    int age = input.nextInt();

                    System.out.print("Unesite ocenu: ");
                    int grade = input.nextInt();
                    input.nextLine();

                    Student student = new Student(name, prezime, age, grade);
                    manager.addStudent(student);

                    System.out.println("Ucenik je dodat.");
                    break;

                case 2:
                    manager.showStudents();
                    break;

                case 3:
                    System.out.print("Unesite ime za pretragu: ");
                    String searchName = input.nextLine();
                    manager.searchStudent(searchName);
                    break;

                case 4:
                    double average = manager.calculateAverageGrade();
                    if (average != 0) {
                        System.out.println("Prosecna ocena: " + average);
                    }
                    break;

                case 5:
                    System.out.print("Unesite ime ucenika za brisanje: ");
                    String deleteName = input.nextLine();
                    manager.removeStudent(deleteName);
                    break;

                case 6:
                    System.out.println("Hvala sto ste koristili program.");
                    break;

                default:
                    System.out.println("Nepostojeca opcija. Pokusajte ponovo.");
                    break;
            }

        } while (choice != 6);

        input.close();
    }
}