public class SetAndGetStudentDetails {
    public static void main(String[] args) {
        Student s = new Student();
        s.setStudRollNo(55);
        s.setStudName("Roman");
        s.setStudDOB("2023-05-08");
        System.out.println("Student Roll No is:" +s.getStudRollNo());
        System.out.println("Student Name is:" +s.getStudName());
        System.out.println("Student Date of Birth is:" +s.getStudDOB());
    }
}
