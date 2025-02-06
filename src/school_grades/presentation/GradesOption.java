package school_grades.presentation;

import java.util.Scanner;

import school_grades.logic.ManagementGrades;

public class GradesOption {

    ManagementGrades managementGrades = new ManagementGrades();
    int op;

    public void optionGrades() {
        Scanner sc = new Scanner(System.in);
        double grade;
        do {
            System.out.println("1. Add grade");
            System.out.println("2. Show median");
            System.out.println("3. Show approved");
            System.out.println("4. Exit");
            op = Integer.parseInt(sc.nextLine());
            switch (op) {
                case 1:
                    System.out.println("Enter grade");
                    grade = Double.parseDouble(sc.nextLine());
                    managementGrades.saveGrade(grade);
                    break;
                case 2:
                    System.out.println("Current average: " + managementGrades.median());
                    break;
                case 3:
                    System.out.println("Approved: " + managementGrades.approved());
                    break;
            }
        } while (op != 4);
    }

}
