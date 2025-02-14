package application;

import entities.Student;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        student.name = sc.nextLine();
        student.trimester1 = sc.nextDouble();
        student.trimester2 = sc.nextDouble();
        student.trimester3 = sc.nextDouble();

        student.approved();

        sc.close();
    }
}
