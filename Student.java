public class Student extends Animal implements Person {
    private String id;
    private String name;
    private double point;

    public Student(String id, String name, double point) {
        this.id = id;
        this.name = name;
        this.point = point;
    }

    public Student() {

    }

    public void getInformation() {
        System.out.println(
                "Student Information: " + "id: " + this.id + " " + "name: " + this.name + " " + "point: " + this.point);
    }

    public void setInformation(String id, String name, double point) {
        this.id = id;
        this.name = name;
        this.point = point;
    }

    public void learning() {
        System.out.println("Student can learning");
    }

    public void singing() {
        System.out.println("Student can singing");
    }

    public void eating() {
        System.out.println("Student can eating");
    };

    public void sleeping() {
        System.out.println("Student can sleeping");
    };
}
