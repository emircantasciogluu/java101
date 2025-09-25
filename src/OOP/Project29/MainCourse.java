package OOP.Project29;

public class MainCourse {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Emir Can", "5327038910", "HIS"); // History
        Teacher t2 = new Teacher("Batuhan", "00000", "MATH");
        Teacher t3 = new Teacher("Perihan", "22222", "PHY"); // Physics

        Course c1 = new Course("History", "101", "HIS", t1);
        Course c2 = new Course("Mathematics", "101", "MATH", t2);
        Course c3 = new Course("Physics", "101", "PHY", t3);

        Student s1 = new Student("Irem Ortakuyu", "1111", "4", c1, c2, c3);
        s1.addAllGrades(45, 55, 35);
        s1.calcAverage();
        s1.checkPass();
    }
}
