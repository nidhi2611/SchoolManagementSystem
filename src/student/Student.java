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

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getContact_Number() {
        return Contact_Number;
    }

    public void setContact_Number(int contact_Number) {
        Contact_Number = contact_Number;
    }

    public int getUniversity_Roll_No() {
        return University_Roll_No;
    }

    public void setUniversity_Roll_No(int university_Roll_No) {
        University_Roll_No = university_Roll_No;
    }

    public String getCourse() {
        return Course;
    }

    public void setCourse(String course) {
        Course = course;
    }

}
