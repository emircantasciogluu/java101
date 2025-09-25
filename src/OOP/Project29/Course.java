package OOP.Project29;

public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int grade;

    Course(String name, String code, String prefix, Teacher courseTeacher) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.grade = 0;
        this.courseTeacher = courseTeacher;
    }

    void addTeacher(Teacher courseTeacher) {
        if (courseTeacher.branch.equals(this.prefix)) {
            this.courseTeacher = courseTeacher;
            this.courseTeacher.print();
        } else {
            System.out.println("Teacher's branch does not match the course prefix.");
        }
    }
}
