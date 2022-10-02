import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner Grades = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter your Grades in Math: ");
        int GradesInMath = Grades.nextInt();
        System.out.println();
        System.out.print("Enter your Chemistry Grade: ");
        int ChemistryGrade = Grades.nextInt();
        System.out.println();
        System.out.print("Enter your Grades in Geography: ");
        int GradesInGeography = Grades.nextInt();
        System.out.println();
        System.out.print("Average score for the day: ");
        System.out.println(GradesInMath + ChemistryGrade + GradesInGeography / 3);




    }






    }
