package microsoft_teams_assignments.due18feb2023;

class Main {
    public static void main(String[] args) {
        Student s1 = new Student("1", "prakhar", 90, 80, 90);
        System.out.println(s1.toString());

        Student s2 = new Student("2", "shikhar");
        s2.setMarksS1(40);
        s2.setMarksS2(90);
        s2.setMarksS3(70);

        System.out.println(s2.toString());

        Student s3 = new Student(60, 90, 10);
        s3.setName("krish");
        s3.setRollNo("3");

        System.out.println(s3.toString());
    }
}

public class Student {
    private String rollNo;
    private String name;

    private int marksS1, marksS2, marksS3;
    private int totalMarks;
    private float percentage;
    private char grade;


    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarksS1() {
        return marksS1;
    }

    public void setMarksS1(int marksS1) {
        this.marksS1 = marksS1;
    }

    public int getMarksS2() {
        return marksS2;
    }

    public void setMarksS2(int marksS2) {
        this.marksS2 = marksS2;
    }

    public int getMarksS3() {
        return marksS3;
    }

    public void setMarksS3(int marksS3) {
        this.marksS3 = marksS3;
    }

    public int getTotalMarks() {
        totalMarks = marksS1 + marksS2 + marksS3;
        return totalMarks;
    }

    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }

    public float getPercentage() {
        totalMarks = getTotalMarks();
        percentage = (totalMarks / 300f) * 100;
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    public char getGrade() {
        if (percentage >= 90) {
            setGrade('A');
        } else if (percentage < 90 && percentage >= 70) {
            setGrade('B');
        } else if (percentage < 70 && percentage >= 60) {
            setGrade('C');
        } else if (percentage < 60 && percentage >= 50) {
            setGrade('D');
        } else if (percentage < 50) {
            setGrade('F');
        }
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" + "rollNo='" + rollNo + '\'' + ", name='" + name + '\'' + ", marksS1=" + marksS1 + ", marksS2=" + marksS2 + ", marksS3=" + marksS3 + ", totalMarks=" + getTotalMarks() + ", percentage=" + getPercentage() + ", grade=" + getGrade() + '}';
    }

    public Student() {
    }

    public Student(String rollNo, String name, int marksS1, int marksS2, int marksS3) {
        this.rollNo = rollNo;
        this.name = name;
        this.marksS1 = marksS1;
        this.marksS2 = marksS2;
        this.marksS3 = marksS3;
    }

    public Student(int marksS1, int marksS2, int marksS3) {
        this.marksS1 = marksS1;
        this.marksS2 = marksS2;
        this.marksS3 = marksS3;
    }

    public Student(String rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

}

