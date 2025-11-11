package mygame.heroes;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Variants {
    private Set<String> students = new HashSet<>();
    private Map<String, List<Integer>> grades = new HashMap<>();

    public void addStudent(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Invalid name.");
            return;
        }
        students.add(name);
        grades.putIfAbsent(name, new ArrayList<Integer>());
        System.out.println("Student added: " + name);
    }

    public void addGrade(String name, int grade) {
        if (!students.contains(name)) {
            System.out.println("Student not found. Will add student: " + name);
            addStudent(name);
        }
        List<Integer> list = grades.get(name);
        list.add(grade);
        System.out.println("Added grade " + grade + " for " + name);
    }

    public void listStudents() {
        if (students.isEmpty()) {
            System.out.println("No students!");
            return;
        }
        System.out.println("Students:");
        for (String s : students) {
            System.out.println("- " + s);
        }
    }

    public void listGrades(String name) {
        if (!students.contains(name)) {
            System.out.println("Student not found: " + name);
            return;
        }
        List<Integer> list = grades.get(name);
        if (list == null || list.isEmpty()) {
            System.out.println("No grades for: " + name);
            return;
        }
        System.out.println("Grades for " + name + ": " + list);
    }

    public void printAverage(String name) {
        if (!students.contains(name)) {
            System.out.println("Student not found: " + name);
            return;
        }
        List<Integer> list = grades.get(name);
        if (list == null || list.isEmpty()) {
            System.out.println("No grades for: " + name);
            return;
        }
        double sum = 0;
        for (int g : list) sum += g;
        double avg = sum / list.size();
        System.out.printf("Average", name, avg);
    }

    public static void main(String[] args) {
        Variants sys = new Variants();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("1 - Add student");
            System.out.println("2 - Add grade to student");
            System.out.println("3 - Show all students");
            System.out.println("4 - Show grades of a student");
            System.out.println("5 - Show average of a student");
            System.out.println("0 - Exit");
            System.out.print("Choose an option: ");

            String choice = sc.nextLine().trim();
            if (choice.equals("0")) {
                System.out.println("Exit.");
                break;
            } else if (choice.equals("1")) {
                System.out.print("Enter student name: ");
                String name = sc.nextLine().trim();
                sys.addStudent(name);
            } else if (choice.equals("2")) {
                System.out.print("Enter student name: ");
                String name = sc.nextLine().trim();
                System.out.print("Enter grade (integer): ");
                String g = sc.nextLine().trim();
                try {
                    int grade = Integer.parseInt(g);
                    sys.addGrade(name, grade);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid grade.");
                }
            } else if (choice.equals("3")) {
                sys.listStudents();
            } else if (choice.equals("4")) {
                System.out.print("Enter student name: ");
                String name = sc.nextLine().trim();
                sys.listGrades(name);
            } else if (choice.equals("5")) {
                System.out.print("Enter student name: ");
                String name = sc.nextLine().trim();
                sys.printAverage(name);
            } else {
                System.out.println("Invalid option.");
            }
        }


    }
}
