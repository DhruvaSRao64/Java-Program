import CIE.*;
import SEE.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        External[] students = new External[n];
        Internals[] internalMarks = new Internals[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " + (i + 1));
            System.out.print("USN: ");
            String usn = scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Semester: ");
            int sem = scanner.nextInt();

            System.out.print("Enter 5 internal marks: ");
            int[] internal = new int[5];
            for (int j = 0; j < 5; j++) {
                internal[j] = scanner.nextInt();
            }
            internalMarks[i] = new Internals(internal);

            System.out.print("Enter 5 SEE marks: ");
            int[] external = new int[5];
            for (int j = 0; j < 5; j++) {
                external[j] = scanner.nextInt();
            }
            scanner.nextLine();  
            students[i] = new External(usn, name, sem, external);

            System.out.println();
        }

        System.out.println("Final Marks:");
        for (int i = 0; i < n; i++) {
            System.out.println("Student: " + students[i].name);
            for (int j = 0; j < 5; j++) {
                int finalMark = internalMarks[i].internalMarks[j] + students[i].seeMarks[j];
                System.out.println("Course " + (j + 1) + " Final Mark: " + finalMark);
            }
            System.out.println();
        }

        scanner.close();
    }
}

