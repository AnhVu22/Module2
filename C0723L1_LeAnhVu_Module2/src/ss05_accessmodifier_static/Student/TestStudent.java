package ss05_accessmodifier_static.Student;

import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("Test student Name: " + student.getName());
        System.out.println("Test student Class: " + student.getClasses());
        System.out.println("Change Name and Calsses Name");
        Scanner input = new Scanner(System.in);
        System.out.println("Input New Name: ");
        String newName = input.nextLine();
        student.setName(newName);
        System.out.println("Input New Classes: ");
        String newClasses = input.nextLine();
        student.setClasses(newClasses);
        System.out.println("Test New Student Name: " + student.getName());
        System.out.println("Test New Student Class: " + student.getClasses());

    }
}
