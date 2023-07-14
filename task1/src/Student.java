public class Student {
    private int StudentId;
    private int getStudentId() {
        return StudentId;
    }

    private void setStudentId(int studentId) {
        StudentId = studentId;
    }
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private float qualifyingExamMarks;

    public float getQualifyingExamMarks() {
        return qualifyingExamMarks;
    }

    public void setQualifyingExamMarks(float qualifyingExamMarks) {
        this.qualifyingExamMarks = qualifyingExamMarks;
    }

    private char residentialStatus;

    public char getResidentialStatus() {
        return residentialStatus;
    }

    public void setResidentialStatus(char residentialStatus) {
        this.residentialStatus = residentialStatus;
    }

    private int yearOfEngg;

    public int getYearOfEngg() {
        return yearOfEngg;
    }

    public void setYearOfEngg(int yearOfEngg) {
        this.yearOfEngg = yearOfEngg;
    }
}