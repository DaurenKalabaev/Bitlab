package Moduk1.Lessone11.Lesson10.Labka;

import java.util.Arrays;

public class Teacher extends User {
    private String nicName;
    private String status;
    private String subjects[] = new String[10];
    private int sizeofsabjects=0;


    public void addSubject(String subject){

        if (sizeofsabjects>9){
            return;
        }

        subjects[sizeofsabjects]=subject;
        sizeofsabjects++;
    }


    @Override
    String getUserData() {
        return "Teacher{" +
                "nicName='" + nicName + '\'' +
                ", status='" + status + '\'' +
                ", sabjects=" + Arrays.toString(subjects) +
                ", sizeofsabjects=" + sizeofsabjects +
                ", id=" + id +
                ", login='" + login + '\'' +
                '}';
    }

    public String getNicName() {
        return nicName;
    }

    public void setNicName(String nicName) {
        this.nicName = nicName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String[] getSabjects() {
        return subjects;
    }

    public void setSabjects(String[] sabjects) {
        this.subjects = sabjects;
    }

    public int getSizeofsabjects() {
        return sizeofsabjects;
    }

    public void setSizeofsabjects(int sizeofsabjects) {
        this.sizeofsabjects = sizeofsabjects;
    }
}
