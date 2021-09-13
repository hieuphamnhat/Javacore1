public class ManageStudent {
    public static void main(String[] args) {
        Student peter = new Student();
        peter.setInformation("K62", "Peter", 4.0);
        CollegeStudent hana = new CollegeStudent("Math", 4);
        hana.setInformation("K62", "Hana", 3.0);
        peter.getInformation();
        hana.getMoreInformation();
    }
}
