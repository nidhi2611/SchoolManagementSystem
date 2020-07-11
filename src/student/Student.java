package student;

public class Student {
    private String Name;
    private int University_Roll_No;
    private String Course;
    private int Contact_Number;

    public Student(String s, int urno, String c, int phno) {
        Name = s;
        University_Roll_No = urno;
        Course = c;
        Contact_Number = phno;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", University_Roll_No=" + University_Roll_No +
                ", Course='" + Course + '\'' +
                ", Contact_Number=" + Contact_Number +
                '}';
    }
}
