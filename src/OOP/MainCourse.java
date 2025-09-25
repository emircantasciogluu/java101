package OOP;

public class MainCourse {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Emir Can", "5327038910", "TRH");
        Teacher t2 = new Teacher("Batuhan", "00000", "MAT");
        Teacher t3 = new Teacher("Perihan", "22222", "FIZ");

        Course c1 = new Course("Tarih", "101", "TRH", t1);
        Course c2 = new Course("Matematik", "101", "MAT", t2);
        Course c3 = new Course("Fizik", "101", "FIZ", t3);

        Student s1 = new Student("İrem Ortakuyu", "1111", "4",c1,c2,c3);
        s1.addAllNotes(45,55,35);
        s1.calcAverage();
        s1.isPass();
    }
}
