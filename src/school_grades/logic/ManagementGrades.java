package school_grades.logic;

import java.util.ArrayList;

public class ManagementGrades {

    ArrayList<Double> grades;

    public ManagementGrades() {
        this.grades = new ArrayList<>();
    }

    public void saveGrade(double n) {
        grades.add(n);
    }

    public double median() {
        double median = 0;
        for (double g : grades) {
            median += g;
        }
        return median / grades.size();
    }

    public int approved() {
        int ap = 0;
        for (double g : grades) {
            if (g > 5) {
                ap++;
            }
        }
        return ap;
    }

}
