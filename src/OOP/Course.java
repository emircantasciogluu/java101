package OOP;

public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;

    Course(String name, String code, String prefix, Teacher courseTeacher){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.courseTeacher = courseTeacher;
    }

    void addTeacher(Teacher courseTeacher){
        if(courseTeacher.branch.equals(this.prefix)){
            this.courseTeacher = courseTeacher;
            this.courseTeacher.print();
        }else{
            System.out.println("Bölüm ve dersler uyuşmuyor.");
        }
    }
}
