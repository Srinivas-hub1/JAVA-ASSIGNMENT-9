import java.util.Scanner;

class Student {
    private String name;
    private int marks1, marks2, marks3, marks4;
    private double total, aggregate;
    private String grade;

    public Student(String name, int marks1, int marks2, int marks3, int marks4) {
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
        this.marks4 = marks4;
        this.total = marks1 + marks2 + marks3 + marks4;
        this.aggregate = total / 4;

        if (aggregate > 75) {
            grade = "Distinction";
        } else if (aggregate >= 60 && aggregate < 75) {
            grade = "First Division";
        } else if (aggregate >= 50 && aggregate < 60) {
            grade = "Second Division";
        } else if (aggregate >= 40 && aggregate < 50) {
            grade = "Third Division";
        } else {
            grade = "Fail";
        }
    }

    public void displayGrade() {
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Aggregate: " + aggregate);
        System.out.println("Grade: " + grade);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter marks in Subject 1: ");
        int marks1 = scanner.nextInt();

        System.out.print("Enter marks in Subject 2: ");
        int marks2 = scanner.nextInt();

        System.out.print("Enter marks in Subject 3: ");
        int marks3 = scanner.nextInt();

        System.out.print("Enter marks in Subject 4: ");
        int marks4 = scanner.nextInt();

        Student student = new Student(name, marks1, marks2, marks3, marks4);
        student.displayGrade();

        scanner.close();
    }
}
