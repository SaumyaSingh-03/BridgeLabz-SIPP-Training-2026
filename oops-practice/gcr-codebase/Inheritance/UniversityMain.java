package Inheritence;

public class UniversityMain {
    public static void main(String[] args) {
        GradStudent studentOne = new GradStudent(
                101,
                "Sneha",
                123,
                7.8,
                "AI"
        );
        System.out.println(studentOne);

        GradStudent studentTwo = new GradStudent(
                102,
                "Vanshika",
                323,
                6.9,
                "Data Mining"
        );
        System.out.println(studentTwo);
    }
}
