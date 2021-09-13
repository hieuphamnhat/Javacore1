public class CollegeStudent extends Student {
    private int level;
    private String branch;

    public CollegeStudent(String branch, int level) {
        this.branch = branch;
        this.level = level;
    }

    public CollegeStudent() {

    }

    public void getMoreInformation() {
        super.getInformation(); // goi truc tiep constructor hoac instance cua lop cha
        System.out.println("College Student Information: " + "level: " + this.level + " " + "branch: " + this.branch);
    }

}