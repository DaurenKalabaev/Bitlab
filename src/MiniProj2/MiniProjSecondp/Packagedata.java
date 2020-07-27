package MiniProj2.MiniProjSecondp;

import java.io.Serializable;
import java.util.ArrayList;

public class Packagedata implements Serializable {
    private ArrayList<Student> students;
    private Student student;
    private String operationType;

    public Packagedata() {
    }

    public Packagedata(ArrayList<Student> students, Student student, String operationType) {
        this.students = students;
        this.student = student;
        this.operationType = operationType;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }
}

