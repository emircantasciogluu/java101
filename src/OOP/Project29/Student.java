package OOP.Project29;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String studentNo;
    String className;
    double average;
    boolean isPass;

    Student(String name, String studentNo, String className, Course c1, Course c2, Course c3) {
        this.name = name;
        this.studentNo = studentNo;
        this.className = className;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.isPass = false;
        this.average = 0.0;
    }

    void addAllGrades(int grade1, int grade2, int grade3) {
        if (grade1 >= 0 && grade1 <= 100) {
            c1.grade = grade1;
        }

        if (grade2 >= 0 && grade2 <= 100) {
            c2.grade = grade2;
        }

        if (grade3 >= 0 && grade3 <= 100) {
            c3.grade = grade3;
        }
    }

    void calcAverage() {
        this.average = (c1.grade + c2.grade + c3.grade) / 3.0;
        System.out.println(c1.name + " grade: " + c1.grade);
        System.out.println(c2.name + " grade: " + c2.grade);
        System.out.println(c3.name + " grade: " + c3.grade);
        System.out.println("Your average: " + this.average);
    }

    void checkPass() {
        if (this.average > 50) {
            System.out.println("Congratulations! You passed the class!");
            this.isPass = true;
        } else {
            System.out.println("You failed the class. You will need to retake the courses next year!");
        }
    }
}
