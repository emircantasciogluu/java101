package OOP.Project29;

public class Teacher {
    String name;
    String phoneNo;
    String branch;

    Teacher(String name, String phoneNo, String branch) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.branch = branch;
    }

    void print() {
        System.out.println("Name: " + this.name);
        System.out.println("Phone No: " + this.phoneNo);
        System.out.println("Branch: " + this.branch);
    }
}
