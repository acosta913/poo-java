package school_grades_lamda.presentation;

import java.util.Scanner;

import school_grades_lamda.logic.ManagementGradesLamda;

public class GradesOptionLamda {

    ManagementGradesLamda managementGrades = new ManagementGradesLamda();
    int op;

    public void optionGrades() {
        Scanner sc = new Scanner(System.in);
        double grade;
        do {
            System.out.println("1. Add grade");
            System.out.println("2. Show median");
            System.out.println("3. Show approved");
            System.out.println("4. ShoWw ordered");
            System.out.println("5. Delete Suspensos");
            System.out.println("6. Exit");
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
                case 4:
                    Object[] all = managementGrades.getGrades();
                    for (Object object : all) {
                        System.out.println(object + ", ");
                    }
                    System.out.println("");
                    break;
                case 5:
                    managementGrades.deleteSuspensos();
            }
        } while (op != 6);
    }

}
