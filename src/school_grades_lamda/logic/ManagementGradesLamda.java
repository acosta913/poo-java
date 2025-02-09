package school_grades_lamda.logic;

import java.util.ArrayList;
import java.util.concurrent.atomic.DoubleAdder;

public class ManagementGradesLamda {

    ArrayList<Double> grades;

    public ManagementGradesLamda() {
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

    public Object[] getGrades() {
        grades.sort((a, b) -> (int) (a - b));
        return grades.toArray();
    }

    public void deleteSuspensos() {
        grades.removeIf(n -> n < 5);
    }

}
