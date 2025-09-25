package OOP;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.isPass = false;
        this.average = 0.0;
    }

    void addAllNotes(int note1, int note2, int note3){
        if (note1 >= 0 && note1 <= 100){
            c1.note = note1;
        }

        if (note2 >= 0 && note2 <= 100){
            c2.note = note2;
        }

        if (note3 >= 0 && note3 <= 100){
            c3.note = note3;
        }
    }

    void calcAverage(){
        this.average = (c1.note + c2.note + c3.note) / 3.0;
        System.out.println(c1.name + " notunuz: " + c1.note);
        System.out.println(c2.name + " notunuz: " + c2.note);
        System.out.println(c3.name + " notunuz: " + c3.note);
        System.out.println("Ortalamanız: " + this.average);
    }

    void isPass(){
        if (this.average > 50){
            System.out.println("Tebrikler sınıfı geçtiniz!");
            this.isPass = true;
        }else{
            System.out.println("Sınıfı geçemediniz seneye tekrar aynı dersleri alacaksınız!");
        }
    }
}
