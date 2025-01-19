package workshop7;

public class GradeCalculator {
    public double calculateAverage(int[] grades) {
        if (grades == null || grades.length == 0) {
            throw new IllegalArgumentException("Grades array cannot be null or empty");
        }
        int total = 0;
        for (int grade : grades) {
            total += grade;
        }
        return (double) total / grades.length;
    }
    public String getLetterGrade(double average) {
        if (average >= 90) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 70) {
            return "C";
        } else if (average >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
    public static void main(String[] args) {
        GradeCalculator calculator = new GradeCalculator();
        int[] grades = {85, 90, 78, 92, 88};
        double average = calculator.calculateAverage(grades);
        System.out.println("Average Grade: " + average);
        String letterGrade = calculator.getLetterGrade(average);
        System.out.println("Final Letter Grade: " + letterGrade);
    }
}
