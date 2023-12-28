/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final_Lab;

/**
 *
 * @author aabik
 */
import java.util.Scanner;

public class AdmissionSystem {
    public static void main(String[] args) {
        University university = University.getInstance();
        ProgramFactory programFactory = university.getProgramFactory();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to University Admission System!");

        System.out.println("Select program type:");
        System.out.println("1. Undergraduate");
        System.out.println("2. Graduate");
        
        int choice = scanner.nextInt();
        String programType;

        switch (choice) {
            case 1:
                programType = "Undergraduate";
                displayUndergraduatePrograms();
                break;
            case 2:
                programType = "Graduate";
                displayGraduatePrograms();
                break;
            default:
                System.out.println("Invalid choice. Exiting...");
                return;
        }

        System.out.println("Enter the program name to apply:");
        String selectedProgram = scanner.next();

        Program program = programFactory.createProgram(selectedProgram);

        Student student = new Student();
        student.addObserver(new Parent());
        student.addObserver(new Teacher());
        student.addObserver(new Administration());

        student.applyForProgram(program);
        System.out.println("Application submitted successfully!");
    }

    private static void displayUndergraduatePrograms() {
        System.out.println("Available Undergraduate Programs:");
        System.out.println("1. Computer Science");
        System.out.println("2. Mathematics");
       
    }

    private static void displayGraduatePrograms() {
        System.out.println("Available Graduate Programs:");
        System.out.println("1. Physics");
        System.out.println("2. Biology");
        
    }
}

