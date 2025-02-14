package entities;

public class Student {

    public String name;
    public double trimester1;
    public double trimester2;
    public double trimester3;

    public void approved() {
        double finalGrade = trimester1 + trimester2 + trimester3;
        double missingPoints = 60 - finalGrade;

        if (finalGrade > 60) {
            System.out.printf("FINAL GRADE = %.2f%n", finalGrade);
            System.out.println("PASS");
        }
        else {
            System.out.printf("FINAL GRADE = %.2f%n", finalGrade);
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", missingPoints);
        }
    }
}
