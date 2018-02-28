package lesson11;

public class StudentDemo {
    public static void main(String[] args) {
        Student student1 = new Aspirant("Daria", "Yegorova", "OF-81",
                4.6, "Madness as philosophical problem");
        Aspirant aspirant1 = new Aspirant("Daria", "Yegorova", "OF-81",
                4.6, "Madness as philosophical problem");
        Student student2 = new Student("Daria", "Yegorova", "OF-81",
                4.6);
        System.out.println(student1.getFirstName() + student1.getLastName() + " " + student1.getAverageMark()
                + " " + student1.getGroup() + " " + student2.getFirstName() + " " + aspirant1.getFirstName()
                + " " + aspirant1.getScienceWork());

        Student[] students = {student1, aspirant1, student2};
        for (Student student : students) {
            System.out.println(student.getFirstName() + " " + student.getLastName() + " - " + student.getScholarship());
        }
    }
}
