package oops3.learnPackage;

public class MainClass {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.teachingClass = 12;
        teacher.degree = "PHD";

        System.out.println("Teaching class is : " + teacher.teachingClass);
        System.out.println("Degree of teacher is : " + teacher.degree);
    }
}
